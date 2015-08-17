import java.util.Scanner;

/**
 * Name: Gcd
 * @author Pulkit
 * @since August 10,2015 
 * Description: Contains gcd method which calculates gcd.
 */

public class Gcd {
	
	/**
	 * Name: gcd
	 * @param{int} x
	 * @param{int} y
	 * @return{int} gcd value
	 * It calculates the greatest common divisor 
	 */ 
	
	public int gcd(int x , int y) {
		
		if(x > 0 && y > 0) {								 // Checking valid input
			if(x%y == 0) {								 	 // Base condition
				return y;
			}
			else {
				return gcd(y,x%y);
			}
		}
		else {
			return -1; 										 // Error
		}
		
	}

	public static void main(String[] args) {
		
		int num1, num2;
		Gcd obj = new Gcd();
		System.out.print("Enter two numbers");				  // Input
		Scanner scan = new Scanner(System.in);
		try {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			System.out.print("Gcd of " + num1 +  " and " + num2 + " is " + obj.gcd(num1,num2));				  // Output
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
