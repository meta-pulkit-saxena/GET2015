/**
 * @class SurveySystem
 * @author pulkit
 * @since  14th August 15
 * This class is the main class of survey system, it controls the flow of system.
 */
public class SurveySystem {

	/**
	 * This is class starts the execution of system and maintains the flow of system.
	 * @param{String[]} args
	 */
	
	public static void main(String[] args) {
		
		InitializeSystem Initiate = new InitializeSystem();					
		Initiate.takeInput();						// displaying Question and taking input
		Report reportObj = new Report();
		reportObj.printSingleSelectRatio(Initiate);
		reportObj.displayAnswers(Initiate);				// report created and displayed.
	}

}
