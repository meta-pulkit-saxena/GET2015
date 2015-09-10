

/**
 * @class  ByNameSorting
 * @author Pulkit
 * @since  02nd September 15
 * This class sorts the list of employees by name using override toCompare function.
 */

package assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import assignment6.Employee.NameComparator;

public class ByNameSorting {

	/**
	 * This is main function.
	 * @param{String} args
	 */
	
	public static void main(String[] args) {
	
				List<Employee> list = new ArrayList<Employee>();
				String choice = "";
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the records ");
				try {
					do {
						System.out.println("Enter the EmployeeID");
						int employeeId = scan.nextInt();
						System.out.println("Enter the name");
						String employeeName = scan.next();
						System.out.println("Enter the address");
						String employeeAddress = scan.next();
						list.add(new Employee(employeeId, employeeName, employeeAddress));
						
						System.out.println("Enter y to add more records and press other key to exit");
						choice = scan.next();
					} while (choice.equalsIgnoreCase("y"));
					NameComparator nm = new NameComparator();
					Collections.sort(list,nm );
					System.out.print("Sorted List: ");
					System.out.println(list);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
	}

}
