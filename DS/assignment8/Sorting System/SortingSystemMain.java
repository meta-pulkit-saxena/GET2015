
/**
 * @class  SortingSystemMain
 * @author Pulkit
 * @since  4th September 15
 * This class controls the whole functioning of system.
 */

package Assignment8;

import java.util.Scanner;

public class SortingSystemMain {

	/**This is the main function.
	 * @param{String[]} args
	 */
	
	public static void main(String[] args) {
		SortingSystemMain object = new SortingSystemMain();
		object.menuRunner();
	}

	/**
	 * This function run the menu and in return calls the respective function.
	 */

	public void menuRunner() {
		String choice;
		int option, value;
		Scanner scan = new Scanner(System.in);
		SortingSystem sortSystem = new SortingSystem();
		do {
			System.out.println("1. Add a value to be sorted.\n"
					+ "2. Select the type of sorting you want to use.\n"
					+ "3. Display the sorted array."
					+ "4. Exit system.");
			System.out.println("Enter an option:");
			option = scan.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter a number you want to sort.");
				while (!scan.hasNextInt()) {
					System.out.println("Please enter a valid number");
					scan.next();
				}
				value = scan.nextInt();
				sortSystem.add(value);
				break;
			case 2:
				System.out.println("Enter you preference regarding type of sorting algo to be used.\n"
									+ "1. Comparison sorting algorithms.\n" 
									+ "2. Linear Sorting algorithms");
				int type = scan.nextInt();
				if(type == 1) {
					sortSystem.decideComparisonSorting();
				}
				else {
					sortSystem.decideLinearAlgo();
				}
				break;
			case 3:
				sortSystem.display();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Enter a correct choice:");
			}
			System.out.println("Enter y to continue.");
			choice = scan.next();
		} while (choice.equalsIgnoreCase("y"));
		scan.close();
	}
}
