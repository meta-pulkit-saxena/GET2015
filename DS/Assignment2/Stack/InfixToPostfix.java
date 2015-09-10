import java.util.Scanner;

/**
 * @class  InfixToPostFix
 * @author Pulkit
 * @since  25th August 15
 */

public class InfixToPostfix {

	/**
	 * Checks the character is operator
	 * @param{char} c
	 * @return{boolean}
	 * Description: Checks the character is operator
	 **/
	private boolean isOperator(char c)
	{
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
			return true;
		return false;
	}
	
	/**
	 * Checks the precedence of the characters.  
	 * @param{char} c1
	 * @param{char} c2
	 * @return{boolean}
	 **/
	
	private boolean checkPrecedence(char c1, char c2)
	{
		if ((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
		{
			return true;
		}
		else if ((c2 == '*' || c2 == '/')&& (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
		{
			return true;
		}
		else if ((c2 == '^')&& (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Converts infix expression to post fix
	 * @param{String} infix
	 * @return{String}
	 **/
	
	public String convert(String infix)
	{
		String postfix = "";
		Stack<Character> stackObj = new Stack<>(); 
		stackObj.push('#'); 
		for (int i = 0; i < infix.length(); i++)
		{
			char inputSymbol = infix.charAt(i); 
			if (isOperator(inputSymbol))
			{ 
				while (checkPrecedence(inputSymbol, stackObj.top.getValue())) {
					postfix += stackObj.pop();
				}
				stackObj.push(inputSymbol);
			} 
			else if (inputSymbol == '(') {
				stackObj.push(inputSymbol);
			}
			else if (inputSymbol == ')')
			{
				while (stackObj.top.getValue() != '(')
				{
					postfix += stackObj.pop();
				}
				stackObj.pop();
			} 
			else
			{
				postfix += inputSymbol;
			}
		}

		
		while (stackObj.top.getValue() != '#')
		{
			postfix += stackObj.pop();
		}
		return postfix;
	}

   /**
    * @param{String[]} args
    **/
	
	public static void main(String[] args)
	{
		InfixToPostfix obj = new InfixToPostfix();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Infix : \t");
		String infix = scan.next();
		System.out.print("Postfix : \t" + obj.convert(infix));
	}
}
