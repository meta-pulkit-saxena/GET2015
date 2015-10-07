
/**
 * @class  Element
 * @author Pulkit
 * @since  1st Oct 15
 * This class defines the basic structure of an element of a generalized list. 
 */

package com.metacube.list.generalized.modal;

import com.metacube.list.generalized.helper.Tag;

public class Element<E> {
	
	private Tag tag;
	private E value;
	private Element<?> nextElement;
	
	/**
	 * This function return the tag type of the element.
	 * @return{Tag}
	 */
	
	public Tag getTag() {
		return tag;
	}
	
	/**
	 * This function sets the tag of the element.
	 * @param{Tag} tag
	 */
	
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
	/**
	 * This function returns the value of the element.
	 * @return{E} value
	 */
	
	public E getValue() {
		return value;
	}
	
	/**
	 * This function sets the value of the element.
	 * @param{E} value
	 */
	
	public void setValue(E value) {
		this.value = value;
	}
	
	/**
	 * This function returns the reference to the next element
	 * @return{Element} nextElement
	 */
	
	public Element<?> getNextElement() {
		return nextElement;
	}
	
	/**
	 * @param{Element} nextElement the nextElement to set
	 */
	
	public void setNextElement(Element<?> nextElement) {
		this.nextElement = nextElement;
	}
}
