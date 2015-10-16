
/**
 * @class  EmployeeCache
 * @author Pulkit
 * @since  14th October 15
 * This class defines cache for employee and function related to it.
 */

package helper;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import model.Employee;

public class EmployeeCache {
	//Cache for employee
	private static Map<Integer,Employee> employeeCache = new ConcurrentHashMap<Integer, Employee>();
	// Private object of the class
	private static EmployeeCache employeeCacheObject = new EmployeeCache();
	
	/**
	 * This is a default constructor.
	 */
	
	private EmployeeCache() {
		employeeCache.put(1,  new Employee("Piyush", "piyush@sdf.com", 22, 1, "2015/10/14"));
		employeeCache.put(2,  new Employee("Himanshu", "himanshu@sdf.com", 21, 2, "2015/10/12"));
		employeeCache.put(3,  new Employee("Nishant", "nishant@sdf.com", 20, 3, "2015/10/12"));
		employeeCache.put(4,  new Employee("Ishpreet", "bugga@sdf.com", 22, 4, "2015/10/11"));
		employeeCache.put(5,  new Employee("Udit", "udit@sdf.com", 21, 5, "2015/10/11"));
	}
	
	/**
	 * This function returns the EmployeeCache object.
	 * @return{EmployeeCache}
	 */
	
	public static EmployeeCache getEmployeeCacheObject() {
		return employeeCacheObject;
	}
	
	/**
	 * This function returns the all employee in the form of a list.
	 * @return{List<Employee>}
	 */
	
	public Collection<Employee> getAllEmployee() {
		return employeeCache.values();
	}
	
	/**
	 * This function returns the employee object for the given employee id.
	 * @param{int} id
	 * @return{Employee}
	 */
	
	public Employee getEmployeeForId(int id) {
		return employeeCache.get(id);
	}
	
	/**
	 * This function adds a new employee in the cache.
	 * @param{Employee} employee
	 */
	
	public void addEmployee(Employee employee) {
		employeeCache.put(employee.getEmployeeId(), employee);
	}
}
