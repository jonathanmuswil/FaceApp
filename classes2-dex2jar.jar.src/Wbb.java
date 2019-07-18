import java.lang.reflect.Method;
import java.lang.reflect.Type;

abstract class wbb<T>
{
  static <T> wbb<T> a(vbb paramvbb, Method paramMethod)
  {
    sbb localsbb = sbb.a(paramvbb, paramMethod);
    Type localType = paramMethod.getGenericReturnType();
    if (!xbb.d(localType))
    {
      if (localType != Void.TYPE) {
        return hbb.a(paramvbb, paramMethod, localsbb);
      }
      throw xbb.a(paramMethod, "Service methods cannot return void.", new Object[0]);
    }
    throw xbb.a(paramMethod, "Method return type must not include a type variable or wildcard: %s", new Object[] { localType });
  }
  
  abstract T a(Object[] paramArrayOfObject);
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */