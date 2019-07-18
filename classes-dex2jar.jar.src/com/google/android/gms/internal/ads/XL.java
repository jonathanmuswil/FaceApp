package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;

@yh
public final class xl
{
  private long a;
  private long b = Long.MIN_VALUE;
  private final Object c = new Object();
  
  public xl(long paramLong)
  {
    this.a = paramLong;
  }
  
  public final void a(long paramLong)
  {
    synchronized (this.c)
    {
      this.a = paramLong;
      return;
    }
  }
  
  public final boolean a()
  {
    synchronized (this.c)
    {
      long l = k.j().b();
      if (this.b + this.a > l) {
        return false;
      }
      this.b = l;
      return true;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */