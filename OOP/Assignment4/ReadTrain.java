/**
 * @class  ReadTrain
 * @author Pulkit
 * @since  15th August 15
 * This class reads train details from the csv file, creates train objects for each detail and then returns the list of train objects. 
 */

package oops;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTrain {
	private List<Train> trainList;																	// List of train objects.
	private String address = "D:/trainList.csv";													// Address of train csv file.
	private String breakPoint = ",";
	
	/**
	 * This function  loads the details of trains and adds in a list of train obj after creating train object corresponding to each train.
	 * @return{List<Train>} trainList
	 */
	
	public List<Train> readTrainFile(String type) {
		BufferedReader read;
		trainList = new  ArrayList<Train>();	
		String line = "";
		Train trainTempObj = null;
		try {
			read = new BufferedReader(new FileReader(address));
			while((line = read.readLine()) != null) {												// Reading line by line from the file 
				String[] tokens = line.split(breakPoint);											// Splitting line into properties
				if(tokens.length > 0 && tokens[2].trim().equalsIgnoreCase(type)) {
					trainTempObj = new Train();										
					trainTempObj.setTrainNumber(Integer.parseInt((tokens[0].trim())));				// Adding train number
					trainTempObj.setTrainName(tokens[1].trim());									// Adding train name
					trainTempObj.setTrainType(tokens[2].trim());									// Adding train type
					trainTempObj.setSource(tokens[3].trim());										// Adding train source station.
					trainTempObj.setDestination(tokens[4].trim());									// Adding train destination.
					trainTempObj.setDuration(Integer.parseInt(tokens[5].trim()));					// Adding duration.
					trainTempObj.setAvailableSeatOrWeight(Float.parseFloat((tokens[6].trim())));	// Adding available seats.
					trainTempObj.setCost(Float.parseFloat(tokens[7].trim()));						// Adding the cost of train.
					trainList.add(trainTempObj);
				}
				
			}
			read.close();																			// closing the scanner.
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return trainList;
	}
	
}
