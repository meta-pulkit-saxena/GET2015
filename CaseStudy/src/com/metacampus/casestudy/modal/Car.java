
/**
 * @class  Car
 * @author Pulkit
 * @extends Vehicle
 * @since  14th September 15
 * This class is a modal class for car.
 */

package com.metacampus.casestudy.modal;

public class Car extends Vehicle {

	private boolean Ac;
	private boolean powerSteering;
	private boolean accessoryKit;
	
	/**
	 * This is a default constructor of the car.
	 */
	
	public Car() {
	}
	
	/**
	 * This is a parameterized constructor.
	 * @param{String} modal
	 * @param{String} make
	 */
	
	public Car(String modal, String make) {
		super(modal, make);
	}

	/**
	 * This function converts the car members into string.
	 * @override toString
	 */
	
	@Override
	public String toString() {
		return super.toString() + ", AC = " + Ac + ", powerSteering = "
				+ powerSteering + ", accessoryKit = " + accessoryKit;
	}

	/**
	 * This function calculates the road price of the car.
	 * @override calculateOnRoadPrice
	 * @return{float} 
	 */
	
	@Override
	public float calculateOnRoadPrice() {
		float extraPrice = 0;
		if(this.isAc()) {
			extraPrice += 10000;
		}
		if(this.isAccessoryKit()) {
			extraPrice += 7000;
		}
		if(this.isPowerSteering()) {
			extraPrice += 5000;
		}
		return (super.calculateOnRoadPrice() + extraPrice);
	}
	
	/**
	 * This function returns if the AC is present in the car or not.
	 * @return{boolean}
	 */
	
	public boolean isAc() {
		return Ac;
	}

	/**
	 * This function sets if the AC is present or not.
	 * @param{boolean} ac
	 */
	
	public void setAc(boolean ac) {
		this.Ac = ac;
	}

	/**
	 * This function returns if the power steering is present or not.
	 * @return{boolean}
	 */
	
	public boolean isPowerSteering() {
		return powerSteering;
	}

	/**
	 * This function sets if the power steering is present or not.
	 * @param{boolean} powerSteering
	 */
	
	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	/**
	 * This function returns if the accessory kit is present.
	 * @return{boolean}
	 */
	
	public boolean isAccessoryKit() {
		return accessoryKit;
	}

	/**
	 * This function sets if accessory kit is present.
	 * @param{boolean} accessoryKit
	 */
	
	public void SetAccessoryKit(boolean accessoryKit) {
		this.accessoryKit = accessoryKit;
	}
	
}
