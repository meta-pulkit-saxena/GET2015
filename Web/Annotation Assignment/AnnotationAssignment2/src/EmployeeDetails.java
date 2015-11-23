
/**
 * @annotation :Employee Details
 * @author Pulkit
 * @since: 16 October,2015
 * @Target(ElementType.METHOD)
 * @Retention(RetentionPolicy.RUNTIME)
 * This defines Employee Details Annotation.
 **/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeDetails
{
	String date_Of_Birth() default "[null]";
	String date_Of_Joining() default "[null]";
	int ctcPerAnnum() default 20000;

}
