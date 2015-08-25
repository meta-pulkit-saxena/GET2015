
/**
 * @class  IsBookingPossible
 * @author Pulkit
 * @since  14th August 15
 */

package oops;

import java.util.List;

public class IsBookingPossible {
	int requirement;
	int newAvailable;
	int found;
	
	/**
	 * This function actually books the ticket if number of seats or weight are available in the requested train
	 * otherwise prints a error message and again starts the whole system.
	 * @param{Train} finalTrain
	 * @param{List<Train>} trainList
	 * @param{Passenger} passenger
	 */
	
	public void checkIfPossible(Train finalTrain,List<Train> trainList, Passenger passenger) {
		requirement = Integer.parseInt(finalTrain.getAvailableSeatOrWeight());
		for(Train trainIterator: trainList) {
			if(finalTrain.getTrainNumber().equalsIgnoreCase(trainIterator.getTrainNumber()) && requirement < Integer.parseInt(trainIterator.getAvailableSeatOrWeight())) {
				finalTrain.setCost(trainIterator.getCost());
				finalTrain.setAvailableSeatOrWeight(Integer.toString(requirement));
				newAvailable = ((Integer.parseInt(trainIterator.getAvailableSeatOrWeight())) - requirement);			
				trainIterator.setAvailableSeatOrWeight(Integer.toString(newAvailable));									// changing available seats.
				new AskPaymentMode().inputPaymentMode(finalTrain,passenger);											// asking for payment mode.
				found=1;
			}
		}
		if(found == 0) {																								// If availability is not suffice.
			System.out.println("\nSorry your request can not be fulfilled\n Try again....");
			new PrintTrainChart().printTrainChart(trainList);	
		}
	}
}
