package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class bd
  extends XU
  implements ad
{
  bd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
  }
  
  public final void a(Uc paramUc, Zc paramZc)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramUc);
    ZU.a(localParcel, paramZc);
    c(2, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */