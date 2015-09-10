/**
 * @class Queue
 * @author Pulkit
 * @since 25th August 15
 * This class contains all the functions related to the queue.
 */

public class Queue {

	private int front;
	private int end;
	private int size;
	private Object queue[];

	/**
	 * This is a  parameterized constructor of queue.
	 * @param{int} size
	 */
	
	public Queue(int size) {
		front = -1;
		end = -1;
		this.size = size;
		queue = new Object[size];
	}
	
	/**
	 * This is a default constructor.
	 */
	 
	public Queue() {
	}
	
	/**
	 * This function will return the end of queue.
	 * @return{int} end
	 */
	
	public int getEnd() {
		return end;
	}

	/**
	 * This function will set the end of queue.
	 * @param{int} end
	 */
	
	public void setEnd(int end) {
		this.end = end;
	}

	/**
	 * This function will return the size of queue.
	 * @return{int}
	 */
	
	public int getSize() {
		return size;
	}

	/**
	 * This function will set the end of queue.
	 * @param{int} size
	 */
	
	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * This will return the array of the values.
	 * @return{Object[]]
	 */
	
	public Object[] getQueue() {
		return queue;
	}

	/**
	 * This function will set the array of values.
	 * @param{Object[]} queue
	 */
	
	public void setQueue(Object[] queue) {
		this.queue = queue;
	}

	/**
	 * This will set the front of the queue.
	 * @param{int} front
	 */
	
	public void setFront(int front) {
		this.front = front;
	}
	
	/**
	 * This will the front value.
	 * @return{Object}
	 */
	
	public Object getFront() {
		Object object;
		if (end == -1) {
			System.out.println("Queue is empty");
			return null;
		} else {
			object = queue[end];
		}
		return object;
	}

	/**
	 * This function will add a value in the queue.
	 * @param{Object} item
	 */
	
	public void enqueue(Object item) {
		// Checks the size
		if (end >= size - 1) {
			System.out.println("Queue is full");
			return;
		} else if (front == -1 && end == -1) {
			front = 0;
		}
		end = end + 1;
		queue[end] = item;
	}

	/**
	 * This function will return a value from the front of queue.
	 * @return{Object}
	 */
	
	public Object dequeue() {
		Object item;
		if (front == -1) {
			System.out.println("Queue is empty");
			return null;

		} else {
			item = queue[front];

		}
		if (front == end) {
			front = -1;
			end = -1;

		} else
			front = front + 1;
		return item;
	}

	/**
	 * This function will make the queue empty.
	 **/
	
	public void makeEmpty() {
		front = -1;
		end = -1;

	}
	

}
