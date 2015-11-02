
/**
 * @class  EmployeeFacade
 * @author Pulkit
 * @since  2nd November 15
 * This class defines the facade for the employee system.
 */

package com.metaemployee.facade;

import java.sql.Connection;
import java.util.List;
import com.metaemployee.db.dao.EmployeeDao;
import com.metaemployee.model.Employee;

public class EmployeeFacade {
	
	/**
	 * This function creates a new employee.
	 * @param{Connection} connectionObject
	 * @param{Employee} employee
	 */
	
	public void createEmployee(Connection connectionObject, Employee employee) {
		EmployeeDao employeeDao = new EmployeeDao();
		try {
			employeeDao.createEmployee(connectionObject, employee);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This function returns a employee by id.
	 * @param{Connection} connectionObject
	 * @param{Employee} employee
	 * @return{Employee}
	 */
	
	public Employee getEmployeeById(Connection connectionObject, Employee employee) {
		Employee resultEmployee = null;
		EmployeeDao employeeDao = new EmployeeDao();
		try {
			resultEmployee = employeeDao.getEmployeeById(connectionObject, employee);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return resultEmployee;
	}
	
	/**
	 * This function returns all the employees with a given name.
 	 * @param{Connection} connectionObject
	 * @param{Employee} employee
	 * @return{List<Employee>}
	 */
	
	public List<Employee> getEmployeesByName(Connection connectionObject, Employee employee) {
		List<Employee> employeeList = null;
		EmployeeDao employeeDao = new EmployeeDao();
		try {
			employeeList = employeeDao.getEmployeesByName(connectionObject, employee);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employeeList;
	}
	
	/**
	 * This function returns all the employees.
	 * @param{Connection} connectionObject
	 * @return{List<Employee>}
	 */
	
	public List<Employee> getAllEmployees(Connection connectionObject) {
		List<Employee> employeeList = null;
		EmployeeDao employeeDao = new EmployeeDao();
		try {
			employeeList = employeeDao.getAllEmployees(connectionObject);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employeeList;
	}
	
	/**
	 * This function deletes all th employees with a given id.
	 * @param{Connection} connectionObject
	 * @param{Employee} employee
	 */
	
	public void deleteEmployeeById(Connection connectionObject, Employee employee) {
		EmployeeDao employeeDao = new EmployeeDao();
		try {
			employeeDao.deleteEmployeeById(connectionObject, employee);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
