package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class ni
  extends YU
  implements mi
{
  public ni()
  {
    super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramInt1 = I();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
    }
    else
    {
      paramParcel1 = getType();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */