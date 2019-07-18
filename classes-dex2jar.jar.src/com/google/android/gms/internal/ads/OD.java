package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class od
  extends YU
  implements nd
{
  public static nd a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    if ((localIInterface instanceof nd)) {
      return (nd)localIInterface;
    }
    return new pd(paramIBinder);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/od.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */