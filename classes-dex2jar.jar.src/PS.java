import java.lang.reflect.Method;

final class ps
{
  private static final Class<?> a = ;
  
  public static qs a()
  {
    Object localObject = a;
    if (localObject != null) {}
    try
    {
      localObject = (qs)((Class)localObject).getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
      return (qs)localObject;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return qs.b;
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */