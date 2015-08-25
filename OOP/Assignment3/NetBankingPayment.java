
/**
 * @class TrainReservation
 * @implements PaymentModeInterface
 * @author Pulkit
 * @since  14th August 15
 * This class implements the payment mode abstract function of PaymentMode interface 
 * according to the net banking payment mode requirements.
 */

package oops;

import java.util.Scanner;

public class NetBankingPayment implements PaymentModeInterface {
	private Scanner scan = new Scanner(System.in);
	private String bankName;
	private String userName;
	private String password;
	
	/**
	 * This function processes the payment through net banking.
	 * @param{Train} finalTrain
	 * @param{Passenger} passenger 
	 */
	
	public void pay(Train finalTrain,Passenger passenger) {
		System.out.println("Enter the bank name:");
		bankName = scan.nextLine();
		System.out.println("\nEnter the user name:");
		userName = scan.nextLine();
		System.out.println("\nEnter the password");
		password = scan.nextLine();
		new PrintTrainTicket().printTicket(finalTrain, passenger);					// printing the tickets.
	}
}
