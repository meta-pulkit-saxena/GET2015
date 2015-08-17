import java.util.Scanner;

 /**
 * @author Pulkit
 * Date: August 10,2015
 * Name: Remainder Class
 * This class contains rem()
 * which calculates remainder.
 */

public class Remainder {
	
	/**
	 * Name: rem
	 * @param{int} x  Dividend
	 * @param{int} y  Divisor
	 * @return{int}   remainder
	 * Description: the rem() takes dividend and divisor as input
	 * and returns remainder
	 */
	
	public int rem(int x, int y) {
		
		if(x>=0 && y>0 ) {					                   							// Checking for valid input
				if(x>=y) {
					return rem((x-y),y);						   						// Recursive call to function
				}															 
				else {
					return x;
				}
			}
		else {
			return -1;		                                        					// Error
		}
				
	}

	public static void main(String[] args) {
		
		int Dividend, Divisor;
		Remainder obj = new Remainder();
	    Scanner scan = new Scanner(System.in);											// Taking input 
	    System.out.println("Enter two numbers");
	    try {
		    Dividend = scan.nextInt();
		    Divisor = scan.nextInt();
		    System.out.println(" Remainder is " + obj.rem(Dividend, Divisor));			// Calling rem() function.
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

}
