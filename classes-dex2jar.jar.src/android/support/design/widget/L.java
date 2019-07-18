package android.support.design.widget;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;

class l
  implements View.OnClickListener
{
  l(p paramp) {}
  
  public void onClick(View paramView)
  {
    paramView = this.a;
    if ((paramView.d) && (paramView.isShowing()) && (this.a.b())) {
      this.a.cancel();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */