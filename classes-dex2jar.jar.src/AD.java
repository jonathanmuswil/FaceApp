import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class ad
{
  private static Method a;
  private static Method b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {
      try
      {
        b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
      }
      catch (Exception localException1)
      {
        throw new IllegalStateException(localException1);
      }
    } else {
      try
      {
        Class localClass = Class.forName("libcore.icu.ICU");
        if (localClass != null)
        {
          a = localClass.getMethod("getScript", new Class[] { String.class });
          b = localClass.getMethod("addLikelySubtags", new Class[] { String.class });
        }
      }
      catch (Exception localException2)
      {
        a = null;
        b = null;
        Log.w("ICUCompat", localException2);
      }
    }
  }
  
  private static String a(String paramString)
  {
    try
    {
      if (a != null)
      {
        paramString = (String)a.invoke(null, new Object[] { paramString });
        return paramString;
      }
    }
    catch (InvocationTargetException paramString)
    {
      Log.w("ICUCompat", paramString);
    }
    catch (IllegalAccessException paramString)
    {
      Log.w("ICUCompat", paramString);
    }
    return null;
  }
  
  public static String a(Locale paramLocale)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      try
      {
        String str = ((Locale)b.invoke(null, new Object[] { paramLocale })).getScript();
        return str;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Log.w("ICUCompat", localIllegalAccessException);
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        Log.w("ICUCompat", localInvocationTargetException);
      }
      return paramLocale.getScript();
    }
    paramLocale = b(paramLocale);
    if (paramLocale != null) {
      return a(paramLocale);
    }
    return null;
  }
  
  private static String b(Locale paramLocale)
  {
    paramLocale = paramLocale.toString();
    try
    {
      if (b != null)
      {
        String str = (String)b.invoke(null, new Object[] { paramLocale });
        return str;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Log.w("ICUCompat", localInvocationTargetException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.w("ICUCompat", localIllegalAccessException);
    }
    return paramLocale;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */