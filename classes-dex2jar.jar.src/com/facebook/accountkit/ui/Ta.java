package com.facebook.accountkit.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.accountkit.internal.c.a;
import pn;
import qn;
import rn;

final class ta
  extends ba
{
  private static final Ga b = Ga.j;
  private a c;
  private zb.a d;
  private Eb.a e;
  private Eb.a f;
  private zb.a g;
  private zb.a h;
  
  ta(g paramg)
  {
    super(paramg);
  }
  
  public ca a()
  {
    if (this.c == null) {
      a(new a());
    }
    return this.c;
  }
  
  public void a(Eb.a parama)
  {
    this.e = parama;
  }
  
  public void a(ca paramca)
  {
    if (!(paramca instanceof a)) {
      return;
    }
    this.c = ((a)paramca);
    this.c.b().putParcelable(Tb.c, this.a.u());
    this.c.a(new qa(this));
  }
  
  public void b(Eb.a parama)
  {
    this.f = parama;
  }
  
  public void b(ca paramca)
  {
    if (!(paramca instanceof zb.a)) {
      return;
    }
    this.h = ((zb.a)paramca);
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
    this.d = ((zb.a)paramca);
  }
  
  public Eb.a d()
  {
    if (this.f == null) {
      this.f = Eb.a(this.a.u(), rn.com_accountkit_email_verify_title, new String[0]);
    }
    return this.f;
  }
  
  public ca e()
  {
    if (this.g == null) {
      this.g = zb.a(this.a.u(), c());
    }
    return this.g;
  }
  
  public ca f()
  {
    if (this.h == null) {
      b(zb.a(this.a.u(), c()));
    }
    return this.h;
  }
  
  protected void g()
  {
    c.a.e(true);
  }
  
  public static final class a
    extends ca
  {
    private a e;
    
    protected View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      return paramLayoutInflater.inflate(qn.com_accountkit_fragment_email_verify_bottom, paramViewGroup, false);
    }
    
    protected void a(View paramView, Bundle paramBundle)
    {
      super.a(paramView, paramBundle);
      paramBundle = paramView.findViewById(pn.com_accountkit_retry_email_button);
      if (paramBundle != null) {
        paramBundle.setOnClickListener(new ra(this));
      }
      paramView = (Button)paramView.findViewById(pn.com_accountkit_check_email_button);
      if (paramView != null) {
        paramView.setOnClickListener(new sa(this));
      }
    }
    
    public void a(a parama)
    {
      this.e = parama;
    }
    
    Ga e()
    {
      return ta.h();
    }
    
    boolean f()
    {
      return false;
    }
    
    static abstract interface a
    {
      public abstract void a(Context paramContext);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */