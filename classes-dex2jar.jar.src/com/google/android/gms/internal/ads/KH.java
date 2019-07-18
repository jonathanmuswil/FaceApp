package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class kh
  extends YU
  implements jh
{
  public static jh a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
    if ((localIInterface instanceof jh)) {
      return (jh)localIInterface;
    }
    return new lh(paramIBinder);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */