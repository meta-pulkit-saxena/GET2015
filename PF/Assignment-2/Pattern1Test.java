import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Pattern1Test {

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
	public void testprintPattern() {
		Pattern1 obj = new Pattern1();
		String outputPyramid[] = obj.printPattern(5);
		String expected[] = {"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		assertArrayEquals(expected,outputPyramid);
	}
	
	@Test
	public void testprintSpace(){
		Pattern1 obj1 = new Pattern1();
		String outputString = obj1.printSpace(1, 5);
		String expected = "    ";
		assertEquals(outputString,expected);
	}
		
	@Test
	public void testprintNum()
	{
		Pattern1 obj2 = new Pattern1();
		String outputString2 = obj2.printNum(1, 5);
		String expected2 = "1";
		assertEquals(expected2,outputString2);
	
	}

}
