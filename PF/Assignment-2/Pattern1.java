import java.util.Scanner;


public class Pattern1 
{
	/** printSpace method prints the spaces in the pattern
	 * @param{int} row number
	 * @param{int} n
	 * @return{String} 
	 */
	
	public static String printSpace(int row,int n)
	{
		String space = new String();
		for(int i=n;i>row;i--)
		{
			space = space + " ";								// Printing space
		}
		return space;
	}
	
	
	
	/** printNum method prints the numbers in pattern
	 * @param{int} row number
	 * @param{int} n
	 * @return{String}
	 */
	
	public static String printNum(int row, int n)
	{
		String numbers = new String();											
		for(int i = 1; i <= row;i++)
		{
			numbers = numbers + i;								// Printing numbers of left side
		}
		
		for(int i = (row-1);i >=1;i--)
		{
			numbers = numbers + i;								// Printing numbers of right side
		}
		return numbers;
	}
	
	
	
	/**printPattern method prints the whole pattern 
	 * by using printNum and printSpace methods
	 * @param{int} n
	 * @return{String} [] array of rows 
	 */
	
	public static String [] printPattern(int n)
	{
		int tempCount =0;
		String[] returnArray = new String[(2*n)-1];
		for(int i = 1; i<= n; i++)								// Printing top half pattern
		{
			returnArray[tempCount] = printSpace(i,n) + printNum(i,n);
			tempCount++;
		}
		
		for(int i = (n-1); i>=1; i--)
		{
			returnArray[tempCount] = printSpace(i,n) + printNum(i,n);			// Printing bottom half pattern
			tempCount++;
		}
		
		return returnArray;
	}
	
	
	
	public static void main(String[] args)
	{
		String [] finalTriangle = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of rows");                           
		int numRows = sc.nextInt();								// Function called
		finalTriangle = printPattern(numRows);
		for(int i = 0; i< finalTriangle.length;i++)
		{
			System.out.println(finalTriangle[i]);								
		}

	}

}
