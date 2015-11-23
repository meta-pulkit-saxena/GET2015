
/**
 * @annotation CanRun
 * @author Pulkit
 * @since 16th October 15
 * @Target(ElementType.METHOD)
 * @Retention(RetentionPolicy.RUNTIME)
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CanRun 
{

}
