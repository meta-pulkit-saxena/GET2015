import java.awt.DisplayMode;
import java.util.Scanner;


/**
 * @class  StackRunner
 * @author Pulkit
 * This class will present the menu and call all the functions accordingly.
 */

public class StackRunner {
	
	public static void main(String[] args) {
		StackFunctions<Integer> stackObj = new StackFunctions<Integer>();
		displayMenu();
		int choice,value; 
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter your choice");
			choice = scan.nextInt();
			switch(choice) {
			case 1:	System.out.println("Enter the value to be added in the stack."); 
					value = scan.nextInt();
					stackObj.push(value);
					break;
			case 2: stackObj.pop();
					break;
			case 3: stackObj.display();
					break;
			case 4: System.exit(0);
					break;
			default: System.out.println("Enter correct choice"); 
			}
			
		}while(choice != 4);
	}

	public static void displayMenu() {
		System.out.println("Menu:");
		System.out.println("1. Add a value in stack (push)"); 
		System.out.println("2. Remove a value");
		System.out.println("3. display all the values");
		System.out.println("4. Exit");
	}
}
