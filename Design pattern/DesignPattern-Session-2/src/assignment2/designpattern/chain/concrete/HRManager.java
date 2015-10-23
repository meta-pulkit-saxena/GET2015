
/**
 * @class HRManager
 * @author Pulkit
 * @extend Approver
 * @since 22 october 15
 * This class extends the approver abstract class and  defines all the functionality of the HR manager.
 */ 

package assignment2.designpattern.chain.concrete;

import assignment2.designpattern.chain.Approver;

public class HRManager extends Approver {
	
	/**
	 * Implementing the processRequest function.
	 */
	
	public void processRequest(int days) {
		if (days < 6)
	      {
	       System.out.println("Request approved by HR manager");
	      }
	      else 
	      {
	        System.out.println("Can not approve this request.");
	      }
	}
}
