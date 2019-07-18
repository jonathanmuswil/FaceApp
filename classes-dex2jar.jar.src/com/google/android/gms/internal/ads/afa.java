package com.google.android.gms.internal.ads;

import Hq;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class afa
  extends XU
  implements _ea
{
  afa(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
  }
  
  public final IBinder c(Hq paramHq, String paramString, lf paramlf, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    localParcel.writeString(paramString);
    ZU.a(localParcel, paramlf);
    localParcel.writeInt(paramInt);
    paramString = a(1, localParcel);
    paramHq = paramString.readStrongBinder();
    paramString.recycle();
    return paramHq;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/afa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */