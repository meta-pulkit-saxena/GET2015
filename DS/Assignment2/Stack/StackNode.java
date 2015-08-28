
/**
 * @class  
 * @author Pulkit
 * @since  26th August 15
 * This function will define the basis structure of a stack node.
 */

public class StackNode<T> {

	private T value;
	private StackNode<T> nextNode;
	
	/**
	 * This is a parameterized constructor of stack node class.
	 * @param{T} value
	 */
	
	public StackNode(T value) {
		this.value = value;
	}
	
	public StackNode() { 
		
	}
	
	/**
	 * This function will return the value part.
	 * @return{T} value
	 */
	
	public T getValue() {
		return value;
	}
	
	/**
	 * This function set the value of the stack node.
	 * @param{T} value 
	 */
	
	public void setValue(T value) {
		this.value = value;
	}
	
	/**
	 * This function will return the reference to the next node.
	 * @return{T} the nextNode
	 */
	
	public StackNode<T> getNextNode() {
		return nextNode;
	}
	
	/**
	 * This function will set the reference to the next node. 
	 * @param nextNode the nextNode to set
	 */
	
	public void setNextNode(StackNode<T> nextNode) {
		this.nextNode = nextNode;
	}
}
