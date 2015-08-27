
/**
 * @class  DoublyNode
 * @author Pulkit
 * @since  25th August 15
 * This class will define the structure of the doubly node.
 */

public class DoublyNode {

	private DoublyNode previous;
	private int data;
	private DoublyNode next;
	private static int noOfNodes;
	
	/**
	 * This function will return the reference to the previous doubly node.
	 * @return{DoublyNode} previous
	 */
	
	public DoublyNode getPrevious() {
		return previous;
	}

	/**
	 * This function will set the reference to previous node.
	 * @param{DoublyNode} previous 
	 */
	
	public void setPrevious(DoublyNode previous) {
		this.previous = previous;
	}

	/**
	 * This function will return the value. 
	 * @return{int} the data
	 */
	
	public int getData() {
		return data;
	}

	/**
	 * This function will return the 
	 * @param{int} data the data to set the value of node.
	 */
	
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * This function will return the reference to the next node.
	 * @return{DoublyNode} the next
	 */
	
	public DoublyNode getNext() {
		return next;
	}

	/**
	 * This function will set the reference to the next node.
	 * @param next the next to set
	 */
	
	public void setNext(DoublyNode next) {
		this.next = next;
	}

	/**
	 * This is a parameterized constructor of doubly node.
	 * @param{int} data
	 */
	
	public  DoublyNode(int data) {
		setData(data);
		noOfNodes++;		
	}
	
	public DoublyNode() {
	}

	/**
	 * This function will return the noOfNodes.
	 * @return{int} noOfNodes
	 */
	
	public  int getNoOfNodes() {
		return this.noOfNodes;
	}

	/**
	 * This function will set the no of nodes.
	 * @param{int} noOfNodes
	 */
	
	public  void setNoOfNodes(int noOfNodes) {
		this.noOfNodes = noOfNodes;
	}
}