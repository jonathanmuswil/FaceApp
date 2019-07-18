package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

public final class z
{
  private static Method a;
  
  static
  {
    if (Build.VERSION.SDK_INT == 25) {
      try
      {
        a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
      }
      catch (Exception localException)
      {
        Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
      }
    }
  }
  
  public static float a(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return paramViewConfiguration.getScaledHorizontalScrollFactor();
    }
    return d(paramViewConfiguration, paramContext);
  }
  
  public static int a(ViewConfiguration paramViewConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return paramViewConfiguration.getScaledHoverSlop();
    }
    return paramViewConfiguration.getScaledTouchSlop() / 2;
  }
  
  public static float b(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return paramViewConfiguration.getScaledVerticalScrollFactor();
    }
    return d(paramViewConfiguration, paramContext);
  }
  
  public static boolean c(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return paramViewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
    paramViewConfiguration = paramContext.getResources();
    int i = paramViewConfiguration.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
    boolean bool;
    if ((i != 0) && (paramViewConfiguration.getBoolean(i))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static float d(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 25)
    {
      Method localMethod = a;
      if (localMethod != null) {
        try
        {
          int i = ((Integer)localMethod.invoke(paramViewConfiguration, new Object[0])).intValue();
          return i;
        }
        catch (Exception paramViewConfiguration)
        {
          Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
        }
      }
    }
    paramViewConfiguration = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(16842829, paramViewConfiguration, true)) {
      return paramViewConfiguration.getDimension(paramContext.getResources().getDisplayMetrics());
    }
    return 0.0F;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */