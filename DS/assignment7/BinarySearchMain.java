
package assignmentDS7;

import java.util.Scanner;

/**
 * @author Pulkit
 *
 */
public class BinarySearchMain {
	
public static void main(String[] args) {
		
		BinarySearch obj = new BinarySearch();
		int arrSize, key, leftLocation;
		Scanner scan = new Scanner(System.in);															
		System.out.println("Enter the size of array");	
		try {
			arrSize = scan.nextInt();																								
			int [] array = new int[arrSize];
			System.out.println("Enter the ascending sorted array");
			for(int loop=0; loop < arrSize; loop++)	{													  // Array input
				array[loop] = scan.nextInt();
			}
			System.out.println("Enter the element to be searched");
			key = scan.nextInt();
			leftLocation = obj.binarySearch(array,key,0,array.length-1);
			if(obj.flag == 0) {
				System.out.println("Element not found");
			}
			else {
				System.out.println("Element found at location: " + leftLocation);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
