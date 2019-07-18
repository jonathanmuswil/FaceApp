package com.google.android.gms.internal.ads;

import Hq.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class si
  extends YU
  implements ri
{
  public si()
  {
    super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
  }
  
  public static ri a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    if ((localIInterface instanceof ri)) {
      return (ri)localIInterface;
    }
    return new ti(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        Object localObject = null;
        IInterface localIInterface = null;
        if (paramInt1 != 3)
        {
          if (paramInt1 != 34)
          {
            switch (paramInt1)
            {
            default: 
              return false;
            case 19: 
              w(paramParcel1.readString());
              paramParcel2.writeNoException();
              break;
            case 18: 
              x(Hq.a.a(paramParcel1.readStrongBinder()));
              paramParcel2.writeNoException();
              break;
            case 17: 
              u(paramParcel1.readString());
              paramParcel2.writeNoException();
              break;
            case 16: 
              paramParcel1 = paramParcel1.readStrongBinder();
              if (paramParcel1 == null)
              {
                paramParcel1 = localIInterface;
              }
              else
              {
                localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                if ((localIInterface instanceof pi)) {
                  paramParcel1 = (pi)localIInterface;
                } else {
                  paramParcel1 = new qi(paramParcel1);
                }
              }
              a(paramParcel1);
              paramParcel2.writeNoException();
              break;
            case 15: 
              paramParcel1 = P();
              paramParcel2.writeNoException();
              ZU.b(paramParcel2, paramParcel1);
              break;
            case 14: 
              a(hfa.a(paramParcel1.readStrongBinder()));
              paramParcel2.writeNoException();
              break;
            case 13: 
              h(paramParcel1.readString());
              paramParcel2.writeNoException();
              break;
            case 12: 
              paramParcel1 = s();
              paramParcel2.writeNoException();
              paramParcel2.writeString(paramParcel1);
              break;
            case 11: 
              l(Hq.a.a(paramParcel1.readStrongBinder()));
              paramParcel2.writeNoException();
              break;
            case 10: 
              D(Hq.a.a(paramParcel1.readStrongBinder()));
              paramParcel2.writeNoException();
              break;
            case 9: 
              H(Hq.a.a(paramParcel1.readStrongBinder()));
              paramParcel2.writeNoException();
              break;
            case 8: 
              destroy();
              paramParcel2.writeNoException();
              break;
            case 7: 
              R();
              paramParcel2.writeNoException();
              break;
            case 6: 
              pause();
              paramParcel2.writeNoException();
              break;
            case 5: 
              boolean bool = oa();
              paramParcel2.writeNoException();
              ZU.a(paramParcel2, bool);
              break;
            }
          }
          else
          {
            a(ZU.a(paramParcel1));
            paramParcel2.writeNoException();
          }
        }
        else
        {
          paramParcel1 = paramParcel1.readStrongBinder();
          if (paramParcel1 == null)
          {
            paramParcel1 = (Parcel)localObject;
          }
          else
          {
            localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
            if ((localIInterface instanceof xi)) {
              paramParcel1 = (xi)localIInterface;
            } else {
              paramParcel1 = new zi(paramParcel1);
            }
          }
          a(paramParcel1);
          paramParcel2.writeNoException();
        }
      }
      else
      {
        K();
        paramParcel2.writeNoException();
      }
    }
    else
    {
      a((Di)ZU.a(paramParcel1, Di.CREATOR));
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/si.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */