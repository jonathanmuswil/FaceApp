package com.google.android.gms.internal.ads;

import Hq;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class wi
  extends XU
  implements vi
{
  wi(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
  }
  
  public final IBinder b(Hq paramHq, lf paramlf, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramlf);
    localParcel.writeInt(paramInt);
    paramlf = a(1, localParcel);
    paramHq = paramlf.readStrongBinder();
    paramlf.recycle();
    return paramHq;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */