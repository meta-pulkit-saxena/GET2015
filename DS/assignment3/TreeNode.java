
/**
 * @class  TreeNode
 * @author Pulkit
 * @since  27th August 15
 * This class is a modal class for a tree node structure. It defines basic the structure of a node.
 */

public class TreeNode<T> {
	private T value;
	private TreeNode<T> left;
	private TreeNode<T> right;
	
	/**
	 * This is a parameterized constructor for a tree node.
	 * @param{T} value
	 */
	
	public TreeNode(T value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	/**
	 * This is a constructor of node.
	 */
	
	public TreeNode() {
	}
	
	/**
	 * This function returns the value of a node of tree.
	 * @return{T} value
	 */
	
	public T getValue() {
		return value;
	}
	
	/**
	 * This function sets the value of a node of tree.
	 * @param{T} value 
	 */
	
	public void setValue(T value) {
		this.value = value;
	}
	
	/**
	 * This function returns the reference to the left node of the tree.
	 * @return{TreeNode} left
	 */
	
	public TreeNode getLeft() {
		return left;
	}
	
	/**
	 * This function sets the reference to the left node of the tree.
	 * @param{TreeNode} left
	 */
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	/**
	 * This function will return the reference to the right node of the tree.
	 * @return{TreeNode} right
	 */
	
	public TreeNode getRight() {
		return right;
	}
	
	/**
	 * This function sets the reference to the right node of the tree.
	 * @param{TreeNode} right
	 */
	
	public void setRight(TreeNode right) {
		this.right = right;
	}
}
