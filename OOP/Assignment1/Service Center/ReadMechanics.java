package Assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ReadMechanics
 * @author Pulkit
 * @since  13th August 15
 * Reads the mechanics details from file
 */

public class ReadMechanics {
	
	private String address = "D:/Mechanic.csv";													// Address of file
	private List<String> mechanic = new ArrayList();
		
	/**
	 * readCsvFile
	 * @return{List<String> list of string
	 * @throws IOException
	 * This method returns the name of person who is mechanic and his details
	 **/
	
	public List<String> readCsvFile() {
		ReadMechanics obj = new ReadMechanics();
		BufferedReader fileReader = null;
		try {
			String line = "";
			fileReader = new BufferedReader(new FileReader(obj.address));						//read from file;
			fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {									
					obj.mechanic.add(line);														// add it to file
			}
			fileReader.close();																	// close the File
		} 
		catch (Exception e){
				e.printStackTrace();
		}
		return obj.mechanic;
	}
}

