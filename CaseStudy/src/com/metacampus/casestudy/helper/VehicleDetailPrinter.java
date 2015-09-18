
/**
 * @class  VehicleDetailPrinter
 * @author Pulkit
 * @since  14th September 15
 * This class prints the details of the vehicle object passed to it.
 */

package com.metacampus.casestudy.helper;

import com.metacampus.casestudy.modal.Vehicle;

public class VehicleDetailPrinter {
	
	/**
	 * This function returns the vehicle members in string form.
	 * @param{Vehicle} vehicle
	 * @return{String}
	 */
	
	public static String printVehicleSpecification(Vehicle vehicle) {
		return vehicle.toString();
	}
}
