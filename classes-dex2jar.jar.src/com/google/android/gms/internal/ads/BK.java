package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;

final class bk
{
  private final Object a = new Object();
  private volatile int b = ck.a;
  private volatile long c = 0L;
  
  public final void a()
  {
    long l1 = k.j().a();
    synchronized (this.a)
    {
      if (this.b == ck.b)
      {
        l2 = this.c;
        ??? = ra.Ge;
        if (l2 + ((Long)Kea.e().a((ga)???)).longValue() <= l1) {
          this.b = ck.a;
        }
      }
      long l2 = k.j().a();
      synchronized (this.a)
      {
        if (this.b != 2) {
          return;
        }
        this.b = 3;
        if (this.b == ck.b) {
          this.c = l2;
        }
        return;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */