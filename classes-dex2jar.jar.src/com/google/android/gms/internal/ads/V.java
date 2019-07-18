package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class v
  extends XU
  implements t
{
  v(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
  }
  
  public final void bb()
    throws RemoteException
  {
    b(1, a());
  }
  
  public final void d(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramBoolean);
    b(5, localParcel);
  }
  
  public final void ka()
    throws RemoteException
  {
    b(3, a());
  }
  
  public final void na()
    throws RemoteException
  {
    b(4, a());
  }
  
  public final void ra()
    throws RemoteException
  {
    b(2, a());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */