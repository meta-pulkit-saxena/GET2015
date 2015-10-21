
/**
 * @class  Runner
 * @author Pulkit
 * @since  21 october 15
 * This class uses the logger facility of the  Logger api (singleton class).
 */

package com.logging.logger;

public class Runner {
	
	/**
	 * This is the main function.
	 * @param{Strings[]} args
	 */
	
	public static void main(String[] args) {
		LoggerApi LoggerObject  = LoggerApi.getLoggerApiInstance();
		int array[]  = {1,2,3,4};
		try {
			System.out.println(array[4]);
		}
		catch(ArrayIndexOutOfBoundsException n) {
			LoggerObject.logError("Array Index Out Of Bounds Exception caught");
		}
	}

}
