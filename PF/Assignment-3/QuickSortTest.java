import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class QuickSortTest {
	
	QuickSort obj = new QuickSort();
	int []inputArray = new int[] {2,5,8,9,10,77,55,11};
	int []outputArray = new int[] {2,5,8,9,10,11,55,77};

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

	@Test
	public void testQuickSort1() {
		
		assertArrayEquals(outputArray, obj.quickSortRecursive(inputArray,0,inputArray.length-1));
	}
	
	@Test
	public void testQuickSort2() {
		
		int []input2 = new int[] {};
		int []output2 = new int[] {};
		
		assertArrayEquals(output2, obj.quickSortRecursive(input2,0,input2.length-1));
	}

}
