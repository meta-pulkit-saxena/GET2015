
/**
 * @class AnnotationParser
 * @author Pulkit Saxena
 * @since 16 October,2015
 * This class parses the given class for the methods which have annotations 
 **/

import java.lang.reflect.Method;

public class AnnotationParser {

	/**
	 * This is the main function.
	 * @param{Strings[] args
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception {
		// Calling the Function
		AnnotationParser parser = new AnnotationParser();
		parser.parse(Employee.class);
	}

	/**
	 * This function parses the class for all the methods who have annotation
	 * applied. And then it  finds methods which have applied annotation. And prints
	 * the members of the annotation.
	 * @param{Class<?> tempClass
	 * @throws Exception
	 **/

	public void parse(Class<?> tempClass) throws Exception {
		// array of Methods
		Method[] methods = tempClass.getMethods();
		for (Method method : methods) {
			// Checking for the Data
			if (method.isAnnotationPresent(RequestForEnhancement.class)) {
				RequestForEnhancement test = method
						.getAnnotation(RequestForEnhancement.class);
				int info = test.id();
				String synopsis = test.synopsis();
				// Matching the Data
				System.out.println("\n");
				System.out.println("Data About Annotations");
				method.invoke(Employee.class.newInstance(), info, synopsis,
						test.engineer(), test.date());
			}
		}
	}
}
