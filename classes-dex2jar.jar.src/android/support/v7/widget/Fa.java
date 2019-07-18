package android.support.v7.widget;

import _d;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.support.v4.graphics.drawable.a;
import android.support.v4.graphics.drawable.c;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class fa
{
  public static final Rect a = new Rect();
  private static Class<?> b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 18) {}
    try
    {
      b = Class.forName("android.graphics.Insets");
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
  }
  
  public static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode)
  {
    if (paramInt != 3)
    {
      if (paramInt != 5)
      {
        if (paramInt != 9)
        {
          switch (paramInt)
          {
          default: 
            return paramMode;
          case 16: 
            return PorterDuff.Mode.ADD;
          case 15: 
            return PorterDuff.Mode.SCREEN;
          }
          return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_ATOP;
      }
      return PorterDuff.Mode.SRC_IN;
    }
    return PorterDuff.Mode.SRC_OVER;
  }
  
  public static boolean a(Drawable paramDrawable)
  {
    if ((Build.VERSION.SDK_INT < 15) && ((paramDrawable instanceof InsetDrawable))) {
      return false;
    }
    if ((Build.VERSION.SDK_INT < 15) && ((paramDrawable instanceof GradientDrawable))) {
      return false;
    }
    if ((Build.VERSION.SDK_INT < 17) && ((paramDrawable instanceof LayerDrawable))) {
      return false;
    }
    if ((paramDrawable instanceof DrawableContainer))
    {
      paramDrawable = paramDrawable.getConstantState();
      if ((paramDrawable instanceof DrawableContainer.DrawableContainerState))
      {
        paramDrawable = ((DrawableContainer.DrawableContainerState)paramDrawable).getChildren();
        int i = paramDrawable.length;
        for (int j = 0; j < i; j++) {
          if (!a(paramDrawable[j])) {
            return false;
          }
        }
      }
    }
    else
    {
      if ((paramDrawable instanceof c)) {
        return a(((c)paramDrawable).a());
      }
      if ((paramDrawable instanceof _d)) {
        return a(((_d)paramDrawable).a());
      }
      if ((paramDrawable instanceof ScaleDrawable)) {
        return a(((ScaleDrawable)paramDrawable).getDrawable());
      }
    }
    return true;
  }
  
  static void b(Drawable paramDrawable)
  {
    if ((Build.VERSION.SDK_INT == 21) && ("android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName()))) {
      d(paramDrawable);
    }
  }
  
  public static Rect c(Drawable paramDrawable)
  {
    if (b != null) {
      try
      {
        paramDrawable = a.h(paramDrawable);
        Object localObject = paramDrawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(paramDrawable, new Object[0]);
        if (localObject != null)
        {
          Rect localRect = new android/graphics/Rect;
          localRect.<init>();
          for (Field localField : b.getFields())
          {
            paramDrawable = localField.getName();
            int k = -1;
            switch (paramDrawable.hashCode())
            {
            default: 
              break;
            case 108511772: 
              if (paramDrawable.equals("right")) {
                k = 2;
              }
              break;
            case 3317767: 
              if (paramDrawable.equals("left")) {
                k = 0;
              }
              break;
            case 115029: 
              if (paramDrawable.equals("top")) {
                k = 1;
              }
              break;
            case -1383228885: 
              if (paramDrawable.equals("bottom")) {
                k = 3;
              }
              break;
            }
            if (k != 0)
            {
              if (k != 1)
              {
                if (k != 2)
                {
                  if (k == 3) {
                    localRect.bottom = localField.getInt(localObject);
                  }
                }
                else {
                  localRect.right = localField.getInt(localObject);
                }
              }
              else {
                localRect.top = localField.getInt(localObject);
              }
            }
            else {
              localRect.left = localField.getInt(localObject);
            }
          }
          return localRect;
        }
      }
      catch (Exception paramDrawable)
      {
        Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
      }
    }
    return a;
  }
  
  private static void d(Drawable paramDrawable)
  {
    int[] arrayOfInt = paramDrawable.getState();
    if ((arrayOfInt != null) && (arrayOfInt.length != 0)) {
      paramDrawable.setState(kb.i);
    } else {
      paramDrawable.setState(kb.f);
    }
    paramDrawable.setState(arrayOfInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */