import java.util.Scanner;


public class duplicate 
{
	static int count = 0;
	static int[] removeDuplicate(int input[])
	{
		int []marker = new int[] {0,0,0,0,0,0,0,0,0,0};
		int []newArray = new int[input.length];
		
		for (int loopCount = 0 ; loopCount < input.length; loopCount++ ) 
	     {
	         if(marker[input[loopCount]]==0)
	         {
	        	 newArray[count]= input[loopCount];
	        	 count++;
	        	 marker[input[loopCount]]=1;
	         }
	     }
		return newArray;
	}
	
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arraySize = input.nextInt();
		System.out.println("Enter the elements of array");
		int []array = new int[arraySize];
		 for (int loopCount = 0 ; loopCount < arraySize; loopCount++ ) 
	     {
	           array[loopCount] = input.nextInt();
	     }
		 int [] output = new int [arraySize];
		 output = removeDuplicate(array);
		 for (int loopCount = 0 ; loopCount < count; loopCount++ ) 
	     {
			 System.out.println(output[loopCount]+" ");
	     }
	}

}
