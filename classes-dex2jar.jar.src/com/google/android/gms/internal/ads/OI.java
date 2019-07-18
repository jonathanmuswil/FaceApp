package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class oi
  extends XU
  implements mi
{
  oi(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
  }
  
  public final int I()
    throws RemoteException
  {
    Parcel localParcel = a(2, a());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final String getType()
    throws RemoteException
  {
    Parcel localParcel = a(1, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */