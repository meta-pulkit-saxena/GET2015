
/**
 * @class  RemoveDuplicate
 * @author Pulkit
 * @since  02nd September 15
 * This class contains set that removes the duplicate entries on the
 */

package assignment6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

	/**
	 * This is the main function
	 * @param{String[]} args
	 */
	
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		String choice = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the records ");
			try {
				do {
					int prevSize = set.size();
					System.out.println("Enter the EmployeeID");
					int employeeId = scan.nextInt();
					System.out.println("Enter the name");
					String employeeName = scan.next();
					System.out.println("Enter the address");
					String employeeAddress = scan.next();
					set.add(new Employee(employeeId, employeeName, employeeAddress));
					if (prevSize == set.size()) {
						System.out.println("User Information already entered");
					}
					System.out.println("Enter y to add more records and press other key to exit");
					choice = scan.next();
				} while (choice.equalsIgnoreCase("y"));
				System.out.println(set);
				scan.close();
			}
			catch (Exception e) {
				System.out.println(set);
			}
	}
}
