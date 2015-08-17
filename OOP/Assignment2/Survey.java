package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Survey
 * @author Pulkit
 * @since  15 August 15
 * Takes input from participant and presents result.
 */

public class Survey {
	
	private List<String> question = new ArrayList();													// Contains questions
	private String continueVal = "Y";
	private List<String> input = new ArrayList();														// Stores input of users
	private Scanner scan = new Scanner(System.in);
	private int noOfPart;																				// Contains number of users
	private int[] status = new int[6];																	// Contains the total input for Q. 1
	
	/**
	 * takeInput
	 * @param{int} index
	 * It takes input from the user. 
	 */
	
	public void takeInput(int in) {
		 
		String str = scan.next();
		input.add(str);	
		if(in == 0) {
			status[(Integer.parseInt(str))] = status[(Integer.parseInt(str))] + 1;						// Increases th value in status array. 
		}		
	}
	
	/**
	 * displyQuestions
	 * It displays question for the user.
	 */
	
	public void displayQuestions() {
		for(int index = 0; index < 3; index++) {
			System.out.println(question.get(index));													// Prints the questions
			takeInput(index);
		}
	}
	
	
	/**
	 * printReport
	 * Prints the final report.
	 */
	
	public void printReport() {
		
		System.out.println("Over all Report");
		for(int count = 1; count < 6; count++) {
			System.out.println(count + "." + (((float)status[count]/noOfPart))*100 + "%");				// Prints the percentage
		}
	}
	
	/**
	 * printInput
	 * Prints the input per participants
	 */
	
	public void printInput() {
		System.out.println("\nParticipant Input Record\n");
		for(int count = 0; count < noOfPart; count++ ) {
			System.out.println("\nParticipant " + (count+1));
			int index = 0;
			for(int loop = count; loop < (count + 3); loop++ ) {
				System.out.println(question.get(index)); 
				System.out.println(input.get(loop));													// Prints the input per user 
				index++;
			}
		}
	}
	
	/**
	 * main
	 * @param{String[]} args
	 * Controls the program.
	 */
	
	public static void main(String[] args) {
		
		Survey obj = new Survey();
		obj.question = new ReadQuestions().readCsvFile();
		while(obj.continueVal.equalsIgnoreCase("Y")) {													// Repeats the whole process until user ends it
			obj.displayQuestions();
			System.out.println("Want to give another response press Y else press any");
			obj.continueVal = obj.scan.next();
			obj.noOfPart++;
		}
		obj.printReport();																				// Call to report printing
		obj.printInput();																				// Call to input printing
	}
}
