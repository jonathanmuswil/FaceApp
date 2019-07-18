package com.google.android.gms.internal.ads;

import Hq.a;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class hg
  extends YU
  implements gg
{
  public hg()
  {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      d(paramParcel1.readString());
    }
    else
    {
      g(Hq.a.a(paramParcel1.readStrongBinder()));
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */