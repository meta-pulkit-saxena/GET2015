
/**
 * @class  VehicleDetailPrinterTest
 * @author Pulkit
 * @since  14th September 15
 * This class tests the vehicleDetailPrinter class.
 */

package com.metacampus.casestudy.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.metacampus.casestudy.helper.VehicleHelper;
import com.metacampus.casestudy.helper.VehicleType;
import com.metacampus.casestudy.modal.Vehicle;

public class VehicleDetailPrinterTest {

	/**
	 * This function tests the VehicleDetailPrinter function for car.
	 */
	
	@Test
	public void testVehicleDetailPrinterForCar() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR, "Figo", "Ford");
		String expectedString = "make = Ford, model = Figo, engineInCC = 900, fuelCapacity = 30, milaege = 21, price = 550000.0, roadTax = 25000.0, AC = true, powerSteering = true, accessoryKit = true";
		assertEquals(expectedString , vehicle.toString());
	}

	/**
	 * This function tests the VehicleDetailPrinter function for bike.
	 */
	
	@Test
	public void testVehicleDetailPrinterForBike() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.BIKE, "Pulsar", "Bajaj");
		String expectedString = "make = Bajaj, model = Pulsar, engineInCC = 220, fuelCapacity = 15, milaege = 45, price = 45000.0, roadTax = 5000.0, selfStart = true, helmetPrice = 1000.0";
		assertEquals(expectedString , vehicle.toString());
	}
	
}
