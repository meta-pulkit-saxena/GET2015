
/**
 * @class  LinkedListInsertion
 * @author Pulkit
 * @since  1st September 15
 * This class contains the recursive insertion function for the insertion in 
 * sorted linkedList
 */

package assignment5;
import java.util.LinkedList;
import java.util.List;

public class LinkListInsertion {

	public  List<Integer> InternalList = new LinkedList<Integer>();

	/**
	 * This function inserts the value in the linkList using recursive method.
	 * @param{int} value
	 * @param{int} index
	 */
	
	public void insert(int value, int index) {

		if (index == InternalList.size()) {

			InternalList.add(value);
		} else

		if ((int)InternalList.get(index) < value) {

			insert(value, index + 1);

		} else {
			InternalList.add(index, value);
		}
	}

	/**
	 * This function simply inserts a value in the linkList.
	 * @param{int} value
	 */
	
	public void insert(int value) {
		InternalList.add(value);
	}

	/**
	 * This function sorts the values in the linkList.
	 */
	
	public void sort() {
		InternalList.sort(null);
	}

	/**
	 * This method displays the linkList.
	 */
	
	public void display() {
		System.out.println(InternalList);
	}
}