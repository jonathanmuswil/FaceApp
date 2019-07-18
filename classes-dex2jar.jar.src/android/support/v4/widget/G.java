package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public final class g
{
  private static Field a;
  private static boolean b;
  
  public static Drawable a(CompoundButton paramCompoundButton)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return paramCompoundButton.getButtonDrawable();
    }
    if (!b)
    {
      try
      {
        a = CompoundButton.class.getDeclaredField("mButtonDrawable");
        a.setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", localNoSuchFieldException);
      }
      b = true;
    }
    Field localField = a;
    if (localField != null) {
      try
      {
        paramCompoundButton = (Drawable)localField.get(paramCompoundButton);
        return paramCompoundButton;
      }
      catch (IllegalAccessException paramCompoundButton)
      {
        Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", paramCompoundButton);
        a = null;
      }
    }
    return null;
  }
  
  public static void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramCompoundButton.setButtonTintList(paramColorStateList);
    } else if ((paramCompoundButton instanceof D)) {
      ((D)paramCompoundButton).setSupportButtonTintList(paramColorStateList);
    }
  }
  
  public static void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramCompoundButton.setButtonTintMode(paramMode);
    } else if ((paramCompoundButton instanceof D)) {
      ((D)paramCompoundButton).setSupportButtonTintMode(paramMode);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */