package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.accountkit.internal.c.a;

class sa
  implements View.OnClickListener
{
  sa(ta.a parama) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent("android.intent.action.MAIN");
    paramView.addCategory("android.intent.category.APP_EMAIL");
    paramView.addFlags(1073741824);
    c.a.b(S.j.name());
    try
    {
      this.a.startActivity(paramView);
      return;
    }
    catch (ActivityNotFoundException paramView)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/sa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */