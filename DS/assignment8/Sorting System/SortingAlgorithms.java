/**
 * @class  SortingAlgorithms
 * @author Pulkit
 * @since  4th September 15
 * This class defines all the sorting algorithms for the sorting system.
 */

package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class SortingAlgorithms {
	
	/**
	 * This function sorts the input array using radix sort.
	 * @param{int[]} input
	 * @return{int[]}
	 */
	
	public int[] radixSort(int[] input) {
		List<Integer>[] bucket = new ArrayList[10];
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = new ArrayList<Integer>();
		}
		boolean maxLength = false;
		int tmp = -1, placement = 1;
		while (!maxLength) {
			maxLength = true;
			for (Integer i : input) {
				tmp = i / placement;
				bucket[tmp % 10].add(i);
				if (maxLength && tmp > 0) {
					maxLength = false;
				}
			}
			int count = 0;
			for (int loopCount = 0; loopCount < 10; loopCount++) {

				for (Integer i : bucket[loopCount]) {
					input[count++] = i;
				}
				bucket[loopCount].clear();
			}
			placement *= 10;
		}
		return input;
	}

	
	/**
	 * This function sorts the input array using counting sort.
	 * @param{int[]} elements
	 * @return{int[]}
	 */
	
	public int[] countingSort(int[] elements) {
		int largest = 0;
		int arrayLength = elements.length;
		for (int number : elements) {
			if (number > largest)
				largest = number;
		}
		int[] bucket = new int[largest + 1];
		int bucketLength = bucket.length;
		for (int count = 0; count < arrayLength; count++) {
			bucket[elements[count]] = bucket[elements[count]] + 1;
		}
		for (int count = 0, j = 0; count < bucketLength;) {
			if (bucket[count] != 0) {
				elements[j] = count;
				j++;
				bucket[count] = bucket[count] - 1;
			} else {
				count++;
			}
		}
		return elements;
	}

	/**
	 * This function sorts the input array in the ascending order by using bubble sort.
	 * @param{int[]} input
	 * @return{int[]} 
	 */
	
	public int[] bubbleSort(int[] input) {
		for (int count = 0; count < input.length - 1; count++) {
			for (int secondCount = count; secondCount < input.length - 1; secondCount++) {
				if (input[count] > input[secondCount + 1]) {
					int temp = input[count];
					input[count] = input[secondCount + 1];
					input[secondCount + 1] = temp;
				}
			}
		}
		return input;
	}

	/**
	 * This function sorts the input array using quick sort.
	 * @param{int[]} input
	 * @return{int[]}
	 */
	
	public int[] quickSort(int[] input) {
		if (input == null || input.length == 0) {
			return input;
		}
		quicksortPart(input, 0, input.length - 1);
		return input;
	}

	/**
	 * This function sorts a partition of the array by using quicksort algorithm.
	 * @param{input} input
	 * @param{int} lowerBound
	 * @param{int} upperBound
	 */
	
	private void quicksortPart(int[] input, int lowerBound, int upperBound) {
		int i = lowerBound, j = upperBound;
		int pivot = input[lowerBound];
		while (i <= j) {
			while (input[i] < pivot) {
				i++;
			}
			while (input[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
		if (lowerBound < j) {
			quicksortPart(input, lowerBound, j);
		}
		if (i < upperBound) {
			quicksortPart(input, i, upperBound);
		}
	}
}
