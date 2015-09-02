
/**
 * @class  DoublyLinkedListMain
 * @author Pulkit
 * @since  25th August 15
 * This class contains the main function for the doubly linked list
 */

package RevisedDsAssignment1;

import java.util.Scanner;

public class DoublyLinkedListMain {

	/**
	 * This function is the main function.
	 * @param{String[]} args
	 */
	
	public static void main(String []args) {
		String choice;
		Scanner scan = new Scanner(System.in);
		int value,location;
		DoublyLinkedList<Integer> doublyListObj = new DoublyLinkedList<Integer>();
		do {
			displayMenu();
			int option = scan.nextInt();
		
			switch(option) {
			case 1:
				System.out.println("Enter the node value to be inserted.");
				value = scan.nextInt();
				doublyListObj.add(value);
				break;
			case 2:
				doublyListObj.display();
				break;
			case 3:
				System.out.print("Enter a value: ");
				value = scan.nextInt();
				System.out.print("Enter Position: ");
				location = scan.nextInt();
				doublyListObj.add(location, value);
				break;
			case 4:
				System.out.print("Enter a value to be deleted");
				value = scan.nextInt();
				doublyListObj.removeItem(value);
				break;
			case 5:
				System.out.print("Enter Index to be deleted: ");
				location = scan.nextInt();
				doublyListObj.remove(location);
				break;
			case 6:
				doublyListObj.reverse();
				break;
			default:
				System.out.println("Enter correct choice");
			}
			System.out.println("Do you want to perform more operations?? (y or n)");
			choice = scan.next();
		} while(choice.equalsIgnoreCase("y"));	
	}
	
	/**
	 * This function will display the menu options.
	 */
	
	public static void displayMenu() {
		System.out.println("Menu:");
		System.out.println("1. Insert node"); 
		System.out.println("2. Print List");
		System.out.println("3. Insert Node at location");
		System.out.println("4. Delete Node ");
		System.out.println("5. Delete By Index");
		System.out.println("6. Reverse the  doubly linked list");
	}
}
