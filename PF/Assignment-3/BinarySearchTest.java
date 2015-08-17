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
	
		BinarySearch obj = new BinarySearch();
		int [] inputArray  = new int[] {2,5,8,9,10,77,55};
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testForNotFound() {
	
		assertEquals(-1,obj.binarySearch(inputArray, 88, 0, inputArray.length-1));
	}

	@Test
	public void testBinarySearch() {
	
		assertEquals(5,obj.binarySearch(inputArray, 77, 0, inputArray.length-1));
	}
}
