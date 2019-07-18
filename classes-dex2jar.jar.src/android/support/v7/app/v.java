package android.support.v7.app;

import android.support.v4.view.J;
import android.support.v4.view.y;
import android.support.v7.widget.ActionBarContextView;
import android.view.ViewGroup;
import android.widget.PopupWindow;

class v
  implements Runnable
{
  v(x paramx) {}
  
  public void run()
  {
    Object localObject = this.a;
    ((x)localObject).r.showAtLocation(((x)localObject).q, 55, 0, 0);
    this.a.l();
    if (this.a.s())
    {
      this.a.q.setAlpha(0.0F);
      x localx = this.a;
      localObject = y.a(localx.q);
      ((J)localObject).a(1.0F);
      localx.t = ((J)localObject);
      this.a.t.a(new u(this));
    }
    else
    {
      this.a.q.setAlpha(1.0F);
      this.a.q.setVisibility(0);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */