
/**
 * @class Student
 * @author Pulkit
 * @since: 26 August,2015
 * Creates the student details
 **/

class Student
{
	
	private String name;
	private int rank;
	
	/**
	 * This is a constructor of student .
	 * @param{String} name
	 * @param{int} rank
	 */
	
	public Student(String name, int rank) 
	{
		this.name = name;
		this.rank = rank;
	}
	
	/**
	 * This function return the name of the student
	 * @return{String}
	 */
	
	public String getName()
	{
		return name;
	}

	/**
	 * This function will set the name of the student
	 * @param{string} name
	 */
	
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * This function will return rank of the student.
	 * @return{int}
	 */
	
	public int getRank()
	{
		return rank;
	}

	/**
	 * This function will set the rank of the student.
	 * @param{int} rank
	 */
	
	public void setRank(int rank)
	{
		this.rank = rank;
	}
}