package com.metaemployee.webservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.metaemployee.model.Employee;
import com.metaemployee.service.EmployeeService;

@Path("/employeewebservice")
public class EmployeeWebService {

	/**
	 * This function creates a new employee.
	 * @param{String} name
	 * @param{String} department
	 * @param{float} salary
	 */
	
	@GET
	@Path("/create/{name}/{department}/{salary}")
	public void createEmployee(@PathParam("name") String name,@PathParam("department") String department, @PathParam("salary") float salary) 
	{
		Employee employee = new Employee();
		employee.setName(name);
		employee.setDepartment(department);
		employee.setSalary(salary);
		EmployeeService employeeService = new EmployeeService();
		try
		{
			employeeService.createEmployee(employee);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This function returns the employee by id.
	 * @param{int} id
	 * @return{Employee}
	 */
	
	@GET
	@Path("/id/{id}")
	@Produces("application/xml")
	public String getEmployeeById(@PathParam("id") int id) 
	{
		String result = null;
		EmployeeService employeeService = new EmployeeService();
		Employee employee = new Employee();
		employee.setEmployeeId(id);
		try
		{
			employee = employeeService.getEmployeeById(employee);
			result = "<employee-list><employee><employeeId>" + employee.getEmployeeId()
					+ "</employeeId>" + "<employeeName>" + employee.getName()
					+ "</employeeName>" + "<employeeDepartment>"
					+ employee.getDepartment() + "</employeeDepartment>" 
					+ "<employeeSalary>" + employee.getSalary() + "</employeeSalary>" + "</employee></employee-list>";
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * This function returns all employees with the given name.
	 * @param{String} name
	 * @return{List<Employee>}
	 */
	
	@GET
	@Path("/getByName/{name}")
	@Produces("application/xml")
	public String getAllEmployeesByName(@PathParam("name") String name) {
		EmployeeService employeeService = new EmployeeService();
		List<Employee> employeesList = null;
		String result = null;
		Employee employee = new Employee();
		employee.setName(name);
		try {
			employeesList = employeeService.getEmployeesByName(employee);
			result = "<employee-list>";
			for (int i = 0; i < employeesList.size(); i++) {
				Employee tempEmployee = new Employee();
				tempEmployee = employeesList.get(i);
				result = result + "<employee><employeeId>" + tempEmployee.getEmployeeId()
						+ "</employeeId>" + "<employeeName>"
						+ tempEmployee.getName() + "</employeeName>"
						+ "<employeeDepartment>" + tempEmployee.getDepartment()
						+ "</employeeDepartment>" + "<employeeSalary>" + tempEmployee.getSalary() + "</employeeSalary></employee>";
			}
			result = result + "</employee-list>";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * This function returns all the employees.
	 * @return{List<Employee>}
	 */
	
	@GET
	@Path("/getAll")
	@Produces("application/xml")
	public String getAll() {
		EmployeeService employeeService = new EmployeeService();
		List<Employee> employeesList = null;
		String result = null;
		try {
			employeesList = employeeService.getAllEmployees();
			result = "<employee-list>";
			for (int i = 0; i < employeesList.size(); i++) {
				Employee tempEmployee = new Employee();
				tempEmployee = employeesList.get(i);
				result =  result + "<employee><employeeId>" + tempEmployee.getEmployeeId()
						+ "</employeeId>" + "<employeeName>"
						+ tempEmployee.getName() + "</employeeName>"
						+ "<employeeDepartment>" + tempEmployee.getDepartment()
						+ "</employeeDepartment>" + "<employeeSalary>" + tempEmployee.getSalary() + "</employeeSalary></employee>";
		
			}
			result = result + "</employee-list>";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * This function deletes the employee by id.
	 * @param{int} id
	 */
	
	@GET
	@Path("/deleteById/{id}")
	public void deleteById(@PathParam("id") int id) {
		Employee  employee = new Employee();
		employee.setEmployeeId(id);
		EmployeeService employeeService = new EmployeeService();
		try {
			employeeService.deleteEmployeeById(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
