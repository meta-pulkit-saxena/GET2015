
/**
 * @class Interface
 * @author Pulkit
 * @since 05 October,2015
 * Provides main control of the whole function.
**/

package com.metacampus.truthtable;
import java.util.Scanner;

public class TruthTable 
{
	/**
	 * This is the main function.
	 * @param{String[]} args
	 **/
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		// Result to store values
		int result = -1;
		GenerateTruthTable truthTableObj = null;
		System.out.println("Truth Table Generated");
		try 
		{
			// choice will hold choice of user 
			String choice;
			do 
			{
				// input will contain infix expression 
				String input = sc.next();
				// converting whole expression to lower case 
				input = input.toLowerCase();
				// Creating Object
				truthTableObj = new GenerateTruthTable();
				result = truthTableObj.truthTableGenerator(input);
				// Printing the Result
				if (result == 1)
				{
					System.out.println("Successfully created");
				}
				else if (result == 0)
				{
					System.out.println("String is empty or null");
				}
				else if (result == -1)
				{
					System.out.println("Invalid expression");
				}
				else
				{
					System.out.println("Some problem occcurred");
				}
				System.out.println("Press Y ot y to continue and any other key to exit");
				choice = sc.next();
				if (!(choice.charAt(0) == 'Y' || choice.charAt(0) == 'y')) 
				{
					System.out.println("System Exit");
					System.exit(0);
				}
			} while (true);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			sc.close();
		}
	}
}
