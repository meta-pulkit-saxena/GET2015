
/**
 * @class  Organization
 * @extends Entity
 * @author Pulkit
 * @since  20th August 15
 * This class extends the entity interface and defines properties of an organization.
 */

public class Organization extends Entity {
	private int numberOfDepartments;
	private int numberOfEmployee;
	
	/**
	 * This function returns the number of departments of organization.
	 * @return{int} numberOfDepartments
	 */
	
	public int getNumberOfDepartments() {
		return numberOfDepartments;
	}
	
	/**
	 * This function sets the number of departments of organization.
	 * @param{int} numberOfDepartments 
	 */
	
	public void setNumberOfDepartments(int numberOfDepartments) {
		this.numberOfDepartments = numberOfDepartments;
	}
	
	/**
	 * This function returns the number of employee in organization.
	 * @return{int} numberOfEmployee
	 */
	
	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}
	
	/**
	 * This function sets the number of employee in organization.
	 * @param{int} numberOfEmployee 
	 */
	
	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}
	
}
