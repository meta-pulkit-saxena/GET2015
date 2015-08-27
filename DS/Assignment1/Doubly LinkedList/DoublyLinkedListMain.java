
/**
 * @class  DoublyLinkedListMain
 * @author Pulkit
 * @since  25th August 15
 * This class  contains the main function for the execution of the doubly linked list.
 */

import java.util.Scanner;

public class DoublyLinkedListMain {
	
	public static void main(String args[]) {

		DoublyNode startNode = null;
		String choiceContinue = "";
		Scanner scan;
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
			DoublyLinkedListFunctions doublyLinkedList = new DoublyLinkedListFunctions();
			switch (choice) {
			case 1:
				startNode = doublyLinkedList.createList();
				break;
			case 2:
				doublyLinkedList.displayList(startNode);
				break;
			case 3:
				System.out.println("Enter Position");
				int position = scan.nextInt();
				DoublyNode head = doublyLinkedList.insertAtPosition(startNode,
						position);
				if (DoublyLinkedListFunctions.check(head))
					startNode = head;
				break;
			case 4:
				head = doublyLinkedList.deleteNode(startNode);
				if (DoublyLinkedListFunctions.check(head))
					startNode = head;
				break;
			case 5:
				head = doublyLinkedList.deleteNodeAtPosition(startNode);
				if (DoublyLinkedListFunctions.check(head))
					startNode = head;
				break;
			case 6:
				startNode = doublyLinkedList.reverse(startNode);
				break;
			default:
				System.out.println("Please enter corrrect choice");
			}
			System.out.println("Do you want to perform more operations??(y or n)");
				choiceContinue = scan.next();
		} while (choiceContinue.equalsIgnoreCase("y"));
	}


}
