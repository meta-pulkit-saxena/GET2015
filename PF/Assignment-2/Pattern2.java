public class Pattern2 
{
	/** This method prints 
	 * Spaces in the rows
	 * @param{int} row
	 * @param{int} n
	 * @return{String} String of spaces
	 */
	
	 String  printSpaces(int row, int n)
	{
		String sp = "";
		for(int i=1;i<row;i++)
		{
			sp = sp + " ";								// Prints Spaces
		}
		return sp;
		
	}
	
	 /**This method prints the numbers
	  * 
	  * @param{int} row
	  * @param{int} n
	  * @return{String} string of numbers
	  */
	 
	 String  printNum(int row ,int n)
	{
		String num = "";
		for(int i = 0; i<=n-row;i++)
		{
			num = num + (i+1);							// Prints numbers
		}
		return num;
		
	
	}
	
	 /**This method prints 
	  * the whole pyramid using above two methods
	  * @param{int} row
	  * @param{int} n
	  * @return{String []} string array of spaces and numbers
	  */
	 
	  String [] printPyramid(int row, int n)
	{
		String []pyramid = new  String[row];
		String com = "";
		for(int i = 0;i < row;i++)							// works row wise
		{
		
		com =  printSpaces(i+1,n) + printNum(i+1,n);					// Prints string of numbers and spaces
		pyramid[i] = com;
		}
		return pyramid;
	}
	
	  
	public static void main(String[] args) 
	{
		String [] pyramidPattern = new String[4];
		Pattern2  obj = new Pattern2();
		pyramidPattern = obj.printPyramid(5, 5);					// Calls printPyramid function
		for(int i=0;i<pyramidPattern.length;i++)
		{
			System.out.println(pyramidPattern[i]);
		}
	}

}

