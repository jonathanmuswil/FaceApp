import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface IA$a
{
  String zzbo();
  
  Class<?> zzbp();
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/IA$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */