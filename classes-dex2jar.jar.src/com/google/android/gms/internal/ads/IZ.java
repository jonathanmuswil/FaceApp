package com.google.android.gms.internal.ads;

import gd;

public final class iz
  implements Xu
{
  private final xy a;
  private final By b;
  
  public iz(xy paramxy, By paramBy)
  {
    this.a = paramxy;
    this.b = paramBy;
  }
  
  public final void k()
  {
    if (this.a.t() == null) {
      return;
    }
    Object localObject = this.a.s();
    sp localsp = this.a.r();
    if (localObject == null) {
      if (localsp != null) {
        localObject = localsp;
      } else {
        localObject = null;
      }
    }
    if ((this.b.d()) && (localObject != null)) {
      ((Dd)localObject).a("onSdkImpression", new gd());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/iz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */