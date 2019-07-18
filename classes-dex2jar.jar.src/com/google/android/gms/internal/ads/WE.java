package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.t;

public final class we
  extends Mm<Rd>
{
  private final Object c = new Object();
  private cl<Rd> d;
  private boolean e;
  private int f;
  
  public we(cl<Rd> paramcl)
  {
    this.d = paramcl;
    this.e = false;
    this.f = 0;
  }
  
  private final void f()
  {
    synchronized (this.c)
    {
      boolean bool;
      if (this.f >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      t.b(bool);
      if ((this.e) && (this.f == 0))
      {
        mk.f("No reference is left (including root). Cleaning up engine.");
        ze localze = new com/google/android/gms/internal/ads/ze;
        localze.<init>(this);
        Km localKm = new com/google/android/gms/internal/ads/Km;
        localKm.<init>();
        a(localze, localKm);
      }
      else
      {
        mk.f("There are still references to the engine. Not destroying.");
      }
      return;
    }
  }
  
  public final re c()
  {
    re localre = new re(this);
    synchronized (this.c)
    {
      xe localxe = new com/google/android/gms/internal/ads/xe;
      localxe.<init>(this, localre);
      ye localye = new com/google/android/gms/internal/ads/ye;
      localye.<init>(this, localre);
      a(localxe, localye);
      boolean bool;
      if (this.f >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      t.b(bool);
      this.f += 1;
      return localre;
    }
  }
  
  protected final void d()
  {
    synchronized (this.c)
    {
      boolean bool;
      if (this.f > 0) {
        bool = true;
      } else {
        bool = false;
      }
      t.b(bool);
      mk.f("Releasing 1 reference for JS Engine");
      this.f -= 1;
      f();
      return;
    }
  }
  
  public final void e()
  {
    synchronized (this.c)
    {
      boolean bool;
      if (this.f >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      t.b(bool);
      mk.f("Releasing root reference. JS Engine will be destroyed once other references are released.");
      this.e = true;
      f();
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/we.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */