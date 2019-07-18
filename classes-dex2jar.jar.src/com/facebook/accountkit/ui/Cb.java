package com.facebook.accountkit.ui;

import android.app.Activity;
import android.os.Handler;
import com.facebook.accountkit.internal.c.a;

final class cb
  extends rb
{
  cb(g paramg)
  {
    super(paramg);
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    h();
    this.h = new Handler();
    this.i = new bb(this, paramActivity);
    this.h.postDelayed(this.i, 2000L);
  }
  
  protected void g()
  {
    c.a.c(true, Ia.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */