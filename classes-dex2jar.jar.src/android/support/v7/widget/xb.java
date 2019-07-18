package android.support.v7.widget;

import android.os.Build.VERSION;
import android.view.View;

public class xb
{
  public static void a(View paramView, CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      paramView.setTooltipText(paramCharSequence);
    } else {
      Ab.a(paramView, paramCharSequence);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/xb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */