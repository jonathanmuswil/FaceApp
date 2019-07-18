package com.facebook.accountkit.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.accountkit.internal.c.a;

class ra
  implements View.OnClickListener
{
  ra(ta.a parama) {}
  
  public void onClick(View paramView)
  {
    c.a.b(S.o.name());
    if (ta.a.a(this.a) != null) {
      ta.a.a(this.a).a(paramView.getContext());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */