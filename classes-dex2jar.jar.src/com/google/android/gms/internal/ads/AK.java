package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.k;

final class ak
  extends hk
{
  ak(Zj paramZj) {}
  
  public final void a()
  {
    ua localua = new ua(Zj.a(this.d), Zj.b(this.d).a);
    try
    {
      synchronized (Zj.c(this.d))
      {
        k.l();
        xa.a(Zj.d(this.d), localua);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Tl.c("Cannot config CSI reporter.", localIllegalArgumentException);
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */