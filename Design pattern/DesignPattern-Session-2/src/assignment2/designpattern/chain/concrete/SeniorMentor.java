
/**
 * @class SeniorMentor
 * @author Pulkit
 * @extend Approver
 * @since 22 october 15
 * This class extends the approver abstract class and  defines all the functionality of the senior mentor.
 */

package assignment2.designpattern.chain.concrete;

import assignment2.designpattern.chain.Approver;

public class SeniorMentor extends Approver {
	
	/**
	 * Implementing the processRequest function.
	 */
	
	public void processRequest(int days) {
		if (days < 3)
	      {
	       System.out.println("Request approved by senior mentor");
	      }
	      else if (successor != null)
	      {
	    	System.out.println("Request has been forwarded to HR manager");
	        successor.processRequest(days);
	      }
	}
}
