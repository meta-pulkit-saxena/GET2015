/**@class  MatrixTest
 * @author Pulkit
 * @since  12th August 15
 * This class tests the methods of the Matrix class, like addElement, matrixTranspose.
 */

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

	/**
	 * Testing the addElement method of the class Matrix.  
	 */
	
	@Test
	public void testAddElement() {
		Matrix obj = new Matrix(2,2);
		obj.addElements(1, 1, 2);
		assertEquals(2,obj.data[1][1]);
	}
	
	/**
	 * Testing the matrixTranspose method of the classMatrix
	 */
	@Test
	public void testTranspose() {
		Matrix matrixTestObj = new Matrix(3,3);
		matrixTestObj.addElements(0, 0, 5);
		matrixTestObj.addElements(0, 1, 2);
		matrixTestObj.addElements(0, 2, 3);											// Adding the elements one by one.
		matrixTestObj.addElements(1, 0, 9);
		matrixTestObj.addElements(1, 1, 8);
		matrixTestObj.addElements(1, 2, 7);
		matrixTestObj.addElements(2, 0, 6);
		matrixTestObj.addElements(2, 1, 3);
		matrixTestObj.addElements(2, 2, 1);
		Matrix actual = matrixTestObj.matrixTranspose();							// Calling the matrixTranspose method.
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
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				assertEquals(expected.data[i][j], actual.data[i][j]);	// Matching the expected and actual element one by one.
			}
		}
	}
	
	
	/**
	 *	Testing the MatrixTranspose function by using loop initialization.
	 */
	
	@Test
	public void testTranspose2() {
		Matrix obj = new Matrix(2,3);
		int val = 0,flag=1;
		for(int count1 = 0; count1 < 2;count1++) {			// Inserting and asserting transpose using loop						// For rows
			for(int count2 = 0; count2 < 3; count2++) {								// For columns
				obj.addElements(count1, count2, val);
				val++;
			}
		}
		val=0;
		Matrix obj2;
		obj2 = obj.matrixTranspose();
		for(int count1 = 0;count1 < 2 ; count1++) {									// For columns
			for(int count2 = 0; count2 < 3; count2++) {								// For rows
				if(obj2.data[count2][count1] != val) {
					flag = 0;
				}
				val++;
			}
		}
		assertEquals(1,flag);
	}
}
