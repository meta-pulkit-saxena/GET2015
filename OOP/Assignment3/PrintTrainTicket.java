
/**
 * @class  PrintTrainTicket
 * @author Pulkit
 * @since  14th August 15
 * This class uses printTicket function to print details of the ticket booked by the user.
 */

package oops;

public class PrintTrainTicket {

	/**
	 *  This function prints details of the ticket booked by the user.
	 * @param{Passenger} passenger 
	 * @param{Train} finalTrain 
	 */
	
	public void printTicket(Train finalTrain, Passenger passenger) {
		System.out.println("\n\t\tTicket details");
		System.out.println("\nUser Name:\t" + passenger.getPassengerName());
		System.out.println("Train Number:\t" + finalTrain.getTrainNumber());
		System.out.println("Seats/weight Booked:\t" + finalTrain.getAvailableSeatOrWeight());
		System.out.println("Amount Paid:\t" + (Integer.parseInt(finalTrain.getAvailableSeatOrWeight()) * Integer.parseInt(finalTrain.getCost())) + "\n");
	}
}
