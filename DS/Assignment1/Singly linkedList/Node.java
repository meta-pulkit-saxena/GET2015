/**
 * @class  Node
 * @author Pulkit
 * @since  25th August 15
 * This class defines the basic structure of a node.
 */

public class Node<T> {
	private T data;
	private Node<T> nextNode;
	
	
	/**
	 * This is a parameterized constructor for node.
	 * @param{T} data
	 */
	
	public Node(T data) {
		this.data = data;
	}
	
	/**
	 * This is a default constructor of node.
	 */
	
	public Node() {	
	}
	
	/**
	 * This function returns the data of the node. 
	 * @return{T} data
	 */
	
	public T getData() {
		return data;
	}
	/**
	 * This function sets the data of the node.
	 * @param{T} data
	 */
	
	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * This function returns the reference to the next node.
	 * @return{Node<T>} nextNode
	 */

	public Node<T> getNextNode() {
		return nextNode;
	}
	
	/**
	 * This function sets the reference to the next node.
	 * @param{Node<T>} nextNode
	 */
	
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
}
