
/**
 * @class  DoublyLinkedList
 * @author Pulkit
 * @class  25th August 15
 * This class defines all the functions related to the doubly linked list.
 */

package RevisedDsAssignment1;

public class DoublyLinkedList<T> {
	private Node<T> startNode;
	private int size;
	
	/**
	 * This function will display the doubly linkedList.
	 */
	
	public void display() {
		Node temp;
		if (startNode == null) {
			System.out.println("List is empty");
			return;
		}
		temp = startNode;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}
	
	/**
	 * This function will add a element in the doubly linked list.
	 * @param{T} data
	 */
	
	public void add(T data) {
		Node<T> newNode;
		if(startNode == null) {
			newNode = new Node<T>(data);
			startNode = newNode;
			size++;
		}
		else {
			add(size + 1, data);
		}
		
	}
	
	/**
	 * This function will add a node at given locatin with specified value.
	 * @param{int} location
	 * @param{T} data
	 */
	
	public void add(int location, T data) {
		int counter = 2;
		Node<T> newNode = new Node<T>(data);
		Node current = startNode;
		if (location == 1) {
			newNode.setNext(startNode);
			startNode.setPrevious(newNode);
			startNode = newNode;
			size++;
		}
		while (counter != location && current.getNext() != null) {
			current = current.getNext();
			counter++;
		}
		newNode.setPrevious(current);
		newNode.setNext(current.getNext());
		if(current.getNext() != null) {
			current.getNext().setPrevious(newNode);
		}
		current.setNext(newNode);	
		size++;
	}
	
	/**
	 * This function will remove the given data from the link list.
	 * @param{T} data
	 */
	
	public void removeItem(T data) {
		if (startNode.getData() == data) {
			startNode = startNode.getNext();
			size -= 1;
		}
		Node<T> current = startNode;
		while (current != null && current.getData() != data) {
			current = current.getNext();
		}
		if (current == null) {
			System.out.println("data does not exist");

		} else {
			current.getPrevious().setNext(current.getNext());
			if (current.getNext() != null)
				current.getNext().setPrevious(current.getPrevious());
			size -= 1;
		}
	}
	
	/**
	 * This function will remove the node from the given location.
	 * @param{int} location
	 */
	
	public void remove(int location) {
		int counter = 1;
		Node tempNode = null;
		tempNode = startNode;
		if (location == 1) {
			tempNode = tempNode.getNext();
			size -= 1;
		}
		Node<T> current = startNode;
		while (location != counter++ && current != null) {
			current = current.getNext();
		}
		if (current == null) {
			System.out.println("Data does not exist");

		} 
		else {
			current.getPrevious().setNext(current.getNext());
			if (current.getNext() != null) {
				current.getNext().setPrevious(current.getPrevious());
			}
			size -= 1;
		}
	}
	
	/**
	 * This function will reverse the doubly linked list
	 */
	
	public void reverse() {
		if (startNode == null) {
			System.out.println("Empty");
		}
		Node<T> current = startNode;
		Node<T> temp = null;
		while (current != null) {
			temp = current.getPrevious();
			current.setPrevious(current.getNext());
			current.setNext(temp);
			current = current.getPrevious();
		}
		System.out.println("Reversed:");
		startNode = temp.getPrevious();
	}
 }
