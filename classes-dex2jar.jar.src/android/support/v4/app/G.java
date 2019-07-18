package android.support.v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class g
{
  public static IBinder a(Bundle paramBundle, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return paramBundle.getBinder(paramString);
    }
    return a.a(paramBundle, paramString);
  }
  
  public static void a(Bundle paramBundle, String paramString, IBinder paramIBinder)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      paramBundle.putBinder(paramString, paramIBinder);
    } else {
      a.a(paramBundle, paramString, paramIBinder);
    }
  }
  
  static class a
  {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;
    
    public static IBinder a(Bundle paramBundle, String paramString)
    {
      if (!b)
      {
        try
        {
          a = Bundle.class.getMethod("getIBinder", new Class[] { String.class });
          a.setAccessible(true);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", localNoSuchMethodException);
        }
        b = true;
      }
      Method localMethod = a;
      if (localMethod != null)
      {
        try
        {
          paramBundle = (IBinder)localMethod.invoke(paramBundle, new Object[] { paramString });
          return paramBundle;
        }
        catch (IllegalArgumentException paramBundle) {}catch (IllegalAccessException paramBundle) {}catch (InvocationTargetException paramBundle) {}
        Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", paramBundle);
        a = null;
      }
      return null;
    }
    
    public static void a(Bundle paramBundle, String paramString, IBinder paramIBinder)
    {
      if (!d)
      {
        try
        {
          c = Bundle.class.getMethod("putIBinder", new Class[] { String.class, IBinder.class });
          c.setAccessible(true);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", localNoSuchMethodException);
        }
        d = true;
      }
      Method localMethod = c;
      if (localMethod != null)
      {
        try
        {
          localMethod.invoke(paramBundle, new Object[] { paramString, paramIBinder });
        }
        catch (IllegalArgumentException paramBundle) {}catch (IllegalAccessException paramBundle) {}catch (InvocationTargetException paramBundle) {}
        Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", paramBundle);
        c = null;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */