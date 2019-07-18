package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class og
  extends XU
  implements mg
{
  og(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
  }
  
  public final void d(String paramString)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString);
    b(2, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/og.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */