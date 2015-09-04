
/**
 * @class  SortingAlgorithmsTest
 * @author Pulkit
 * @since  4th September 15
 * This class tests all the sorting algorithms.
 */

package Assignment8;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SortingAlgorithmsTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testbubbleSort() {
		SortingAlgorithms obj = new SortingAlgorithms();
		int input[] = {7,4,2,1,6,3,5};
		int output[] = {1,2,3,4,5,6,7};
		assertArrayEquals(output,obj.bubbleSort(input));
	} 
	
	@Test
	public void testbubbleSortNegative() {
		SortingAlgorithms obj = new SortingAlgorithms();
		int input[] = {7,4,-2,-1,6,-3,5};
		int output[] = {-3,-2,-1,4,5,6,7};
		assertArrayEquals(output,obj.bubbleSort(input));
	} 

	@Test
	public void testRadixSort() {
		SortingAlgorithms obj = new SortingAlgorithms();
		int input[] = {7,4,2,1,6,3,5};
		int output[] = {1,2,3,4,5,6,7};
		assertArrayEquals(output,obj.radixSort(input));
	} 
	
	@Test
	public void testCountingSort() {
		SortingAlgorithms obj = new SortingAlgorithms();
		int input[] = {7,4,2,1,9,3,5};
		int output[] = {1,2,3,4,5,7,9};
		assertArrayEquals(output,obj.countingSort(input));
	} 
	
	@Test
	public void testQuickSort() {
		SortingAlgorithms obj = new SortingAlgorithms();
		int input[] = {10,4,2,1,6,3,5};
		int output[] = {1,2,3,4,5,6,10};
		assertArrayEquals(output,obj.quickSort(input));
	} 
	
	@Test
	public void testQuickSortNegative() {
		SortingAlgorithms obj = new SortingAlgorithms();
		int input[] = {10,4,-2,-1,6,-3,5};
		int output[] = {-3,-2,-1,4,5,6,10};
		assertArrayEquals(output,obj.quickSort(input));
	} 
	
	@Test
	public void testCountingSortWorstCase() {
		SortingAlgorithms obj = new SortingAlgorithms();
		int input[] = {7,6,5,4,3,2,1};
		int output[] = {1,2,3,4,5,6,7};
		assertArrayEquals(output,obj.countingSort(input));
	} 
	
}
