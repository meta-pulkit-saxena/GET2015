package com.metacampus.casestudy.modal;

public class Vehicle {
	private String make;
	private String model;
	private int engineInCC;
	private int fuelCapacity;
	private int mileage;
	private float price;
	private float roadTax;
	
	public Vehicle() {
	}
	
	public Vehicle(String modal, String make) {
		this.model = modal;
		this.make = make;
	}
	
	public float calculateOnRoadPrice() {
		return (price + roadTax);
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getEngineInCC() {
		return engineInCC;
	}
	public void setEngineInCC(int engineInCC) {
		this.engineInCC = engineInCC;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getRoadTax() {
		return roadTax;
	}
	public void setRoadTax(float roadTax) {
		this.roadTax = roadTax;
	}
	
	@Override
	public String toString() {
		return "make = " + make + ", model = " + model + ", engineInCC = " + engineInCC
				+ ", fuelCapacity = " + fuelCapacity + ", milaege = " + mileage
				+ ", price = " + price + ", roadTax = " + roadTax;
	}
}

