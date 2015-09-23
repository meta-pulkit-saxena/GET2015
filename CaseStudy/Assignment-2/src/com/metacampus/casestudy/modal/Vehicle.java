
/**
 * @class  Vehicle
 * @author Pulkit
 * @since  21st September 15
 * This is a modal class for vehicle.
 */

package com.metacampus.casestudy.modal;

import java.sql.Timestamp;

public class Vehicle {
	private int vehicleId;
	private String createdBy;
	private Timestamp createdTime;
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
	 * This function returns the vehicle id of the vehicle.
	 * @return{int} vehicleId
	 */
	
	public int getVehicleId() {
		return vehicleId;
	}

	/**This function sets the id of the vehicle.
 	 * @param{int} vehicleId
	 */
	
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	/**
	 * This function returns the created by of the vehicle object.
	 * @return{String} createdBy
	 */
	
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * This function sets the created by for the vehicle object.
	 * @param{String} createdBy 
	 */
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * This function returns the created time of the vehicle object.
	 * @return{Date} createdTime
	 */
	
	public Timestamp getCreatedTime() {
		return createdTime;
	}

	/**
	 * This function returns  
	 * @param{Timestamp} createdTime the createdTime to set
	 */
	
	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
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
	 * This function returns the road tax of the vehicle.
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
				+ ", fuelCapacity = " + fuelCapacity + ", mileage = " + mileage
				+ ", price = " + price + ", roadTax = " + roadTax;
	}

	/**
	 * This function implements the hashcode function for the vehicle.
	 * @override hashCode()
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
		result = prime * result + engineInCC;
		result = prime * result + fuelCapacity;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + mileage;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + Float.floatToIntBits(roadTax);
		result = prime * result + vehicleId;
		return result;
	}

	/**
	 * This function implements the equals function for the vehicle.
	 * @override equals()
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdTime == null) {
			if (other.createdTime != null)
				return false;
		} else if (!createdTime.equals(other.createdTime))
			return false;
		if (engineInCC != other.engineInCC)
			return false;
		if (fuelCapacity != other.fuelCapacity)
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (mileage != other.mileage)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (Float.floatToIntBits(roadTax) != Float
				.floatToIntBits(other.roadTax))
			return false;
		if (vehicleId != other.vehicleId)
			return false;
		return true;
	}
}

