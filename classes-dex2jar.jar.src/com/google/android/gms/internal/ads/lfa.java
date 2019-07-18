package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class lfa
  extends XU
  implements jfa
{
  lfa(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
  }
  
  public final void a(String paramString1, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    b(1, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */