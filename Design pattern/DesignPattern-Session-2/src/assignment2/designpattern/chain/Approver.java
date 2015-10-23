
/**
 * @abstract Approver
 * @author Pulkit
 * @since 22 october 15
 * This abstract class defines the basic must functions for an approver.
 */


package assignment2.designpattern.chain;

public abstract class Approver {
	protected Approver successor;
	 
	/**
	 * This function sets the successor of it.
	 * @param{Approver} successor
	 */
	
    public void setSuccessor(Approver successor)
    {
      this.successor = successor;
    }
    
    /**
     * function to be implemented by extending classes.
     * @param{int} days
     */
    
    public abstract void processRequest(int days);
}
