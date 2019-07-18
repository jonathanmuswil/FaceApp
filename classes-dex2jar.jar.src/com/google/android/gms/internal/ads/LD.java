package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class ld
  extends YU
  implements kd
{
  public ld()
  {
    super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
  }
  
  public static kd a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    if ((localIInterface instanceof kd)) {
      return (kd)localIInterface;
    }
    return new md(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3) {
        return false;
      }
      k(paramParcel1.readString());
    }
    else
    {
      Y();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */