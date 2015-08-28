
/**
 * @class Stack
 * @author Pulkit
 * @since  26th August 15
 * This class  will define the functions for the stack.
 */

public class StackFunctions<T> {
	public StackNode<T> top ;
	
	/**
	 * This function will add a new value in the stack by adding a new node.
	 * @param{T} value
	 */
	
	public void push(T value) {
		StackNode<T> newStackNode = new StackNode<T>(value);
		if(top == null) {
			top = newStackNode;
		}
		else {
			newStackNode.setNextNode(top);
			top = newStackNode;
		}
	}
	
	/**
	 * This function will return the value node from the top of the stack.
	 * @return{T}
	 */
	
	public T pop() {
		StackNode<T> tempTopNode = null;
		if(top == null) {
			System.out.println("UnderFlow");
		}
		else {
			tempTopNode = new StackNode<T>();
			tempTopNode = top;
			top = tempTopNode.getNextNode();
		}
		return tempTopNode.getValue();
	}
	
	/**
	 * This function will display all the elements of the stack.
	 */
	
	public void display() {
		if (top == null) {
			System.out.println("Stack is Empty");
			return;
		}
		else {
			StackNode<T> head = top;
			while (head != null) {
				System.out.print(head.getValue() + " ");
				head = head.getNextNode();
			}
		}
	}
}
