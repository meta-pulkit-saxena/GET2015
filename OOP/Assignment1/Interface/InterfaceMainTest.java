package Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InterfaceMainTest {

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
		Shape obj=new Square(5);
		double expected=25.0;
		double actual=obj.getArea();
		assertEquals(expected,actual,0);
	}
	
	@Test
	public void test1()
	{
		Shape obj=new Circle(5);
		double expected=75.0;
		double actual=obj.getArea();
		assertEquals(expected,actual,0);
	}


}
