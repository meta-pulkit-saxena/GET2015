
/**
 * @class TruthTable 
 * @author Pulkit
 * @since 05 October,2015
 * Generate the Table for the required infix.
 **/

package com.metacampus.truthtable;

import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import com.metacampus.truthtable.helper.Validation;

public class GenerateTruthTable 
{
	
	/**
	 * Generate the table for input
	 * @param{String} input
	 * @return{int} 
	 **/
	
	public int truthTableGenerator(String input)
	{
		Validation validation = new Validation();
		try 
		{
			// validating input expression 
			if (input == null || input.length() == 0)
			{
				return 0;
			}
			if (validation.isExpression(input)) 
			{
				// input string will be furnished 
				input = replaceCharacter(input);
				// after furnish also checked for validation 
				if (validation.isExpression(input)) 
				{
					// converting infix expression to postfix 
					String inputPostfix = postfixConvertor(input);
					System.out.println("Postfix Equivalent : " + inputPostfix);
					evalPostfix(inputPostfix);
				}
				else
				{
					return -1;
				}
				return 1;
			} 
			else
			{
				return -1;
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			return -2;
		}
	}

	/**
	 * Method to furnish the input expression i.e. this method will remove pairs of '~' symbols from expression
	 * @param{String} input
	 * @return{String} 
	 **/
	
	private String replaceCharacter(String input)
	{
		//Traversing over the input string to filter it
		for (int i = 0; i < input.length(); i++) 
		{
			if (input.charAt(i) == '~') 
			{
				if (input.charAt(i + 1) == '~') 
				{
					if (i == 0) 
					{
						input = input.substring(i + 2, input.length());
						i = -1;
					} 
					else
					{
						input = input.substring(0, i)+ input.substring(i + 2, input.length());
					}
				}
			}
		}
		System.out.println(" Expression : " + input);
		return input;
	}

	/**
	 * Method to count letters in the given expression.
	 * @param{String} inputPostfix
	 * @return{Set<Character>} letterSet  
	 **/
	
	private Set<Character> countLetters(String inputPostfix)
	{
		// defining character set 
		Set<Character> letterSet = new TreeSet<Character>();
		// converting input string in character array 
		char[] chars = inputPostfix.toCharArray();
		// adding unique letters from the array to the set 
		for (char c : chars) 
		{
			if (Character.isLetter(c))
			{
				letterSet.add(c);
			}
		}
		return letterSet;
	}
	
	/**
	 * Evaluates the Postfix expression.
	 * @param{String} inputPostfix
	 **/
	
	private void evalPostfix(String inputPostfix)
	{
		Set<Character> letterSet = countLetters(inputPostfix);
		char res = ' ';
		char[][] chars = binaryCombinations(letterSet.size());
		//letterSetIterator1 is iterator over the letterSet 
		Iterator<Character> letterSetIterator1 = letterSet.iterator();
		// iterating over the set letterSet 
		while (letterSetIterator1.hasNext()) 
		{
			char c = letterSetIterator1.next();
			System.out.print(c + "\t");
		}
		System.out.print("Output");
		System.out.println();
		for (int i = 0; i < chars.length; i++) 
		{
			//input update also contains the same string as inputPostfix 
			String inputUpdate = inputPostfix;
			int j = 0;
			// letterSetIterator is iterator over the set letterSet 
			Iterator<Character> letterSetIterator = letterSet.iterator();
			// iterating over the set letterSet 
			while (letterSetIterator.hasNext())
			{
				// extracting character from the set 
				char c = letterSetIterator.next();
				// replacing characters from the inputUpdate 
				inputUpdate = inputUpdate.replace(c, chars[i][j]);
				j++;
			}
			Stack<Character> list = new Stack<Character>();
			char characterFirst;
			char characterSecond;

			// iterating over the complete input string 
			for (j = 0; j < inputUpdate.length(); j++)
			{
				char ch = inputUpdate.charAt(j);
				if (ch == ' ') 
				{
				} 
				else
				{
					//if character is letter then push that onto the stack
					if (Character.isLetter(ch)) 
					{
						list.push(ch);
					} 
					else 
					{
						if (ch == '~')
						{
							characterFirst = list.pop();
							list.push(operationPerform(characterFirst, ch));
						} 
						else 
						{
							characterFirst = list.pop();
							characterSecond = list.pop();
							switch (ch) 
							{
							 // if operator is AND operator this case will be
							case '&':
								list.push(operationPerform(characterFirst, characterSecond, '&'));
								break;
							 // if operator is OR operator this case will be
							case '|':
								list.push(operationPerform(characterFirst, characterSecond, '|'));
								break;
							 //This Code will be executed if the order of operators is invalid
							default:
								System.out.println("Invalid operator order!");
							}
						}
					}
				}
			}
			res = list.pop();
			for (int count = 0; count < chars[0].length; count++) 
			{
				System.out.print(chars[i][count] + "\t");
			}
			System.out.println(res);
		}
	}
	
	/**
	 * Checks the String and performs the Operation
	 * @param{char} characterFirst
	 * @param{char} characterSecond
	 * @param{char} op
	 * @return{Character}
	 **/
	
	private Character operationPerform(char characterFirst, char characterSecond, char op)
	{
		//If operator is '&' then this code will be executed 
		if (op == '&') 
		{
			 //If both characters are 'F' then retrun false, otherwise return true
			if (characterFirst == 'F' || characterSecond == 'F')
			{
				return 'F';
			} 
			else
			{
				return 'T';
			}
		}
		// If operator is '|' then this code will be executed 
		else 
		{
			if (characterFirst == 'T' || characterSecond == 'T')
			{
				return 'T';
			}
			else
			{
				return 'F';
			}
		}
	}
	
	/**
	 * Performs operation
	 * @param{char} characterFirst
	 * @param{char} notOperator
	 * @return{Character}
	 **/
	
	private Character operationPerform(char characterFirst, char notOperator) 
	{
		// if input character is 'F' then return 'T', otherwise return 'T' 
		if (characterFirst == 'F')
		{
			return 'T';
		}
		else
		{
			return 'F';
		}
	}
	
	/**
	 * Converts into postfix Converter
	 * @param{String} input
	 * @return{Sring}
	 **/
	
	private String postfixConvertor(String input)
	{
		Stack<Character> stackObj = new Stack<Character>();
		// Calculating length of infix expression 
		int inputLength = input.length();
		String postfixExpression = "";
		Object poppedItem;
		int countBraces = 0;
		// Traversing each character in the input string using for loop 
		for (int i = 0; i < inputLength; i++)
		{
			Character temp = new Character(input.charAt(i));
			// Checking whether the character is alphabet or not 
			if (Character.isLetter(temp))
			{
				postfixExpression = postfixExpression + temp;
			}

			// if the character is '(' then push it on the stack 
			else if (input.charAt(i) == '(') 
			{
				stackObj.push(temp);
				countBraces++;
			}
			else if (temp == ')') 
			{
				if (countBraces == 0)
				{
					System.out.println("Invalid Expression");
					return null;
				}

				// retrieving top elements from stack 
				while (!((char) stackObj.peek() == '('))
				{
					poppedItem = stackObj.pop();
					postfixExpression = postfixExpression + poppedItem;
				}
				stackObj.pop();
				countBraces--;
			}
			// if the character is an operator 
			else if (temp == '&' || temp == '|' || temp == '~')
			{
				// if stack is empty then push the operator on the stack 
				if (stackObj.size() == 0)
				{
					stackObj.push(temp);
				} 
				else
				{
					if (input.charAt(i) == '~')
					{
						/* popping characters from stack if top is '~' */
						if ((char) stackObj.peek() == '~')
						{
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}
					else if (input.charAt(i) == '&')
					{
						while (stackObj.peek() != '|' && stackObj.peek() != '(')
						{
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
							if (stackObj.size() == 0)
							{
								break;
							}
						}
					}
					//if current character is '|' , then this code will be
					else if (input.charAt(i) == '|') 
					{
						while (stackObj.size() != 0 && stackObj.peek() != '(')
						{
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}
					//adding operator to top if the operator has higher precedence than top operator
					stackObj.push(temp);
				}
			}
		}
		while (stackObj.size() != 0) 
		{
			poppedItem = stackObj.pop();
			postfixExpression = postfixExpression + poppedItem;
		}
		return postfixExpression;
	}

	/**
	 * Method to find binary combination for a given number
	 * @param{int} numberOfCharacters
	 * @return{char[][]} character Array corresponding to binary combinations.
	 **/
	
	private char[][] binaryCombinations(int numberOfCharacters) 
	{

		// If number of characters are zero then return null
		if (numberOfCharacters == 0)
		{
			return null;
		}
		// numberOfRows will contain the number of rown in booelan array bools 
		int numberOfRows = (int) Math.pow(2, numberOfCharacters);
		boolean[][] bools = new boolean[numberOfRows][numberOfCharacters];
		char[][] chars = new char[numberOfRows][numberOfCharacters];
		//assigning appropriate values to bools and chars
		for (int i = 0; i < bools.length; i++)
		{
			for (int j = 0; j < bools[i].length; j++) 
			{
				int val = bools.length * j + i;
				int ret = (1 & (val >>> j));
				bools[i][j] = ret != 0;
				if (bools[i][j]) 
				{
					chars[i][j] = 'T';
				} 
				else
				{
					chars[i][j] = 'F';
				}
			}
		}
		return chars;
	}
}
