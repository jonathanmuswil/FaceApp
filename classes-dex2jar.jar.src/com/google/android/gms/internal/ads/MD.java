package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class md
  extends XU
  implements kd
{
  md(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
  }
  
  public final void k(String paramString)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString);
    b(3, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/md.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */