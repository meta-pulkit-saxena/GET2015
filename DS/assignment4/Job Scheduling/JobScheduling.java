
/**
 * @class  JobScheduling
 * @author Pulkit
 * @since  30th August 15
 * This class performs the job scheduling
 */

package assignment4;

import java.util.Scanner;

public class JobScheduling {

	/**
	 * This is the main function.
	 * @param{String} args
	 */
	
	public static void main(String[] args) {
		JobScheduling scheduling = new JobScheduling();
		scheduling.takeInput();

	}

	/**
	 * This function will take input and call the max heap functions.
	 */
	
	public void takeInput() {
		int priority;
		String choice;
		Job job = null;
		BinaryHeap maxHeap  = new BinaryHeap();
		Scanner scan = new Scanner(System.in);
		System.out.println("4 for Cahirperson, 3 for Professors, 2 for graduates, 1 for underGraduates.\n");
		do {
			System.out.println("Enter the priority of job");
			priority = scan.nextInt();
			job = new Job(priority);
			maxHeap.setJobObj(job);
			maxHeap.add();
			System.out.println("Do you want to enter more jobs(y/n)");
			choice = scan.next();
		}while(choice.equalsIgnoreCase("y") );

	System.out.println("The order of jobs are: ");
	while(!maxHeap.isEmpty()){
        System.out.println(maxHeap.remove());
    }
	}
}
