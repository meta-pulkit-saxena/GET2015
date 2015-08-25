/**
 * @class  Train
 * @author Pulkit
 * @since  15th August 15
 * This class contains all the details of the train entity.
 */

package oops;
public class Train {
	private int trainNumber;
	private String trainName;
	private String trainType;
	private String source;
	private String destination;
	private int duration;
	private float availableSeatOrWeight;
	private float cost;
	
	/**
	 * This function returns the cost of the function.
	 * @return{float} cost
	 */
	
	public float getCost() {
		return cost;
	}

	/**
	 * This function sets the cost of the train.
	 * @param{float} cost
	 */
	
	public void setCost(float cost) {
		this.cost = cost;
	}

	/**
	 * This function returns the train number of the train.
	 * @return{int} trainNumber
	 */
	
	public int getTrainNumber() {
		return trainNumber;
	}
	
	/**
	 * This function will set the train number.
	 * @param{int} trainNumber 
	 */
	
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	/**
	 * This function returns the train name. 
 	 * @return{String} trainName
	 */
	
	public String getTrainName() {
		return trainName;
	}
	
	/**
	 * This function sets the train name
	 * @param{String} trainName 
	 */
	
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	/**
	 * This function returns the type of train like passenger or goods.
	 * @return{String} trainType
	 */
	
	public String getTrainType() {
		return trainType;
	}
	
	/**
	 * This function sets the type of train like passenger or goods.
	 * @param{String} trainType 
	 */
	
	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}
	
	/**
	 * This function returns the station from which train starts
	 * @return{String} source
	 */
	
	public String getSource() {
		return source;
	}
	
	/**
	 * This function sets the starting station of the train.
	 * @param{String} source 
	 */
	
	public void setSource(String source) {
		this.source = source;
	}
	
	/**
	 * This function returns the ending station of the train.
	 * @return{String} destination
	 */
	
	public String getDestination() {
		return destination;
	}
	
	/**
	 * This function sets the destination station of the train. 
	 * @param{String} destination 
	 */
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	/**
	 * This function returns duration of travel from starting station destination station 
	 * @return{int} duration
	 */
	
	public int getDuration() {
		return duration;
	}
	
	/**
	 * This function sets the duration of the train.
	 * @param{int} duration 
	 */
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	/**
	 * This function returns the seats or weight available in the passenger or goods train.
	 * @return{float} getAvailableSeatOrWeight
	 */
	
	public float getAvailableSeatOrWeight() {
		return availableSeatOrWeight;
	}
	
	/**
	 * This function  sets the seat or weight available in the passenger or goods train. 
	 * @param{float} availableSeatOrWeight 
	 */
	
	public void setAvailableSeatOrWeight(float availableSeatOrWeight) {
		this.availableSeatOrWeight = availableSeatOrWeight;
	}
}