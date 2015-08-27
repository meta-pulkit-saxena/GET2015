
/**
 * @class LinkedListMain
 * @author Pulkit
 * @since  25th August 15
 * This class contains the 
 */

import java.util.Scanner;

public class LinkedListMain {
	
	/**
	 * This function will display the menu options.
	 */
	
	public static void displayMenu() {
		System.out.println("Menu:");
		System.out.println("1. Create List"); 
		System.out.println("2. Print List");
		System.out.println("3. Insert Node");
		System.out.println("4. Insert In between");
		System.out.println("5. Delete Node ");
		System.out.println("6. Delete By Index");
		System.out.println("7. Reverse the linked list");
	}
	
	/**
	 * This function will start the execution. And it will control the flow.
	 * @param{String[]} args
	 */
	
	public static void main(String []args) {
		String choice;
		Scanner scan = new Scanner(System.in);
		LinkedList start = null;
		int value;
		do {
			displayMenu();
			int option = scan.nextInt();
			LinkedList linkedListObj = new LinkedList();
			switch(option) {
			case 1:
				start = linkedListObj.createList();
				break;
			case 2:
				linkedListObj.displayLinkedList(start);
				break;
			case 3:
				System.out.print("\nEnter a value to insert: ");
				int element = scan.nextInt();
				linkedListObj.addNode(start, element);
				break;
			case 4:
				System.out.print("Enter a value: ");
				value = scan.nextInt();
				System.out.print("Enter Position: ");
				int position = scan.nextInt();
				start=linkedListObj.addAtLocation(start, position, value);
				break;
			case 5:
				System.out.print("Enter a value");
				value = scan.nextInt();
				linkedListObj.deleteElement(start, value);
				break;
			case 6:
				System.out.print("Enter Index: ");
				value = scan.nextInt();
				linkedListObj.deleteAtIndex(start, value);
				break;
			case 7: start = linkedListObj.reverseLinkedList(start);
				break;
			default:
				System.out.println("Enter correct choice");
			}
			System.out.println("Do you want to perform more operations?? (y or n)");
			choice = scan.next();
		} while(choice.equalsIgnoreCase("y"));	
	}
	
	
}
