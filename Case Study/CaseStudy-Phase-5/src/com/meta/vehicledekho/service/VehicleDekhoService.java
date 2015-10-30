
/**
 * @class  VehicleDekhoService
 * @author Pulkit
 * @since  29th October 15
 * This class implements the service layer functionality.
 */

package com.meta.vehicledekho.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.meta.vehicledekho.Exception.MetaVehicleSystemException;
import com.meta.vehicledekho.db.ConnectionPool;
import com.meta.vehicledekho.facade.VehicleDekhoFacade;
import com.meta.vehicledekho.model.User;
import com.meta.vehicledekho.model.Vehicle;

public class VehicleDekhoService {
	
	/**
	 * This function implements the login service layer function.
	 * @param{User} user
	 * @return{boolean}
	 * @throws MetaVehicleSystemException
	 */
	
	public boolean loginService(User user) throws MetaVehicleSystemException {
		boolean loginStatus = false;
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		connectionObject = (Connection) poolObject.getConnectionFromPool(); 
		VehicleDekhoFacade vehicleFacade = new VehicleDekhoFacade();
		try {
			loginStatus = vehicleFacade.loginFacade(connectionObject, user);
		}
		catch(MetaVehicleSystemException e) {
			e.printStackTrace();
			throw new MetaVehicleSystemException("Error occurred in login service layer" + "[" + e.getMessage() + "]");
		}
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
		return loginStatus;	
	}
	
	/**
	 * This function implements the create service layer function for vehicle creation.
	 * @param{Vehicle} car
	 * @throws MetaVehicleSystemException
	 */
	
	public void createService(Vehicle car) throws MetaVehicleSystemException {
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		connectionObject = (Connection) poolObject.getConnectionFromPool();
		VehicleDekhoFacade vehicleFacade = new VehicleDekhoFacade();
		try {
			connectionObject.setAutoCommit(false);
			vehicleFacade.createCarFacade(connectionObject, car);
			connectionObject.commit();
		}
		catch(MetaVehicleSystemException e) {
			try {
				connectionObject.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			throw new MetaVehicleSystemException("Error occurred in create service layer function" + "[" + e.getMessage() + "]");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
	}
	
	/**
	 * This function performs the get vehicle details service layer function.
	 * @param{Vehicle} vehicle
	 * @return{Vehicle}
	 * @throws MetaVehicleSystemException
	 */
	
	public Vehicle getVehicleDetailsService(Vehicle vehicle) throws MetaVehicleSystemException {
		Vehicle car = new Vehicle();
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		connectionObject = (Connection) poolObject.getConnectionFromPool(); 
		try {
			 VehicleDekhoFacade vehicleFacade = new VehicleDekhoFacade();
			 car = vehicleFacade.getVehicleDetailsFacade(connectionObject, vehicle);
		}
		catch(MetaVehicleSystemException e) {
			e.printStackTrace();
			throw new MetaVehicleSystemException("Error occurred in get vehicle details service layer function." + "[" + e.getMessage() + "]");
		}
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
		return car;
	}
	
	/**
	 * This function implements the edit vehicle service layer function.
	 * @param{Vehicle} vehicle
	 * @throws MetaVehicleSystemException
	 */
	
	public void editVehicleService(Vehicle vehicle) throws MetaVehicleSystemException {
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		connectionObject = (Connection) poolObject.getConnectionFromPool();
		try {
			connectionObject.setAutoCommit(false);
			VehicleDekhoFacade vehicleFacade = new VehicleDekhoFacade();
			vehicleFacade.editVehicleFacade(connectionObject, vehicle);
			connectionObject.commit();
		} catch (SQLException e) {
			try {
				connectionObject.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} 
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
	}
	
	/**
	 * This function implements the get distinct make service layer function.
	 * @return{List<String>}
	 * @throws MetaVehicleSystemException
	 */
	
	public List<String> getDistinctMake() throws MetaVehicleSystemException {
		List<String> make = null;
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		connectionObject = (Connection) poolObject.getConnectionFromPool();
		try {
			VehicleDekhoFacade vehicleFacade = new VehicleDekhoFacade();
			make = vehicleFacade.getDistinctMake(connectionObject);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
		return make;
	}
	
	/**
	 * This function performs the get make and model function of the service layer.
	 * @param{Vehicle} vehicle
	 * @return{List<Vehicle}
	 * @throws MetaVehicleSystemException
	 */
	
	public List<Vehicle> getMakeAndModel(Vehicle vehicle) throws MetaVehicleSystemException {
		List<Vehicle> makeAndModel = null;
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		connectionObject = (Connection) poolObject.getConnectionFromPool();
		try {
			VehicleDekhoFacade vehicleFacade = new VehicleDekhoFacade();
			makeAndModel = vehicleFacade.getByMakeAndModel(connectionObject, vehicle);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
		return makeAndModel;
	}
}
