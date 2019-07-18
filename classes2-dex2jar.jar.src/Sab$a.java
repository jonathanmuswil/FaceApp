import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class Sab$a
{
  protected static Class<?> a(Type paramType)
  {
    return xbb.c(paramType);
  }
  
  protected static Type a(int paramInt, ParameterizedType paramParameterizedType)
  {
    return xbb.a(paramInt, paramParameterizedType);
  }
  
  public abstract Sab<?, ?> a(Type paramType, Annotation[] paramArrayOfAnnotation, vbb paramvbb);
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Sab$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */