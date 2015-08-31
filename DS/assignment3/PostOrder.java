
/**
 * @class  PostOrder
 * @author Pulkit
 * @since  27th August
 * This class creates a binary tree then traverses the binary tree in postorder manner.
 */

public class PostOrder {

	/**
	 * This is the main function
	 * @param{String} args
	 */
	
	public static void main(String[] args) {
		BinaryTree<Integer> treeObject = new BinaryTree<Integer>();
		treeObject.createTree();
		System.out.println("\nThe preorder traversal of the binary tree is :\n");
		treeObject.postOrder(treeObject.root);
	}

}
