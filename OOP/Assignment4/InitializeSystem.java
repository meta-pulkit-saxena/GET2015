
/**
 * @class  InitializeSystem
 * @author Pulkit
 * @since  14th August 15
 * This class initializes the system and maintains the flow of the program .
 */

package oops;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitializeSystem {
	
	private BufferedReader scan;
	private Passenger passenger;															
	private List<Train> trains;                                                             						   // List of train objects.
	private List<Train> refinedTrains;
	private Train tempTrainObject;
	private Filter filterSourceDestination;
	private PrintUtility printObj;
	private IsBookingPossible bookingObj;
	
	/**
	 * This function starts the reservation system. 
	 */
	
	public void initializeSystem() {
		
		try{
			scan = new BufferedReader(new InputStreamReader(System.in));
			passenger = new Passenger();	
			bookingObj = new IsBookingPossible();
			tempTrainObject = new Train();
			System.out.println("Enter your name: ");
			passenger.setPassengerName(scan.readLine());
			System.out.println("\nEnter the type of train you want to search in (p for passsenger/g for goods):\n");
			trains = new ReadTrain().readTrainFile(scan.readLine());													// Read train list from the file.
			printObj.printTrainChart(trains);																			// Print train chart.
			System.out.println("\nEnter the source station and destination station");
			tempTrainObject.setSource(scan.readLine());
			tempTrainObject.setDestination(scan.readLine());
			filterSourceDestination = new Filter();
			refinedTrains = filterSourceDestination.FilterTrainOnSourceDestinationBasis(tempTrainObject,trains);
			if(refinedTrains.size() > 0) {																				// Entering if train found.
				System.out.println("\nThe available trains between input stations are:\n");
				printObj.printTrainChart(refinedTrains);																// Printing filtered trains
				System.out.println("\nEnter train number and seats or weight to book");
				tempTrainObject.setTrainNumber(Integer.parseInt(scan.readLine()));
				tempTrainObject.setAvailableSeatOrWeight(Float.parseFloat(scan.readLine()));
				bookingObj.checkIfPossible(tempTrainObject, refinedTrains,passenger);									// Checking if booking is possible.
				System.out.println("here");
				printObj.printTrainChart(trains);
			}
			else {
				System.out.println("\nSorry no trains available between input stations\nTry Again...");					// if no trains found
				initializeSystem();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
