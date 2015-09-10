
/**
 * @class  BookingSystem
 * @author Pulkit
 * @since  30th August 15
 * This class is the main class of booking system
 */

package assignment4;

import java.util.Scanner;

public class BookingSystem {

	/**
	 * This is the main function.
	 * @param{String} args
	 */
	
	public static void main(String[] args) {
		BookingSystem bookingObj = new BookingSystem();
		bookingObj.menu();
	}
	
	
	/**
	 * This function will display menu , take input from user and call respective functions
	 */
	
	public void menu() {
		int age;
		String name,choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter prime number of rooms");
		Hashing hashing = new Hashing(scan.nextInt());
		Guest guest = null;
	
		do {
			System.out.println("Enter the name and age of the guest");
			name = scan.next();
			age = scan.nextInt();
			guest = new Guest(name,age);
			hashing.setGuest(guest);
			hashing.allotRoom();
			System.out.println("Do you want to enter more guests(y/n");
			choice = scan.next();
		}while(choice.equalsIgnoreCase("y") );
		hashing.displayBookingStatus();
	}

}
