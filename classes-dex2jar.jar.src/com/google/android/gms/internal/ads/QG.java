package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class qg
  extends YU
  implements pg
{
  public qg()
  {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3) {
        return false;
      }
      d(paramParcel1.readString());
    }
    else
    {
      ua();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */