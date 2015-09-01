
/**
 * @class  ArrayListMain
 * @author Pulkit
 * @since  25th August 15
 * This class will create a array list and call functions upon it.
 */

public class ArrayListMain {

	public static void main(String[] args) {
		GenericArrayList<Integer> arrayList = new GenericArrayList<Integer>(Integer[].class);
		for(int count = 1; count < 7; count++) {
			arrayList.addItem(count);                                   // Inputing elements in first list by loop.
		}
		arrayList.addItemAtLocation(2, 0);
		System.out.print("Element which is at location 1 is also at location: ");
		System.out.println(arrayList.firstOccurrenceAfterlocation(1));
		System.out.print("\nElement 5 is first time found at: ");
		System.out.println(arrayList.firstIndex(5));
		arrayList.removeAtLocation(4);
		arrayList.removeElement(4);
		arrayList.reverse();											// Reversing the array list.
		arrayList.sort();
		System.out.println("\nElements of first array list are:");
		arrayList.show();
		System.out.println("\n\nElements of second array list.");
		GenericArrayList<Integer> arrayListSecond = new GenericArrayList<Integer>(Integer[].class);
		GenericArrayList<Integer> arrayListMerged;
		for(int count = 8; count < 14; count++) {
			arrayListSecond.addItem(count);                             // Adding elements in the second list by loop.
		}
		arrayListSecond.show();
		System.out.println("\n\nElements of merged array List are:");
		arrayListMerged = arrayList.mergeArrayLists(arrayListSecond);	// Calling merge array list function for  
		arrayListMerged.show();											// array list first and second.
		arrayList.removeAll();
	}

}
