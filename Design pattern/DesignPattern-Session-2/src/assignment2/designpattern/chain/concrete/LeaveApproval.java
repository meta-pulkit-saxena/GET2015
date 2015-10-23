
/**
 * @class LeaveApproval
 * @author Pulkit
 * @extend Approver
 * @since 22 october 15
 * This class creates the chain between different approvers and then executes the request for leave.
 */

package assignment2.designpattern.chain.concrete;

import java.util.Scanner;
import assignment2.designpattern.chain.Approver;

public class LeaveApproval {
	
	/**
	 * This function creates the chain between the approvers,
	 * @return{Approver}
	 */
	
	public Approver doChaining() {
		Approver chandler = new Mentor();
		Approver harvey = new SeniorMentor();
		Approver tom = new HRManager();
		chandler.setSuccessor(harvey);
		harvey.setSuccessor(tom);
		return chandler;
	}
	
	/**
	 * This is the main function.
	 * @param{String[]} args
	 */
	
	public static void main(String[] args) {
		LeaveApproval leave = new LeaveApproval();
		Approver mentor = leave.doChaining();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of days for leave");
		int days = scan.nextInt();
		mentor.processRequest(days);
	}

}
