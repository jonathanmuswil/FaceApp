package android.support.v4.widget;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

class k
  implements View.OnApplyWindowInsetsListener
{
  k(DrawerLayout paramDrawerLayout) {}
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramView = (DrawerLayout)paramView;
    boolean bool;
    if (paramWindowInsets.getSystemWindowInsetTop() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    paramView.a(paramWindowInsets, bool);
    return paramWindowInsets.consumeSystemWindowInsets();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */