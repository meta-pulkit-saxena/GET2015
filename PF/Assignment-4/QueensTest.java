import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Name: QueensTest
 * @author Pulkit
 * Since: 12th August 15
 * Checks the test case of queens problem
 **/

public class QueensTest
{
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
	 * Name:test
	 * checks the value returned for input 4 queens
	 **/

	@Test
	public void test() {
		Queens testObject1 = new Queens(4);
		int expected[][] = {{'0','0','1','0'}, {'1','0','0','0'}, {'0','0','0','1'}, {'0','1','0','0'}};
		int actual[][] = testObject1.callPlaceNQueens();
		QueensTest test = new QueensTest();
		int result=test.compare(expected, actual);
		assertEquals("", 1,result);
	}


	/**
	 * Name:Compare
	 * @param{int[][]}  expected :output expected
	 * @param{int[][]}  actual :value returned
	 * @return{int}     0 or 1
	 **/

	public int compare(int[][] expected, int[][] actual) {
		int result=1;
		int length = expected.length;
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				if(expected[i][j]!=actual[i][j]) {
					result = 0;
					System.out.print(actual[i][j]+"\t");
					return result;
					}
			}
			System.out.println();
		}
		return result;
	}

}

