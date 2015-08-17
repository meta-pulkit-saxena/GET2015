
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 * Name: QuickSort
 * @author Pulkit
 * Since: 11 August,2015
 * Description: This class sorts the array using Quick Sort
 */

class QuickSort
{
	
/**
 * Name:Partition
 * @param{int} numbers,input array
 * @param{int} lowerbound
 * @param{int} upperbound
 * @return{int}
 * This function finds the exact place of the value
 */
	
	public  int Partition(int[] numbers, int lowerbound, int upperbound) {
		int pivot = numbers[lowerbound];
		while (lowerbound <= upperbound) {
			while (numbers[lowerbound] < pivot)
				lowerbound++;

			while (numbers[upperbound] > pivot)
				upperbound--;

			if (lowerbound < upperbound) {
				int temporary = numbers[upperbound];												
				numbers[upperbound] = numbers[lowerbound];									  // Swapping
				numbers[lowerbound] = temporary;
			}
			else {
				return upperbound;
			}
		}
		return -1;
	}
	
	/**
	 * Name quickSortRecursive
	 * @param{int} input:array 
	 * @param{int} lowerbound:starting index of the array
	 * @param{int} upperbound:last index of the array
	 */

	public  int[] quickSortRecursive(int[] input, int lowerbound, int upperbound) {
		
		if(lowerbound < upperbound)	{														  // base condition
			int pivot = Partition(input, lowerbound, upperbound);

			if(pivot > 1) 																	  // if pivot is greater
				quickSortRecursive(input, lowerbound, pivot - 1);

			if(pivot + 1 < upperbound)                                                        // pivot is less than upper bound
				quickSortRecursive(input, pivot + 1, upperbound);
		}
		return input;
	}
	
	public static void main(String[] args) { 
		
		QuickSort obj = new QuickSort();
		System.out.print("enter the no of values  ");									
		Scanner sc=new Scanner(System.in);
		try {
			int noofelements= sc.nextInt();
			int input[]= new int[noofelements];
			int output[]=new int[noofelements];
			for(int i=0;i<noofelements;i++) {
				input[i]=sc.nextInt();															// Input
			}                                       
	        output = obj.quickSortRecursive(input,0,input.length-1);                            // output printing
			for (int i = 0; i < noofelements; i++)
				System.out.println(input[i]);
		}
		catch(Exception e) {
			
		}
	}
}

