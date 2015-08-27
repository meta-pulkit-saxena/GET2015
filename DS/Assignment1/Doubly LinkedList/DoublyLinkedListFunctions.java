
/**
 * This class contains all the functions related to doubly list list
 * @class  DoublyLinkedListFunctions
 * @author Pulkit
 * @since  25th August 15
 */

import java.util.Scanner;

public class DoublyLinkedListFunctions {
	private Scanner scan;
	private DoublyNode  doublyNodeObj= new DoublyNode();
	
	/**
	 * This function will create a linked list by taking elements one by one.
	 * @return{DoublyNode}
	 */
	
	public  DoublyNode createList() {
		int data;
		scan = new Scanner(System.in);
		String choice = null;
		DoublyNode current = null;
		DoublyNode start = null;
		DoublyNode newNode = null;
		
		do {
			System.out.print("Enter value of node");
			data = scan.nextInt();
			newNode = new DoublyNode(data);
			if (isEmpty(start)) {
				start = newNode;
				current = start;
			} else {
				current.setNext(newNode);
				newNode.setPrevious(current);
				current = newNode;
			}
			System.out.print("Do you want to add more nodes:(Y/N) ");
				choice = scan.next();
		} while (choice.equalsIgnoreCase("y"));

		return start;
	}


	/**
	 * This function will check if linked list is empty.
	 * @param{DoublyNode} node
	 * @return{boolean}
	 */
	
	public static boolean isEmpty(DoublyNode node) {
		return node == null;
	}

	/**
	 * This function will display all the nodes value.
	 * @param{DoublyNode} start
	 */
	
	public void displayList(DoublyNode start) {
		if (isEmpty(start)) {
			System.out.println("List is empty");
			return;
		}
		while (start != null) {
			System.out.print(start.getData() + " ");
			start = start.getNext();
		}
	}

	/**
	 * This function will add node at a location.
	 * @param{DoublyNode} startNode
	 * @param{int} position
	 * @return
	 */
	
	public DoublyNode insertAtPosition(DoublyNode startNode, int position) {
		int counter = 2;
		int data;
		scan = new Scanner(System.in);
		if (position <= 0 && position > doublyNodeObj.getNoOfNodes() + 1
				|| isEmpty(startNode))
			return null;
		System.out.println("Enter data to be insert");
		data = scan.nextInt();
		DoublyNode newNode = new DoublyNode(data);
		DoublyNode head = startNode;
		if (position == 1) {
			newNode.setNext(startNode);
			startNode.setPrevious(newNode);
			startNode = newNode;
			return startNode;
		}
		while (counter != position) {
			head = head.getNext();
			counter++;
		}
		newNode.setPrevious(head);
		newNode.setNext(head.getNext());
		if (!DoublyLinkedListFunctions.isEmpty(head.getNext())) 			// if no is to insert
																			// in between in the
																			// list
			head.getNext().setPrevious(newNode);
		head.setNext(newNode);												// if the no is at last position
		return startNode;
	}

	/**
	 * This function will delete node based on the data.
	 * @param{DoublyNode} startNode
	 * @return{DoublyNode}
	 */
	
	public DoublyNode deleteNode(DoublyNode startNode) {
		if (DoublyLinkedListFunctions.isEmpty(startNode))
			return null;
		System.out.println("Enter data to be deleted");
		int data = scan.nextInt();
		if (startNode.getData() == data) {
			startNode = startNode.getNext();
			doublyNodeObj.setNoOfNodes(doublyNodeObj.getNoOfNodes() - 1);
			return startNode;
		}
		DoublyNode head = startNode;
		while (head != null && head.getData() != data) {
			head = head.getNext();
		}
		if (DoublyLinkedListFunctions.isEmpty(head)) {
			System.out.println("data does not exist");

		} else {
			head.getPrevious().setNext(head.getNext());
			if (!DoublyLinkedListFunctions.isEmpty(head.getNext()))
				head.getNext().setPrevious(head.getPrevious());
			doublyNodeObj.setNoOfNodes(doublyNodeObj.getNoOfNodes() - 1);
			return startNode;

		}
		return null;
	}

	/***
	 * This function will delete node at given location.
	 * @param{DoublyNode} startNode
	 * @return{DoublyNode}
	 */
	
	public DoublyNode deleteNodeAtPosition(DoublyNode startNode) {
		int counter = 1;
		if (DoublyLinkedListFunctions.isEmpty(startNode))
			return null;

		System.out.println("Enter Position ");
		int index = scan.nextInt();
		if (index <= 0 || index > doublyNodeObj.getNoOfNodes())
			return null;

		if (index == 1) {
			startNode = startNode.getNext();
			doublyNodeObj.setNoOfNodes(doublyNodeObj.getNoOfNodes() - 1);
			return startNode;
		}
		DoublyNode head = startNode;
		while (index != counter++ && head != null) {
			head = head.getNext();
		}
		if (DoublyLinkedListFunctions.isEmpty(head)) {
			System.out.println("Data does not exist");

		} else {
			head.getPrevious().setNext(head.getNext());
			if (!DoublyLinkedListFunctions.isEmpty(head.getNext()))
				head.getNext().setPrevious(head.getPrevious());
			doublyNodeObj.setNoOfNodes(doublyNodeObj.getNoOfNodes() - 1);
			return startNode;
		}
		return null;
	}

	/**
	 * This function will reverse the doubly linked list
	 * @param{DoublyNode} start
	 * @return{DoublyNode}
	 */
	
	public DoublyNode reverse(DoublyNode start) {
		if (start == null) {
			System.out.println("Empty");
			return null;
		}
		DoublyNode current = start;
		DoublyNode temp = null;
		while (current != null) {
			temp = current.getPrevious();
			current.setPrevious(current.getNext());
			current.setNext(temp);
			current = current.getPrevious();
		}
		System.out.println("Reversed:");
		return temp.getPrevious();
	}

	/**
	 * This function checks if the head of linked list is empty or not.
	 * @param{DoublyNode} head
	 * @return{boolean}
	 */
	
	public static boolean check(DoublyNode head) {
		if (DoublyLinkedListFunctions.isEmpty(head)) {
			System.out.println("Position is incorrect or Node is empty");
			return false;
		} else {
			return true;
		}
	}
}
