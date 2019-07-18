package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class hda
  extends XU
  implements gda
{
  hda(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
  }
  
  public final ada a(dda paramdda)
    throws RemoteException
  {
    Object localObject = a();
    ZU.a((Parcel)localObject, paramdda);
    paramdda = a(1, (Parcel)localObject);
    localObject = (ada)ZU.a(paramdda, ada.CREATOR);
    paramdda.recycle();
    return (ada)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */