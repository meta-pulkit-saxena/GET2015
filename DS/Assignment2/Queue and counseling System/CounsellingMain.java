import java.io.DataInputStream;
import java.util.Scanner;

/**
 * @class CounsellingMain
 * @author Pulkit
 * @since  25th August 15
 */
public class CounsellingMain {

	public static void main(String args[]) {

		System.out.println("Councelling Manangement System");
		CounsellingMain obj = new CounsellingMain();
		obj.menuDisplay();
	}

	/**
	 * This function will display the menu.
	 */
	
	public void menuDisplay() {
		Scanner scan = new Scanner(System.in);
		String choiceMenu = null;
		do {
			System.out.println("Enter 1 for counselling");
			System.out.println("Enter 2 for Chart");
			System.out.println("Enter 3 for exit");
			System.out.print("Enter the choice");
			while (!scan.hasNextInt()) {
				System.out.println("That's not a number!");
				scan.next();
			}
			int choice = scan.nextInt();
			CounselingSystem collegeCounselingSystem = new CounselingSystem();
			switch (choice) {
			case 1:
				collegeCounselingSystem.initializeSystem();
				collegeCounselingSystem.enqueueStudents();
				collegeCounselingSystem.councelingProcess();
				break;
			case 2:
				CounselingSystem.displayList();
				break;
			case 3:
				System.out.println("SystemClosing");
				System.exit(0);
				break;
			default:
				System.out.println("wrong Input");
			}
			System.out
					.println("Enter y to continue and other element to exist");
			choiceMenu = scan.next();
		} while (choiceMenu.equalsIgnoreCase("y"));
		scan.close();
	}
}
