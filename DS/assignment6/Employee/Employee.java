
/**
 * @class  Employee
 * @author Pulkit
 * @since  02nd September 15
 * This class defines basis structure of Employee
 */

package assignment6;

import java.util.Comparator;

public class Employee implements Comparable {
	private Integer employeeId;
	private String name;
	private String address;
	
	/**
	 * This is a parameterized constructor.
	 * @param{Integer} empId
	 * @param name
	 * @param address
	 **/
	
	public Employee(Integer employeeId, String name, String address)
	{
		this.employeeId = employeeId;
		this.name = name;
		this.address = address;
	}
	
	/**
	 * This is a default constructor.
	 */
	
	public Employee() {
		
	}
	
	/**
	 * This function returns the employeeId
	 * @return{Integer} employeeId
	 */
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	/**
	 * This function sets the employee id.
	 * @param employeeId
	 */
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	/**
	 * This function returns the name of the employee.
	 * @return{String} name
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * This function sets the name of the employee.
	 * @param{String} employeeName
	 */
	
	public void setName(String employeeName) {
		name = employeeName;
	}
	
	/**
	 * This function returns the address of the employee.
	 * @return{String} address
	 */
	
	public String getAddress() {
		return address;
	}
	
	/**
	 * This function sets the address of the employee.
	 * @param{String} address 
	 */
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * This function overrides the toString function.
	 * @override toString
	 */
	
	@Override
	public String toString()
	{
		return "Student [empId=" + employeeId + ", name=" + name + ", address="+ address + "]";
	}

	/**
	 * This function overrides the compareTo function .
	 * @override compareTo
	 */
	
	@Override
	public int compareTo(Object employeeObj) {
		return this.getEmployeeId().compareTo(((Employee)employeeObj).getEmployeeId());
	}
	
	/**
	 * This function overrides the hashCode function.
	 * @override hashCode 
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
	}

	/**
	 * This function overrides the equals function.
	 * @override equals 
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}	
	
	
	
	/**
	 * @class  This class defines the custom compare function.
	 * @author Pulkit
	 * @since  02nd September 15
	 */
	
	static class NameComparator implements Comparator 
	{
		/**
		 * This function Overrides the compare function matches the name by compare to function.
		 * @param{Object} o1
		 * @param{Object} o2
		 * @return{int}
		 */
		
		public int compare(Object object1, Object object2)
		{
			Employee employeeFirst = (Employee) object1;
			Employee employeeSecond = (Employee) object2;
			return employeeFirst.getName().compareTo(employeeSecond.getName());
		}
	}
}
