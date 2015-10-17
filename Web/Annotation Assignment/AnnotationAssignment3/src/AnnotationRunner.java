
/**
 * @class AnnotationRunner
 * @author Pulkit
 * @since: 16 October,2015
 * Defines a class with dummy functions applied annotations.
 **/

public class AnnotationRunner
{
	@CanRun
	public static void method1()
	{
		System.out.println("Executing method-1");
	}
	
	public static void method2()
	{
		System.out.println("Executing method-2");
	}
	
	@CanRun
	public static void method3()
	{
		System.out.println("Executing method-3");
	}
	
	public static void method4()
	{
		System.out.println("Executing method-4");
	}
	
	@CanRun
	public static void method5()
	{
		System.out.println("Executing method-5");
	}
	
}
