
/**
 * @class  LinkList
 * @author Pulkit
 * @since  1st September 15
 * This class controls the menu and calls respective functions.
 */

package assignment5;

import java.util.Scanner;

public class LinkList {

	/**
	 * This is the main function.
	 * @param{String} args
	 */
	
	public static void main(String[] args) {
		LinkListInsertion linkListObject = new LinkListInsertion();
		int choice,number,loc;
		int result;
		Scanner scan= new Scanner(System.in);
		do {
			System.out.println("Enter choice: ");
			System.out.println("1. Add an element");
			System.out.println("2. Sort the link list first");
			System.out.println("3. Add an element at a particular location using recursion.");
			System.out.println("4. Display linkList");
			choice = scan.nextInt();
			switch(choice) {
				case 1:
						System.out.println("Enter a number: ");
						number = scan.nextInt();
						linkListObject.insert(number);;
						break;
				case 2:
						linkListObject.sort();
						break;
				case 3:
						System.out.println("Enter the location: ");
						loc = scan.nextInt();
						System.out.println("Enter the value to be entered at given location");
						number = scan.nextInt();
						linkListObject.insert(number, loc);
						break;
				case 4:
						linkListObject.display();
						break;
				default:
						System.out.println("Enter correct choice");
			}
		} while(true);

	}

}
