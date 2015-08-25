/**
 * @class Car
 * @author Pulkit
 * @since  13th August 15
 *
 */
public class Car {
	private int carNum;
	private String carType;
	
	/**
	 * This is a constructor of class Car.
	 * @param{int} carNum
	 * @param{String} carType
	 */
	
	public Car(int carNum,String carType) {
		this.carNum = carNum;
		this.carType = carType;
	}
	
	/**
	 * This function sets the carNum member of the object.
	 * @param{int} carNum
	 */
	
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	/**
	 * This function returns th carNum of the car.
	 * @return{int}
	 */
	
	public int getCarNum() {
		return this.carNum;
	}
	
	/**
	 * This function sets the carType of the car.
	 * @param{String} carType
	 */
	
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	/**
	 * This function returns the carType of the car.
	 * @return{String}
	 */
	
	public String getCarType() {
		return this.carType;
	}

}
