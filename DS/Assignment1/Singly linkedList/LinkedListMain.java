
/**
 * @class  LinkedListMain
 * @author Pulkit
 * @since  25th August 15
 * This class contains the main function for running linked list function.
 */

import java.util.Scanner;

public class LinkedListMain {

	/**
	 * This is main function.
	 * @param{String} args
	 */
	
	public static void main(String[] args) {
		String choice;
		Scanner scan = new Scanner(System.in);
		int value,option,index;
		LinkedList<Integer> linkedListObj = new LinkedList<Integer>();
		do {
			displayMenu();
			option = scan.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Enter the value to be added");
				value = scan.nextInt();
				linkedListObj.add(value);
				break;
			case 2:
				linkedListObj.display();
				break;
			case 3:
				System.out.print("\nEnter the location: ");
				index = scan.nextInt();
				System.out.print("Enter a value: ");
				value = scan.nextInt();
				linkedListObj.add(index, value);
				break;
			case 4:
				System.out.print("Enter a value to delete: ");
				value = scan.nextInt();
				linkedListObj.removeItem(value);
				break;
			case 5:
				System.out.print("Enter a location to delete at:");
				index = scan.nextInt();
				linkedListObj.remove(index);
				break;
			case 6: 
				linkedListObj.reverse();
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
		System.out.println("1. Insert Node"); 
		System.out.println("2. Print List");
		System.out.println("3. Insert Node at a location");
		System.out.println("4. Delete Node by value");
		System.out.println("5. Delete By Index");
		System.out.println("6. Reverse the linked list");
	}
}
