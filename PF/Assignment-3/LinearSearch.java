import java.util.Scanner;

/**
 * LinearSearch
 * @author Pulkit
 * @since  10th August 15
 * Name LinearSearch Class
 * It contains function linearSearch()
 */

public class LinearSearch {
	
	/**
	 * Name linearSearch
	 * @param{int[]} array
	 * @param{int} key
	 * @param{int} index
	 * @return{int} index of key
	 * performs the linear search 
	 */
	
	public int linearSearch(int []array,int key,int index) {
		if(array.length <= index) {                                          // Element not found or error
			return -1;
		}
		if (array[index] == key) {                                           // Element found                                                                  
			return index;
		}
		return  linearSearch(array,key,index+1);                             // Recursive call to function
	}

	
	public static void main(String[] args) {
		
		int arrSize, key;
		LinearSearch obj = new LinearSearch();
		Scanner scan = new Scanner(System.in);                               // Input
		System.out.println("Enter the size of array");   
		try {
			arrSize = scan.nextInt();
			int [] array = new int[arrSize];
			System.out.println("Enter the array");
			for(int loop=0; loop < arrSize; loop++) {
				array[loop] = scan.nextInt();
			}
			System.out.println("Enter the element to be searched");
			key = scan.nextInt();
			System.out.print(" Element found at location " + obj.linearSearch(array,key,0));
			scan.close();
		}
		catch(Exception e) {
			
		}
	}

}
