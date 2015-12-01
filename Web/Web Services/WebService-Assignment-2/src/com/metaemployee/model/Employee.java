
/**
 * @class  Employee
 * @author Pulkit
 * @since  2 Novenber 15
 * This is a model class for employee.
 */

package com.metaemployee.model;

import lombok.Data;

@Data
public class Employee {
	private int employeeId;
	private String name;
	private String department;
	private float salary;
}
