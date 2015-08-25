/**
 * @class  ProcessData
 * @author Pulkit
 * @since  13th August 15
 * This class contains the methods which will create a hashmap between mechanic and car data and calculate the final statistics
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessData {
	private HashMap<String, String> outputMap = new HashMap<String, String>();
	private List<Mechanic> mech = new ArrayList<Mechanic>();
	private List<Car> car = new ArrayList<Car>();
	private int []carTypeNo = new int[3];
	
	/**
	 * This maps the mechanic and car data in HashMap.
	 * @return{HashMap<String,String>}
	 */
	
	public HashMap<String,String> ProcessNow() {
	
		ReadMechanicFile object1 = new ReadMechanicFile();
		mech = object1.readMechanicFile();
		ReadCarFile object2 = new ReadCarFile();
		car = object2.readCarFile();
		for(int carCount = 0; carCount < car.size(); carCount++) {
			for(int mechCount = 0; mechCount < mech.size(); mechCount++) {
				if(car.get(carCount).getCarType().equalsIgnoreCase(mech.get(mechCount).getServiceType())) {
					
					outputMap.put(mech.get(mechCount).getName(), car.get(carCount).getCarType());	// Maping each mechanic with car									
					mech.get(mechCount).setServiceType(" ");	
					break;
				}
			}
		}
		System.out.println(outputMap.size());
		return outputMap;
		
	} 
	
	/**
	 * This function calculates the number of each type cars serviced by station.
	 * @return{int[]}
	 */
	
	public int[] calculateCarTypes() {
		
		for(String m : outputMap.values() ) {
			System.out.print("in" + m);
			if(m.equalsIgnoreCase(" Suv")) {
				System.out.print("in");
				carTypeNo[0] = carTypeNo[0] +1;
			}
			else if(m.equalsIgnoreCase(" Sedan")) {
				System.out.print("in");																// Checking each type car served.
				carTypeNo[1] = carTypeNo[1] +1;
			}
			else if(m.equalsIgnoreCase(" Hatchback")) {
				System.out.print("in");
				carTypeNo[2] = carTypeNo[2] +1;
			}
		}
		return carTypeNo;	
	}
	
	/**
	 * This function displays the final report of the car service station. Like total cars served of each type and total earnings. 
	 */
	
	public void displayReport() {
		
		int [] temp = new int[3];
		temp = calculateCarTypes();
		System.out.println("Total cars served:\n");
		System.out.println("SUV=" + temp[0]);
		System.out.println("Sedan=" + temp[1]);
		System.out.println("Hatchback=" + temp[2]);
		long totalEarning = temp[0] * 5000 + temp[1] * 3000 + temp[2] * 2000;						// Calculating the money earned.
		System.out.println("Total Earning =" + totalEarning);
	}
}
