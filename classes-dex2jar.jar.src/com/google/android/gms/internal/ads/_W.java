package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.k;

public final class _w
  extends Ct
{
  private final Context f;
  private final rw g;
  private final Cx h;
  private final Vt i;
  private final HM j;
  private boolean k = false;
  
  _w(Context paramContext, Zu paramZu, rw paramrw, Cx paramCx, Vt paramVt, HM paramHM)
  {
    this.f = paramContext;
    this.c = paramZu;
    this.g = paramrw;
    this.h = paramCx;
    this.i = paramVt;
    this.j = paramHM;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.g.J();
    this.h.a(paramBoolean, this.f);
    this.k = true;
  }
  
  public final boolean f()
  {
    return this.i.a();
  }
  
  public final Zu g()
  {
    return this.c;
  }
  
  public final boolean h()
  {
    ga localga = ra.La;
    if (((Boolean)Kea.e().a(localga)).booleanValue())
    {
      k.c();
      if (vk.g(this.f))
      {
        Tl.d("It is not recommended to show an interstitial when app is not in foreground.");
        localga = ra.Ma;
        if (((Boolean)Kea.e().a(localga)).booleanValue()) {
          this.j.a(this.a.b.b.b);
        }
        return false;
      }
    }
    return !this.k;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */