package com.google.android.gms.internal.ads;

import Hq;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class gh
  extends XU
  implements fh
{
  gh(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
  }
  
  public final IBinder C(Hq paramHq)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    localParcel = a(1, localParcel);
    paramHq = localParcel.readStrongBinder();
    localParcel.recycle();
    return paramHq;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */