package com.facebook.accountkit.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.accountkit.internal.c.a;

class kb
  implements View.OnClickListener
{
  kb(nb.a parama, boolean paramBoolean) {}
  
  public void onClick(View paramView)
  {
    String str;
    if (this.a) {
      str = S.h.name();
    } else {
      str = S.i.name();
    }
    c.a.d(str);
    if (nb.a.a(this.b) != null) {
      nb.a.a(this.b).a(paramView.getContext());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */