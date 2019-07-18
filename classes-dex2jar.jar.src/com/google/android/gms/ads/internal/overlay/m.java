package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.internal.ads.Yl;
import com.google.android.gms.internal.ads.kea;
import com.google.android.gms.internal.ads.vk;
import com.google.android.gms.internal.ads.yh;

@yh
public final class m
{
  public static void a(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel, boolean paramBoolean)
  {
    if ((paramAdOverlayInfoParcel.k == 4) && (paramAdOverlayInfoParcel.c == null))
    {
      localObject = paramAdOverlayInfoParcel.b;
      if (localObject != null) {
        ((kea)localObject).l();
      }
      k.a();
      a.a(paramContext, paramAdOverlayInfoParcel.a, paramAdOverlayInfoParcel.i);
      return;
    }
    Object localObject = new Intent();
    ((Intent)localObject).setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    ((Intent)localObject).putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", paramAdOverlayInfoParcel.m.d);
    ((Intent)localObject).putExtra("shouldCallOnOverlayOpened", paramBoolean);
    AdOverlayInfoParcel.a((Intent)localObject, paramAdOverlayInfoParcel);
    if (!com.google.android.gms.common.util.m.h()) {
      ((Intent)localObject).addFlags(524288);
    }
    if (!(paramContext instanceof Activity)) {
      ((Intent)localObject).addFlags(268435456);
    }
    k.c();
    vk.a(paramContext, (Intent)localObject);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */