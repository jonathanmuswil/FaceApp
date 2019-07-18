package android.support.v7.widget;

import android.support.v7.view.menu.a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window.Callback;

class ub
  implements View.OnClickListener
{
  final a a = new a(this.b.a.getContext(), 0, 16908332, 0, 0, this.b.i);
  
  ub(wb paramwb) {}
  
  public void onClick(View paramView)
  {
    wb localwb = this.b;
    paramView = localwb.l;
    if ((paramView != null) && (localwb.m)) {
      paramView.onMenuItemSelected(0, this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */