import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GcdTest {
	
	Gcd obj = new  Gcd();

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
	public void test() {
		
		assertEquals(1,obj.gcd(2, 1));
	}
	
	@Test
	public void testGcd() {
		
		assertEquals(6,obj.gcd(12, 18));
	}
	
	@Test
	public void testGcdFun() {
		
		assertEquals(1,obj.gcd(100, 3));
	}

}
