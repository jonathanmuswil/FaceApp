import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class ubb
  implements InvocationHandler
{
  private final qbb a = qbb.d();
  private final Object[] b = new Object[0];
  
  ubb(vbb paramvbb, Class paramClass) {}
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    throws Throwable
  {
    if (paramMethod.getDeclaringClass() == Object.class) {
      return paramMethod.invoke(this, paramArrayOfObject);
    }
    if (this.a.a(paramMethod)) {
      return this.a.a(paramMethod, this.c, paramObject, paramArrayOfObject);
    }
    paramObject = this.d.a(paramMethod);
    if (paramArrayOfObject == null) {
      paramArrayOfObject = this.b;
    }
    return ((wbb)paramObject).a(paramArrayOfObject);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ubb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */