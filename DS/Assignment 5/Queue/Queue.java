
/**
 * @class  Queue
 * @author Pulkit
 * @since  1st September 15
 * This Class implements the basic methods of queue.
 */

package assignment5;
import java.util.LinkedList;

public class Queue<T> {

	LinkedList<T> queue = new LinkedList<T>(); 
	
	/**
	 * This method adds an element in to the rear of the queue.
	 * @param{T} element
	 */
	
	public  void enqueue(T element){
		queue.addLast(element);	
	}
	
	/**
	 * This method removes an element from front of the queue.
	 * @return{T} element
	 */
	
	public T dequeue() {
		T element = null;
		if(queue.size()>0){	
			element = queue.removeFirst(); 	
			return element;
		}
		else {
			System.out.println("Empty queue");
		}
		return element;
	}
}
