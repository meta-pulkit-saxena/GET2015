package problems;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Name: TowerOfHanoiTest
 * @author Pulkit
 * since: 12th August 15
 * checks the value of tower of hanoi
 **/

public class TowerOfHanoiTest {   
	
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
	 * Name:testTowerOfHanoi2
	 * Checks the value returned when 1 disc
	 **/
	
	@Test
	public void testTowerOfHanoiFor1() {
		
		TowerOfHanoi towerOfHanoi=new TowerOfHanoi(1);
		List<String> diskMovementList=towerOfHanoi.towerOfHanoi( "A", "B", "C",1);
		String expected[]={"Move Disk 1 from A to B"};
		int index=0;
		for(String str:diskMovementList) {
			assertEquals(expected[index++], str);
		}
	}
	
	
	/**
	 * Name:testTowerOfHanoi
	 * Checks the value returned when 2 discs
	 **/
	
	@Test
	public void testTowerOfHanoiFor2() {
		
		TowerOfHanoi towerOfHanoi=new TowerOfHanoi(2);
		List<String> diskMovementList=towerOfHanoi.towerOfHanoi( "A", "B", "C", 2);
		String expected[]={"Move Disk 2 from A to C","Move Disk 1 from A to B","Move Disk 2 from C to B"};
		int index=0;
		for(String str:diskMovementList) {
			assertEquals(expected[index++], str);
			
		}
	}
	
	
	/**
	 * Name:testTowerOfHanoi
	 * checks the value returned when 3 discs
	 **/
	
	@Test
	public void testTowerOfHanoiFor3() {

		TowerOfHanoi towerOfHanoi=new TowerOfHanoi(3);
		List<String> diskMovementList=towerOfHanoi.towerOfHanoi( "A", "B", "C",3);
		String expected[]={"Move Disk 3 from A to B", "Move Disk 2 from A to C", "Move Disk 3 from B to C","Move Disk 1 from A to B","Move Disk 3 from C to A","Move Disk 2 from C to B","Move Disk 3 from A to B"};
		int index=0;
		for(String str:diskMovementList) {
			assertEquals(expected[index++], str);
			
		}
	}
}