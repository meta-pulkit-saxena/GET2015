
/**
 * @class  LinkedList
 * @author Pulkit
 * @since  25th August 15
 * This class contains all the functions related to linked list and basis unit structure of linked list node..
 */

import java.util.Scanner;

public class LinkedList {
	private int data;
	private LinkedList next;
	
	/**
	 * This function will return the 
	 * @return{int} data
	 */
	
	public int getData() {
		return data;
	}

	/**
	 * This function will set the data to the passed value.
	 * @param{int} data
	 */
	
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * This function will return the reference to next linked list.
	 * @return{LinkedList} next
	 */
	
	public LinkedList getNext() {
		return next;
	}

	/**
	 * This function will set the next to the reference of passes linked list.
	 * @param{LinkedList} next
	 */
	
	public void setNext(LinkedList next) {
		this.next = next;
	}
	
	/**
	 * This function is a parameterized constructor of Linked list class. 
	 * @param{int} data
	 */
	
	public LinkedList(int data) {
		this.data = data;
	}
	
	/**
	 * This function is a default constructor.
	 */
	
	public LinkedList() {
	}
	
	/**
	 * This function creates the list and returns the reference of start node.
	 * @return{LinkedList}
	 */
	
	public LinkedList createList()  {
		Scanner scan = new Scanner(System.in);
		int data;
		String choice = null;
		LinkedList head = null;
		LinkedList start = null;
		LinkedList newNode = null;

		do {
			
			System.out.print("Enter value of node");
			data = scan.nextInt();
			newNode = new LinkedList(data);
			if(start == null) {
				start = newNode;
				head = start;
			}
			else {
				head.setNext(newNode);
				head = head.getNext();
			}
	
			System.out.print("Do you want to add more nodes:(y or n) ");
			choice = scan.next();

		} while (choice.equalsIgnoreCase("y"));
		return start;
	}
	
	/**
	 * This function will display all the nodes in the linked list one by one.
	 * @param{printList} start
	 */

	public void displayLinkedList(LinkedList start) {			
		if(start == null) {
			System.out.println("Empty");
			return;
		}
		System.out.println("Linked List is :");
		while(start!= null) {
			System.out.println(start.getData());
			start = start.getNext();
		}
		System.out.println();
	}

	/**
	 * This function will add a node in the existing linked list.
	 * @param{LinkedList} start
	 * @param{int} element
	 */
	
	public void addNode(LinkedList start, int value ) {
		LinkedList newNode = new LinkedList(value) ;
		LinkedList current ;
		
		if(start == null) {
			start = newNode;
		} else {
			current = start;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}

	/**
	 * This function will add a node at a given position.
	 * @param{LinkedList} start
	 * @param{int} position
	 * @param{int] value
	 * @return
	 */
	
	public LinkedList addAtLocation(LinkedList start, int position, int value) {
		LinkedList newNode = new LinkedList(value);
		LinkedList current;
		int count = 2;
		current = start ;
		if( position == 1 ) {
			newNode.setNext(current);
			start = newNode;
		} else {
			while(count++ != position) {
				current =  current.getNext() ;
			}
				newNode.setNext(current.getNext()); 
				current.setNext(newNode); 
			}
		return start;
	}
	
	/**
	 * This function will return value at a given index.
	 * @param{LinkedList} start
	 * @param{int} index
	 * @return{int}
	 */
	
	public int getElement(LinkedList start, int index) {		
		int count = 0;
		LinkedList current = start ;
		while( count != index) {
			current = current.getNext();
			count++;
		}
		return current.getData();
	}

	/**
	 * This function will delete node from the Linked list.
	 * @param{LinkedList} start
	 * @param{int} value
	 */
	
	public void deleteElement(LinkedList start, int value) {
		LinkedList current = start;
		while( current.getNext().getData() != value && current.getNext().getNext() != null ) {
			current = current.getNext();
		}
		if(current.getNext().getNext() == null) System.out.println("value not found");
		else if(current.getNext() == null)
			current.setNext(null) ;
		else
			current.setNext(current.getNext().getNext());
	}

	/**
	 * This function will delete node on the basis of the given index.
	 * @param{LinkedList} start
	 * @param{int} index
	 */
	
	public void deleteAtIndex(LinkedList start, int index) {
		LinkedList current = start;
		int count = 1;
		while( ++count != index ) {
			if(current.getNext() == null) {
				System.out.println("Wrong Index");
				break;
			}
			current = current.getNext();
		}
		if(current.getNext() == null)
			current.setNext(null) ;
		else {
			LinkedList nextNode = current.getNext().getNext();
			current.setNext(nextNode);
		}
	}
	
	/**
	 * This function will reverse the linkedList.
	 * @param{LinkedList} start
	 * @return{LinkedList}
	 */
	
	public LinkedList reverseLinkedList(LinkedList start) {
		if(start == null) {
			System.out.println("Empty");
			return null;
		}
		LinkedList previousNode = null, nextNode = null;
		LinkedList head = start;
		while(head != null) {
			nextNode = head.getNext();
			head.setNext(previousNode);
			previousNode = head;
			head = nextNode;
		}
		return previousNode;
		
	}
}
