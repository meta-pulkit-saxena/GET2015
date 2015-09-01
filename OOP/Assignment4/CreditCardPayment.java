
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
	
	private Scanner scan;
	private int creditCardNumber;
	private int cvvNumber;
	private PrintUtility printObj;
	
	/**
	 * This function processes the payment for credit card. 
	 */
	
	public void pay(Train finalTrain,Passenger passenger) {
		scan = new Scanner(System.in);
		printObj = new PrintUtility();
		System.out.println("Enter the Credit card number:");
		creditCardNumber = scan.nextInt();												// input credit card details 
		System.out.println("\nEnter the cvv number");
		cvvNumber = scan.nextInt();														// input cvv number.
		printObj.printTicket(finalTrain,passenger);										// Print the ticket
	}

}
