/**
 * @class  LinkedList
 * @author Pulkit
 * @since  25th August 15
 */
public class LinkedList<T> {
	private Node<T> startNode;
	private int size;
	
	/**
	 * This function adds a new node at the end of the linked list.
	 * @param{T} value
	 */
	
	public void add(T value) {
		Node<T> newNode = new Node<T>(value);
		if(startNode == null) {
			startNode = newNode;						// Sets the new node at start.
			size++;
		}
		else {
			add(size + 1,value);		
		}
	}
	
	/**
	 * This function adds a node at the specified location.
	 * @param{int} location
	 * @param{T} data
	 */
	
	public void add(int location, T data) {
		Node<T> newNode = new Node<T>(data);
		Node<T> current;
		int count = 2;
		current = startNode ;
		if( location == 1 ) {
			newNode.setNextNode(current);
			startNode = newNode;
			size++;
		} 
		else {
			while(count++ != location) {
				current =  current.getNextNode() ;
			}
				newNode.setNextNode(current.getNextNode()); 
				current.setNextNode(newNode); 
		}
		size++;
	}
	
	/**
	 * This function removes a node from the linked list at given location.
	 * @param location
	 */
	
	public void remove(int location) {
		Node<T> current = startNode;
		int count = 1;
		while( ++count != location ) {
			if(current.getNextNode() == null) {
				System.out.println("Wrong Index");
				break;
			}
			current = current.getNextNode();
		}
		if(current.getNextNode() == null)
			current.setNextNode(null) ;
		else {
			Node<T> nextNode = current.getNextNode().getNextNode();
			current.setNextNode(nextNode);
			size--;
		}
	}
	
	/**
	 * This function removes the given data from the linked list.
	 * @param{T} data
	 */
	
	public void removeItem(T data) {
		Node<T> current = startNode;
		while( current.getNextNode().getData() != data && current.getNextNode().getNextNode() != null ) {
			current = current.getNextNode();
		}
		if(current.getNextNode().getNextNode() == null) {
			System.out.println("value not found");
		}
		else if(current.getNextNode() == null){
			current.setNextNode(null) ;
		}
		else {
			current.setNextNode(current.getNextNode().getNextNode());
			size--;
		}
			
	}
	
	/**
	 * This function returns the data present in the node at the given location.
	 * @param location
	 * @return
	 */
	
	public T getData(int location) {
		int count = 1;
		Node<T> current = startNode ;
		while( count != location) {
			current = current.getNextNode();
			count++;
		}
		return current.getData();
		
		
	}
	
	/**
	 * This function will display the link list.
	 */
	
	public void display() {
		if(startNode == null) {
			System.out.println("Empty");
			return;
		}
		System.out.println("Linked List is :");
		Node<T> current = startNode;
		while(current!= null) {
			System.out.println(current.getData());
			current = current.getNextNode();
		}
		System.out.println();
	}
	
	/**
	 * This function reverses the linked list.
	 */
	
	public void reverse() {
		if(startNode == null) {
			System.out.println("Empty");
		}
		Node<T> previousNode = null, nextNode = null;
		Node<T> head = startNode;
		while(head != null) {
			nextNode = head.getNextNode();
			head.setNextNode(previousNode);
			previousNode = head;
			head = nextNode;
		}
		startNode =  previousNode;
	}
}
