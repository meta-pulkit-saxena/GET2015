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

	@Test
	public void testGetUid() {
			Person personObj = new Person(89, "Name1");
			assertEquals(89, personObj.getUid());
	}
	
	@Test
	public void testSetUid() {
			Person personObj = new Person(89, "Name1");
			personObj.setUid(67);
			assertEquals(67, personObj.getUid());
	}
	
	@Test
	public void testSetName() {
			Person personObj = new Person(89, "Name1");
			personObj.setName("ChangedName");
			assertEquals("ChangedName", personObj.getName());
	}
	
	@Test
	public void testGetName() {
			Person personObj = new Person(89, "Name2");
			assertEquals("Name2", personObj.getName());
	}
	
	@Test
	public void testGetStudentId()
	{
		Student StudentObj = new Student(23456789, "Name3", 101);
		assertEquals("",101, StudentObj.getStudentId());
	}

}
