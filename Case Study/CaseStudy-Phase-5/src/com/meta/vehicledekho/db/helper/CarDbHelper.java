
/**
 * @class  CarDbhelper
 * @author Pulkit
 * @since  26th October 15
 * This class defines all the functions related to car and database interaction.
 */

package com.meta.vehicledekho.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.meta.vehicledekho.Exception.MetaVehicleException;
import com.meta.vehicledekho.Exception.MetaVehicleSystemException;
import com.meta.vehicledekho.db.ConnectionPool;
import com.meta.vehicledekho.model.Car;
import com.meta.vehicledekho.model.Vehicle;

public class CarDbHelper {

	/**
	 * This function inserts the relevant data of car type vehicle into the car table.
	 * @throws MetaException 
	 * @param{Vehicle} vehicle
	 */
	
	public void insertIntoCarTable(Connection connectionObject, Vehicle vehicle) throws MetaVehicleSystemException {
		PreparedStatement statement = null;
		String query = "INSERT INTO car (vehicle_id, ac, power_steering, accessory_kit) VALUES (?,?,?,?)";
		try {
			statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			String ac = (Boolean.toString(((Car)vehicle).isAc()));
			String powerStreering = (Boolean.toString(((Car)vehicle).isPowerSteering()));
			String accessoryKit = (Boolean.toString(((Car)vehicle).isAccessoryKit()));
			VehicleDbHelper vehicleDb = new VehicleDbHelper();
			int id = vehicleDb.getLastVehicleId(connectionObject);
			statement.setInt(1, id);
			statement.setString(2, ac);
			statement.setString(3, powerStreering);
			statement.setString(4, accessoryKit);
			statement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new MetaVehicleSystemException("Error occurred while creating a new vehicle" + "[" + e.getMessage() + "]");
		}
		finally {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * This function retrieves the car details.
	 * @param{Connection} connection
	 * @param{Vehicle} vehicle
	 * @return{Car}
	 */
	
	public Car getCarDetails(Connection connection, Vehicle vehicle) throws MetaVehicleSystemException {
		Car car = new Car();
		PreparedStatement statement  = null;
		String query = "SELECT * FROM car WHERE vehicle_id = ? ";
		try {
			statement = connection.prepareStatement(query); // Creating a prepared statement.
			statement.setInt(1, vehicle.getVehicleId());
			ResultSet set = statement.executeQuery();
			set.next();
			boolean type = Boolean.getBoolean(set.getString("ac"));
			car.setAc(type);
			type = Boolean.getBoolean(set.getString("power_steering"));
			car.setPowerSteering(type);
			type = Boolean.getBoolean(set.getString("accessory_kit"));
			car.setAccessoryKit(type);
		}
		catch(Exception e) {
			throw new MetaVehicleSystemException("Error occurred while fetching car details" + "[" + e.getMessage() + "]");
		}
		finally {
			try {
				statement.close();
			} catch (SQLException e) {
				throw new MetaVehicleSystemException("Error occurred while fetching car details" + "[" + e.getMessage() + "]");
			}
		}
		return car;
	}
	
	/**
	 * This function updates the car in the car table.
	 * @throws{Exception} MetaException 
	 * @param{Vehicle} vehicle
	 */
		
	public void editCarTable(Connection connectionObject, Vehicle vehicle) throws MetaVehicleSystemException {
		PreparedStatement statement = null;
		String query = "UPDATE car SET ac=?,power_steering=?,accessory_kit=? WHERE vehicle_id=?";
		try {
			statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			String ac = (Boolean.toString(((Car)vehicle).isAc()));
			String powerStreering = (Boolean.toString(((Car)vehicle).isPowerSteering()));
			String accessoryKit = (Boolean.toString(((Car)vehicle).isAccessoryKit()));
			VehicleDbHelper vehicleDb = new VehicleDbHelper();
			statement.setString(1, ac);
			statement.setString(2, powerStreering);
			statement.setString(3, accessoryKit);
			int id = vehicle.getVehicleId();
			statement.setInt(4, id);
			statement.executeUpdate();
		}
		catch(SQLException e) {
			throw new MetaVehicleSystemException("Error occurred while editing vehicle" + "[" + e.getMessage() + "]");
		}
		finally {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
