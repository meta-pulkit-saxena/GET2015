
/**
 * @class  GenericArrayList
 * @author Pulkit
 * @since  25th August 15
 * This class will implement the Array list using a array.It is a generic type class.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class GenericArrayList<T> {
	private T []internalArray;
	private final int DEFAULT_SIZE = 10; 
	private int size;
	
	/**
	 * This is a constructor of GenericArrayList class. It will create an array for internal implementation.
	 */
	
	public GenericArrayList(Class<T[]> classObj) {
		internalArray =  (T[]) classObj.cast(Array.newInstance(classObj.getComponentType(), DEFAULT_SIZE));
	}
	
	/**
	 * @return{int} the size
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * This function will add a value in the array list if space is available in it. If space not available
	 *  in it then it will increase the size of arrayList and add value in it.
	 * @param{T} value
	 */
	
	public void add(T value) {
		add(getSize(),value);
	}
	
	/**
	 * Whenever there is need of more free space in the array list. This function will increase the size of 
	 * array list by 10 free spaces.
	 */
	
	public void increaseArraySize() {
		int newSize = internalArray.length + 5;
		internalArray = Arrays.copyOf(internalArray, newSize);
	}
	
	/**
	 * This function will add a given value in the array list at a given location. It will increase the 
	 * array list size if needed.
	 * @param{int} location
	 * @param{T} value
	 */
	
	public void add(int location,T value) {
		int freeSpace = internalArray.length - getSize();
		if(freeSpace < 1) {
			increaseArraySize();
		}
		for(int count = (getSize() - 1); count >= location; count--) {
			internalArray[count+1] = internalArray[count];
		}
		internalArray[location] = value;
		size += 1;
	}
	
	/**
	 * This function will return the location of the next first occurrence of item after a given location. 
	 * @param{int} location
	 * @return{int} nextLocation
	 */
	
	public int indexOf(int location,T value) {
		int lastIndex = getSize() - 1;
		int newLocation = -1;
		for(int count = location + 1; count <= lastIndex; count++) {
			if(value == internalArray[count]) {
				newLocation = count;
				break;
			}
		}
		return newLocation;													// -1 means element not found
	}
	
	/**
	 * This function will return the first location of the value in the array list.
	 * @param{T} value
	 * @return{int} count
	 */
	
	public int indexOf(T value) {
		return indexOf(-1,value);													// -1, means element not found.
	}
	
	/**
	 * This function will delete the element at a given location.
	 * @param{int} location
	 */
	
	public void remove(int location) {
		int lastIndex = getSize() - 1;
		int start = location + 1;
		if(location >= 0 && lastIndex != location) {					// To check if element to be deleted  
			for(int count = start; count <= lastIndex; count++) {			// is not the last and index is > 0.
				internalArray[count-1] = internalArray[count];
			}
		}
		internalArray[lastIndex] = null;
		size -= 1;
	}
	
	/**
	 * This function will remove all the occurrences of the given value from array list. 
	 * @param{T} value
	 */
	
	public void remove(T value) { 
		int count = 0;
		while(internalArray[count] != null) {
			if(internalArray[count] == value) {
				remove(count);												// Call to removeAtLocation function.
			}
			count++;
		}
	}
	
	/**
	 * This function will delete all the elements from the array list and initialize 
	 * them with null. 
	 */
	public void removeAll() {
		int lastIndex = getSize() - 1;
		for(int count = 0; count <= lastIndex; count++) {
			internalArray[count] = null;
		}
	}
	
	/**
	 * This function will reverse the array list.
	 */
	
	public void reverse() {
		int lastIndex = getSize() - 1;
		int left = 0;
	    int right = lastIndex;

	    while( left < right ) {																
	        T temp = internalArray[left];							// swap the values at the left and right indices
	        internalArray[left] = internalArray[right];							
	        internalArray[right] = temp;	        					// move the left and right index pointers in toward the center
	        left++;
	        right--;
	    }
	}
	
	
	/**
	 * This function will sort the array list in ascending order.
	 */
	
	public void sort() {
		int lastIndex = getSize() - 1;
		for(int firstCount = 0;firstCount < lastIndex; firstCount++) {
			for(int secondCount = firstCount + 1;secondCount <= lastIndex; secondCount++) {
				if((int)internalArray[firstCount] > (int)internalArray[secondCount]) {
					T swap = internalArray[firstCount];
					internalArray[firstCount] = internalArray[secondCount];
					internalArray[secondCount] = swap;						// swapping the values
				}
			}
		}
	}
	
	/**
	 * This function will merge two arrayList and return new array list containing elements of both.
	 * @param{GenericArrayList<T>} secondList
	 * @return{GenericArrayList<T>}
	 */
	
	public GenericArrayList<Integer>  mergeArrayLists(GenericArrayList<T> secondList) {
		GenericArrayList<Integer> mergedArrayList = new GenericArrayList<Integer>(Integer[].class);	
		int sizeFirst = getSize();
		int sizeSecond = secondList.getSize();
		int newSize = sizeFirst + sizeSecond;						// new size
		T value;
		mergedArrayList.internalArray = (Integer[]) Arrays.copyOf(this.internalArray, newSize);
		for(int count = 0; count < sizeFirst; count++) {
			value = internalArray[count];
			mergedArrayList.add((Integer) value);
		}
		for(int count = 0; count < sizeSecond; count++) {
			value = secondList.internalArray[count];
			mergedArrayList.add((Integer) value);
		}
		return mergedArrayList;
	}
	
	/**
	 * This function will display the arrayList elements.
	 */
	
	public void show() {
		int lastIndex = getSize() - 1;
		for(int count = 0; count <= lastIndex; count++) {
			System.out.print(internalArray[count] + " ");				// Displaying elements.
		}
	}
}
