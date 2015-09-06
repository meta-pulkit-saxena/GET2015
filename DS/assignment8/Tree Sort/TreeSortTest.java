
/**
 * This class tests the tree sorting.
 * @class  TreeSortTest
 * @author Pulkit
 * @since  4th September 15
 */

package Assignment8;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TreeSortTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * This test case tests the insertNode function of binary tree.
	 */
	 
	@Test
	public void testInsert() {
		BinarySearchTree<Integer> treeObj = new BinarySearchTree<Integer>();
		treeObj.root = treeObj.insertNode(treeObj.root, new TreeNode<Integer>(34));
		treeObj.root = treeObj.insertNode(treeObj.root, new TreeNode<Integer>(12));
		treeObj.root = treeObj.insertNode(treeObj.root, new TreeNode<Integer>(56));
		String output = "123456";
		assertEquals(output, treeObj.sort(treeObj.root));
	}
	
	/**
	 * This test case tests the insertNode function for null input.
	 */
	
	@Test
	public void testNull() {
		BinarySearchTree<Integer> treeObj = new BinarySearchTree<Integer>();
		treeObj.root = treeObj.insertNode(treeObj.root, new TreeNode<Integer>());
		String output = "null";
		assertEquals(output, treeObj.sort(treeObj.root));
	}
	
	/**
	 * This test case tests the insertNode function for negative input.
	 */
	
	@Test
	public void testNegative() {
		BinarySearchTree<Integer> treeObj = new BinarySearchTree<Integer>();
		treeObj.root = treeObj.insertNode(treeObj.root, new TreeNode<Integer>());
		String output = "null";
		assertEquals(output, treeObj.sort(treeObj.root));
	}

}
