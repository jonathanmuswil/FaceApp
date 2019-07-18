package android.support.design.widget;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.util.Log;
import java.lang.reflect.Method;

public class z
{
  private static Method a;
  private static boolean b;
  
  public static boolean a(DrawableContainer paramDrawableContainer, Drawable.ConstantState paramConstantState)
  {
    return b(paramDrawableContainer, paramConstantState);
  }
  
  private static boolean b(DrawableContainer paramDrawableContainer, Drawable.ConstantState paramConstantState)
  {
    if (!b)
    {
      try
      {
        a = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[] { DrawableContainer.DrawableContainerState.class });
        a.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
      }
      b = true;
    }
    Method localMethod = a;
    if (localMethod != null) {
      try
      {
        localMethod.invoke(paramDrawableContainer, new Object[] { paramConstantState });
        return true;
      }
      catch (Exception paramDrawableContainer)
      {
        Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
      }
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */