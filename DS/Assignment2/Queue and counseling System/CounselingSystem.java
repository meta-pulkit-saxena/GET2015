
/**
 * @class  CounselingSystem
 * @author Pulkit
 * @since  25th august 15
 * This class contains all the functions necessary to perform the counseling for college.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CounselingSystem {

	public List<Student> studentList = new ArrayList<Student>();
	public List<College> collegeList = new ArrayList<College>();
	public Map<String, String> finalallotment = new HashMap<String, String>();
	private Queue studentQueue;
	private Scanner scan = new Scanner(System.in);

	/**
	 * This function will initialize the whole system.
	 */
	
	public void initializeSystem() {
		System.out.println("Enter the no Of students ");
		int n = scan.nextInt();
		addStudents(n);
		collegeList.add(new College("college1", 5));
		collegeList.add(new College("college2", 5));
		collegeList.add(new College("college3", 5));
		collegeList.add(new College("college4", 5));
		collegeList.add(new College("college5", 5));
	}

	/**
	 * @param{int} noOfStudents
	 * @return{List<Student>} This function will add student in the student list.
	 */

	public List<Student> addStudents(int noOfStudents) {
		for (int i = 1; i <= noOfStudents; i++) {
			System.out.println("Enter the name");
			String name = scan.next();
			studentList.add(new Student(name, i));
		}
		return studentList;
	}

	/**
	 * This function will add students in the queue.
	 **/
	
	protected void enqueueStudents() {
		studentQueue = new Queue(100);
		// Storing in StudentQueue
		for (int count = 1; count <= studentList.size(); count++) {
			for (Student student : studentList) {
				if (student.getRank() == count) {
					studentQueue.enqueue(student);
				}
			}
		}
	}

	/**
	 * This function displays the list of all the colleges in the system.
	 */

	public static void printCollegeList() {
		CounselingSystem tempObj = new CounselingSystem(); 
		int i = 1;
		System.out.println("COLLEGE NAME" + "  " + "Avaliablity");
		for (College college : tempObj.collegeList) {
			System.out.println(i + "   " + college.getName() + " "
					+ college.getSeatsAvailable());
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
				System.out.println("Welcome " + student.getName()
						+ " with your rank " + student.getRank());
				System.out.println("Enter your choice");
				printCollegeList();
					scan.next();
				int choice = scan.nextInt();
				College college = collegeList.get(choice - 1);
				if (college.getSeatsAvailable() > 0) {
					college.setSeatsAvailable(college.getSeatsAvailable() - 1);
					finalallotment.put(student.getName(), college.getName());
					System.out.println("Alloted college:" + college.getName());
				} else {
					System.out.println("Seats not available");
				}
			}
			else 
			{
				break;
			}
		}
	}

	/**
	 * This function displays the list of alloted candidates
	 */

	public static void displayList() {
		CounselingSystem tempObj = new CounselingSystem();
		if (tempObj.finalallotment.size() != 0) {
			System.out.println("Name Of Candidate" + "\t" + "College Name");
			for (Entry<String, String> m : tempObj.finalallotment.entrySet()) {
				System.out.println(m.getKey() + "\t\t\t" + m.getValue());
			}
		}
		else {
			System.out.println(" No Allotments..");
		}
	}
}
