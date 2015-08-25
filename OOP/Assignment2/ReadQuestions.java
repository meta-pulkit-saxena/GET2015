/**
 * @class ReadQuestion
 * @author Pulkit
 * @since 14th August 15
 * This class reads the questions from the csv file and returns back a list of question object. 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadQuestion {
		
	private List<Question> question = new ArrayList<Question>();
	private String address = "D:/question.csv";												// Address
	private String breakPoint = ",";
	
	/**
	 * This function reads the csv type file of questions and stores it in a list of question type objects.
	 * @return{List<Question>}
	 */
	
	public List<Question> readCsvQuestion() {
		Question tempObj = null;
		BufferedReader file ;
		try {
			String line = "";
			file = new BufferedReader(new FileReader(address));
			while ((line = file.readLine()) != null) {									
				String[] tokens = line.split(breakPoint);									// Separator
				if (tokens.length > 0) {													// add it to file
					tempObj = new Question();
					tempObj.setQuestion(tokens[0].trim());
					tempObj.setType(tokens[1].trim());
					tempObj.setOptions(tokens[2].trim());
				}
				this.question.add(tempObj);
		}
		file.close();																	   // close the File
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return question;
	}
	
}
