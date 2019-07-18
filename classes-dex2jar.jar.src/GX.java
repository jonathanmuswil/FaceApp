import java.lang.reflect.Method;

final class gx
{
  private static final Class<?> a = ;
  
  public static hx a()
  {
    Object localObject = a;
    if (localObject != null) {}
    try
    {
      localObject = (hx)((Class)localObject).getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
      return (hx)localObject;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return hx.b;
  }
  
  private static Class<?> b()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.ExtensionRegistry");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */