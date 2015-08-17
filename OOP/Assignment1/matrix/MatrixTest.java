package Assignment1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixTest {
	
	 
	
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
	public void testAddElement() {
		Matrix obj = new Matrix(2,2);
		obj.addElements(1, 1, 2);
		assertEquals(2,obj.data[1][1]);
	}
	
	@Test
	public void testTranspose() {
		Matrix matrixTestObj = new Matrix(3,3);
		matrixTestObj.addElements(0, 0, 5);
		matrixTestObj.addElements(0, 1, 2);
		matrixTestObj.addElements(0, 2, 3);
		matrixTestObj.addElements(1, 0, 9);
		matrixTestObj.addElements(1, 1, 8);
		matrixTestObj.addElements(1, 2, 7);
		matrixTestObj.addElements(2, 0, 6);
		matrixTestObj.addElements(2, 1, 3);
		matrixTestObj.addElements(2, 2, 1);
		Matrix actual = matrixTestObj.matrixTranspose();
		Matrix expected = new Matrix(3, 3);
		expected.addElements(0, 0, 5);
		expected.addElements(0, 1, 9);
		expected.addElements(0, 2, 6);
		expected.addElements(1, 0, 2);
		expected.addElements(1, 1, 8);
		expected.addElements(1, 2, 3);
		expected.addElements(2, 0, 3);
		expected.addElements(2, 1, 7);
		expected.addElements(2, 2, 1);
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				assertEquals(expected.data[i][j], actual.data[i][j]);
			}
		}
	}
	

}
