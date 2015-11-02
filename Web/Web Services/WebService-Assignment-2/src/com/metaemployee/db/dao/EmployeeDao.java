
/**
 * @class  EmployeeDao
 * @author Pulkit
 * @since  2nd November 15
 * This class defines all the database access functions.
 */

package com.metaemployee.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.metaemployee.model.Employee;

public class EmployeeDao {
	
	/**
	 * This function creates a employee in the database.
	 * @param{Connection} connectionObject
	 * @param{Employee} employee
	 */
	
	public void createEmployee(Connection connectionObject, Employee employee) {
		PreparedStatement statement = null;
		String query = "INSERT INTO employee(name,department,salary) VALUES(?,?,?)";
		try {
			statement = connectionObject.prepareStatement(query);
			statement.setString(1,employee.getName());
			statement.setString(2, employee.getDepartment());
			statement.setFloat(3, employee.getSalary());
			System.out.println(statement);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
			
	
	/**
	 * This function returns the employee with the particular id. from the database.
	 * @param{Connection} connectionObject
	 * @param{Employee} employee
	 * @return{Employee}
	 */
	
	public Employee getEmployeeById(Connection connectionObject, Employee employee) {
		ResultSet result = null;
		Employee resultEmployee = null;
		PreparedStatement statement = null;
		String query = "SELECT * FROM employee WHERE employee_id = ? ";
		try {
			statement = connectionObject.prepareStatement(query);
			statement.setInt(1, employee.getEmployeeId());
			result = statement.executeQuery();
			result.next();
			resultEmployee = new Employee();
			int id = Integer.parseInt(result.getString("employee_id"));
			float salary  = Float.parseFloat(result.getString("salary"));
			resultEmployee.setEmployeeId(id);
			resultEmployee.setName(result.getString("name"));
			resultEmployee.setDepartment(result.getString("department"));
			resultEmployee.setSalary(salary);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return resultEmployee;
	}
	
	/**
	 * This function returns all the employees from the database with the given
	 * particular name.
	 * @param{Connection} connectionObject
	 * @param{Employee} employee
	 * @return{List<Employee>}
	 */
	
	public List<Employee> getEmployeesByName(Connection connectionObject, Employee employee) {
		ResultSet result = null;
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee resultEmployee = null;
		PreparedStatement statement = null;
		String query = "SELECT * FROM employee WHERE name = ? ";
		try {
			statement = connectionObject.prepareStatement(query);
			statement.setString(1, employee.getName());
			result = statement.executeQuery();
			while(result.next()) {
				resultEmployee = new Employee();
				int id = Integer.parseInt(result.getString("employee_id"));
				float salary  = Float.parseFloat(result.getString("salary"));
				resultEmployee.setEmployeeId(id);
				resultEmployee.setName(result.getString("name"));
				resultEmployee.setDepartment(result.getString("department"));
				resultEmployee.setSalary(salary);
				employeeList.add(resultEmployee);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return employeeList;
	}
	
	/**
	 * This function returns all the employee details.
	 * @param{Connection} connectionObject
	 * @return{List<Employee>}
	 */
	
	public List<Employee> getAllEmployees(Connection connectionObject) {
		ResultSet result = null;
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee resultEmployee = null;
		PreparedStatement statement = null;
		String query = "SELECT * FROM employee";
		try {
			statement = connectionObject.prepareStatement(query);
			result = statement.executeQuery();
			while(result.next()) {
				resultEmployee = new Employee();
				int id = Integer.parseInt(result.getString("employee_id"));
				float salary  = Float.parseFloat(result.getString("salary"));
				resultEmployee.setEmployeeId(id);
				resultEmployee.setName(result.getString("name"));
				resultEmployee.setDepartment(result.getString("department"));
				resultEmployee.setSalary(salary);
				employeeList.add(resultEmployee);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return employeeList;
	}
	
	/**
	 * This function deletes the employee with the given id.
	 * @param{Connection} connectionObject
	 * @param{Employee} employee
	 */
	
	public void deleteEmployeeById(Connection connectionObject, Employee employee) {
		String query = "DELETE FROM employee WHERE employee_id = ? ";
		PreparedStatement statement = null;
		try {
			statement = connectionObject.prepareStatement(query);
			statement.setInt(1, employee.getEmployeeId());
			statement.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
