
/**
 * @class  Guest
 * @author Pulkit
 * @since  30th August 15
 * This class is a model class for guest.
 */

package assignment4;

public class Guest {
	private String name;
	private int age;
	
	/**
	 * This is a default constructor of guest.
	 */
	
	public Guest() {
	}
	
	/**
	 * This is a parameterized constructor of guest.
	 * @param{String} name 
	 * @param{int} age
	 */
	
	public Guest(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	/**
	 * This function returns the name of the guest.
	 * @return{String} the name
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * This function sets the name of the guest.
	 * @param{String} name 
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This function returns the age of the guest.
	 * @return{int} age
	 */
	
	public int getAge() {
		return age;
	}
	
	/**
	 * This function sets the age of guest.
	 * @param{int} age 
	 */
	
	public void setAge(int age) {
		this.age = age;
	}
}
