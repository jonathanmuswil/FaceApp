package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class mf
  extends YU
  implements lf
{
  public mf()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
  }
  
  public static lf a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    if ((localIInterface instanceof lf)) {
      return (lf)localIInterface;
    }
    return new nf(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          return false;
        }
        paramParcel1 = m(paramParcel1.readString());
        paramParcel2.writeNoException();
        ZU.a(paramParcel2, paramParcel1);
      }
      else
      {
        boolean bool = y(paramParcel1.readString());
        paramParcel2.writeNoException();
        ZU.a(paramParcel2, bool);
      }
    }
    else
    {
      paramParcel1 = v(paramParcel1.readString());
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */