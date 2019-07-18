package com.google.android.gms.internal.ads;

import Hq;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class f
  extends XU
  implements e
{
  f(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
  }
  
  public final IBinder e(Hq paramHq, int paramInt)
    throws RemoteException
  {
    Object localObject = a();
    ZU.a((Parcel)localObject, paramHq);
    ((Parcel)localObject).writeInt(paramInt);
    paramHq = a(1, (Parcel)localObject);
    localObject = paramHq.readStrongBinder();
    paramHq.recycle();
    return (IBinder)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */