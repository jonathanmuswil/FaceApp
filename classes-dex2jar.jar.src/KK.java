import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

public class kk
  implements qk
{
  private final Method a;
  private final Object b;
  
  public kk(Object paramObject, Method paramMethod)
  {
    this.b = paramObject;
    this.a = paramMethod;
  }
  
  private static Object a(Context paramContext, Class paramClass)
  {
    try
    {
      paramContext = paramClass.getDeclaredMethod("getInstance", new Class[] { Context.class }).invoke(paramClass, new Object[] { paramContext });
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public static qk a(Context paramContext)
  {
    Class localClass = b(paramContext);
    if (localClass == null) {
      return null;
    }
    Object localObject = a(paramContext, localClass);
    if (localObject == null) {
      return null;
    }
    paramContext = b(paramContext, localClass);
    if (paramContext == null) {
      return null;
    }
    return new kk(localObject, paramContext);
  }
  
  private static Class b(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  private static Method b(Context paramContext, Class paramClass)
  {
    try
    {
      paramContext = paramClass.getDeclaredMethod("logEventInternal", new Class[] { String.class, String.class, Bundle.class });
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public void a(String paramString, Bundle paramBundle)
  {
    a("fab", paramString, paramBundle);
  }
  
  public void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    try
    {
      this.a.invoke(this.b, new Object[] { paramString1, paramString2, paramBundle });
      return;
    }
    catch (Exception paramString1)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */