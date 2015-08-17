
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Name:Permutation
 * @author: Pulkit
 * Since: 12th August 15
 * To print all the combinations of string
 **/

public class Permutation {
	
    public List<String> permutationPattern = new ArrayList<String>();											// Stores the permutation patterns

    /**
     * callGeneratePermutations
     * @param{String} String given as input
     * @return{List<String>}
     */
    
    public List<String> callGeneratePermutations(String endingString) {
    	return generatePermutations("",endingString);															// calling the generatePermutations()
    }
    
    
   /**
   * generatePermutations
   * @param{String} beginningString: Starting string
   * @param{String} endingString :inputed string
   * @return{string}
   **/

	public List<String> generatePermutations(String beginningString,String endingString) {
		if (endingString.length() <= 1) {
			permutationPattern.add(beginningString + endingString);
		}
		else {
			for (int i = 0; i < endingString.length(); i++) {
				try {
					String newString = endingString.substring(0, i) + endingString.substring(i + 1);	        //extracting substring
					generatePermutations(beginningString + endingString.charAt(i),newString);					//appending the substring
				}
				catch (StringIndexOutOfBoundsException exception) {
					exception.printStackTrace();
				}
			}
		}
		return permutationPattern;
	}

	
	/**
	 * main
	 * @param{String} args
	 * starts the execution
	 */ 
	
	public static void main(String args[]) {
		
		List<String> output = new ArrayList<String>();
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		try {
			String input=scan.next();														                   // to take input
			scan.close();																					   // Releasing resources
			Permutation obj = new Permutation();
			output = obj.callGeneratePermutations(input);
			for (int index = 0; index < output.size(); index++) {								               // to print the output
				System.out.println(output.get(index));
			}
		}
		catch(Exception e) {
			e.printStackTrace();																				// Printing Exceptions
		}
	}
}

