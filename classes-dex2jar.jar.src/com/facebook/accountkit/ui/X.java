package com.facebook.accountkit.ui;

import Rm;
import Wm;
import android.os.Handler;
import dn;
import en;
import fn;
import hn;

class x
  extends hn
{
  x(I paramI, AccountKitActivity paramAccountKitActivity) {}
  
  private void i()
  {
    this.f.n();
  }
  
  protected void a(Wm paramWm)
  {
    this.f.a(paramWm.a());
  }
  
  protected void a(fn paramfn)
  {
    if (!(this.f.o() instanceof pb)) {
      return;
    }
    this.f.a(Ga.g, null);
  }
  
  protected void b(fn paramfn)
  {
    this.f.a(null);
  }
  
  protected void c(fn paramfn)
  {
    aa localaa = this.f.o();
    boolean bool = localaa instanceof pb;
    if ((!bool) && (!(localaa instanceof Sb))) {
      return;
    }
    if (paramfn.i() == Ja.a) {
      this.g.g(this.f);
    }
    if (bool) {
      this.f.a(Ga.e, null);
    } else {
      this.f.a(Ga.f, new v(this));
    }
  }
  
  protected void d(fn paramfn)
  {
    aa localaa = this.f.o();
    if ((!(localaa instanceof za)) && (!(localaa instanceof Sb))) {
      return;
    }
    this.f.a(Ga.l, null);
    this.f.a(paramfn.getCode());
    this.f.a(paramfn.a());
    this.f.a(en.a);
    this.f.b(paramfn.d());
    paramfn = paramfn.a();
    if (paramfn != null) {
      this.f.a(paramfn.p());
    }
    new Handler().postDelayed(new w(this), 2000L);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */