package com.google.android.gms.internal.ads;

import Hq.a;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class pb
  extends YU
  implements ob
{
  public pb()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
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
        d(Hq.a.a(paramParcel1.readStrongBinder()));
      }
      else
      {
        mb();
      }
    }
    else {
      c(Hq.a.a(paramParcel1.readStrongBinder()));
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */