package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class hb
  extends YU
  implements gb
{
  public hb()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
  }
  
  public static gb a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    if ((localIInterface instanceof gb)) {
      return (gb)localIInterface;
    }
    return new ib(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3)
        {
          if (paramInt1 != 4)
          {
            if (paramInt1 != 5) {
              return false;
            }
            paramInt1 = getHeight();
            paramParcel2.writeNoException();
            paramParcel2.writeInt(paramInt1);
          }
          else
          {
            paramInt1 = getWidth();
            paramParcel2.writeNoException();
            paramParcel2.writeInt(paramInt1);
          }
        }
        else
        {
          double d = Ua();
          paramParcel2.writeNoException();
          paramParcel2.writeDouble(d);
        }
      }
      else
      {
        paramParcel1 = getUri();
        paramParcel2.writeNoException();
        ZU.b(paramParcel2, paramParcel1);
      }
    }
    else
    {
      paramParcel1 = _a();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */