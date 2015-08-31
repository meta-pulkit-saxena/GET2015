
/**
 * @class  TreeFunctions
 * @author Pulkit
 * @since  27th August 15
 * This class contains all the functions related to the tree node.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree<T> {
	private T value;
	public TreeNode<T> root, currentlyAdded, focusedNode;
	private String choice;
	private Scanner scan = new Scanner(System.in);
	private String first  = "";
	private String second = "";

	/**
	 * This function creates the root node.
	 * @param{T} value
	 */

	public void createRoot(T value) {
		TreeNode<T> rootNode = new TreeNode<T>(value);
		this.root = rootNode;
	}

	/**
	 * This function adds a node in the tree.
	 * @param{T} value
	 * @param{String} orientation
	 * @param{TreeNode<T>} focusedNode
	 * @return{TreeNode<T>} returnNode
	 */

	public TreeNode<T> addNode(T value, String orientation,
			TreeNode<T> focusedNode) {
		TreeNode<T> newNode = new TreeNode<T>(value);
		TreeNode<T> returnNode = null;
		if (orientation.equalsIgnoreCase("right")) {
			focusedNode.setRight(newNode);
			returnNode = focusedNode.getRight();
		} 
		else if (orientation.equalsIgnoreCase("left")) {
			focusedNode.setLeft(newNode);
			returnNode = focusedNode.getLeft();
		}
		return returnNode;
	}

	/**
	 * This function creates the binary tree.
	 */

	public void createTree() {
		Queue<TreeNode<T>> queue = new LinkedList<TreeNode<T>>();
		System.out.println("Enter the Root node value:");
		value = (T) scan.next();
		createRoot(value);
		queue.add(root);

		while (!queue.isEmpty()) {
			focusedNode = queue.remove();
			for (int count = 0; count < 2; count++) {
				if (count == 0) {
					addRightChild(queue, focusedNode);
				} 
				else {
					addLeftChild(queue, focusedNode);
				}
			}
		}
		System.out.println("Tree completed");
	}

	
	/**
	 * This function will add right child of the parent node.
	 * @param{Queue<TreeNode<T>>} queue
	 * @param{TreeNode<T>} focusedNode
	 */
	
	public void addRightChild(Queue<TreeNode<T>> queue, TreeNode<T> focusedNode) {
		System.out.println("Do you want to add right child of " + focusedNode.getValue() + " Press(y/n)");
		choice = scan.next();
		if (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter the value of right child of "
					+ focusedNode.getValue());
			value = (T) scan.next();
			currentlyAdded = addNode(value, "right", focusedNode);
			queue.add(currentlyAdded);
		}
	}

	
	/**
	 * This function will add left child of the parent node.
	 * @param{Queue<TreeNode<T>>} queue
	 * @param{TreeNode<T>} focusedNode
	 */
	
	public void addLeftChild(Queue<TreeNode<T>> queue, TreeNode<T> focusedNode) {
		System.out.println("do you want to enter left child of " + focusedNode.getValue() + " Press(y/n)");
		choice = scan.next();
		if (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter the value of left child of " + focusedNode.getValue());
			value = (T) scan.next();
			currentlyAdded = addNode(value, "left", focusedNode);
			queue.add(currentlyAdded);
		}
	}
	
	/**
	 * This function prints the preorder traversal of the nodes of binary tree.
	 * @param{TreeNode<T>} focusedNode
	 */
	
	public void preOrder(TreeNode<T> focusedNode) {
		if (focusedNode != null) {
			System.out.println(focusedNode.getValue());
			preOrder(focusedNode.getLeft());
			preOrder(focusedNode.getRight());
		}
	}
	
	/**
	 * This function prints the postorder traversal of the nodes of binary tree.
	 * @param{TreeNode<T>} focusedNode
	 */
	
	public void postOrder(TreeNode<T> focusedNode) {
		if (focusedNode != null) {
			postOrder(focusedNode.getLeft());
			postOrder(focusedNode.getRight());
			System.out.println(focusedNode.getValue());
		}
	}
	
	/**
	 * This function validates if two binary trees are mirror of each other.
	 * @param{TreeNode<T>} firstTreeNode
	 * @param{TreeNode<T>} secondTreeNode
	 * @return{boolean} result
	 */
	
	public boolean areMirror(TreeNode<T> firstTreeNode, TreeNode<T> secondTreeNode) {
		boolean result = false;
		inOrder(firstTreeNode);
		second = new StringBuilder(first).reverse().toString();
		first = "";
		inOrder(secondTreeNode);
		if(first.equalsIgnoreCase(second)) {
			result = true;
		}
		return result;
	}
	
	/**
	 * This function traverses the binary tree in inorder manner.
	 * @param{TreeNode<T>} focusedNode
	 */
	
	public void inOrder(TreeNode<T> focusedNode) {
		if (focusedNode != null) {
			inOrder(focusedNode.getLeft());
			first = first + focusedNode.getValue();
			inOrder(focusedNode.getRight());
		}
	}
}
