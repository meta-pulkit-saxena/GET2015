
/**
 * @class  VehicleHelper
 * @author Pulkit
 * @since  21st September 15
 * This class contains all the helper functions related to vehicle.
 */

package com.metacampus.casestudy.helper;

import java.util.List;
import com.metacampus.casestudy.database.DatabaseFunctions;
import com.metacampus.casestudy.modal.Bike;
import com.metacampus.casestudy.modal.Car;
import com.metacampus.casestudy.modal.Vehicle;

public class VehicleHelper {
	
	/**
	 * This function creates a Vehicle object according to the type passed to the function.
	 * @param{VehicleType} vehicleType
	 * @param{String} model
	 * @param{String} make
	 * @return{Vehicle}
	 */
	
	public static Vehicle createVehicle(VehicleType vehicleType) {
		Vehicle newVehicle = null;
		if(vehicleType == VehicleType.CAR) {
			newVehicle = new Car();
		}
		else if(vehicleType == VehicleType.BIKE) {
			newVehicle =  new Bike();
		}
		return newVehicle;
		}
	
	/**
	 * This function inserts all the vehicles in the database provided in the given list.
	 * @param{List<Vehicle>} vehicleList
	 */
	
	public void insertVehiclesInDatabase(List<Vehicle> vehicleList) {
		DatabaseFunctions databaseFunctionsObject = new DatabaseFunctions();
		for(Vehicle vehicle : vehicleList) {
			databaseFunctionsObject.insertVehicle(vehicle);
		}	
	}
}
