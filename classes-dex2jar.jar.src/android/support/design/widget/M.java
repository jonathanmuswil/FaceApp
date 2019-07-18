package android.support.design.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.view.d;
import android.view.View;
import zd;

class m
  extends d
{
  m(p paramp) {}
  
  public void a(View paramView, zd paramzd)
  {
    super.a(paramView, paramzd);
    if (this.c.d)
    {
      paramzd.a(1048576);
      paramzd.f(true);
    }
    else
    {
      paramzd.f(false);
    }
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (paramInt == 1048576)
    {
      p localp = this.c;
      if (localp.d)
      {
        localp.cancel();
        return true;
      }
    }
    return super.a(paramView, paramInt, paramBundle);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */