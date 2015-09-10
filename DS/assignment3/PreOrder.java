
/**
 * @class  PreOrder
 * @author Pulkit
 * @since  27th August
 * This class creates a binary tree then traverses the binary tree in preorder manner.
 */

public class PreOrder {

	/**
	 * This is main function.
	 * @param{String} args
	 */
	
	public static void main(String[] args) {
		BinaryTree<Integer> treeObject = new BinaryTree<Integer>();
		treeObject.createTree();
		System.out.println("\nThe preorder traversal of the binary tree is :\n");
		treeObject.preOrder(treeObject.root);
	}

}
