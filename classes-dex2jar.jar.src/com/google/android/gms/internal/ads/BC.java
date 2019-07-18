package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class bc
  extends XU
  implements ac
{
  bc(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
  }
  
  public final void Ab()
    throws RemoteException
  {
    b(2, a());
  }
  
  public final void s(String paramString)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString);
    b(1, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */