package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class pt
  implements sv, mca
{
  private final dL a;
  private final Uu b;
  private final AtomicBoolean c = new AtomicBoolean();
  
  public pt(dL paramdL, Uu paramUu)
  {
    this.a = paramdL;
    this.b = paramUu;
  }
  
  private final void k()
  {
    if (this.c.compareAndSet(false, true)) {
      this.b.K();
    }
  }
  
  public final void a(lca paramlca)
  {
    if ((this.a.e == 1) && (paramlca.m)) {
      k();
    }
  }
  
  public final void h()
  {
    try
    {
      if (this.a.e != 1) {
        k();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */