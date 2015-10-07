
/**
 * @class Utility
 * @author Pulkit
 * @since 6 October,2015
 * Takes the Value and provides the Information
 **/

package com.metacampus.slidingwindow.helper;
import java.util.Scanner;

public class InputValidator
{
	/**
	 * This function provides Integer value and checks till value entered is not integer
	 * @param{String} message
	 * @return{int} 
	 **/
	
	public int getIntegerValue(String message)
	{
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println(message);
			int number;
			String inputStr = sc.next();
			if(isNumeric(inputStr) && (Integer.parseInt(inputStr)>0))
			{
				number=Integer.parseInt(inputStr);
				return number;
			}
			else
			{
				System.out.println("Enter positive integer value");
			}
		}while(true);
	}
	
	/**
	 * This function Checks whether the value is numeric or not
	 * @param{String} input
	 * @return{boolean}
	 **/
	
	private boolean isNumeric(String input) 
	{
		try 
		{
			Integer.parseInt(input);
		} 
		catch (NumberFormatException e) 
		{
			return false;
		}
		return true;	
	}
	
	/**
	 * This function takes input a String from user
	 * @param{String} message
	 * @return{String}
	 **/
	
	public String getStringInput(String message)
	{
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		String inputStr = sc.nextLine();
		return inputStr;
	}
	
	/**
	 * This function Checks the choice of the User whether want to continue or not
	 * @param{String} message
	 * @return{char}
	 **/
	
	public char getCharacterInput(String message)
	{
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		char input = sc.next().charAt(0);
		if((input == 'y' || input == 'Y') || (input == 'n' || input == 'N'))
		{
			return input;
		}
		else
		{	
			return getCharacterInput(message);
		}
	}
	
	/**
	 * This function takes an array as input.
	 * @param{String} message
	 * @return{int[]}
	 **/
	
	public int[] getArrayInput(String message)
	{
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		int array[] = new int[9];
		for(int i = 0; i < (array.length-1) ; i++)
		{
			array[i] = sc.nextInt();
		}
		return array;
	}
	
}
