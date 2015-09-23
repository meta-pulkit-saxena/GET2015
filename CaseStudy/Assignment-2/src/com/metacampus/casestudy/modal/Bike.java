
/**
 * @class  Bike
 * @author Pulkit
 * @extends Vehicle
 * @since  21st September 15
 * This is a modal class for bike.
 */

package com.metacampus.casestudy.modal;

public class Bike extends Vehicle{
	private boolean selfStart;
	private float helmetPrice;
	
	/**
	 * This is a default constructor.
	 */
	
	public Bike() {	
	}
	
	/**
	 * This is a parameterized constructor of bike.
	 * @param{String} modal
	 * @param{String} make
	 */
	
	public Bike(String modal, String make) {
		super(modal, make);
	}
	
	/**
	 * This function converts the object members to string.
	 * @overrides toString()
	 */
	
	@Override
	public String toString() {
		return super.toString() + ", selfStart = " + selfStart + ", helmetPrice = "
				+ helmetPrice;
	}
	
	/**
	 * This function calculates the on road price for bike.
	 * @overrides calculateOnRoadPrice() 
	 */
	
	@Override
	public float calculateOnRoadPrice() {
		float extraPrice = this.helmetPrice;
		if(this.isSelfStart()) {
			extraPrice += 2000;
		}
		return (super.calculateOnRoadPrice() + extraPrice);
	}
	
	/**
	 * This function returns if self start feature is present or not.
	 * @return{boolean}
	 */
	
	public boolean isSelfStart() {
		return selfStart;
	}
	
	/**
	 * This function sets the self start value true or false.
	 * @param{boolean} selfStart 
	 */
	
	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}
	
	/**
	 * This function returns the helmet price of bike.
	 * @return{float}
	 */
	
	public float getHelmetPrice() {
		return helmetPrice;
	}
	
	/**
	 * This function sets the helmet price of the bike.
	 * @param{float} helmetPrice
	 */
	
	public void setHelmetPrice(float helmetPrice) {
		this.helmetPrice = helmetPrice;
	}	
}
