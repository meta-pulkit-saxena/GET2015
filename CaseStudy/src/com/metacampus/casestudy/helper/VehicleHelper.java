
/**
 * @class  VehicleHelper
 * @author Pulkit
 * @since  14th September 15
 * This class contains all the helper functions related to vehicle.
 */

package com.metacampus.casestudy.helper;

import com.metacampus.casestudy.modal.Bike;
import com.metacampus.casestudy.modal.Car;
import com.metacampus.casestudy.modal.Vehicle;

public class VehicleHelper {
	
	/**
	 * This function creates a Vehicle object according to the type passed to the function.
	 * @param vehicleType
	 * @param modal
	 * @param make
	 * @return
	 */
	
	public static Vehicle createVehicle(VehicleType vehicleType, String model, String make) {
		Vehicle newVehicle = null;
		if(vehicleType == VehicleType.CAR) {
			newVehicle = createCar(model, make);
		}
		else if(vehicleType == VehicleType.BIKE) {
			newVehicle =  createBike(model,make);
		}
		return newVehicle;
	}

	/**
	 * This function creates a Bike object and returns it.
	 * @param{String} model
	 * @param{String} make
	 * @return{Bike}
	 */
	
	private static Bike createBike(String model, String make) {
		Bike bike = new Bike(model, make);
		bike.setEngineInCC(220);
		bike.setFuelCapacity(15);
		bike.setMileage(45);
		bike.setPrice(45000);
		bike.setRoadTax(5000);
		bike.setHelmetPrice(1000);
		bike.setSelfStart(true);
		return bike;
	}

	/**
	 * This function creates a car object and returns it.
	 * @param{String} model
	 * @param{String} make
	 * @return{Car}
	 */
	
	private static Car createCar(String model, String make) {
		Car car = new Car(model, make);
		car.setEngineInCC(900);
		car.setFuelCapacity(30);
		car.setMileage(21);
		car.setPrice(550000);
		car.setRoadTax(25000);
		car.setAc(true);
		car.setPowerSteering(true);
		car.SetAccessoryKit(true);
		return car;
	}
}
