package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class i
{
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return paramMarginLayoutParams.getMarginEnd();
    }
    return paramMarginLayoutParams.rightMargin;
  }
  
  public static void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      paramMarginLayoutParams.setMarginEnd(paramInt);
    } else {
      paramMarginLayoutParams.rightMargin = paramInt;
    }
  }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return paramMarginLayoutParams.getMarginStart();
    }
    return paramMarginLayoutParams.leftMargin;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */