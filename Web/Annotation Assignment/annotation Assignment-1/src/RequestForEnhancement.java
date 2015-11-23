
/**
 * @annotation RequestForEnhancement
 * @author Pulkit 
 * @since: 16 October,2015
 * @Target(ElementType.METHOD)
 * @Retention(RetentionPolicy.RUNTIME)
 * This defines the RequestForEnhancement
 **/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestForEnhancement
{
	// To store id
    int id();
    // To store Synposis
    String synopsis();
    // To store Engineer
    String engineer() default "[unassigned]";
    // To store Date
    String date() default "[unknown]";
}
