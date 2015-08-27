
/**
 * @class  ControlClass
 * @author Pulkit
 * @since  20th August 15
 * This class will control the input and display related functions of the social system.
 */

import java.util.Scanner;

public class ControlClass {
	private Scanner scan;
	private int choice;
	private Graph graphNetwork;
	
	/** 
	 * This function will take input from user and call respective functions according to the need.
	 */
	
	public void control() {
		graphNetwork = new Graph();
		graphNetwork.initializeGraph();
		long hashCode;
		Record recordObj = new Record();
		UtilityFunctions utilObj = new UtilityFunctions();
		scan = new Scanner(System.in);
		do {
			String firstEmail,secondEmail;
			displayMenu();
			System.out.println("\nEnter your choice: ");
			choice = scan.nextInt();
			switch(choice) {
			case 1: graphNetwork.displayGraph(graphNetwork.nodesInGraph);
					break;
			case 2: System.out.println("Enter the e-mail of the user you want to search.");
					firstEmail = scan.next(); 
					graphNetwork.searchEntity(firstEmail);													// Calling function for searching a entity.
					break;
			case 3: System.out.println("Enter the first email.");
					firstEmail = scan.next();
					System.out.println("Enter the second email");
					secondEmail = scan.next();
					graphNetwork.addConnectionBetween(firstEmail, secondEmail);								// Calling function for adding two entities.
					break;
			case 4: System.out.println("Enter the first email.");
					firstEmail = scan.next();
					System.out.println("Enter the second email");
					secondEmail = scan.next();
					graphNetwork.removeConnectionBetween(firstEmail, secondEmail);							// Calling function to remove connection between 
					break;																					// two entities.
			case 5: System.out.println("Enter the email of entity to be removed from network.");
					firstEmail = scan.next();
					graphNetwork.removeNodeFromGraph(firstEmail);											// Calling function to remove a node from network.
					break;
			case 6: graphNetwork.addNodeInGraph();
					break;
			case 7: System.out.println("Enter th email of the entity for which you want record");
					firstEmail = scan.next(); 
					recordObj.printRecord(firstEmail, graphNetwork);
					break;
			case 8: System.out.println("Enter the email of node for which you want to calculate hashcode");
					firstEmail = scan.next();
					hashCode = utilObj.nodeHashCode(firstEmail, graphNetwork);								// Calling the function to calculate the hash code. 
					System.out.println("Hashcode is: " + hashCode); 
					break;
			case 9: System.exit(0);																		
			}
			
		}while(choice != 9);
	}
	
	/**
	 * This function will display the menu for the user.
	 */
	
	public void displayMenu() {
		System.out.println("\nPress according your needs:");
		System.out.println("1. Display the social network.");
		System.out.println("2. Search for the person/Organization in the social nework.");
		System.out.println("3. Add connection between two entities");										// Displayng the menu for user.
		System.out.println("4. Remove connection between two entities");
		System.out.println("5. Remove entity from the whole network");
		System.out.println("6. Add a node in the graph network");
		System.out.println("7. Print the record of a entity");
		System.out.println("8. Print hash code for a node.");
		System.out.println("9. To LogOut");
	}
	
}
