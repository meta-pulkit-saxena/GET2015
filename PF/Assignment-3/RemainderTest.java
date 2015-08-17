import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RemainderTest {
	
	Remainder obj = new Remainder();

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
	public void testRemainder1() 
	{
		assertEquals(0,obj.rem(2, 1));
	}
	
	@Test
	public void testRemainder2()
	{
		assertEquals(-1,obj.rem(2, 0));
	}

	@Test
	public void testRemainder3()
	{
		assertEquals(1,obj.rem(100, 3));
	}
}
