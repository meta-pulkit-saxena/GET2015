
/**
 * @class  FrequencyMain
 * @author Pulkit
 * @since  02nd September 15
 * This class contains the main function and controls the flow.
 */

package assignment6;

import java.util.Scanner;

public class FrequencyMain {

	/** 
	 * This is main function.
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Frequency object = new Frequency();
		String choice = "";
		int result = 0;
		do {
			System.out.println("Enter the string");
			String input = scan.next();
			result = object.findFrequency(input);
			System.out.println("Frequency of the entered string is:" + result);
			System.out.println("Enter y to add more records and press other key to exit");
			choice = scan.next();
		} while (choice.equalsIgnoreCase("y"));
		scan.close();
	}
}
