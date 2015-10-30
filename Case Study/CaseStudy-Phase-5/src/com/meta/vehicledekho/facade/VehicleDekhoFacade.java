
/**
 * @class  VehicleDekhoFacade
 * @author Pulkit
 * @since  29th October 15
 * This class contains all the facade implementing functions.
 */

package com.meta.vehicledekho.facade;

import java.sql.Connection;
import java.util.List;

import com.meta.vehicledekho.Exception.MetaVehicleSystemException;
import com.meta.vehicledekho.db.helper.CarDbHelper;
import com.meta.vehicledekho.db.helper.SearchDbHelper;
import com.meta.vehicledekho.db.helper.UserDbHelper;
import com.meta.vehicledekho.db.helper.VehicleDbHelper;
import com.meta.vehicledekho.model.User;
import com.meta.vehicledekho.model.Vehicle;

public class VehicleDekhoFacade {
	
	/**
	 * This function provides the facade for login functionality.
	 * @param{Connection} connectionObject
	 * @param{User} user
	 * @return{boolean}
	 */
	
	public boolean loginFacade(Connection connectionObject, User user) throws MetaVehicleSystemException {
		boolean returnValue = false;
		UserDbHelper userDb = new UserDbHelper();
		try {
			returnValue = userDb.login(connectionObject,user);
		}
		catch(MetaVehicleSystemException e) {
			throw new MetaVehicleSystemException("Error occurred in login facade" + "[" + e.getMessage() + "]");
		}
		return returnValue;
	}
	
	/**
	 * This function provides the facade for creating the car.
	 * @param{Connection} connectionObject
	 * @param{Vehicle} car
	 */
	
	public void createCarFacade(Connection connectionObject, Vehicle car) throws MetaVehicleSystemException {
		VehicleDbHelper vehicleDb = new VehicleDbHelper();
		CarDbHelper carDb = new CarDbHelper();
		try {
			vehicleDb.insertIntoVehicleTable(connectionObject, car);
			carDb.insertIntoCarTable(connectionObject, car);
		}
		catch(MetaVehicleSystemException e) {
			throw new MetaVehicleSystemException("Error occurred in create car facade" + "[" + e.getMessage() + "]");
		}
	}
	
	/**
	 * This function implements the getVehicleDetails facade
	 * @param{Connection} connectionObject
	 * @param{Vehicle} car
	 * @return{Vehicle}
	 * @throws MetaVehicleSystemException
	 */
	
	public Vehicle getVehicleDetailsFacade(Connection connectionObject, Vehicle car) throws MetaVehicleSystemException {
		Vehicle vehicle = new Vehicle();
		VehicleDbHelper vehicleDb = new VehicleDbHelper();
		try {
			vehicle = vehicleDb.getVehicleDetails(connectionObject,car);			
		}
		catch(MetaVehicleSystemException e) {
			e.printStackTrace();
			throw new MetaVehicleSystemException("Error occurred in get vehicle details facade" + "[" + e.getMessage() + "]");
		}
		return vehicle;
	}
	
	/**
	 * This function implements the facade for editing the vehicle.
	 * @param{Connection} connectionObject
	 * @param{Vehicle} car
	 * @throws{Exception} MetaVehicleSystemException
	 */
	
	public void editVehicleFacade(Connection connectionObject, Vehicle car) throws MetaVehicleSystemException {
		VehicleDbHelper vehicleDb = new VehicleDbHelper();
		CarDbHelper carDb = new CarDbHelper();
		try {
			vehicleDb.editVehicleTable(connectionObject, car);
			carDb.editCarTable(connectionObject, car);
		}
		catch(MetaVehicleSystemException e) {
			e.printStackTrace();
			throw new MetaVehicleSystemException("Error occurred in edit vehicle facade" + "[" + e.getMessage() + "]");
		}
	}
	
	/**
	 * This function returns the list of all the distinct make.
	 * @param{Connection} connectionObject
	 * @return{List<String>}
	 * @throws{Exception} MetaVehicleSystemException
	 */
	
	public List<String> getDistinctMake(Connection connectionObject) throws MetaVehicleSystemException {
		SearchDbHelper searchDb = new SearchDbHelper();
		List<String> make = null;
		try {
			make = searchDb.retreiveDistinctMake(connectionObject);
		}
		catch(MetaVehicleSystemException e) {
			e.printStackTrace();
			throw new MetaVehicleSystemException("Error occurred in getdistinct facade" + "[" + e.getMessage() + "]");
		}
		return make;
	}
	
	/**
	 * This function returns the list of vehicles make and model by particular make.
	 * @param{Connection} connectionObject
	 * @param{Vehicle} vehicle
	 * @return{List<Vehicle}
	 * @throws{Exception} MetaVehicleSystemException
	 */
	
	public List<Vehicle> getByMakeAndModel(Connection connectionObject, Vehicle vehicle) throws MetaVehicleSystemException {
		List<Vehicle> makeAndModel = null;
		VehicleDbHelper vehicleDb = new VehicleDbHelper();
		try {
			makeAndModel = vehicleDb.getMakeAndModel(connectionObject, vehicle);
		}
		catch(MetaVehicleSystemException e) {
			e.printStackTrace();
			throw new MetaVehicleSystemException("Error occurred in get make and model facade" + "[" + e.getMessage() + "]");
		}
		return makeAndModel;
	}
}
