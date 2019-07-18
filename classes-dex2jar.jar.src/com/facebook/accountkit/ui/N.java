package com.facebook.accountkit.ui;

import android.app.Activity;
import android.os.Handler;
import com.facebook.accountkit.internal.c.a;
import rn;

public class n
  extends ba
{
  private zb.a b;
  private zb.a c;
  private Eb.a d;
  private Eb.a e;
  private zb.a f;
  private zb.a g;
  private Handler h;
  private Runnable i;
  
  n(g paramg)
  {
    super(paramg);
  }
  
  private void h()
  {
    Handler localHandler = this.h;
    if (localHandler != null)
    {
      Runnable localRunnable = this.i;
      if (localRunnable != null)
      {
        localHandler.removeCallbacks(localRunnable);
        this.i = null;
        this.h = null;
      }
    }
  }
  
  public ca a()
  {
    if (this.b == null) {
      a(zb.a(this.a.u(), c()));
    }
    return this.b;
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    h();
    this.h = new Handler();
    this.i = new m(this, paramActivity);
    this.h.postDelayed(this.i, 2000L);
  }
  
  public void a(Eb.a parama)
  {
    this.d = parama;
  }
  
  public void a(ca paramca)
  {
    if (!(paramca instanceof zb.a)) {
      return;
    }
    this.b = ((zb.a)paramca);
  }
  
  public void b(Activity paramActivity)
  {
    h();
    super.b(paramActivity);
  }
  
  public void b(Eb.a parama)
  {
    this.e = parama;
  }
  
  public void b(ca paramca)
  {
    if (!(paramca instanceof zb.a)) {
      return;
    }
    this.g = ((zb.a)paramca);
  }
  
  public Ga c()
  {
    return Ga.g;
  }
  
  public void c(ca paramca)
  {
    if (!(paramca instanceof zb.a)) {
      return;
    }
    this.c = ((zb.a)paramca);
  }
  
  public Eb.a d()
  {
    if (this.e == null) {
      b(Eb.a(this.a.u(), rn.com_accountkit_account_verified, new String[0]));
    }
    return this.e;
  }
  
  public ca e()
  {
    if (this.f == null) {
      this.f = zb.a(this.a.u(), c());
    }
    return this.f;
  }
  
  public ca f()
  {
    if (this.g == null) {
      b(zb.a(this.a.u(), c()));
    }
    return this.g;
  }
  
  protected void g()
  {
    c.a.a(true);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */