package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class cfa
  extends YU
  implements bfa
{
  public cfa()
  {
    super("com.google.android.gms.ads.internal.client.IAdManager");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    IInterface localIInterface = null;
    boolean bool;
    switch (paramInt1)
    {
    case 16: 
    case 17: 
    case 27: 
    case 28: 
    default: 
      return false;
    case 38: 
      p(paramParcel1.readString());
      paramParcel2.writeNoException();
      break;
    case 37: 
      paramParcel1 = P();
      paramParcel2.writeNoException();
      ZU.b(paramParcel2, paramParcel1);
      break;
    case 36: 
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = localIInterface;
      }
      else
      {
        localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        if ((localIInterface instanceof gfa)) {
          paramParcel1 = (gfa)localIInterface;
        } else {
          paramParcel1 = new ifa(paramParcel1);
        }
      }
      a(paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 35: 
      paramParcel1 = ma();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 34: 
      a(ZU.a(paramParcel1));
      paramParcel2.writeNoException();
      break;
    case 33: 
      paramParcel1 = lb();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 32: 
      paramParcel1 = db();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 31: 
      paramParcel1 = tb();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 30: 
      a((w)ZU.a(paramParcel1, w.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 29: 
      a((aa)ZU.a(paramParcel1, aa.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 26: 
      paramParcel1 = getVideoController();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 25: 
      h(paramParcel1.readString());
      paramParcel2.writeNoException();
      break;
    case 24: 
      a(yi.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 23: 
      bool = pa();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 22: 
      e(ZU.a(paramParcel1));
      paramParcel2.writeNoException();
      break;
    case 21: 
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = (Parcel)localObject1;
      }
      else
      {
        localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        if ((localIInterface instanceof pfa)) {
          paramParcel1 = (pfa)localIInterface;
        } else {
          paramParcel1 = new rfa(paramParcel1);
        }
      }
      a(paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 20: 
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = (Parcel)localObject2;
      }
      else
      {
        localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
        if ((localIInterface instanceof Nea)) {
          paramParcel1 = (Nea)localIInterface;
        } else {
          paramParcel1 = new Pea(paramParcel1);
        }
      }
      a(paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 19: 
      a(Na.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 18: 
      paramParcel1 = s();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 15: 
      a(oh.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      break;
    case 14: 
      a(kh.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 13: 
      a((xea)ZU.a(paramParcel1, xea.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 12: 
      paramParcel1 = nb();
      paramParcel2.writeNoException();
      ZU.b(paramParcel2, paramParcel1);
      break;
    case 11: 
      vb();
      paramParcel2.writeNoException();
      break;
    case 10: 
      Xa();
      paramParcel2.writeNoException();
      break;
    case 9: 
      showInterstitial();
      paramParcel2.writeNoException();
      break;
    case 8: 
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = (Parcel)localObject3;
      }
      else
      {
        localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if ((localIInterface instanceof jfa)) {
          paramParcel1 = (jfa)localIInterface;
        } else {
          paramParcel1 = new lfa(paramParcel1);
        }
      }
      a(paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 7: 
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = (Parcel)localObject4;
      }
      else
      {
        localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
        if ((localIInterface instanceof Qea)) {
          paramParcel1 = (Qea)localIInterface;
        } else {
          paramParcel1 = new Sea(paramParcel1);
        }
      }
      a(paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 6: 
      R();
      paramParcel2.writeNoException();
      break;
    case 5: 
      pause();
      paramParcel2.writeNoException();
      break;
    case 4: 
      bool = b((sea)ZU.a(paramParcel1, sea.CREATOR));
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 3: 
      bool = w();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 2: 
      destroy();
      paramParcel2.writeNoException();
      break;
    case 1: 
      paramParcel1 = wa();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */