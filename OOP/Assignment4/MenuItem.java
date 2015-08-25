
/**
 * This interface declares the functions for the menu items to implement.
 * @interface MenuItem
 * @author lenovo
 * @since  15th August 15
 */

package oops;

public interface MenuItem {
	
	/**
	 * Declaration of display function. 
	 */
	
	public void display();
	
	/**
	 * Declaration of takeAction function.
	 */
	
	public void takeAction(int i,Train finalTrain,Passenger passenger);

}
