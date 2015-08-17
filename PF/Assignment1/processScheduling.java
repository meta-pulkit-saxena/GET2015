import java.util.Scanner;
import java.lang.*;

public class processScheduling
{
	
   
	static int [][] FCFS(int arrival_time[], int job_size[],int n)
	{
		int [][]returnArray = new int[n][5];
		int waitTime=0,loopCount1=0,loopCount2;
		int startTime=1; 
		
		
		
		for( loopCount1 =0; loopCount1 <n; loopCount1 ++)
		{
			if(loopCount1>0)
			{
				if(returnArray[loopCount1-1][4]>arrival_time[loopCount1])
				waitTime = returnArray[loopCount1-1][4] - arrival_time[loopCount1]+1;
				else
					waitTime=0;
				if(returnArray[loopCount1-1][4]>arrival_time[loopCount1])
					startTime = returnArray[loopCount1-1][4] + 1;
				else
					startTime = arrival_time[loopCount1];
			}
			for( loopCount2 =0; loopCount2 <5; loopCount2 ++)
			{
				if(loopCount2==0)
					returnArray[loopCount1][loopCount2]=loopCount1+1;
				else if(loopCount2==1)
					returnArray[loopCount1][loopCount2]=arrival_time[loopCount1];
				else if(loopCount2==2)
					returnArray[loopCount1][loopCount2]=waitTime;
				else if(loopCount2==3)
					returnArray[loopCount1][loopCount2]=startTime;
				else if(loopCount2==4)
					returnArray[loopCount1][loopCount2]=(returnArray[loopCount1][3]-1)+ job_size[loopCount1];
			}
			
		}
		
		return returnArray;
	}
	
	public static void main(String[] args) 
	{
		 int [][]result;
		
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter number of processes");
		 int n = input.nextInt();
		 int [] arrivalTime = new int[n];
		 System.out.println("Enter the arrival time of processes");
	     for (int loopCount = 0 ; loopCount < n; loopCount++ ) 
	     {
	           arrivalTime[loopCount] = input.nextInt();
	     }
	     int [] jobSize = new int[n];
	     System.out.println("Enter the job size of processes");
	     for (int loopCount = 0 ; loopCount < n; loopCount++ ) 
	     {
	           jobSize[loopCount] = input.nextInt();
	     }
	     int [][]resultArray;
	     resultArray = FCFS(arrivalTime,jobSize,n);
	     for(int loopCount1=0; loopCount1<n; loopCount1++)
	     {
	    	 for(int loopCount2=0; loopCount2<5; loopCount2++)
	    	 {
	    		 System.out.print(resultArray[loopCount1][loopCount2]+"    ");
	    	 }
	    	 System.out.println("\n");
	     }

	}

}


