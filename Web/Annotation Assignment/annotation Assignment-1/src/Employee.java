
/**
 * @class  Employee
 * @author Pulkit
 * @since: 16 October,2015
 * This class defines  member function of the employee.
 **/

public class Employee
{
	/**
	 * This function displays the partial details of the employee
	 * @param{int} id
	 * @param{String} synopsis
	 * @param{String} engineer
	 * @param{String} date
	 */
	
	@RequestForEnhancement(id = 2, synopsis = "Pulkit")
	public static void employeeDetailPartial(int id, String synopsis, String engineer,String date)
	{
		System.out.println("Hii" +"\nid:"+ id + "\nSynopsis:" + synopsis + "\nEngineer" + engineer
				+ "\nDate" + date);
	}

	/**
	 * This function displays the full details of the employee.
	 * @param{int} id
	 * @param{String} synopsis
	 * @param{String} engineer
	 * @param{String} date
	 **/
	
	@RequestForEnhancement(id = 2, synopsis = "Pulkit", engineer = "software", date = "10/16/2015")
	public static void employeeDetailsFull(int id, String synopsis,
			String engineer, String date) {
		System.out.println("Hii" +"\nid:"+ id + "\nSynopsis:" + synopsis + "\nEngineer" + engineer
				+ "\nDate" + date);
	}

	/**
	 * This function is without annotation. 
	 */
	
	public static void employeeDetail() {
		System.out.println("Not Annotation");
	}

}
