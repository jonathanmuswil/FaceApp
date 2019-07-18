package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class oh
  extends YU
  implements nh
{
  public static nh a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
    if ((localIInterface instanceof nh)) {
      return (nh)localIInterface;
    }
    return new ph(paramIBinder);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */