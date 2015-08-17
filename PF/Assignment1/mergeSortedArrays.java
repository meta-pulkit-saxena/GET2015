
import java.util.Scanner;

public class mergeSortedArrays 
{
	static int[] join(int a[], int asize, int b[], int bsize, int c[])
	{
		int whileCount = 0,cCount=0,whileCount2 = 0;
		while (whileCount < asize && whileCount2 < bsize)
	    {
	        if (a[whileCount] < b[whileCount2])                                             // all ascending
	        {
	            c[cCount] = a[whileCount];
	            whileCount++;
	        }
	        else
	        {
	            c[cCount] = b[whileCount2];
	            whileCount2++;
	        }
	        cCount++;
	    }

	    while (whileCount < asize)
	    {
	        c[cCount] = a[whileCount];
	        whileCount++;
	        cCount++;
	    }

	    while (whileCount2 < bsize)
	    {
	        c[cCount] = b[whileCount2];
	        whileCount2++;
	        cCount++;
	    }
	    return c;
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of first sorted array");
		int aSize = input.nextInt();
		int []a = new int[aSize];
		System.out.println("Enter the elements of the first sorted array");
	     for (int loopCount = 0 ; loopCount < aSize; loopCount++ ) 
	     {
	           a[loopCount] = input.nextInt();
	     }
		
	     System.out.println("Enter the size of second sorted array");
			int bSize = input.nextInt();
			int []b = new int[aSize];
			System.out.println("Enter the elements of the second sorted array");
		     for (int loopCount = 0 ; loopCount < bSize; loopCount++ ) 
		     {
		           b[loopCount] = input.nextInt();
		     }
		int []c = new int[aSize+bSize];
		int []returnedC = new int[aSize+bSize];
		returnedC = join(a,aSize,b,bSize,c);
		for(int loopCount= 0 ; loopCount<returnedC.length;loopCount++)
		{
			System.out.print(returnedC[loopCount]+" ");
		}
	}

}

