
/**
 * @author Pulkit
 * @since  29th August 15
 * Name BinarySearch
 * This class contains binarySearch()
 */

package assignmentDS7;
import java.util.Scanner;

public class BinarySearch {
	public int index = -1;
	public int flag =0;
	/**
	 * Name binarySearch
	 * @param{int[]} array
	 * @param{int} key
	 * @param{int} start
	 * @param{int} end
	 * @return{int} location of key in array
	 * finds element using binary sorting
	 */
	
	public int binarySearch(int []array,int key,int start,int end) {
		
		int mid  = (start + end)/2; 																		// mid calculation
		if(start > end) {
			return index;
		}
		if(array[end] < key) {
			return -1;
		}
		if(start == end && array[mid] != key ) {                                                         	// exit point
			return -1;
		}
		if(array[mid] == key)	{																		  	// element found
			 index = mid;
			 flag = 1;																						// To check if element is found or not
			 binarySearch(array,key,start,mid-1);
			 return index;
		}
		return key > array[mid] ? binarySearch(array,key,mid+1,end) : binarySearch(array,key,start,mid-1);  // recursive call
		
	}
}
