package com.facebook.accountkit.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.accountkit.internal.c.a;

class eb
  implements View.OnClickListener
{
  eb(gb paramgb) {}
  
  public void onClick(View paramView)
  {
    c.a.d(S.s.name());
    if (gb.a(this.a) != null) {
      gb.a(this.a).a(paramView.getContext());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */