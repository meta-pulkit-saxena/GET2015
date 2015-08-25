/**
 * @class ServiceStation
 * @author Pulkit
 * @since  14th August 15
 * This class controls the whole functioning of service station. 
 */

public class ServiceStation {

	/**
	 * This main method starts the execution and controls flow.
	 * @param{String[]} args
	 */
	public static void main(String[] args) {
		
		ProcessData process = new ProcessData();
		process.ProcessNow();
		process.displayReport();			
	}

}
