package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;

public class bx
{
  private final Cx a;
  private final sp b;
  
  public bx(Cx paramCx)
  {
    this(paramCx, null);
  }
  
  public bx(Cx paramCx, sp paramsp)
  {
    this.a = paramCx;
    this.b = paramsp;
  }
  
  public final sp a()
  {
    return this.b;
  }
  
  public Set<Bw<Mu>> a(Gx paramGx)
  {
    return Collections.singleton(Bw.a(paramGx, Cm.b));
  }
  
  public final Cx b()
  {
    return this.a;
  }
  
  public final View c()
  {
    sp localsp = this.b;
    if (localsp == null) {
      return null;
    }
    return localsp.getWebView();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */