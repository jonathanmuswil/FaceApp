package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.k;

@yh
public final class wl
  extends hk
{
  private final Xl d;
  private final String e;
  
  public wl(Context paramContext, String paramString1, String paramString2)
  {
    this(paramString2, k.c().b(paramContext, paramString1));
  }
  
  private wl(String paramString1, String paramString2)
  {
    this.d = new Xl(paramString2);
    this.e = paramString1;
  }
  
  public final void a()
  {
    this.d.a(this.e);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */