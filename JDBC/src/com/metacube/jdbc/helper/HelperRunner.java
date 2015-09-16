
/**
 * @class  HelperRunner
 * @author Pulkit
 * @since  16th September 15
 * This class contains the main function, displays the menu and calls the respective functions.
 */

package com.metacube.jdbc.helper;

import java.util.Scanner;

public class HelperRunner {

	/**
	 * This is the main function.
	 * @param{String[]} args
	 */
	
	public static void main(String[] args) {
		HelperRunner runnerObject = new HelperRunner();
		runnerObject.menuDisplay();																// Displaying menu.
	}
	
	/**
	 * This function will display the menu.
	 */
	
	public void menuDisplay() {
		Scanner scan = new Scanner(System.in);
		String choiceMenu = null;
		Helper helperObject = new Helper();
		do {
			System.out.println("Enter 1 to search titles based on author name");
			System.out.println("Enter 2 to issue book based on title name ");
			System.out.println("Enter 3 to delete books not issued for more than a year.");
			System.out.print("Enter the choice");
			while (!scan.hasNextInt()) {
				System.out.println("That's not a number!");
				scan.next();
			}
			int choice = scan.nextInt();														// Taking choice.
			switch (choice) {
			case 1:
				System.out.println("Enter the author name for which you wanna search titles");
				String name = scan.next();
				helperObject.titleByAuthor(name);
				break;
			case 2:
				System.out.println("Enter the title name you wanna issue");
				String titleName = scan.next();
				System.out.println(helperObject.issueBookByTitle(titleName));
				break;
			case 3:
				int deletedRecords = helperObject.deleteBooks();
				if(deletedRecords == 0 ) {
					System.out.println("No records deleted");
				}
				else {
					System.out.println(deletedRecords);
				}
				break;
			case 4: 
				System.exit(0);
			default:
				System.out.println("wrong Input");
			}
			System.out
					.println("Enter y to continue ");
			choiceMenu = scan.next();
		} while (choiceMenu.equalsIgnoreCase("y"));												// checking for choice.
		scan.close();
	}
}
