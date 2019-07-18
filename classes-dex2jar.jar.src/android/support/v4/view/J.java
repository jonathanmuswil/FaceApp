package android.support.v4.view;

import Ec;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;

public final class j
{
  public static MenuItem a(MenuItem paramMenuItem, e parame)
  {
    if ((paramMenuItem instanceof Ec)) {
      return ((Ec)paramMenuItem).a(parame);
    }
    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
    return paramMenuItem;
  }
  
  public static void a(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    if ((paramMenuItem instanceof Ec)) {
      ((Ec)paramMenuItem).setAlphabeticShortcut(paramChar, paramInt);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setAlphabeticShortcut(paramChar, paramInt);
    }
  }
  
  public static void a(MenuItem paramMenuItem, ColorStateList paramColorStateList)
  {
    if ((paramMenuItem instanceof Ec)) {
      ((Ec)paramMenuItem).setIconTintList(paramColorStateList);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setIconTintList(paramColorStateList);
    }
  }
  
  public static void a(MenuItem paramMenuItem, PorterDuff.Mode paramMode)
  {
    if ((paramMenuItem instanceof Ec)) {
      ((Ec)paramMenuItem).setIconTintMode(paramMode);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setIconTintMode(paramMode);
    }
  }
  
  public static void a(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    if ((paramMenuItem instanceof Ec)) {
      ((Ec)paramMenuItem).setContentDescription(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setContentDescription(paramCharSequence);
    }
  }
  
  public static void b(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    if ((paramMenuItem instanceof Ec)) {
      ((Ec)paramMenuItem).setNumericShortcut(paramChar, paramInt);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setNumericShortcut(paramChar, paramInt);
    }
  }
  
  public static void b(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    if ((paramMenuItem instanceof Ec)) {
      ((Ec)paramMenuItem).setTooltipText(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setTooltipText(paramCharSequence);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */