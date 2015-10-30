
/**
 * @class  VehicleDbHelper
 * @author Pulkit
 * @since  26th October 15
 * This class contains all the functions related to the vehicle.
 */

package com.meta.vehicledekho.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.meta.vehicledekho.db.ConnectionPool;
import com.meta.vehicledekho.model.Car;
import com.meta.vehicledekho.model.Vehicle;
import com.meta.vehicledekho.Exception.MetaVehicleException;
import com.meta.vehicledekho.Exception.MetaVehicleSystemException;

public class VehicleDbHelper {

	/**
	 * This function inserts the relevant data of vehicle in vehicle table. 
	 * @param{Vehicle} vehicle
	 */
	
	public void insertIntoVehicleTable(Connection connectionObject, Vehicle vehicle) throws MetaVehicleSystemException {
		String query = "INSERT INTO vehicle_table (vehicle_id, created_by, created_time, make, model, engine_in_cc, fuel_capacity, mileage, price, road_tax) VALUES (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement statement = null;
		try {
			statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			statement.setInt(1, vehicle.getVehicleId());
			statement.setString(2, vehicle.getCreatedBy());
			statement.setTimestamp(3, new Timestamp(vehicle.getCreationTime().getTime()));
			statement.setString(4, vehicle.getMake());
			statement.setString(5, vehicle.getModel());
			statement.setInt(6, vehicle.getEngineInCC());
			statement.setInt(7, vehicle.getFuelCapacity());
			statement.setInt(8, vehicle.getMileage());
			statement.setFloat(9, vehicle.getPrice());
			statement.setFloat(10, vehicle.getRoadTax());
			statement.executeUpdate();
			connectionObject.commit();
		}
		catch(SQLException e) {
			throw new MetaVehicleSystemException("Error occurred while adding the new vehicle into the vehicle table" + "[" + e.getMessage() + "]");
		}
		finally {
			try {
				statement.close();
			} catch (SQLException e) {
				throw new MetaVehicleSystemException("Error occurred while closing the statement" + "[" + e.getMessage() + "]");
			}
		}
	}
	
	
	/**
	 * This function returns the id of the last vehicle input in vehicle table.
	 * @param{Connection} connection
	 * @return{int}
	 * @throws{MetaException} MetaException
	 */
	
	public int getLastVehicleId(Connection connection) throws MetaVehicleSystemException {
		String query = "SELECT vehicle_id FROM vehicle_table ORDER BY vehicle_id DESC LIMIT 1";
		ResultSet resultSet = null;
		int id = -1;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				id = resultSet.getInt("vehicle_id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				throw new MetaVehicleSystemException("Error occurred while closing the statement" + "[" + e.getMessage() + "]");
			}
		}
		return id;
	}
	
	/**
	 * This function returns the list of vehicle objects of the given make.
	 * @return{List<Vehicle>}
	 */
	
	public List<Vehicle> getMakeAndModel(Connection connectionObject, Vehicle vehicle) throws MetaVehicleSystemException {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		PreparedStatement statement = null;
		String query = "SELECT vehicle_id, make, model FROM vehicle_table WHERE make = ? ";
		try {
			statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			statement.setString(1, vehicle.getMake());
			ResultSet set = statement.executeQuery();
			Vehicle tempVehicle = null;
			while(set.next()) {
				String make = set.getString("make");
				String model = set.getString("model");
				int vehicleId = Integer.parseInt(set.getString("vehicle_id"));
				tempVehicle = new Vehicle();
				tempVehicle.setMake(make);
				tempVehicle.setModel(model);
				tempVehicle.setVehicleId(vehicleId);
				vehicleList.add(tempVehicle);
			}
		}
		catch(Exception e) {
			throw new MetaVehicleSystemException("Error occurred while fetching make and model of all the vehicles with"
													+ " a particular make" + "[" + e.getMessage() + "]");
		}
		finally {
			try {
				statement.close();
			} catch (SQLException e) {
				throw new MetaVehicleSystemException("Error occurred while closing the statement" + "[" + e.getMessage() + "]");
			}
		}
		return vehicleList;
	}
	
	/**
	 * This function returns all the details of vehicle identified by the given id.
	 * @return{List<Vehicle>}
	 */
	
	public Vehicle getVehicleDetails(Connection connectionObject, Vehicle vehicle) throws MetaVehicleSystemException {
		Vehicle car = new Car();
		PreparedStatement statement = null;
		String query = "SELECT * FROM vehicle_table WHERE vehicle_id = ? ";
		try {
			statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			statement.setInt(1, vehicle.getVehicleId());
			ResultSet set = statement.executeQuery();
			set.next();
			car.setMake(set.getString("make"));
			car.setModel(set.getString("model"));
			int engine = Integer.parseInt(set.getString("engine_In_CC"));
			car.setEngineInCC(engine);
			int fuelCapacity = Integer.parseInt(set.getString("fuel_Capacity"));
			car.setFuelCapacity(fuelCapacity);
			int milage = Integer.parseInt(set.getString("fuel_Capacity"));
			car.setMileage(milage);
			float showRoom = Float.parseFloat((set.getString("price")));
			car.setPrice(showRoom);
			float roadTax =Float.parseFloat((set.getString("road_Tax")));
			car.setRoadTax(roadTax);
			car.setVehicleId(vehicle.getVehicleId());
			CarDbHelper carDb = new CarDbHelper();
			Car tempCar= carDb.getCarDetails(connectionObject,car);
			((Car)car).setAc(tempCar.isAc());
			((Car)car).setPowerSteering(tempCar.isPowerSteering());
			((Car)car).setAccessoryKit(tempCar.isAccessoryKit());
		}
		catch(Exception e) {
			throw new MetaVehicleSystemException("Error occurred while fetching the details of the vehicle" 
													+ "[" + e.getMessage() + "]");
		}
		finally {
			try {
				statement.close();
			} catch (Exception e) {
				throw new MetaVehicleSystemException("Error occurred while closing the statement" + "[" + e.getMessage() + "]");
			}
		}
		return car;
	}
	
	/**
	 * This function updates the vehicle in the vehicle table. 
	 * @param{Vehicle} vehicle
	 */
	
	public void editVehicleTable(Connection connectionObject, Vehicle vehicle) throws MetaVehicleSystemException {
		PreparedStatement statement = null;
		String query = "UPDATE vehicle_table SET make=?,model=?,engine_In_CC=?,fuel_Capacity=?,mileage=?,price=?,road_Tax=? WHERE vehicle_id=?";
		try {
			statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			statement.setString(1, vehicle.getMake());
			statement.setString(2, vehicle.getModel());
			statement.setInt(3, vehicle.getEngineInCC());
			statement.setInt(4, vehicle.getFuelCapacity());
			statement.setInt(5, vehicle.getMileage());
			statement.setFloat(6, vehicle.getPrice());
			statement.setFloat(7, vehicle.getRoadTax());
			statement.setInt(8, vehicle.getVehicleId());
			statement.executeUpdate();
		}
		catch(SQLException e) {
			throw new MetaVehicleSystemException("Error occurred while editing the vehicle" + "[" + e.getMessage() + "]");
		}
		finally {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new MetaVehicleSystemException("Error occurred while closing the statement" + "[" + e.getMessage() + "]");
			} 
		}
	}
	
}
