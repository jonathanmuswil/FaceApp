import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.PARAMETER})
public @interface _bb
{
  String encoding() default "binary";
  
  String value() default "";
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */