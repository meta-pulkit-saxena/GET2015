
/**
 * @class  TrainReservationSystem
 * @author pulkit
 * @since  14th August 15
 * This class controls the whole reservation system. 
 */

package oops;
public class TrainReservationSystem {
	
	/**
	 * This function controls the flow of whole reservation system. This starts the execution of program  
	 * @param{String[]} args
	 */
	
	public static void main(String[] args) {
		
		InitializeSystem start = new InitializeSystem();
		start.initializeSystem();
	}	
}
