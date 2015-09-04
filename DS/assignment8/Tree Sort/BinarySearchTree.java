/**
 * This class defines the basis function of adding a element in the tree and tree sort.
 * @class  TreeSort
 * @author Pulkit
 * @since  4th September 15
 */

package Assignment8;

public class BinarySearchTree<T> {
	public TreeNode<T> root;
	private String result = "";

	/**
	 * This function inserts a node in the tree accoring to the properties of
	 * the binary search tree.
	 * 
	 * @param{TreeNode<T> currentParent
	 * @param{TreeNode<T> newNode
	 * @return
	 */

	public TreeNode<T> insertNode(TreeNode<T> currentNode, TreeNode<T> newNode) {
		if (currentNode == null) {
			return newNode;
		} 
		else if ((Integer) newNode.value >= (Integer) currentNode.value) {
			currentNode.setRight(insertNode(currentNode.getRight(), newNode));
		} 
		else if ((Integer) newNode.value < (Integer) currentNode.value) {
			currentNode.setLeft(insertNode(currentNode.getLeft(), newNode));
		}
		return currentNode;
	}

	/**
	 * This function prints the nodes in the sorted manner.
	 * 
	 * @param{ root
	 */

	public String sort(TreeNode<T> focusedNode) {
		if (focusedNode != null) {
			sort(focusedNode.getLeft());
			result = result + focusedNode.getValue();
			System.out.println(focusedNode.getValue());
			sort(focusedNode.getRight());
		}
		return result;
	}
}
