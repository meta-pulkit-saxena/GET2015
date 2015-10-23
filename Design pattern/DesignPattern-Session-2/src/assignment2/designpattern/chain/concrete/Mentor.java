
/**
 * @class Mentor
 * @author Pulkit
 * @extend Approver
 * @since 22 october 15
 * This class extends the approver abstract class and  defines all the functionality of the mentor.
 */

package assignment2.designpattern.chain.concrete;

import assignment2.designpattern.chain.Approver;

public class Mentor extends Approver {

	/**
	 * Implementing the processRequest function.
	 */
	
	public void processRequest(int days) {
		if(days < 1) {
			System.out.println("Enter valid days for leave application.");
		}
		else {
			if (days < 2) {
				System.out.println("Request approved by mentor");
			}
			else if (successor != null) {
				System.out.println("Request has been forwarded to Senior mentor");
				successor.processRequest(days);
			}
		}
	}
}
