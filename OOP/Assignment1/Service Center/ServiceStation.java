package Assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceStation 
{  
    /**
     * main 
     * @param{String} args
     * manages the flow
     */
	
	public static void main(String args[]) {
		
		ServiceStation obj = new ServiceStation();
		int suv = 0, hatchback = 0, sedan = 0;
		HashMap<String, String> output = new HashMap<String, String>();
		output = obj.CollectData();
		for (Map.Entry<String, String> m : output.entrySet()) {
			if (m.getValue().equalsIgnoreCase("SUV")) {												// check for number of cars
				suv++;
			} 
			else if (m.getValue().equalsIgnoreCase("Sedan")) {										//check for number of sedan
				sedan++;
			} 
			else if (m.getValue().equalsIgnoreCase("hatchback")) {									//check for no of hatchback
				hatchback++;
			}
		}
		System.out.println("Total cars Serviced");									     			// printing of output
		System.out.println("SUV=" + suv);
		System.out.println("Sedan=" + sedan);
		System.out.println("Hatchback=" + hatchback);
		long totalEarning = suv * 5000 + sedan * 3000 + hatchback * 2000;
		System.out.println("Total Earning =" + totalEarning);

	}
	
	
    /**
     * CollectData
     * @return{hashmap}
     * This calls the ReadMechanics and ReadCar class and performs operation 
     */
	
	public  HashMap<String, String> CollectData()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		List<String> mechanic1 = new ArrayList();
		List<String> car1 = new ArrayList();
		String BREAK_POINT = " ";																	// Separation based on coma
		ServiceStation obj = new ServiceStation();
		ReadMechanics objMech = new ReadMechanics();
		ReadCar objCar = new ReadCar();
		try
		{
			mechanic1 = objMech.readCsvFile();
			car1 = objCar.readFile();
			String[] registrationnumber = new String[car1.size()];
			String[] cartype = new String[car1.size()];
			String[] name = new String[mechanic1.size()];
			String[] carTypeService = new String[mechanic1.size()];
			String[] rate = new String[mechanic1.size()];

			for (int i = 0; i < car1.size(); i++) {
				String[] tokens = car1.get(i).split(BREAK_POINT);									// Intializing the value to the string array
				if (tokens.length > 0) {
					registrationnumber[i] = tokens[0];
					cartype[i] = tokens[1];
				}
			}
			for (int i = 0; i < mechanic1.size(); i++) {
				String[] tokens = mechanic1.get(i).split(BREAK_POINT);								// Intializing the value to the string array
				if (tokens.length > 0) {
					name[i] = tokens[0];
					carTypeService[i] = tokens[2];
					rate[i] = tokens[3];
				}
			}

			int count = 0;
			for (int loopCount = 0; loopCount < car1.size(); loopCount++) { 						// Maping cars to the mechanic
				for (int loopmechanic = 0; loopmechanic < mechanic1.size(); loopmechanic++) {

					if (cartype[loopCount].equalsIgnoreCase(carTypeService[loopmechanic])&& (count <= car1.size())) {
						hm.put(name[loopmechanic], cartype[loopCount]);
						carTypeService[loopmechanic] = " ";
						count++;
						break;
					}
				}
			}

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return hm;
	}
}

