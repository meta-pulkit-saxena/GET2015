
/**
 * @class Person
 * @extends Entity
 * @author Pulkit
 * @since  20th August 15
 * This class extends the Entity class and defines properties of person
 */

public class Person extends Entity {
	private String hobby;
	private int age;
	
	/**
	 * This function returns the hobby of the person.
	 * @return{String} hobby
	 */
	
	public String getHobby() {
		return hobby;
	}
	
	/**
	 * This function sets the hobby of the person.
	 * @param{String} hobby 
	 */
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	/**
	 * This function returns the age of the person.
	 * @return{int} age
	 */
	
	public int getAge() {
		return age;
	}
	
	/**
	 * This function sets the age of the person.
	 * @param{int} age
	 */
	
	public void setAge(int age) {
		this.age = age;
	}
}
