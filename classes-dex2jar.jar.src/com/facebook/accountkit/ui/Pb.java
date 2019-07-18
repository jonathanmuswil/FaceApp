package com.facebook.accountkit.ui;

import Vm.a;
import Wm;
import com.facebook.accountkit.internal.O;
import com.facebook.accountkit.internal.c.a;
import rn;

final class pb
  extends ba
{
  private zb.a b;
  private zb.a c;
  private Eb.a d;
  private Eb.a e;
  private zb.a f;
  private zb.a g;
  
  pb(g paramg)
  {
    super(paramg);
  }
  
  public ca a()
  {
    if (this.b == null) {
      a(zb.a(this.a.u(), c()));
    }
    return this.b;
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
    return Ga.d;
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
    if (this.e == null)
    {
      int i = ob.a[this.a.p().ordinal()];
      if (i != 1)
      {
        if (i == 2) {
          i = rn.com_accountkit_phone_loading_title;
        } else {
          throw new Wm(Vm.a.d, O.n);
        }
      }
      else {
        i = rn.com_accountkit_email_loading_title;
      }
      b(Eb.a(this.a.u(), i, new String[0]));
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
    c.a.b(true, this.a.p());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/pb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */