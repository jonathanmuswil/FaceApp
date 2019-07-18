package com.google.android.gms.internal.ads;

import Hq;
import Hq.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class wd
  extends YU
  implements vd
{
  public wd()
  {
    super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 3)
    {
      if (paramInt1 != 4)
      {
        if (paramInt1 != 5) {
          return false;
        }
        Hq localHq = Hq.a.a(paramParcel1.readStrongBinder());
        IBinder localIBinder = paramParcel1.readStrongBinder();
        if (localIBinder == null)
        {
          paramParcel1 = null;
        }
        else
        {
          paramParcel1 = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
          if ((paramParcel1 instanceof xd)) {
            paramParcel1 = (xd)paramParcel1;
          } else {
            paramParcel1 = new yd(localIBinder);
          }
        }
        a(localHq, paramParcel1);
        paramParcel2.writeNoException();
      }
      else
      {
        destroy();
        paramParcel2.writeNoException();
      }
    }
    else
    {
      paramParcel1 = getVideoController();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */