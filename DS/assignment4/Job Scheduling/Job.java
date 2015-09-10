
/**
 * @class  Job
 * @author Pulkit
 * @since  30th August 15
 * This class is a model class for job.
 */

package assignment4;

public class Job {
	private int priority;
	private String document;
	
	/**
	 * This is a default constructor of job.
	 */
	
	public Job() {
	}
	
	/**
	 * This is a parameterized constructor of job. 
	 * @param{int} priority
	 */
	
	public Job(int priority) {
		this.priority = priority;
	}
	
	/**
	 * This function returns the priority of the job.
	 * @return{int} priority
	 */
	
	public int getPriority() {
		return priority;
	}
	
	/**
	 * This function sets the priority of the job.
	 * @param{int} priority
	 */
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
}
