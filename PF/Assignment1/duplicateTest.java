import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class duplicateTest 
{
	int []input = new int[] {1,1,4,4,6,7,8,8};
	int []expected = new int[] {1,4,6,7,8};
	int matchArray(int []a,int []b)
	{
		int ret=1;
		for(int loop=0;loop<a.length;loop++)
		{
			if(a[loop]!=b[loop])
			{
				ret=0;
			}
		}
		return ret;
	}
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
	public void test() 
	{
		duplicate obj = new duplicate();
		assertEquals(1,matchArray(expected,obj.removeDuplicate(input)));
	}

}
