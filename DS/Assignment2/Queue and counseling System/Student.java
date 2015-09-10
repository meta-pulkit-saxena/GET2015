
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
	private int choices[];
	private int assignedCollegeId;
	
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
	 * This is a default constructor for student.
	 */
	
	public Student() {
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
	
	/**
	 * This function returns the choices array of the student.
	 * @return{int[]} choices
	 */
	
	public int[] getChoices() {
		return choices;
	}

	/**
	 * This function sets the choices array of the student.
	 * @param{int[]} choices 
	 */
	
	public void setChoices(int[] choices) {
		this.choices = choices;
	}
	
	/**
	 * This function returns the college id of the college assigned to the student.
	 * @return{int} the assignedCollegeId
	 */
	
	public int getAssignedCollegeId() {
		return assignedCollegeId;
	}

	/**
	 * This function sets the assigned college id in the respective student.
	 * @param{int} assignedCollegeId
	 */
	
	public void setAssignedCollegeId(int assignedCollegeId) {
		this.assignedCollegeId = assignedCollegeId;
	}
