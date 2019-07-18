package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class l
  extends XU
  implements j
{
  l(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
  }
  
  public final String Ia()
    throws RemoteException
  {
    Parcel localParcel = a(2, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String eb()
    throws RemoteException
  {
    Parcel localParcel = a(1, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */