package android.support.v7.app;

import android.support.v4.view.J;
import android.support.v4.view.L;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

class y
  extends L
{
  y(x.b paramb) {}
  
  public void b(View paramView)
  {
    this.a.b.q.setVisibility(8);
    x localx = this.a.b;
    paramView = localx.r;
    if (paramView != null) {
      paramView.dismiss();
    } else if ((localx.q.getParent() instanceof View)) {
      android.support.v4.view.y.F((View)this.a.b.q.getParent());
    }
    this.a.b.q.removeAllViews();
    this.a.b.t.a(null);
    this.a.b.t = null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */