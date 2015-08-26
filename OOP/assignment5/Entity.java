
/**
 * @class Entity
 * @author Pulkit
 * @since  20th August 15
 * This class will declare the entity properties.
 */

public class Entity {
	private String name;
	private String email;
	
	/**
	 * This function returns the name of the entity.
	 * @return{String} name
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * This function sets the name of the entity.
	 * @param{String} name 
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This function returns the email of the entity.
	 * @return{String} email
	 */
	
	public String getEmail() {
		return email;
	}

	/**
	 * This function sets the email of the entity.
	 * @param{String} email 
	 */
	
	public void setEmail(String email) {
		this.email = email;
	}
}
