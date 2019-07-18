package com.google.android.gms.internal.ads;

import Hq.a;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class yf
  extends YU
  implements xf
{
  public yf()
  {
    super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    boolean bool;
    switch (paramInt1)
    {
    default: 
      return false;
    case 22: 
      a(Hq.a.a(paramParcel1.readStrongBinder()), Hq.a.a(paramParcel1.readStrongBinder()), Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 21: 
      paramParcel1 = y();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 20: 
      paramParcel1 = aa();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 19: 
      paramParcel1 = t();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 18: 
      paramParcel1 = da();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 17: 
      paramParcel1 = getVideoController();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 16: 
      a(Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 15: 
      paramParcel1 = getExtras();
      paramParcel2.writeNoException();
      ZU.b(paramParcel2, paramParcel1);
      break;
    case 14: 
      bool = ga();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 13: 
      bool = U();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 12: 
      e(Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 11: 
      b(Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 10: 
      A();
      paramParcel2.writeNoException();
      break;
    case 9: 
      paramParcel1 = F();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 8: 
      paramParcel1 = O();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 7: 
      double d = J();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      break;
    case 6: 
      paramParcel1 = v();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 5: 
      paramParcel1 = E();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 4: 
      paramParcel1 = x();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 3: 
      paramParcel1 = z();
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
      break;
    case 2: 
      paramParcel1 = u();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */