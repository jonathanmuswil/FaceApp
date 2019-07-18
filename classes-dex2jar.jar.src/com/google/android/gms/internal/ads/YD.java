package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class yd
  extends XU
  implements xd
{
  yd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
  }
  
  public final void Cb()
    throws RemoteException
  {
    b(1, a());
  }
  
  public final void h(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeInt(paramInt);
    b(2, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */