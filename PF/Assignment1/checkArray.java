import java.util.Scanner;

public class checkArray
{
	static int sortedOrNot (int array[])
	{
		int ascMark=1,descMark=1,retValue = 0;
		for(int forCount=0; forCount<array.length-1;forCount++)
		{
			if(array[forCount]<array[forCount+1])
			{}
			else
				ascMark=0;
		}
		for(int forCount=0; forCount<array.length-1;forCount++)
		{
			if(array[forCount]>array[forCount+1])
			{}
			else
				descMark=0;
		}
		if(ascMark==0 && descMark==0)
			retValue=0;
		else if(ascMark==1)
			retValue=1;
		else if(descMark==1)
			retValue=2;
		return retValue;
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arraySize = input.nextInt();
		int []array = new int[arraySize];
		System.out.println("Enter the elements of the array");
	    for (int loopCount = 0 ; loopCount < arraySize; loopCount++ ) 
	     {
	           array[loopCount] = input.nextInt();
	     }
		System.out.print(sortedOrNot(array));
	}

}



