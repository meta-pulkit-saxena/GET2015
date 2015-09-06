
/**
 * @class  BinarySearchTest
 * @author Pulkit
 * @since  29th August 15
 * This class contains the test cases for binary search.
 */

package assignmentDS7;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinarySearchTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
 	* This funtion tests the binary search function.
 	*/
 	
	@Test
	public void testBinarySearchFirst() {
		BinarySearch object = new BinarySearch();
		int inputArray[] ={1,2,2,3}; 
		int expected = 1;
		assertEquals(expected,object.binarySearch(inputArray, 2, 0,inputArray.length-1));
	}
	
	/**
 	* This funtion tests the binary search function.
 	*/
 	
	@Test
	public void testSearchSecond() {
		BinarySearch object = new BinarySearch();
		int inputArray[] ={1,1,1,1,1,1,1}; 
		int expected = 0;
		assertEquals(expected,object.binarySearch(inputArray, 1, 0,inputArray.length-1));
	}
	
	/**
 	* This funtion tests the binary search function.
 	*/
	
	@Test
	public void testBinarySearchThree() {
		BinarySearch object = new BinarySearch();
		int inputArray[] ={1,1,1,1,2,1}; 
		int expected = 4;
		assertEquals(expected,object.binarySearch(inputArray, 2, 0,inputArray.length-1));
	}
}
