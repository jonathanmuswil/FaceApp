package com.facebook.accountkit.ui;

import com.facebook.accountkit.internal.c.a;
import rn;

abstract class ua
  extends ba
{
  private static final Ga b = Ga.n;
  private zb.a c;
  private Eb.a d;
  private Eb.a e;
  private zb.a f;
  private zb.a g;
  
  ua(g paramg)
  {
    super(paramg);
  }
  
  public void a(Eb.a parama)
  {
    this.d = parama;
  }
  
  void a(String paramString)
  {
    Eb.a locala = this.e;
    if (locala != null) {
      locala.a(paramString);
    }
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
    return b;
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
      this.e = Eb.a(this.a.u(), rn.com_accountkit_error_title, new String[0]);
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
    c.a.a(true, this.a.p());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */