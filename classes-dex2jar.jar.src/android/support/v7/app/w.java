package android.support.v7.app;

import android.support.v4.view.J;
import android.support.v4.view.L;
import android.support.v4.view.y;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;

class w
  extends L
{
  w(x paramx) {}
  
  public void b(View paramView)
  {
    this.a.q.setAlpha(1.0F);
    this.a.t.a(null);
    this.a.t = null;
  }
  
  public void c(View paramView)
  {
    this.a.q.setVisibility(0);
    this.a.q.sendAccessibilityEvent(32);
    if ((this.a.q.getParent() instanceof View)) {
      y.F((View)this.a.q.getParent());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */