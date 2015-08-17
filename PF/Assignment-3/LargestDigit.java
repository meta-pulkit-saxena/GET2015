import java.util.Scanner;

/**
 * @author Pulkit
 * @since August 10,2015
 * Name: LargestDigit
 * Desc: class to find the largest digit 
 */

public class LargestDigit {

	/**
	 * Name: largestdigit
	 * @param{int} x
	 * @return{int} largest digit
	 * This function returns the largest digit of number
	 */
	
	public int largestDigit(int x) {
		

		int maxDigit;
		if(x > 0) {                                                                    // Base condition
			maxDigit = x % 10;
			int maxOfTwo = largestDigit(x / 10);
			return maxDigit < maxOfTwo ? maxOfTwo : maxDigit;						   // Recursive call on the basis of return value
		}
		else return 0 ;
	}
	
	public static void main(String[] args) {
		
		int num;
		LargestDigit obj = new LargestDigit();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			num = scan.nextInt();														// Input
			System.out.print(obj.largestDigit(num));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}


