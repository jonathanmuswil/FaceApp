package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class k
  extends YU
  implements j
{
  public k()
  {
    super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
  }
  
  public static j a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    if ((localIInterface instanceof j)) {
      return (j)localIInterface;
    }
    return new l(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramParcel1 = Ia();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    else
    {
      paramParcel1 = eb();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */