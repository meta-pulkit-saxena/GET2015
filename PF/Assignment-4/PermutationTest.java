import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Name: permutationTest
 * @author Pulkit
 * Since: 12th August 15
 * checks the value returned is correct or not
 **/

public class PermutationTest
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{

	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{

	}
	@Before
	public void setUp() throws Exception
	{

	}

	@After
	public void tearDown() throws Exception
	{

	}

	/**
	 * PermutationTestFor3
	 * checks the value returned for String of length 3
	 **/

	@Test
	public void permutationTestFor3()
	{
		Permutation permutationObj1 = new Permutation();
		List<String> resultString = permutationObj1.callGeneratePermutations("abcd");
		List<String> expectedString1 = Arrays.asList("abcd","abdc","acbd","acdb","adbc","adcb","bacd","badc","bcad","bcda","bdac","bdca","cabd","cadb","cbad","cbda","cdab","cdba","dabc","dacb","dbac","dbca","dcab","dcba");
		assertEquals(expectedString1,resultString);
	}
}
