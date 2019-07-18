package com.facebook.accountkit.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.accountkit.internal.c.a;

class jb
  implements View.OnClickListener
{
  jb(nb.a parama) {}
  
  public void onClick(View paramView)
  {
    c.a.d(S.g.name());
    if (nb.a.a(this.a) != null) {
      nb.a.a(this.a).c(paramView.getContext());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/jb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */