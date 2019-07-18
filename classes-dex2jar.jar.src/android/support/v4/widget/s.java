package android.support.v4.widget;

import android.os.Build.VERSION;
import android.support.v4.view.f;
import android.support.v4.view.y;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class s
{
  private static Method a;
  private static boolean b;
  private static Field c;
  private static boolean d;
  
  public static void a(PopupWindow paramPopupWindow, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      paramPopupWindow.setWindowLayoutType(paramInt);
      return;
    }
    if (!b) {}
    try
    {
      localObject = Integer.TYPE;
      a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[] { localObject });
      a.setAccessible(true);
    }
    catch (Exception localException)
    {
      try
      {
        Object localObject;
        ((Method)localObject).invoke(paramPopupWindow, new Object[] { Integer.valueOf(paramInt) });
        return;
        localException = localException;
      }
      catch (Exception paramPopupWindow)
      {
        for (;;) {}
      }
    }
    b = true;
    localObject = a;
    if (localObject == null) {}
  }
  
  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      paramPopupWindow.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
    }
    else
    {
      int i = paramInt1;
      if ((f.a(paramInt3, y.l(paramView)) & 0x7) == 5) {
        i = paramInt1 - (paramPopupWindow.getWidth() - paramView.getWidth());
      }
      paramPopupWindow.showAsDropDown(paramView, i, paramInt2);
    }
  }
  
  public static void a(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      paramPopupWindow.setOverlapAnchor(paramBoolean);
    }
    else if (i >= 21)
    {
      if (!d)
      {
        try
        {
          c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
          c.setAccessible(true);
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", localNoSuchFieldException);
        }
        d = true;
      }
      Field localField = c;
      if (localField != null) {
        try
        {
          localField.set(paramPopupWindow, Boolean.valueOf(paramBoolean));
        }
        catch (IllegalAccessException paramPopupWindow)
        {
          Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", paramPopupWindow);
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */