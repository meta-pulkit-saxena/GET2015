
/**
 * @class  DatabaseFunctions
 * @author Pulkit
 * @since  21st September 15
 * This class contains all the functions required to enter the data in database.
 */

package com.metacampus.casestudy.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.metacampus.casestudy.helper.ConnectionPool;
import com.metacampus.casestudy.modal.Bike;
import com.metacampus.casestudy.modal.Car;
import com.metacampus.casestudy.modal.Vehicle;

public class DatabaseFunctions {
	
	/**
	 * This function inserts the data related to a vehicle.
	 * @param{Vehicle} vehicle
	 */
	
	public void insertVehicle(Vehicle vehicle) { 
		insertIntoVehicleTable(vehicle);
		if(vehicle instanceof Car) {
			insertIntoCarTable(vehicle);
		}
		else if(vehicle instanceof Bike) {
			insertIntoBikeTable(vehicle);
		}
	}
	
	/**
	 * This function inserts the relevant data of vehicle in vehicle table. 
	 * @param{Vehicle} vehicle
	 */
	
	public void insertIntoVehicleTable(Vehicle vehicle) {
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		String query = "INSERT INTO vehicle (vehicle_id, created_by, created_time, make, model, engine_in_cc, fuel_capacity, mileage, price, road_tax) VALUES (?,?,?,?,?,?,?,?,?,?)";
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool();
			connectionObject.setAutoCommit(false); 
			PreparedStatement statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			statement.setInt(1, vehicle.getVehicleId());
			statement.setString(2, vehicle.getCreatedBy());
			statement.setTimestamp(3, vehicle.getCreatedTime());
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
			try {
				connectionObject.rollback();
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
	}

	/**
	 * This function inserts the relevant data of bike type vehicle into the bike table.
	 * @param{Vehicle} vehicle
	 */
	
	private void insertIntoBikeTable(Vehicle vehicle) {
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		String query = "INSERT INTO bike (vehicle_id, self_start, helmet_price) VALUES (?,?,?)";
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool();
			connectionObject.setAutoCommit(false); 
			PreparedStatement statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			statement.setInt(1, vehicle.getVehicleId());
			String selfStart = (Boolean.toString(((Bike)vehicle).isSelfStart()));
			statement.setString(2, selfStart);
			statement.setFloat(3, ((Bike)vehicle).getHelmetPrice());
			statement.executeUpdate();
			connectionObject.commit();
		}
		catch(SQLException e) {
			try {
				connectionObject.rollback();
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
	}

	/**
	 * This function inserts the relevant data of car type vehicle into the car table.
	 * @param{Vehicle} vehicle
	 */
	
	private void insertIntoCarTable(Vehicle vehicle) {
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		String query = "INSERT INTO car (vehicle_id, ac, power_steering, accessory_kit) VALUES (?,?,?,?)";
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool();
			connectionObject.setAutoCommit(false); 
			PreparedStatement statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			String ac = (Boolean.toString(((Car)vehicle).isAc()));
			String powerStreering = (Boolean.toString(((Car)vehicle).isPowerSteering()));
			String accessoryKit = (Boolean.toString(((Car)vehicle).isAccessoryKit()));
			statement.setInt(1, vehicle.getVehicleId());
			statement.setString(2, ac);
			statement.setString(3, powerStreering);
			statement.setString(4, accessoryKit);
			statement.executeUpdate();
			connectionObject.commit();
		}
		catch(SQLException e) {
			try {
				connectionObject.rollback();
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
		
	}
}
