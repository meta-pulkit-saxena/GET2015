import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class mergeSortedArraysTest 
{
	boolean bValue=true;
	int []a =new int[] {1,9,12,46};
	int []b =new int[] {4,6,17,34};
	int []expected = new int[] {1,4,6,9,12,17,34,46};
	int []c = new int[a.length+b.length];
	
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
	public boolean isArraySame(int expected[],int output[])
	{
		int loopCount;
		for(loopCount=0;loopCount<expected.length;loopCount++)
		{
			if(expected[loopCount]!=output[loopCount])
				bValue=false;
		}
		return bValue;
	}
	
	@Test
	public void test() 
	{
		mergeSortedArrays obj = new mergeSortedArrays();
		assertEquals(true,isArraySame(expected,obj.join(a, a.length, b, b.length, c)));
	}

}
