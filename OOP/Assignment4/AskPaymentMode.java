
/**
 * @class  AskPaymentMode
 * @author Pulkit
 * @since  15th August 15
 * This class asks the payment mode.
 */

package oops;

import java.util.Scanner;

public class AskPaymentMode {

	private int choice;

	/**
	 * This function displays the menu and take input the choice for payment.
	 * @param{Passenger} passenger
	 * @param{Train} finalTrain
	 */

	public void inputPaymentMode(Train finalTrain, Passenger passenger) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How do you want to pay ticket charges : Press your choice\n ");
		Menu paymentMenu = new Menu();																	// Menu created
		paymentMenu.addMenuItem(new ActionableMenuItem("1. Credit Card"));								// Item 1 added
		paymentMenu.addMenuItem(new ActionableMenuItem("2. Wallet"));									// Item 2 added
		paymentMenu.addMenuItem(new ActionableMenuItem("3. NetBanking"));								// Item 3 added
		paymentMenu.display(finalTrain, passenger);														// Displaying menu
	}
}
