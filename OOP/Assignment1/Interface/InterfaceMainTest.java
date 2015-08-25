/**
 * @class  InterfaceTest
 * @author Pulkit
 * @since  12th August 15
 * This class contains test cases for the Interface.
 */

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

	/**
	 * This method tests the getarea function of square class.
	 */
	
	@Test
	public void testsquare()
	{
		Shape obj=new Square(5);
		double expected=25.0;
		double actual=obj.getArea();												// getArea function of square class called.
		assertEquals(expected,actual,0);
	}
	
	/**
	 * This method tests the getarea function of circle class.
	 */
	
	@Test
	public void testCircle()
	{
		Shape obj=new Circle(5);
		double expected=75.0;
		double actual=obj.getArea();												// getArea function of circle class called 
		assertEquals(expected,actual,0);
	}


}
