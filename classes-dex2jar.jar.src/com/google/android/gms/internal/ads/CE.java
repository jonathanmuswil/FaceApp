package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

@yh
public final class ce
{
  private final Object a = new Object();
  private final Context b;
  private final String c;
  private final Yl d;
  private cl<Rd> e;
  private cl<Rd> f;
  private we g;
  private int h = 1;
  
  public ce(Context paramContext, Yl paramYl, String paramString)
  {
    this.c = paramString;
    this.b = paramContext.getApplicationContext();
    this.d = paramYl;
    this.e = new qe();
    this.f = new qe();
  }
  
  public ce(Context paramContext, Yl paramYl, String paramString, cl<Rd> paramcl1, cl<Rd> paramcl2)
  {
    this(paramContext, paramYl, paramString);
    this.e = paramcl1;
    this.f = paramcl2;
  }
  
  protected final we a(hP paramhP)
  {
    we localwe = new we(this.f);
    Cm.a.execute(new de(this, paramhP, localwe));
    localwe.a(new ne(this, localwe), new oe(this, localwe));
    return localwe;
  }
  
  public final re b(hP arg1)
  {
    synchronized (this.a)
    {
      synchronized (this.a)
      {
        if ((this.g != null) && (this.h == 0))
        {
          Object localObject3 = ra.i;
          if (((Boolean)Kea.e().a((ga)localObject3)).booleanValue())
          {
            we localwe = this.g;
            localObject3 = new com/google/android/gms/internal/ads/ee;
            ((ee)localObject3).<init>(this);
            localwe.a((Lm)localObject3, fe.a);
          }
        }
        if ((this.g != null) && (this.g.a() != -1))
        {
          if (this.h == 0)
          {
            ??? = this.g.c();
            return (re)???;
          }
          if (this.h == 1)
          {
            this.h = 2;
            a(null);
            ??? = this.g.c();
            return (re)???;
          }
          if (this.h == 2)
          {
            ??? = this.g.c();
            return (re)???;
          }
          ??? = this.g.c();
          return (re)???;
        }
        this.h = 2;
        this.g = a(null);
        ??? = this.g.c();
        return (re)???;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */