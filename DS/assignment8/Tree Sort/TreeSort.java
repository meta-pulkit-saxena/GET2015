
/**
 * This class performs the tree sort on nodes and print nodes in sorted manner.
 * @class  TreeSort
 * @author Pulkit
 * @since  4th September 15
 */

package Assignment8;

import java.util.Scanner;

public class TreeSort {

	/***
	 * This is main function.
	 * 
	 * @param{String[] args
	 */

	public static void main(String args[]) {
		TreeSort treeSortObject = new TreeSort();
		treeSortObject.menuRunner();
	}

	/**
	 * This function run the menu and in return calls the respective function.
	 */

	public void menuRunner() {
		String choice;
		int option, value;
		Scanner scan = new Scanner(System.in);
		BinarySearchTree<Integer> treeObject = new BinarySearchTree<Integer>();
		do {
			System.out.println("1. Add a node in the tree.\n"
					+ "2. Print the nodes in the sorted order\n"
					+ "3. Exit system.");
			System.out.println("Enter an option:");
			option = scan.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter the  Roll Number");
				while (!scan.hasNextInt()) {
					System.out.println("Please enter a valid number");
					scan.next();
				}
				value = scan.nextInt();
				TreeNode<Integer> newNode = new TreeNode<Integer>(value);
				treeObject.root = treeObject.insertNode(treeObject.root,
						newNode);
				break;
			case 2:
				treeObject.sort(treeObject.root);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Enter a correct choice:");
			}
			System.out.println("Enter y to continue.");
			choice = scan.next();
		} while (choice.equalsIgnoreCase("y"));
		scan.close();
	}
}
