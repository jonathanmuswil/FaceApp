package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class q
{
  private final r<?> a;
  
  private q(r<?> paramr)
  {
    this.a = paramr;
  }
  
  public static q a(r<?> paramr)
  {
    return new q(paramr);
  }
  
  public l a(String paramString)
  {
    return this.a.e.b(paramString);
  }
  
  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.a.e.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void a()
  {
    this.a.e.g();
  }
  
  public void a(Configuration paramConfiguration)
  {
    this.a.e.a(paramConfiguration);
  }
  
  public void a(Parcelable paramParcelable, A paramA)
  {
    this.a.e.a(paramParcelable, paramA);
  }
  
  public void a(l paraml)
  {
    r localr = this.a;
    localr.e.a(localr, localr, paraml);
  }
  
  public void a(Menu paramMenu)
  {
    this.a.e.a(paramMenu);
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.e.a(paramBoolean);
  }
  
  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    return this.a.e.a(paramMenu, paramMenuInflater);
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    return this.a.e.a(paramMenuItem);
  }
  
  public void b()
  {
    this.a.e.h();
  }
  
  public void b(boolean paramBoolean)
  {
    this.a.e.b(paramBoolean);
  }
  
  public boolean b(Menu paramMenu)
  {
    return this.a.e.b(paramMenu);
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    return this.a.e.b(paramMenuItem);
  }
  
  public void c()
  {
    this.a.e.i();
  }
  
  public void d()
  {
    this.a.e.k();
  }
  
  public void e()
  {
    this.a.e.l();
  }
  
  public void f()
  {
    this.a.e.m();
  }
  
  public void g()
  {
    this.a.e.n();
  }
  
  public void h()
  {
    this.a.e.o();
  }
  
  public boolean i()
  {
    return this.a.e.q();
  }
  
  public s j()
  {
    return this.a.d();
  }
  
  public void k()
  {
    this.a.e.t();
  }
  
  public A l()
  {
    return this.a.e.v();
  }
  
  public Parcelable m()
  {
    return this.a.e.w();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */