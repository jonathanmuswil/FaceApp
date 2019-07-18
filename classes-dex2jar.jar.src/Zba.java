import android.content.Context;
import java.lang.reflect.Method;

final class zba
  implements yba
{
  private final Method a;
  private final Object b;
  
  private zba(Class paramClass, Object paramObject)
    throws NoSuchMethodException
  {
    this.b = paramObject;
    this.a = paramClass.getDeclaredMethod("isDataCollectionDefaultEnabled", new Class[0]);
  }
  
  public static yba a(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getClassLoader().loadClass("com.google.firebase.FirebaseApp");
      paramContext = new zba(paramContext, paramContext.getDeclaredMethod("getInstance", new Class[0]).invoke(paramContext, new Object[0]));
      return paramContext;
    }
    catch (Exception paramContext)
    {
      Naa.e().c("Fabric", "Unexpected error loading FirebaseApp instance.", paramContext);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Xaa localXaa = Naa.e();
      paramContext = new StringBuilder();
      paramContext.append("Could not find method: ");
      paramContext.append(localNoSuchMethodException.getMessage());
      localXaa.d("Fabric", paramContext.toString());
    }
    catch (ClassNotFoundException paramContext)
    {
      Naa.e().d("Fabric", "Could not find class: com.google.firebase.FirebaseApp");
    }
    return null;
  }
  
  public boolean a()
  {
    try
    {
      boolean bool = ((Boolean)this.a.invoke(this.b, new Object[0])).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
      Naa.e().c("Fabric", "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", localException);
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */