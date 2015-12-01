
/**
 * @class  EmployeeService
 * @author Pulkit
 * @since  2nd November 15
 * This class implements the service layer functions.
 */

package com.metaemployee.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.metaemployee.db.ConnectionPool;
import com.metaemployee.facade.EmployeeFacade;
import com.metaemployee.model.Employee;

public class EmployeeService {

	/**
	 * This function calls the facade layer function for creating the employee.
	 * @param{Employee} employee
	 */
	
	public void createEmployee(Employee employee) {
		Connection connectionObject = null;
		ConnectionPool  poolObject = new ConnectionPool();
		try {
			connectionObject = poolObject.getConnectionFromPool();
			connectionObject.setAutoCommit(false);
			EmployeeFacade employeeFacade = new EmployeeFacade();
			employeeFacade.createEmployee(connectionObject, employee);
			connectionObject.commit();
		}
		catch(Exception e) {
			try {
				connectionObject.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	
	/**
	 * This function calls the facade layer function for getting the employee by id.
	 * @param{Employee} employee
	 * @return{Employee}
	 */
	
	public Employee getEmployeeById(Employee employee) {
		Employee resultEmployee = null;
		Connection connectionObject = null;
		ConnectionPool  poolObject = new ConnectionPool();
		try {
			connectionObject = poolObject.getConnectionFromPool();
			EmployeeFacade employeeFacade = new EmployeeFacade();
			resultEmployee = employeeFacade.getEmployeeById(connectionObject, employee);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return resultEmployee;
	}
	
	/**
	 * This function calls the facade layer function for getting all the employees with a 
	 * given name.
	 * @param{Employee} employee
	 * @return{Employee}
	 */
	
	public List<Employee> getEmployeesByName(Employee employee) {
		Connection connectionObject = null;
		List<Employee> employeeList  = null;
		ConnectionPool  poolObject = new ConnectionPool();
		try {
			connectionObject = poolObject.getConnectionFromPool();
			EmployeeFacade employeeFacade = new EmployeeFacade();
			employeeList = employeeFacade.getEmployeesByName(connectionObject, employee);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employeeList;
	}
	
	/**
	 * This function calls the facade layer function to return all the employees.
	 * @param{Employee} employee
	 * @return{List<Employee}
	 */
	
	public List<Employee> getAllEmployees() {
		Connection connectionObject = null;
		List<Employee> employeeList  = null;
		ConnectionPool  poolObject = new ConnectionPool();
		try {
			connectionObject = poolObject.getConnectionFromPool();
			EmployeeFacade employeeFacade = new EmployeeFacade();
			employeeList = employeeFacade.getAllEmployees(connectionObject);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employeeList;
	}
	
	public void deleteEmployeeById(Employee employee) {
		Connection connectionObject = null;
		ConnectionPool  poolObject = new ConnectionPool();
		try {
			connectionObject = poolObject.getConnectionFromPool();
			connectionObject.setAutoCommit(false);
			EmployeeFacade employeeFacade = new EmployeeFacade();
			employeeFacade.deleteEmployeeById(connectionObject, employee);
			connectionObject.commit();
		}
		catch(Exception e) {
			try {
				connectionObject.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
