
/**
 * @class   Validation
 * @author Pulkit
 * @since 05 October,2015
 * Validates the String Expression
 **/

package com.metacampus.truthtable.helper;

public class Validation 
{
	/**
	 * This function validates the input expression.
	 * @param{String} expression
	 * @return{boolean}
	 **/
	
	public boolean isExpression(String expression)
	{
		// if expression is null, or its length is zero then return false 
		if (expression == null || expression.length() == 0)
		{
			return false;
		}
		// Changes to array
		char[] expressionArray = expression.toCharArray();
		// Calculates the Length
		int length = expressionArray.length;
		int openCount = 0, closeCount = 0;
		int i = 0;
		// Traverses the Array
		for (i = 0; i < (length - 1); i++)
		{
			// Checks The Letter
			if ((Character.isLetter(expressionArray[i]))) 
			{
				if (Character.isLetter(expressionArray[i + 1])|| expressionArray[i + 1] == '(')
				{
					return false;
				}
			}
			// Checks for closing Bracket
			if (expressionArray[i] == ')') 
			{
				if (expressionArray[i + 1] == '(')
				{
					return false;
				}
			}
			// Checks for the Other Cases
			if (expressionArray[i] == ')'|| Character.isLetter(expressionArray[i])) 
			{
				if (expressionArray[i + 1] == '~')
				{
					return false;
				}
			}
			// Checks the Operators
			if (expressionArray[i] == '&' || expressionArray[i] == '|') 
			{
				if (expressionArray[i + 1] == '&'|| expressionArray[i + 1] == '|')
				{
					return false;
				}
			}

			if (expressionArray[i] == '~') {
				if (expressionArray[i + 1] == ')')
					return false;
			}
		}

		// validation for first character is operator
		if (expressionArray[0] == '&' || expressionArray[0] == '|'
				|| expressionArray[length - 1] == '&'
				|| expressionArray[length - 1] == '|'
				|| expressionArray[length - 1] == '~')
			return false;

		// Validation for acceptable symbols number or open and closed braces 
		for (char c : expressionArray)
		{
			if (!(Character.isLetter(c)) && !(c == '&') && !(c == '|')&& !(c == '~') && !(c == '(') && !(c == ')')) 
			{
				return false;
			}
			else 
			{
				if (c == '(')
				{
					openCount++;
				}
				else if (c == ')')
				{
					closeCount++;
				}
			}
		}
		// Checks whether number of open bracket is equal to close brackets
		if (openCount == closeCount)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
