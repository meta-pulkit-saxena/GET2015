
/**
 * @class  Employee
 * @author Pulkit
 * @since  14th October 15
 * This class defines the basic structure of employee.
 */

package model;

import java.util.Date;
import lombok.Data;

// Used lombok api for automatically creating setters and getters, toString, equals, hashCode functions.(by @Data annotation).
@Data
public class Employee {
	private String name;
	private String email;
	private int age;
	private int employeeId;
	private String dateOfRegistration;
	
	/**
	 * This is a default constructor.
	 */
	
	public Employee() {
		
	}
	
	/**
	 * This is a parameterized constructor.
	 * @param{String} name
	 * @param{String} email
	 * @param{int} age
	 * @param{int} employeeId
	 * @param{String} date
	 */
	
	public Employee(String name, String email, int age, int employeeId, String date) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.employeeId = employeeId;
		this.dateOfRegistration = date;
	}
}
