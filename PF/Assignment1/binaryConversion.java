
public class binaryConversion 
{
    int convertBinaryToOctal(int n)
	{
		int digit,count=0,octalDigit=0,octalNumber=0,tempDigit,digitCount=0;
		while(n>0)
		{
			
			digit = n%10;
			n=n/10;
			if(count==0)
			{
				count=3;
				octalDigit=0;
			}
			if(count>0)
			{
				if(count==3 && digit==1)
					tempDigit= 1;
				else if(count==2 && digit==1)
					tempDigit= 2;
				else if(count==1 && digit==1)
					tempDigit = 4;
				else 
					tempDigit = 0;
				
				octalDigit += tempDigit;
				--count;
			}
				if(count==0 || n<0)
				{
					octalNumber = octalDigit*(int)(Math.pow(10,digitCount)) + octalNumber;
					++digitCount;
				}
		}	
		return octalNumber;
	}
	
	
	
	public static void main(String[] args)
	{
		 binaryConversion obj = new binaryConversion();
		 System.out.println(obj.convertBinaryToOctal(111111));
		
	}

}
