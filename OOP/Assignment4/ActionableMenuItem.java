
/**
 * @class  ActionableMenuItem
 * @implements MenuItem
 * @author Pulkit
 * @since  15th August 15
 * This class implements the abstract functions of the MenuItem interface
 */

package oops;

public class ActionableMenuItem implements MenuItem{
	private Action action;
	private String displayText; 
	private PrintUtility printObj;
	private PaymentModeInterface payMode;
	
	/**
	 * This is a constructor of class and it sets the display text of the class.
	 * @param{String} displayText
	 */
	
	ActionableMenuItem(String displayText){
		this.displayText = displayText;
	}

	/**
	 * This function displays the display text of the item. 
	 */
	
	@Override
	public void display() {
		System.out.println(displayText);
		
	}
	
	/**
	 * This function takes the action based on the input. 
	 */
	
	@Override
	public void takeAction(int choice,Train finalTrain,Passenger passenger) {
		switch(choice) {
		case 1: payMode = new CreditCardPayment();												// reference of credit card 
				break;
		case 2: printObj.printTicket(finalTrain,passenger);
				break;
		case 3: payMode = new NetBankingPayment();												// reference of net Banking
				break;
		default:System.out.println("Wrong choice");
		}
		payMode.pay(finalTrain, passenger);
		
	}

}
