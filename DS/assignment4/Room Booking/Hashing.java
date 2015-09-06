
/**
 * @class  Hashing
 * @author Pulkit
 * @since  30th August 15
 * This class contains all the functions related to hashing.
 */

package assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashing {
	private Map<Integer,String> bookingStatus;
	private int numberOfRooms;
	private Guest guest;
	
	/**
	 * This function sets the guest.
	 * @param{Guest} guest
	 */
	
	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	/**
	 * This is a default constructor..
	 */
	
	public Hashing() {
	}

	/**
	 * This is a constructor which sets the total number of rooms in the hotel.
	 * @param{int} totalRooms
	 */
	
	public Hashing(int totalRooms) {
		this.numberOfRooms = totalRooms;
		bookingStatus = new HashMap<Integer, String>();
	}
	
	/**
	 * This function calculates the hash value for each user on the basis of age.
	 * if room corresponding to that hash value is available it is alloted.
	 * @param{age} age
	 * @return{int} 
	 */
	
	public int hashValue(int age) {
		int hashValue = age % this.numberOfRooms;
		return hashValue;
	}
	
	/**
	 * This function allots the room to the guest.
	 * @param{int} hashValue
	 */
	
	public void allotRoom() {
		int hashValue = hashValue(this.guest.getAge());
		if(!bookingStatus.containsKey(hashValue)) {
			bookingStatus.put(hashValue, this.guest.getName());
		}
		else {
			avoidCollison(hashValue);
		}
	}
	
	
	/**
	 * This function in the situation of collision tries to find another room.
	 * @param{int} hashValue
	 */
	
	public void avoidCollison(int hashValue) {
		int flag = 0;
		for(int count = hashValue + 1;count <= numberOfRooms; count += 2) {
			if(!bookingStatus.containsKey(count)) {
				bookingStatus.put(count,this.guest.getName());
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			for(int count = 1;count <= numberOfRooms; count++) {
				if(!bookingStatus.containsKey(count)) {
					bookingStatus.put(count,this.guest.getName());
				}
			}
		}
	}
	
	/**
	 * This function displays the booking status. Room number and corresponding guest's name. 
	 */
	
	public void displayBookingStatus() {
		for(Map.Entry<Integer, String> entry : bookingStatus.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
