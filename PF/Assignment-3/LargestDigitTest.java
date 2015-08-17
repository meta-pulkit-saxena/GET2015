import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LargestDigitTest {
	
	LargestDigit obj = new LargestDigit();

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
	public void testLargestDigit1() {
		assertEquals(2,obj.largestDigit(2));
	}
	
	@Test
	public void testLargestDigit2() {
		assertEquals(9,obj.largestDigit(1257369));
	}
	
	@Test
	public void testLargestDigit3() {
		assertEquals(4,obj.largestDigit(444));
	}

}
