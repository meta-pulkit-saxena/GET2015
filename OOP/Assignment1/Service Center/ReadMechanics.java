/**
 * @class  ReadMechanicFile
 * @author Pulkit
 * @since  13th August 15
 * This class reads the mechanics csv file and returns the list of objects of mechanic class.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadMechanicFile {
	private String address = "D:/Mechanic.csv";													// Address of file
	private String breakPoint = ",";															// separator
	private List<Mechanic> mechanicList = new ArrayList<Mechanic>();
	
	/**
	 * This reads the mechanic details from the file , stores it in list and returns
	 * @return{List<Mechanic>}
	 */
	
	public List<Mechanic> readMechanicFile() {
		ReadMechanicFile obj = new ReadMechanicFile();
		BufferedReader fileReader = null;
		Mechanic tempObj = null;
		try {
			String line = "";
			fileReader = new BufferedReader(new FileReader(obj.address));						//read from file;
			fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {	
				String[] tokens = line.split(breakPoint);	
				if(tokens.length > 2) {
					tempObj = new Mechanic("nam", "m",100);
					tempObj.setName(tokens[0]);													// Adding name to the file
					tempObj.setServiceType(tokens[1]);											//Adding service type to the file
					tempObj.setCharge(Float.parseFloat(tokens[2]));
				}
				mechanicList.add(tempObj);
			}
			fileReader.close();																	// close the File
		} 
		catch (Exception e){
				e.printStackTrace();
		}
		return mechanicList;
	}
}
