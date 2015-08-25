/**
 * @class  Train
 * @author Pulkit
 * @since  15th August 15
 * This class contains all the details of the train entity.
 */

package oops;
public class Train {
	private String trainNumber;
	private String trainName;
	private String trainType;
	private String source;
	private String destination;
	private String duration;
	private String availableSeatOrWeight;
	private String cost;
	
	/**
	 * This function returns the cost of the function.
	 * @return{String} cost
	 */
	
	public String getCost() {
		return cost;
	}

	/**
	 * This function sets the cost of the train.
	 * @param{String} cost
	 */
	
	public void setCost(String cost) {
		this.cost = cost;
	}

	/**
	 * This function returns the train number of the train.
	 * @return{String} trainNumber
	 */
	
	public String getTrainNumber() {
		return trainNumber;
	}
	
	/**
	 * This function will set the train number.
	 * @param{String} trainNumber 
	 */
	
	public void setTrainNumber(String trainNumber) {
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
	 * @return{String} duration
	 */
	
	public String getDuration() {
		return duration;
	}
	
	/**
	 * This function sets the duration of the train.
	 * @param{String} duration 
	 */
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	/**
	 * This function returns the seats or weight available in the passenger or goods train.
	 * @return{String} getAvailableSeatOrWeight
	 */
	
	public String getAvailableSeatOrWeight() {
		return availableSeatOrWeight;
	}
	
	/**
	 * This function  sets the seat or weight available in the passenger or goods train. 
	 * @param{String} availableSeatOrWeight 
	 */
	
	public void setAvailableSeatOrWeight(String availableSeatOrWeight) {
		this.availableSeatOrWeight = availableSeatOrWeight;
	}
}