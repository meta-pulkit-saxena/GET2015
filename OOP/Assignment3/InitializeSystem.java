
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
	
	private BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	private Passenger passenger = new Passenger();																
	private List<Train> trains = new ArrayList<Train>();                                                              // List of train objects.
	private List<Train> refinedTrains = new ArrayList<Train>();
	private Train tempTrainObject;
	private FilterTrainOnSourceDestinationBasis filterSourceDestination = new FilterTrainOnSourceDestinationBasis();
	private PrintTrainChart print = new PrintTrainChart();
	
	/**
	 * This function starts the reservation system. 
	 */
	
	public void initializeSystem() {
		
		try{
			tempTrainObject = new Train();
			System.out.println("Enter your name: ");
			passenger.setPassengerName(scan.readLine());
			System.out.println("\nEnter the type of train you want to search in (p for passsenger/g for goods):\n");
			trains = new ReadTrain().readTrainFile(scan.readLine());													// Read train list from the file.
			print.printTrainChart(trains);																				// Print train chart.
			System.out.println("\nEnter the source station and destination station");
			tempTrainObject.setSource(scan.readLine());
			tempTrainObject.setDestination(scan.readLine());
			refinedTrains = filterSourceDestination.filterTrain(tempTrainObject,trains);
			if(refinedTrains.size() > 0) {																				// Entering if train found.
				System.out.println("\nThe available trains between input stations are:\n");
				print.printTrainChart(refinedTrains);																	// Printing filtered trains
				System.out.println("\nEnter train number and seats or weight to book");
				tempTrainObject.setTrainNumber(scan.readLine());
				tempTrainObject.setAvailableSeatOrWeight(scan.readLine());
				new IsBookingPossible().checkIfPossible(tempTrainObject, refinedTrains,passenger);						// Checking if booking is possible.
				System.out.println("here");
				print.printTrainChart(trains);
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
