
import java.util.Scanner;

/**
 * @author Pulkit
 * @since  10th August 15
 * Name BinarySearch
 * This class contains binarySearch()
 */

public class BinarySearch {
	
	/**
	 * Name binarySearch
	 * @param{int[]} arr
	 * @param{int} key
	 * @param{int} start
	 * @param{int} end
	 * @return{int} location of key in array
	 * finds element using binary sorting
	 */
	
	public int binarySearch(int []arr,int key,int start,int end) {
	 
		int mid  = (start + end)/2;                                                                   // mid calculation
		if(start == end && arr[mid] != key) {                                                         // exit point
			return -1;
		}
		if(arr[mid] == key)	{																		  // element found
			return mid;
		}
		return key > arr[mid] ? binarySearch(arr,key,mid+1,end) : binarySearch(arr,key,start,mid-1);  // recursive call
		
	}
	
	public static void main(String[] args) {
		
		BinarySearch obj = new BinarySearch();
		int arrSize, key;
		Scanner scan = new Scanner(System.in);															
		System.out.println("Enter the size of array");	
		try {
			arrSize = scan.nextInt();																								
			int [] array = new int[arrSize+1];
			System.out.println("Enter the ascending sorted array");
			for(int loop=0; loop < arrSize; loop++)	{													  // Array input
				array[loop] = scan.nextInt();
			}
			System.out.println("Enter the element to be searched");
			key = scan.nextInt();
			System.out.print("Element found at location:" + obj.binarySearch(array,key,0,array.length));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
