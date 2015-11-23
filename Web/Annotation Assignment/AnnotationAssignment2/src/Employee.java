
/**
 * @class Employee
 * @author Pulkit
 * @since: 16 October,2015 
 * This class defines members of the employee.
 **/

import lombok.Data;

// Used lambok api for defining setters and getters.

@Data
public class Employee {
	
	String employeeName;
	int employee_id;
	String email_id;
	String date_Of_Birth;
	String date_Of_Joining;
	int ctcPerAnnum;

	/**
	 * Default constructor.
	 */

	public Employee() {
		this.ctcPerAnnum = 18000;
		this.date_Of_Birth = "";
		this.date_Of_Joining = "";
	}

	/**
	 * This is a parameterized constructor.
	 * 
	 * @param{String employeeName
	 * @param{int employee_id
	 * @param{String email_id
	 * @param{String date_Of_Joining
	 */
	
	public Employee(String employeeName, int employee_id, String email_id, String date_Of_Joining) {
		super();
		this.employeeName = employeeName;
		this.employee_id = employee_id;
		this.email_id = email_id;
		this.date_Of_Joining = date_Of_Joining;

	}
}
