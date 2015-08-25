/**
 * @class InheritenceMainTest
 * @author Pulkit
 * @since  13th August 15
 * This class tests the student and person class functions.
 */

package Assignment1;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InheritanceMainTest {

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
	 * This function tests the getUid function of the person class. 
	 */
	
	@Test
	public void testGetUid() {
			Person personObj = new Person(89, "Name1");
			assertEquals(89, personObj.getUid());
	}
	
	/**
	 * This function tests the setUid function of the person class.
	 */
	
	@Test
	public void testSetUid() {
			Person personObj = new Person(89, "Name1");
			personObj.setUid(67);
			assertEquals(67, personObj.getUid());
	}
	
	/**
	 * This function tests the setName function of the person class.
	 */
	
	@Test
	public void testSetName() {
			Person personObj = new Person(89, "Name1");
			personObj.setName("ChangedName");
			assertEquals("ChangedName", personObj.getName());
	}
	
	/**
	 * This function tests the getName function of the person class.
	 */
	
	@Test
	public void testGetName() {
			Person personObj = new Person(89, "Name2");
			assertEquals("Name2", personObj.getName());
	}
	
	/**
	 * This function tests the getStudentId function of the student class.
	 */
	
	@Test
	public void testGetStudentId()
	{
		Student studentObj = new Student(23456789, "Name3", 101);
		assertEquals(101, studentObj.getStudentId());
	}

	/**
	 * This function tests the setStudentId function of the student class.
	 */
	
	@Test
	public void testSetStudentId()
	{
		Student studentObj = new Student(56789, "Name4", 11);
		studentObj.setStudentId(45);
		assertEquals(45, studentObj.getStudentId());
	}
	
	/**
	 * This function tests the setCourses function of the student class.
	 */
	
	@Test
	public void testSetCourses()
	{
		String []coursesInput = new String[] {"English","Maths","Hindi"};
		Student studentObj = new Student(89, "Name4", 17);
		studentObj.setCourses(coursesInput);
		assertArrayEquals(coursesInput, studentObj.getCourses());
	}
	
	/**
	 * This function tests the getCourses function of the student class.
	 */
	
	@Test
	public void testGetCourses()
	{
		String []coursesInput = new String[] {"English","Maths","Hindi","French"};
		Student studentObj = new Student(899, "Name4", 107);
		studentObj.setCourses(coursesInput);
		assertArrayEquals(coursesInput, studentObj.getCourses());
	}
	
}

