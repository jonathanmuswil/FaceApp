package com.google.android.gms.internal.ads;

import Hq;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class _b
  extends XU
  implements Xb
{
  _b(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
  }
  
  public final boolean p(Hq paramHq)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    paramHq = a(2, localParcel);
    boolean bool = ZU.a(paramHq);
    paramHq.recycle();
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */