package com.google.android.gms.internal.ads;

import Hq;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class ffa
  extends XU
  implements efa
{
  ffa(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
  }
  
  public final IBinder a(Hq paramHq, xea paramxea, String paramString, lf paramlf, int paramInt1, int paramInt2)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramxea);
    localParcel.writeString(paramString);
    ZU.a(localParcel, paramlf);
    localParcel.writeInt(paramInt1);
    localParcel.writeInt(paramInt2);
    paramxea = a(2, localParcel);
    paramHq = paramxea.readStrongBinder();
    paramxea.recycle();
    return paramHq;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ffa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */