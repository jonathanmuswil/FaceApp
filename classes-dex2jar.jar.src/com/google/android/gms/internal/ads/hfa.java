package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class hfa
  extends YU
  implements gfa
{
  public hfa()
  {
    super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
  }
  
  public static gfa a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    if ((localIInterface instanceof gfa)) {
      return (gfa)localIInterface;
    }
    return new ifa(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      qa();
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */