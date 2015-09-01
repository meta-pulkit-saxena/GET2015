
/**
 * @class  ImplementedQueue
 * @author Pulkit
 * @since  1st September 15
 * This class implements 
 */

package assignment5;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ImplementedQueue {

	/**
	 * This is the main function.
	 * @param{String} args
	 */
	
	public static void main(String args[]) {
		Queue<Integer> newQueue= new Queue<Integer>();
		int choice,number;
		int result;
		Scanner scan= new Scanner(System.in);
		do {
			System.out.println("Enter choice: ");
			System.out.println("1. Add an element to queue");
			System.out.println("2. Remove an element from queue");
			choice = scan.nextInt();
			switch(choice) {
				case 1:
						System.out.println("Enter a number: ");
						number = scan.nextInt();
						newQueue.enqueue(number);
						break;
				case 2:
						if(newQueue.queue.size() != 0) {
							result = newQueue.dequeue();
							System.out.println("Removed Element is: " + result);
						}
						else
							System.out.println("Queue is Empty");
						break;
				default:
						System.out.println("Enter correct choice");
			}
		} while(true);
	}
}

