package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.e;
import lK;

abstract class c
{
  private static volatile Handler a;
  private final ya b;
  private final Runnable c;
  private volatile long d;
  
  c(ya paramya)
  {
    t.a(paramya);
    this.b = paramya;
    this.c = new d(this, paramya);
  }
  
  private final Handler d()
  {
    if (a != null) {
      return a;
    }
    try
    {
      if (a == null)
      {
        localObject1 = new lK;
        ((lK)localObject1).<init>(this.b.getContext().getMainLooper());
        a = (Handler)localObject1;
      }
      Object localObject1 = a;
      return (Handler)localObject1;
    }
    finally {}
  }
  
  final void a()
  {
    this.d = 0L;
    d().removeCallbacks(this.c);
  }
  
  public final void a(long paramLong)
  {
    a();
    if (paramLong >= 0L)
    {
      this.d = this.b.b().a();
      if (!d().postDelayed(this.c, paramLong)) {
        this.b.c().s().a("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
  
  public abstract void b();
  
  public final boolean c()
  {
    return this.d != 0L;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */