
/**
 * @class  GeneralizedList
 * @author Pulkit
 * @since  5th october 15
 * @param <E> 
 * This class defines all the functions related to the generalized list.
 */

package com.metacube.list.generalized.helper;

import java.util.Scanner;

import com.metacube.list.generalized.modal.Element;
import com.metacube.list.generalized.modal.LinkedList;

public class GeneralizedList<E> {
	public Element<?> start;
	private static int index = 0;
	
	/**
	 * This is the main function.
	 * @param{String[]} args
	 */
	
	public static void main(String[] args) {
		GeneralizedList<Integer> obj = new GeneralizedList<Integer>("(2,(3,7,1),8)");
		Scanner scan = new Scanner(System.in);
		obj.traverse(obj.start);
		System.out.println("\n" + "Sum:" 
								+ obj.sum(obj.start) 
								+"\nMax:" 
								+ obj.max(obj.start));
		System.out.println("Enter the element to be searched");
		int find = scan.nextInt();
		System.out.println(obj.find(obj.start, find));
	}

	/**
	 * This is a default constructor.
	 */
	
	public GeneralizedList() {
		
	}
	
	/**
	 * This is a parameterized constructor.
	 * @param{String} setList
	 */
	
	public GeneralizedList(String setList) {
		start =  createList(setList);
	}
	
	/**
	 * This function takes a string representing the input of the 
	 * generalized list and creates the generalized list according to it.
	 * @param{String} setList
	 * @return
	 */
	
	private Element<?> createList (String setList) {
		LinkedList<E> list = new LinkedList<E>();
		char character = setList.charAt(index);
		while(character != ')') {
			if(Character.isDigit(character)) {
				Element<E> newElement = new Element<E>();
				newElement.setTag(Tag.VALUE);
				newElement.setValue((E) (String.valueOf(character)));
				if(list.getStart() == null) {
					list.setStart(newElement);
					list.setCurrent(newElement);
				}
				else {
					list.getCurrent().setNextElement(newElement);
					list.setCurrent(newElement);
				}
			}
			if(character == '(' && index > 0) {
				index++;
				Element<?> tempList = createList(setList);
				Element<Element<?>> newElement = new Element<Element<?>>();
				newElement.setValue(tempList);
				list.getCurrent().setNextElement(newElement);
				list.setCurrent(newElement);
				
			}
			index++;
			character = setList.charAt(index);
		}
		return list.getStart();
	}
	
	/**
	 * This function returns the object in string form. 
	 * @override toString()
	 * @return String
	 */
	
	public String toString() {
		
		return null;
	}
	
	/**
	 * This function returns the max element of all the elements present in the generalized list.
	 * @param{Element<?>} startNode
	 * @return{Integer}
 	 */
	
	public Integer sum (Element<?> startNode)
	{
		Integer data=0;
		if(startNode!=null){
			if(startNode.getTag() == Tag.VALUE)
				data= Integer.parseInt((String) startNode.getValue());
			else 
				data=sum((Element<?>)startNode.getValue());
		
			return data+sum(startNode.getNextElement());
		}
		return 0;
	}
	
	/**
	 * This function finds and returns the maximum element from the list.
	 * @param{Element<?>} startNode
	 * @return{E}
	 */
	
	public Integer max (Element<?> startNode)
	{
		Integer data=0;
		if(startNode!=null){
			if(startNode.getTag() == Tag.VALUE)
				data=Integer.parseInt((String) startNode.getValue());
			else 
				data = max((Element<?>)startNode.getValue());
		
			return data>max(startNode.getNextElement())?data:max(startNode.getNextElement());
		}
		return 0;
	}
	
	/**
	 * This function return true if the given element is found in the generalized list else false 
	 * @return{boolean}
	 */
	

	public boolean find (Element<?> startNode ,Integer dataSearch)
	{
		Integer data=0;
		boolean isFound=false;
		if(startNode!=null){
			if(startNode.getTag() == Tag.VALUE)
				data = Integer.parseInt((String) startNode.getValue());
			else 
				isFound = find((Element<?>)startNode.getValue(),dataSearch);
		
			return isFound==true ? isFound : find(startNode.getNextElement(),dataSearch);
		}
		return false;
	}
	
	/**
	 * This function traverses the generalized list.
	 * @param{Element<?} startNode
	 */
	
	public  void  traverse (Element<?> startNode)
	{
		if(startNode!=null) {
			if(startNode.getTag() == Tag.VALUE)
				System.out.print(startNode.getValue()+",");
			else {
				System.out.print("(");
				traverse((Element<?>)startNode.getValue());
				System.out.print(")");
			}
			traverse(startNode.getNextElement());
		}
	}
}


