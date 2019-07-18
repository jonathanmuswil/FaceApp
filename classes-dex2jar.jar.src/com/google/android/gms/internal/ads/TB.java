package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class tb
  extends YU
  implements sb
{
  public tb()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 19: 
      paramParcel1 = s();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 18: 
      paramParcel1 = y();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 17: 
      paramParcel1 = t();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 16: 
      f((Bundle)ZU.a(paramParcel1, Bundle.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 15: 
      boolean bool = d((Bundle)ZU.a(paramParcel1, Bundle.CREATOR));
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 14: 
      c((Bundle)ZU.a(paramParcel1, Bundle.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 13: 
      paramParcel1 = getVideoController();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 12: 
      destroy();
      paramParcel2.writeNoException();
      break;
    case 11: 
      paramParcel1 = getExtras();
      paramParcel2.writeNoException();
      ZU.b(paramParcel2, paramParcel1);
      break;
    case 10: 
      paramParcel1 = F();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 9: 
      paramParcel1 = O();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 8: 
      double d = J();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      break;
    case 7: 
      paramParcel1 = v();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 6: 
      paramParcel1 = E();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 5: 
      paramParcel1 = x();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 4: 
      paramParcel1 = z();
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
      break;
    case 3: 
      paramParcel1 = u();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 2: 
      paramParcel1 = G();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */