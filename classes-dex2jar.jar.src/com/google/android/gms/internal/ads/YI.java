package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class yi
  extends YU
  implements xi
{
  public yi()
  {
    super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
  }
  
  public static xi a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    if ((localIInterface instanceof xi)) {
      return (xi)localIInterface;
    }
    return new zi(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 8: 
      o();
      break;
    case 7: 
      c(paramParcel1.readInt());
      break;
    case 6: 
      T();
      break;
    case 5: 
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = null;
      }
      else
      {
        IInterface localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        if ((localIInterface instanceof mi)) {
          paramParcel1 = (mi)localIInterface;
        } else {
          paramParcel1 = new oi(paramParcel1);
        }
      }
      a(paramParcel1);
      break;
    case 4: 
      ba();
      break;
    case 3: 
      n();
      break;
    case 2: 
      ca();
      break;
    case 1: 
      ia();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */