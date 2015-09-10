
/**
 * @class  ConcordanceFunction
 * @author Pulkit
 * @since  1st September 15
 * This class contains the functions related to the calculating of concordance.
 */

package assignment5;

import java.util.HashMap;
import java.util.Map;


public class ConcordanceFunction {
	private Map<Character,String> concordanceMap = new HashMap<Character,String>();

	/**
	 * This function calculates the concordance of characters in the string.
	 * @param{String[]} arguments
	 */
	
	public void concordance(String[] arguments) {
		String in = "";
		String tempString = "";
		for(int count = 0; count < arguments.length; count++) {
			in = in + arguments[count].trim();
		}
		
		for(int count = 0; count < in.length(); count++) {
			if(concordanceMap.containsKey(in.charAt(count))) {
				tempString = concordanceMap.get(in.charAt(count));
				tempString = tempString + "," + count;
			}
			else {
				tempString = tempString + count;
			}
			concordanceMap.put(in.charAt(count), tempString);
			tempString = "";
		}
		
		for(Map.Entry<Character, String> map: concordanceMap.entrySet()) {
			System.out.println(map.getKey() + " {" + map.getValue() + "}");
		}
	}
}
