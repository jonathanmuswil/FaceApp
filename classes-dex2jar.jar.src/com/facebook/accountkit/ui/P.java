package com.facebook.accountkit.ui;

import Rm;
import Wm;
import Zm;
import an;
import android.os.Handler;
import dn;
import en;

class p
  extends an
{
  p(s params, AccountKitActivity paramAccountKitActivity) {}
  
  private void i()
  {
    this.e.n();
  }
  
  protected void a(Wm paramWm)
  {
    this.e.a(paramWm.a());
  }
  
  protected void a(Zm paramZm)
  {
    if (!(this.e.o() instanceof pb)) {
      return;
    }
    this.e.a(Ga.g, null);
  }
  
  protected void b(Zm paramZm)
  {
    this.e.a(null);
  }
  
  protected void c(Zm paramZm)
  {
    if (!(this.e.o() instanceof pb)) {
      return;
    }
    this.e.a(Ga.e, null);
  }
  
  protected void d(Zm paramZm)
  {
    aa localaa = this.e.o();
    if ((!(localaa instanceof ta)) && (!(localaa instanceof Sb))) {
      return;
    }
    this.e.a(Ga.l, null);
    this.e.b(paramZm.d());
    this.e.a(paramZm.a());
    this.e.a(paramZm.getCode());
    this.e.a(en.a);
    paramZm = paramZm.a();
    if (paramZm != null) {
      this.e.a(paramZm.p());
    }
    new Handler().postDelayed(new o(this), 2000L);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */