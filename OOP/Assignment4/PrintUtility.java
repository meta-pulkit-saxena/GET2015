
/**
 * @class  PrintTrainTicket
 * @author Pulkit
 * @since  14th August 15
 * This class uses printTicket function to print details of the ticket booked by the user.
 */

package oops;

import java.util.List;

public class PrintUtility {
	public float numberOfSeats;
	public float costOfTicket;
	
	/**
	 *  This function prints details of the ticket booked by the user.
	 * @param{Passenger} passenger 
	 * @param{Train} finalTrain 
	 */
	
	public static void printTicket(Train finalTrain, Passenger passenger) {
		numberOfSeats = finalTrain.getAvailableSeatOrWeight();
		costOfTicket = finalTrain.getCost();
		System.out.println("\n\t\tTicket details");
		System.out.println("\nUser Name:\t" + passenger.getPassengerName());
		System.out.println("Train Number:\t" + finalTrain.getTrainNumber());
		System.out.println("Seats/weight Booked:\t" + finalTrain.getAvailableSeatOrWeight());
		System.out.println("Amount Paid:\t" + (numberOfSeats * costOfTicket) + "\n");
	}
	
	/**
	 * This function prints the train chart.
	 */
	
	public static void printTrainChart(List<Train> listOfTrain) {
		for(Train train: listOfTrain) {
			System.out.println(train.getTrainNumber() + "\t" + train.getTrainName() + "\t" + train.getTrainType() + "\t" +  train.getSource() + "\t" 
					+ train.getDestination() + "\t" + train.getDuration() + "\t" + train.getAvailableSeatOrWeight());
		}
	}
}
