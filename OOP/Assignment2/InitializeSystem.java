/**
 * @class InitializeSyatem
 * @author Pulkit
 * @since  14th August 15 
 * This class initializes the system with questions and makes it display questions.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitializeSystem {
	
	public List<Question> questions = new ArrayList<Question>();
	public List<Participant> participants = new ArrayList<Participant>();
	private String continueVal;	
	public int []status = new int[7];

	/**
	 * This function displays the questions one by one and saves the answers in participant obj.
	 * @param{Participant} tempObj
	 */
	
	public void displayQuestSaveAnswer(Participant tempObj) {
		questions = new ReadQuestion().readCsvQuestion();
		List<String> ans= new ArrayList<String>();
		
		for(int index = 0; index < questions.size(); index++) {
			Scanner scanObj = new Scanner(System.in);
			System.out.println(questions.get(index).getQuestion());											// Prints the questions one by one from list.
			String str = scanObj.next();							
			if(index == 0 ) {
				status[Integer.parseInt(str)] = status[Integer.parseInt(str)] + 1;							// Increases the value in status array.
			}
			 ans.add(str);
		}
		tempObj.setAnswers(ans);
	}
	
	/**
	 * This function takes input from user and stores in its object until new participants take survey.
	 */
	
	public void takeInput() {
		Participant obj = null;
		Scanner scan = new Scanner(System.in);
		try {
			do {
				obj = new Participant();
				System.out.println("Enter your name: ");
				obj.setName(scan.next());
				displayQuestSaveAnswer(obj);
				System.out.println("Enter Y if want to enter another response else enter any key: ");
				participants.add(obj);																			// Participant added 
				continueVal = scan.next();																		
			}while(continueVal.equalsIgnoreCase("y"));															// Checks if the user wants to continue.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		scan.close();
	}
}
