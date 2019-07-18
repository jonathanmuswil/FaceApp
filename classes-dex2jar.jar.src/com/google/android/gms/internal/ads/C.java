package com.google.android.gms.internal.ads;

import Hq.a;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class c
  extends YU
  implements sfa
{
  public c()
  {
    super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 13: 
      paramParcel1 = Oa();
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      break;
    case 12: 
      a(od.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 11: 
      a(mf.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 10: 
      l(paramParcel1.readString());
      paramParcel2.writeNoException();
      break;
    case 9: 
      paramParcel1 = Ra();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 8: 
      boolean bool = Sa();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 7: 
      float f = cb();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 6: 
      a(paramParcel1.readString(), Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 5: 
      b(Hq.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      break;
    case 4: 
      f(ZU.a(paramParcel1));
      paramParcel2.writeNoException();
      break;
    case 3: 
      t(paramParcel1.readString());
      paramParcel2.writeNoException();
      break;
    case 2: 
      a(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      break;
    case 1: 
      M();
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */