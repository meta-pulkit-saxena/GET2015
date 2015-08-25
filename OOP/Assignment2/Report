/**
 * @class  Report
 * @author pulkit
 * @since  14th August 15
 * This class Displays the report of percentage of each single select option selected by all users and there answers.
 */

import java.util.ArrayList;
import java.util.List;
public class Report {
	
	/**
	 * This funtion displays the report of percentage of each single  Select option selected by all users.
	 * @param{InitializeSystem] object
	 */
	
	public void printSingleSelectRatio(InitializeSystem object) {
		System.out.println("Overall Single select question report");
		for(int count = 1; count < 7; count++) {
			System.out.println(count + "." + (((float)object.status[count]/object.participants.size()))*100 + "%");	 			// Prints the percentage of each option entered.
		}	
	}
	
	/**
	 * This function displays the answers of user corresponding to the question.
	 * @param{InitializeSystem} object
	 */
	
	public void displayAnswers(InitializeSystem object) {
		
		List<String> answerOfUser;
		for(Participant m: object.participants) {
			System.out.println("\nInput of Participant:" + (object.participants.indexOf(m)+1));
			answerOfUser = new ArrayList<String>();
			answerOfUser = m.getAnswers();
			for(int count = 0; count < object.questions.size(); count++) {
				System.out.println("\n" + object.questions.get(count).getType() + "\n" + object.questions.get(count).getQuestion() + object.questions.get(count).getOptions());
				//Prints the question.
				System.out.println(answerOfUser.get(count));
			}
		}		
	}

}
