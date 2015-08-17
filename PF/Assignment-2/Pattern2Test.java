import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class pattern2Test {

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
	public void testprintSpaces() 
	{
		pattern2 obj = new pattern2();
		assertEquals(" ",obj.printSpaces(2, 5));
	}
	@Test
	public void testprintNum() 
	{
		pattern2 obj = new pattern2();
		assertEquals("12345",obj.printNum(1, 5));
	}
	
	@Test
	public void testprintPyramid() 
	{
		pattern2 obj = new pattern2();
		String [] expected = new String[] {"12345"," 1234","  123","   12","    1"};
		assertArrayEquals(expected,obj.printPyramid(5, 5));
	}
	
}
