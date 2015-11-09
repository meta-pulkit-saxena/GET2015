
/**
 * @class  LinkedList
 * @author Pulkit
 * @since  5th October 15
 * @param <E>
 * This class defines the 
 */

package com.metacube.list.generalized.modal;

import com.metacube.list.generalized.modal.Element;

public class LinkedList<E> {
	private Element<?> start;
	private Element<?> current;

	
	/**
	 * This function returns the start reference to the element of linked list.
	 * @return{Element} start
	 */
	
	public Element<?> getStart() {
		return start;
	}
	
	/**
	 * This function sets the start element of the linked list.
	 * @param{Element} start
	 */
	
	public void setStart(Element<?> start) {
		this.start = start;
	}
	
	/**
	 * This function returns the current element of the linked list.
	 * @return{Element} current
	 */
	
	public Element<?> getCurrent() {
		return current;
	}
	
	/**
	 * This function sets the current element of the linked list.
	 * @param{Element} current
	 */
	
	public void setCurrent(Element<?> current) {
		this.current = current;
	}
}
