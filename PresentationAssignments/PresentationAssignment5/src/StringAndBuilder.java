
/**
 * @class  StringAndBuilder
 * @author Pulkit
 * This class demonstrates the difference between normal string object allotment 
 * and by string builder.
 */

public class StringAndBuilder{

	/**
	 * This is the main function controlling the flow
	 * @param{String[]} args
	 */
	
    public static void main(String args[]){
    	
       StringBuffer stringBuffer = new StringBuffer("It is");
       String sampleString="old string";
       
       // appending to the old string buffer object
       
       stringBuffer.append(" String Buffer");

       // new object of from string pool alloted to the sample
       
       sampleString = "new String";
       
       // printing both type strings.
       
       System.out.println(sampleString);
       System.out.println(stringBuffer);  
   }
}