
/**
 * @class TestAnnotationParser
 * @author Pulkit
 * @since: 16 October,2015
 * Checks the Value and parses the Annotation
 **/

import java.lang.reflect.Method;

public class TestAnnotationParser
{
	/**
	 * This is the main function
	 * @param{Strings{}} args
	 * @throws Exception
	 **/
	
	public static void main(String[] args) throws Exception 
	{
		TestAnnotationParser parser = new TestAnnotationParser();
		parser.parse(AnnotationRunner.class);
	}
	
	/**
	 * Parses the whole file and updates the value
	 * @param{Class<?>} tempClass
	 * @throws Exception 
	 **/
	
	public void parse(Class<?> tempClass) throws Exception 
	{
		// Array of methods to get the annotations
		Method[] methods = tempClass.getMethods();
		for (Method method : methods)
		{
			if (method.isAnnotationPresent(CanRun.class))
			{
				CanRun test = method.getAnnotation(CanRun.class);
				// try to invoke the method with param
				method.invoke(AnnotationRunner.class.newInstance());
			}
		}
	}

}
