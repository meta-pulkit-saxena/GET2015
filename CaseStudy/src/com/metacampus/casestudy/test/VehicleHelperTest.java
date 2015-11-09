
/**
 * @class VehicleHelperTest
 * @author Pulkit
 * @since 14th September 15
 * This class tests the 
 */

package com.metacampus.casestudy.test;

import org.junit.Test;

import com.metacampus.casestudy.helper.VehicleHelper;
import com.metacampus.casestudy.helper.VehicleType;
import com.metacampus.casestudy.modal.Bike;
import com.metacampus.casestudy.modal.Car;
import com.metacampus.casestudy.modal.Vehicle;


public class VehicleHelperTest {

	@Test
	public void testVehicleHelperForCar() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR, "Figo", "Ford");
		assert(vehicle instanceof Car );
	}
	
	@Test
	public void testVehicleHelperForBike() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.BIKE, "Pulsar", "Bajaj");
		assert(vehicle instanceof Bike );
	}

}
