package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class dc
  extends YU
  implements cc
{
  public dc()
  {
    super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    boolean bool;
    switch (paramInt1)
    {
    default: 
      return false;
    case 29: 
      paramParcel1 = La();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 28: 
      wb();
      paramParcel2.writeNoException();
      break;
    case 27: 
      H();
      paramParcel2.writeNoException();
      break;
    case 26: 
      a(h.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 25: 
      a(k.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 24: 
      bool = Ma();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 23: 
      paramParcel1 = ab();
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
      break;
    case 22: 
      D();
      paramParcel2.writeNoException();
      break;
    case 21: 
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = null;
      }
      else
      {
        IInterface localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
        if ((localIInterface instanceof ac)) {
          paramParcel1 = (ac)localIInterface;
        } else {
          paramParcel1 = new bc(paramParcel1);
        }
      }
      a(paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 20: 
      paramParcel1 = getExtras();
      paramParcel2.writeNoException();
      ZU.b(paramParcel2, paramParcel1);
      break;
    case 19: 
      paramParcel1 = y();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 18: 
      paramParcel1 = G();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 17: 
      f((Bundle)ZU.a(paramParcel1, Bundle.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 16: 
      bool = d((Bundle)ZU.a(paramParcel1, Bundle.CREATOR));
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 15: 
      c((Bundle)ZU.a(paramParcel1, Bundle.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 14: 
      paramParcel1 = t();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 13: 
      destroy();
      paramParcel2.writeNoException();
      break;
    case 12: 
      paramParcel1 = s();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 11: 
      paramParcel1 = getVideoController();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
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
      paramParcel1 = N();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */