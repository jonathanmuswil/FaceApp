package android.support.v4.view;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class x
  implements View.OnApplyWindowInsetsListener
{
  x(r paramr) {}
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramWindowInsets = N.a(paramWindowInsets);
    return (WindowInsets)N.a(this.a.a(paramView, paramWindowInsets));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */