
/**
 * This class contains all the functions related to doubly list list
 * @class  DoublyLinkedListFunctions
 * @author Pulkit
 * @since  25th August 15
 */

import java.util.Scanner;

public class DoublyLinkedList {
	private Scanner scan;
	private DoublyNode  doublyNodeObj= new DoublyNode();
	private DoublyNode start = null;
	
	/**
	 * This function will create a linked list by taking elements one by one.
	 * @return{DoublyNode}
	 */
	
	
	public void createList() {
		int data;
		scan = new Scanner(System.in);
		String choice = null;
		DoublyNode current = null;
		DoublyNode newNode = null;
		System.out.println("Enter the value of start node:");
		data = scan.nextInt();
		newNode = new DoublyNode(data);
		start = newNode;
		current = start;
		do {
			System.out.print("Enter value of node");
			data = scan.nextInt();
			newNode = new DoublyNode(data);
			current.setNext(newNode);
			newNode.setPrevious(current);
			current = newNode;
			System.out.print("Do you want to add more nodes:(Y/N) ");
				choice = scan.next();
		} while (choice.equalsIgnoreCase("y"));
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
	 */
	
	public void displayList() {
		DoublyNode temp;
		if (isEmpty(start)) {
			System.out.println("List is empty");
			return;
		}
		temp = start;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

	/**
	 * This function will add node at a location.
	 * @param{int} position
	 */
	
	public void add( int position,int data) {
		int counter = 2;;
		DoublyNode newNode = new DoublyNode(data);
		DoublyNode head = start;
		if (position == 1) {
			newNode.setNext(start);
			start.setPrevious(newNode);
			start = newNode;
		}
		while (counter != position) {
			head = head.getNext();
			counter++;
		}
		newNode.setPrevious(head);
		newNode.setNext(head.getNext());
		if (!DoublyLinkedList.isEmpty(head.getNext())) 						// if no is to insert
																			// in between in the
																			// list
			head.getNext().setPrevious(newNode);
		head.setNext(newNode);												// if the no is at last position
	}

	/**
	 * This function will delete node based on the data.
	 */
	
	public void delete() {
		System.out.println("Enter data to be deleted");
		int data = scan.nextInt();
		if (start.getData() == data) {
			start = start.getNext();
			doublyNodeObj.setNoOfNodes(doublyNodeObj.getNoOfNodes() - 1);
		}
		DoublyNode head = start;
		while (head != null && head.getData() != data) {
			head = head.getNext();
		}
		if (DoublyLinkedList.isEmpty(head)) {
			System.out.println("data does not exist");

		} else {
			head.getPrevious().setNext(head.getNext());
			if (!DoublyLinkedList.isEmpty(head.getNext()))
				head.getNext().setPrevious(head.getPrevious());
			doublyNodeObj.setNoOfNodes(doublyNodeObj.getNoOfNodes() - 1);
		}
	}

	/***
	 * This function will delete node at given location.
	 */
	
	public void delete(int index) {
		int counter = 1;
		DoublyNode tempNode = null;
		tempNode = start;
		if (index == 1) {
			tempNode = tempNode.getNext();
			doublyNodeObj.setNoOfNodes(doublyNodeObj.getNoOfNodes() - 1);
		}
		DoublyNode head = start;
		while (index != counter++ && head != null) {
			head = head.getNext();
		}
		if (DoublyLinkedList.isEmpty(head)) {
			System.out.println("Data does not exist");

		} else {
			head.getPrevious().setNext(head.getNext());
			if (!DoublyLinkedList.isEmpty(head.getNext()))
				head.getNext().setPrevious(head.getPrevious());
			doublyNodeObj.setNoOfNodes(doublyNodeObj.getNoOfNodes() - 1);
		}
	}

	/**
	 * This function will reverse the doubly linked list
	 */
	
	public void reverse() {
		if (start == null) {
			System.out.println("Empty");
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
		start = temp.getPrevious();
	}

	/**
	 * This function checks if the head of linked list is empty or not.
	 * @param{DoublyNode} head
	 * @return{boolean}
	 */
	
	public static boolean check(DoublyNode head) {
		if (DoublyLinkedList.isEmpty(head)) {
			System.out.println("Position is incorrect or Node is empty");
			return false;
		} else {
			return true;
		}
	}
}
