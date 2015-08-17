package problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ReadQuestions
 * @author Pulkit
 * @since  13th August 15
 * Reads questions from file
 */

public class ReadQuestions {
	
	private String address = "D:/Questions.csv";													// Address of file
	private List<String> questions = new ArrayList();
		
	/**
	 * readCsvFile
	 * @return{List<String> list of string
	 * @throws IOException
	 * This method returns the questions for survey
	 **/
	
	public List<String> readCsvFile() {
		ReadQuestions obj = new ReadQuestions();
		BufferedReader fileReader = null;
		try {
			String line = "";
			fileReader = new BufferedReader(new FileReader(obj.address));						   //read from file;
			fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {									
					obj.questions.add(line);													   // add it to file
			}
			fileReader.close();																	   // close the File
		} 
		catch (Exception e){
				e.printStackTrace();
		}
		return obj.questions;	
	}
}


