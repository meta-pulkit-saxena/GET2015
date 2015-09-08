
/**
 * @class  Node
 * @author Pulkit
 * @since  25th August 15
 * This class defines the basic structure of a node of doubly linkedList.
 */

package RevisedDsAssignment1;

public class Node<T> {
	private T data;
	private Node<T> next;
	private Node<T> previous;
	
	/**
	 * This is a parameterized constructor of doubly node.
	 * @param{T} data
	 */
	
	public  Node(T data) {
		setData(data);		
	}
	
	/**
	 * This is a default constructor of node.
	 */
	
	public Node() {
	}
		
	/**
	 * This function will return the reference to the previous doubly node.
	 * @return{Node<T>} previous
	 */
	
	public Node<T> getPrevious() {
		return previous;
	}

	/**
	 * This function will set the reference to previous node.
	 * @param{Node<T>} previous 
	 */
	
	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	/**
	 * This function will return the data. 
	 * @return{T} data
	 */
	
	public T getData() {
		return data;
	}

	/**
	 * This function will set the data of node. 
	 * @param{T} data 
	 */
	
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * This function will return the reference to the next node.
	 * @return{Node<T>} next
	 */
	
	public Node<T> getNext() {
		return next;
	}

	/**
	 * This function will set the reference to the next node.
	 * @param next the next to set
	 */
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
}
