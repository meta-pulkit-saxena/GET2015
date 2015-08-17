import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinearSearchTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	LinearSearch obj = new LinearSearch();
	int [] inputArray1 = new int [] {2,5,8,9,10,77,55};
	int [] inputArray2 = new int [] {2,5,8,9,10,77,55,11};
	
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
	public void testLinearSearchNegative() {
		
		assertEquals(-1,obj.linearSearch(inputArray1, 88, 0));
	
	}
	
	@Test
	public void testLinearSearch() {
		
		assertEquals(5,obj.linearSearch(inputArray2, 77, 0));
	
	}

}
