
/**
 * @class  Vehicle
 * @author Pulkit
 * @since  14th September 15
 * This is a modal class for vehicle.
 */

package com.metacampus.casestudy.modal;

public class Vehicle {
	private String make;
	private String model;
	private int engineInCC;
	private int fuelCapacity;
	private int mileage;
	private float price;
	private float roadTax;
	
	/**
	 * This is a default constructor.
	 */
	
	public Vehicle() {
	}
	
	/**
	 * This is a parameterized constructor.
	 * @param{String} model
	 * @param{String} make
	 */
	
	public Vehicle(String model, String make) {
		this.model = model;
		this.make = make;
	}
	
	/**
	 * This function calculates the on road price for the vehicle.
	 * @return{float}
	 */
	
	public float calculateOnRoadPrice() {
		return (price + roadTax);
	}
	
	/**
	 * This function returns the make of the vehicle.
	 * @return{String}
	 */
	
	public String getMake() {
		return make;
	}
	
	/**
	 * This function sets the make of the vehicle.
	 * @param{String} make
	 */
	
	public void setMake(String make) {
		this.make = make;
	}
	
	/**
	 * This function returns the model of the vehicle.
	 * @return{String }
	 */
	
	public String getModel() {
		return model;
	}
	
	/**
	 * This function sets model of the vehicle.
	 * @param{String} model
	 */
	
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * This function returns the engine in cc.
	 * @return{int}
	 */
	
	public int getEngineInCC() {
		return engineInCC;
	}
	
	/**
	 * This function sets the engine in cc.
	 * @param{int} engineInCC
	 */
	
	public void setEngineInCC(int engineInCC) {
		this.engineInCC = engineInCC;
	}
	
	/**
	 * This function returns the fuel capacity.
	 * @return{int}
	 */
	
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	
	/**
	 * This function sets the fuel capacity.
	 * @param{int} fuelCapacity
	 */
	
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	/**
	 * This function returns the mileage of the vehicle.
	 * @return{int}
	 */
	
	public int getMileage() {
		return mileage;
	}
	
	/**
	 * This function sets the mileage of the vehicle.
	 * @param{int} mileage
	 */
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	/**
	 * This function returns the price of vehicle.
	 * @return{float}
	 */
	
	public float getPrice() {
		return price;
	}
	
	/**
	 * This function sets the price of the vehicle.
	 * @param{float} price
	 */
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	/**
	 * This funtion returns the roadtax of the vehicle.
	 * @return{float}
	 */
	
	public float getRoadTax() {
		return roadTax;
	}
	
	/**
	 * This function sets the road tax of the vehicle.
	 * @param{float} roadTax
	 */
	
	public void setRoadTax(float roadTax) {
		this.roadTax = roadTax;
	}
	
	/**
	 * This function overrides the toString function for vehicle.
	 * @overrides toString()
	 */
	
	@Override
	public String toString() {
		return "make = " + make + ", model = " + model + ", engineInCC = " + engineInCC
				+ ", fuelCapacity = " + fuelCapacity + ", milaege = " + mileage
				+ ", price = " + price + ", roadTax = " + roadTax;
	}
}

