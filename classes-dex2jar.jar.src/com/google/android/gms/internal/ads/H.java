package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class h
  extends YU
  implements g
{
  public static g a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    if ((localIInterface instanceof g)) {
      return (g)localIInterface;
    }
    return new i(paramIBinder);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */