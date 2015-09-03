
/**
 * @class  CounselingSystem
 * @author Pulkit
 * @since  25th august 15
 * This class contains all the functions necessary to perform the counseling for college.
 */

package RevisedAssignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CounselingSystem {
	public List<College> collegeList = new ArrayList<College>();
	public List<Student> finalallotment = new ArrayList<Student>();
	private Queue studentQueue;
	private Scanner scan = new Scanner(System.in);

	/**
	 * This function will initialize the whole system.
	 */
	
	public void initializeSystem() {
		System.out.println("Enter the no Of students (greater than 8)");
		int num = scan.nextInt();
		enqueueStudents(num);
		int collegeRank[] = {2,1,1,2,2};
		String str = "";
		for(int count = 1; count <= 5; count++ ) {
			str = "College" + count;
			collegeList.add(new College(str,collegeRank[count] ,count ,(int) (Math.random()*100)));
			str  = "";
		}
	}

	/**
	 * This function will add students in the queue.
	 **/
	
	protected void enqueueStudents(int noOfStudents) {
		studentQueue = new Queue(noOfStudents);
		for (int count = 1; count <= noOfStudents; count++) {
			System.out.println("Enter the name of " + count + " student");
			String name = scan.next();
			studentQueue.enqueue(new Student(name, count));
		}
	}

	/**
	 * This function displays the list of all the colleges in the system.
	 */

	public void printCollegeList() {
		int i = 1;
		System.out.println("COLLEGE NAME" + "  " + "Avaliablity");
		for (College college : this.collegeList) {
			System.out.println(i + "   " + college.getName() + " " + college.getSeatsAvailable());
			i++;
		}
	}

	/**
	 * This function performs the counseling process and allot colleges to students.
	 */
	
	public void councelingProcess() {
		while (true) {
			Student student = (Student) studentQueue.dequeue();
			if (student != null) {
				System.out.println("Welcome " + student.getName() + " with your rank " + student.getRank());
				printCollegeList();
				takeChoices(student);
			}
			else 
			{
				break;
			}
		}
	}
	

	/**
	 * This function allots the college out of available three choices.
	 * @param{Student} student
	 */
	
	public void allotCollege(Student student) {
		int flag = 0;
		int choices[] = student.getChoices();
		for(int count = 0; count < 3;count++) {
			College college = collegeList.get(choices[count] - 1);
			if (college.getSeatsAvailable() > 0) {
				college.setSeatsAvailable(college.getSeatsAvailable() - 1);
				student.setAssignedCollegeId(college.getCollegeId());
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			student.setAssignedCollegeId(-1);
		}
		finalallotment.add(student);
	}

	/**
	 * This function takes three choices as input.
	 * @param{Student} student
	 */
	
	public void takeChoices(Student student) {
		int []choices = new int[3];
		System.out.println("Enter your 3 choices for college (1,2,3,4,5) ");
		for(int count = 0; count < 3; count++ ) { 
			choices[count] = scan.nextInt();
		}
		student.setChoices(choices);
		allotCollege(student);
	}
	
	/**
	 * This function displays the list of alloted candidates
	 */

	public void displayList() {
		if (this.finalallotment.size() != 0) {
			System.out.println("Name Of Candidate" + "\t" + "College Id.");
			for (Student m : this.finalallotment) {
				System.out.format("%15s%16s\n", m.getName(),m.getAssignedCollegeId());
			}
		}
		else {
			System.out.println(" No Allotments..");
		}
	}
}

