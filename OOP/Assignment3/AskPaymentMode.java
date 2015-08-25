
/**
 * @class  AskPaymentMode
 * @author Pulkit
 * @since 15th August 15
 * This class asks the user about the payment mode.
 */

package oops;

import java.util.Scanner;

public class AskPaymentMode {

	private int choice;

	/**
	 * This takes the input mode by the user.
	 * @param{Passenger} passenger
	 * @param{Train} finalTrain
	 */

	public void inputPaymentMode(Train finalTrain, Passenger passenger) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How do you want to pay ticket charges : Press your choice\n ");
		System.out.println("1. Credit card\n" + "2. Wallet\n" + "3. NetBanking\n");
		choice = scan.nextInt();
		switch(choice) {
		case 1: new CreditCardPayment().pay(finalTrain,passenger);                              // Payment by credit card.
				break;
		case 2: new PrintTrainTicket().printTicket(finalTrain,passenger);                       // Payment by wallet.
				break;
		case 3: new NetBankingPayment().pay(finalTrain,passenger);                              // Payment by net banking.
				break;
		default:System.out.println("Enter correct choice");
				inputPaymentMode(finalTrain, passenger);
		}
	}
}
