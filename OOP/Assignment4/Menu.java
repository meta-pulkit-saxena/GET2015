
/**
 * @class Menu
 * @author Pulkit
 * @since  15th august 15
 * This class adds the menu items, displays them and calls their action. 
 */

package oops;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private List<MenuItem> items = new ArrayList<>();
	private Scanner scan  = new Scanner(System.in);
	
	/**
	 * This function adds the menu item to its list.
	 * @param{MenuItem} item
	 */
	
	public void addMenuItem(MenuItem item){
		items.add(item);
	}
	
	/**
	 * This functions displays the menu items and then calls their action.
	 * @param{Train} finalTrain
	 * @param{Passenger} passenger
	 */
	
	public void display(Train finalTrain,Passenger passenger) {
		boolean count = true;
		while (count) {
			for (MenuItem i : items) {
				i.display();												// Displaying items
			}
			int choice = scan.nextInt();
			MenuItem i = items.get(choice - 1) ;
			i.takeAction(choice,finalTrain,passenger);						// Based on input choice action of that item is called.	
			count = false;
		}
		
	}

}
