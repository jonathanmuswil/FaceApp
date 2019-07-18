package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class u
  extends YU
  implements t
{
  public u()
  {
    super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
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
            d(ZU.a(paramParcel1));
          }
          else
          {
            na();
          }
        }
        else {
          ka();
        }
      }
      else {
        ra();
      }
    }
    else {
      bb();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */