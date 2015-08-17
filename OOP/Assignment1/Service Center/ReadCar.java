package Assignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReadCar
 * @author Pulkit
 * @since  13th August 15
 * Reads car details from csv file
 */

public class ReadCar {

	private List<String> cars = new ArrayList<String>();
	private String address = "D:/Car.csv";
	private String breakPoint = ",";
	
	/**
	 * readFile
	 * @return{List<String}
	 * Reads the data
	 */
	
	public List<String> readFile() { 
		ReadCar obj = new ReadCar();
		BufferedReader fileReader = null;
		try {
			String line = "";
			fileReader  = new BufferedReader(new FileReader(obj.address));                           				// file reading
			fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {
				String[] tokens = line.split(obj.breakPoint);														// Separator
				if (tokens.length > 0) {
					obj.cars.add(tokens[0] + tokens[1]);															// Adding to the list
				}
			}
			fileReader.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return obj.cars;
	}
}
