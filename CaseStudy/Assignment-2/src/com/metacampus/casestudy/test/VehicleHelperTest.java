
/**
 * @class  VehicleHelperTest
 * @author Pulkit
 * @since  21st September 15
 * This class tests the vehicle helper class.
 */

package com.metacampus.casestudy.test;

import org.junit.Test;
import com.metacampus.casestudy.helper.VehicleHelper;
import com.metacampus.casestudy.helper.VehicleType;
import com.metacampus.casestudy.modal.Bike;
import com.metacampus.casestudy.modal.Car;
import com.metacampus.casestudy.modal.Vehicle;

public class VehicleHelperTest {

	/**
	 * This function tests the createVehicle() present in vehicle helper class
	 * for the creation of a bike type vehicle object.
	 */
	
	@Test
	public void testVehicleHelperForBike() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.BIKE);
		assert (vehicle instanceof Bike);
	}

	/**
	 * This function tests the createVehicle() present in vehicle helper class
	 * for the creation of a car type vehicle object.
	 */
	
	@Test
	public void testVehicleHelperForCar() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR);
		assert (vehicle instanceof Car);
	}
}
