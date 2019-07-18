package android.support.v7.widget;

import android.support.v7.view.menu.u;
import android.support.v7.view.menu.z;
import android.view.View;

class h
  extends la
{
  h(g.d paramd, View paramView, g paramg)
  {
    super(paramView);
  }
  
  public z h()
  {
    g.e locale = this.k.d.z;
    if (locale == null) {
      return null;
    }
    return locale.b();
  }
  
  public boolean i()
  {
    this.k.d.i();
    return true;
  }
  
  public boolean j()
  {
    g localg = this.k.d;
    if (localg.B != null) {
      return false;
    }
    localg.e();
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */