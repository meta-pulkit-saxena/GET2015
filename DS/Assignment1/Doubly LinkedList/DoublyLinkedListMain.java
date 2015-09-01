
/**
 * @class  DoublyLinkedListMain
 * @author Pulkit
 * @since  25th August 15
 * This class  contains the main function for the execution of the doubly linked list.
 */

import java.util.Scanner;

public class DoublyLinkedListMain {
	
	public static void main(String args[]) {
		String choiceContinue = "";
		Scanner scan;
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		do {
			scan = new Scanner(System.in);
			System.out.print("Menu:");
			System.out.println("1. Create List");
			System.out.println("2. Print List");
			System.out.println("3. Insert Node at Postion");
			System.out.println("4. Delete Node");
			System.out.println("5. Delete Node by Position");
			System.out.println("6. Reverse of List");
			
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				doublyLinkedList.createList();
				break;
			case 2:
				doublyLinkedList.displayList();
				break;
			case 3:
				System.out.println("Enter Position");
				int position = scan.nextInt();
				System.out.println("Enter data to be added");
				int value = scan.nextInt();
				 doublyLinkedList.add(position,value);
				break;
			case 4:
				doublyLinkedList.delete();
				break;
			case 5:
				System.out.println("Enter Position ");
				int val = scan.nextInt();
				doublyLinkedList.delete(val);
				break;
			case 6:
				doublyLinkedList.reverse();
				break;
			default:
				System.out.println("Please enter corrrect choice");
			}
			System.out.println("Do you want to perform more operations??(y or n)");
				choiceContinue = scan.next();
		} while (choiceContinue.equalsIgnoreCase("y"));
	}
}
