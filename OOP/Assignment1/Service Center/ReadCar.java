/**
 * @class ReadCarFile
 * @author Pulkit
 * @since  13th August 15
 * This class reads the car csv file and returns list of car type.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCarFile {
	private List<Car> carList = new ArrayList<Car>();
	private String address = "D:/Car.csv";
	private String breakPoint = ",";
	
	/**
	 * This method is called when we need to read car details from csv file and store them in car type object.
	 * @return{List<Car>}
	 */
	
	public List<Car> readCarFile() {
		
		BufferedReader fileReader = null;
		Car tempObj = null;
		try {
			String line = "";
			fileReader  = new BufferedReader(new FileReader(this.address));                           	// file reading
			fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {
				

				String[] tokens = line.split(breakPoint);												// Separator
				if (tokens.length > 0) {
						tempObj = new Car(2,"se");
						tempObj.setCarNum(Integer.parseInt(tokens[0]));
						tempObj.setCarType(tokens[1]);  												// Adding to the object
																							
				}
				this.carList.add(tempObj);																// Adding the object to the list.
				                                             
			}
			
			fileReader.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print(" q" + carList.size() + " q");
		return carList;
	}

}
