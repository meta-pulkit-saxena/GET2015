
/**
 * @class  MirrorTrees
 * @author Pulkit
 * @since  27th August
 * This class takes input two binary trees then checks if they are mirror of each other..
 */

public class MirrorTrees {

	/**
	 * This is the main function.
	 * @param{String} args
	 */
	
	public static void main(String[] args) {
		boolean same;
		BinaryTree<Integer> treeObjectFirst = new BinaryTree<Integer>();
		treeObjectFirst.createTree();
		System.out.println("\nThe preorder traversal of the binary tree is :\n");
		treeObjectFirst.preOrder(treeObjectFirst.root);

		BinaryTree<Integer> treeObjectSecond = new BinaryTree<Integer>();
		treeObjectSecond.createTree();
		treeObjectSecond.inOrder(treeObjectSecond.root);
		same = treeObjectFirst.areMirror(treeObjectFirst.root, treeObjectSecond.root);
		if(same == true) {
			System.out.println("Yes,Both the trees are mirror image of each other");
		}
		else {
			System.out.println("No,Both the trees are not mirror image of each other");
		}
	}

}
