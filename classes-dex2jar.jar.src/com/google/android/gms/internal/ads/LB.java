package com.google.android.gms.internal.ads;

import Hq.a;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class lb
  extends YU
  implements kb
{
  public lb()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 6: 
      d(Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 5: 
      a(Hq.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      break;
    case 4: 
      destroy();
      paramParcel2.writeNoException();
      break;
    case 3: 
      c(Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 2: 
      paramParcel1 = q(paramParcel1.readString());
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 1: 
      b(paramParcel1.readString(), Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */