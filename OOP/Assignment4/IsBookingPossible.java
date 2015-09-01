
/**
 * @class  IsBookingPossible
 * @author Pulkit
 * @since  14th August 15
 */

package oops;

import java.util.List;

public class IsBookingPossible {
	public float requirement;
	public float newAvailable;
	public int trainNumber;
	private AskPaymentMode askMode;
	private PrintUtility printObj;
	
	/**
	 * This function actually books the ticket if number of seats or weight are available in the requested train
	 * otherwise prints a error message and again starts the whole system.
	 * @param{Train} finalTrain
	 * @param{List<Train>} trainList
	 * @param{Passenger} passenger
	 */
	
	public void checkIfPossible(Train finalTrain,List<Train> trainList, Passenger passenger) {
		int iteratorTrainNumber;
		float availability;
		printObj = new PrintUtility();
		requirement = finalTrain.getAvailableSeatOrWeight();
		trainNumber = finalTrain.getTrainNumber();
		for(Train trainIterator: trainList) {
			iteratorTrainNumber = trainIterator.getTrainNumber();
			availability = trainIterator.getAvailableSeatOrWeight();
			if(trainNumber == iteratorTrainNumber && requirement < availability) {
				finalTrain.setCost(trainIterator.getCost());
				finalTrain.setAvailableSeatOrWeight(requirement);
				newAvailable = (availability - requirement);			
				trainIterator.setAvailableSeatOrWeight(newAvailable);									// changing available seats.
				askMode.inputPaymentMode(finalTrain,passenger);											// asking for payment mode.
			}
		}
	}
}
