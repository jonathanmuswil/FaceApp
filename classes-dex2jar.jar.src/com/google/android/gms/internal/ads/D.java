package com.google.android.gms.internal.ads;

import Hq;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class d
  extends XU
  implements sfa
{
  d(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
  }
  
  public final void M()
    throws RemoteException
  {
    b(1, a());
  }
  
  public final void a(lf paramlf)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramlf);
    b(11, localParcel);
  }
  
  public final void a(String paramString, Hq paramHq)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString);
    ZU.a(localParcel, paramHq);
    b(6, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */