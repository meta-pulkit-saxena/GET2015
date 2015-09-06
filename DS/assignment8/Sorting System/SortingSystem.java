
/**
 * This class defines the basic functions required operate sorting system.
 * @class  SortingSystem
 * @author Pulkit
 * @since  4th September 15
 */

package Assignment8;
import java.util.ArrayList;
import java.util.List;

public class SortingSystem {
	private List<Integer> tempInput = new ArrayList<Integer>();
	private int  []inputNumbers;
	private int []sortedNumbers ;
	private int totalElements;
	private boolean useCountingSort = true;

	/**
	 * This function returns if counting sort to be used or not.
	 * @return{boolean} the useCountingSort
	 */
	
	public boolean isUseCountingSort() {
		return useCountingSort;
	}

	/**
	 * @return the totalElements
	 */
	
	public int getTotalElements() {
		return totalElements;
	}
	
	/**
	 * This function adds a new element in the array list.
	 * @param{int} value
	 */
	
	public void add(int value) {
		tempInput.add(value);
		totalElements++;
		maxNumber(value);
	}

	/**
	 * This function decides if to use counting sort or not based on efficiency.
	 * @param value
	 */
	
	public void maxNumber(int value) {
		if( (Integer)value > 99) {
			useCountingSort = false;
		}
	}
	
	/**
	 * This function decides according to input which algorithm to use for comparison sorting.
	 */
	
	public void decideComparisonSorting() {
		inputNumbers = tempInput.stream().mapToInt(Integer::intValue).toArray();
		SortingAlgorithms tempObj = new SortingAlgorithms();
		if(this.getTotalElements() <= 10) {
			sortedNumbers = tempObj.bubbleSort(inputNumbers);
			System.out.println("bubble sorting used");
		}
		else {
			sortedNumbers = tempObj.quickSort(inputNumbers);
			System.out.println("quick sorting used");
		}
	}
	
	/**
	 * This function decides according to input which algorithm to use for linear sorting.
	 */
	
	public void decideLinearAlgo() {
		inputNumbers = tempInput.stream().mapToInt(Integer::intValue).toArray();
		SortingAlgorithms tempObj = new SortingAlgorithms();
		if(this.isUseCountingSort()){
			sortedNumbers = tempObj.countingSort(inputNumbers);
			System.out.println("counting sorting used");
		}
		else {
			sortedNumbers = tempObj.radixSort(inputNumbers);
			System.out.println("radix Sorting used");
		}
	}

	/**
	 * This function displays the sorted numbers.
	 */
	 
	public void display() {
		for(int count = 0; count < sortedNumbers.length; count++) {
		System.out.println(sortedNumbers[count]);
		}
	}
}
