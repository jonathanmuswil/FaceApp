package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class rfa
  extends XU
  implements pfa
{
  rfa(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
  }
  
  public final long getValue()
    throws RemoteException
  {
    Parcel localParcel = a(1, a());
    long l = localParcel.readLong();
    localParcel.recycle();
    return l;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */