
/**
 * @class CreditCardPayment
 * @implements PaymentModeInterface
 * @author Pulkit
 * @since 14th August 15
 * This class implements the payment mode abstract function of PaymentMode interface 
 * according to the credit card payment mode requirements.
 */

package oops;

import java.util.Scanner;

public class CreditCardPayment implements PaymentModeInterface {
	
	private Scanner scan = new Scanner(System.in);
	private int creditCardNumber;
	private int cvvNumber;
	
	/**
	 * This function processes the payment for credit card. 
	 */
	
	public void pay(Train finalTrain,Passenger passenger) {
		
		System.out.println("Enter the Credit card number:");
		creditCardNumber = scan.nextInt();												// input credit card details 
		System.out.println("\nEnter the cvv number");
		cvvNumber = scan.nextInt();														// input cvv number.
		new PrintTrainTicket().printTicket(finalTrain,passenger);						// Print the ticket
	}

}
