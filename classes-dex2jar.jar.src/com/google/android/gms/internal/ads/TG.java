package com.google.android.gms.internal.ads;

import Hq;
import Hq.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class tg
  extends YU
  implements sg
{
  public tg()
  {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
  }
  
  public static sg a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    if ((localIInterface instanceof sg)) {
      return (sg)localIInterface;
    }
    return new ug(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5;
    Object localObject6;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3)
        {
          if (paramInt1 != 5)
          {
            if (paramInt1 != 10)
            {
              if (paramInt1 != 11)
              {
                boolean bool;
                switch (paramInt1)
                {
                default: 
                  return false;
                case 18: 
                  localObject1 = paramParcel1.readString();
                  localObject3 = paramParcel1.readString();
                  localObject5 = (sea)ZU.a(paramParcel1, sea.CREATOR);
                  localObject2 = Hq.a.a(paramParcel1.readStrongBinder());
                  localObject6 = paramParcel1.readStrongBinder();
                  if (localObject6 != null) {
                    for (;;)
                    {
                      localObject4 = ((IBinder)localObject6).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                      if ((localObject4 instanceof mg)) {
                        localObject4 = (mg)localObject4;
                      } else {
                        localObject4 = new og((IBinder)localObject6);
                      }
                    }
                  }
                  a((String)localObject1, (String)localObject3, (sea)localObject5, (Hq)localObject2, (mg)localObject4, sf.a(paramParcel1.readStrongBinder()));
                  paramParcel2.writeNoException();
                  break;
                case 17: 
                  bool = o(Hq.a.a(paramParcel1.readStrongBinder()));
                  paramParcel2.writeNoException();
                  ZU.a(paramParcel2, bool);
                  break;
                case 16: 
                  localObject3 = paramParcel1.readString();
                  localObject6 = paramParcel1.readString();
                  localObject5 = (sea)ZU.a(paramParcel1, sea.CREATOR);
                  localObject2 = Hq.a.a(paramParcel1.readStrongBinder());
                  localObject4 = paramParcel1.readStrongBinder();
                  if (localObject4 == null) {
                    localObject4 = localObject1;
                  }
                  for (;;)
                  {
                    break;
                    localObject1 = ((IBinder)localObject4).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    if ((localObject1 instanceof pg)) {
                      localObject4 = (pg)localObject1;
                    } else {
                      localObject4 = new rg((IBinder)localObject4);
                    }
                  }
                  a((String)localObject3, (String)localObject6, (sea)localObject5, (Hq)localObject2, (pg)localObject4, sf.a(paramParcel1.readStrongBinder()));
                  paramParcel2.writeNoException();
                  break;
                case 15: 
                  bool = n(Hq.a.a(paramParcel1.readStrongBinder()));
                  paramParcel2.writeNoException();
                  ZU.a(paramParcel2, bool);
                  break;
                case 14: 
                  localObject3 = paramParcel1.readString();
                  localObject1 = paramParcel1.readString();
                  localObject5 = (sea)ZU.a(paramParcel1, sea.CREATOR);
                  localObject6 = Hq.a.a(paramParcel1.readStrongBinder());
                  localObject4 = paramParcel1.readStrongBinder();
                  if (localObject4 == null) {
                    localObject4 = localObject2;
                  }
                  for (;;)
                  {
                    break;
                    localObject2 = ((IBinder)localObject4).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if ((localObject2 instanceof jg)) {
                      localObject4 = (jg)localObject2;
                    } else {
                      localObject4 = new lg((IBinder)localObject4);
                    }
                  }
                  a((String)localObject3, (String)localObject1, (sea)localObject5, (Hq)localObject6, (jg)localObject4, sf.a(paramParcel1.readStrongBinder()));
                  paramParcel2.writeNoException();
                  break;
                case 13: 
                  localObject5 = paramParcel1.readString();
                  localObject1 = paramParcel1.readString();
                  localObject6 = (sea)ZU.a(paramParcel1, sea.CREATOR);
                  localObject2 = Hq.a.a(paramParcel1.readStrongBinder());
                  localObject4 = paramParcel1.readStrongBinder();
                  if (localObject4 == null) {
                    localObject4 = localObject3;
                  }
                  for (;;)
                  {
                    break;
                    localObject3 = ((IBinder)localObject4).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    if ((localObject3 instanceof gg)) {
                      localObject4 = (gg)localObject3;
                    } else {
                      localObject4 = new ig((IBinder)localObject4);
                    }
                  }
                  a((String)localObject5, (String)localObject1, (sea)localObject6, (Hq)localObject2, (gg)localObject4, sf.a(paramParcel1.readStrongBinder()), (xea)ZU.a(paramParcel1, xea.CREATOR));
                  paramParcel2.writeNoException();
                  break;
                }
              }
              else
              {
                a(paramParcel1.createStringArray(), (Bundle[])paramParcel1.createTypedArray(Bundle.CREATOR));
                paramParcel2.writeNoException();
              }
            }
            else
            {
              r(Hq.a.a(paramParcel1.readStrongBinder()));
              paramParcel2.writeNoException();
            }
          }
          else
          {
            paramParcel1 = getVideoController();
            paramParcel2.writeNoException();
            ZU.a(paramParcel2, paramParcel1);
          }
        }
        else
        {
          paramParcel1 = hb();
          paramParcel2.writeNoException();
          ZU.b(paramParcel2, paramParcel1);
        }
      }
      else
      {
        paramParcel1 = qb();
        paramParcel2.writeNoException();
        ZU.b(paramParcel2, paramParcel1);
      }
    }
    else
    {
      localObject3 = Hq.a.a(paramParcel1.readStrongBinder());
      localObject4 = paramParcel1.readString();
      localObject2 = (Bundle)ZU.a(paramParcel1, Bundle.CREATOR);
      localObject5 = (Bundle)ZU.a(paramParcel1, Bundle.CREATOR);
      localObject1 = (xea)ZU.a(paramParcel1, xea.CREATOR);
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = null;
      }
      else
      {
        localObject6 = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        if ((localObject6 instanceof vg)) {
          paramParcel1 = (vg)localObject6;
        } else {
          paramParcel1 = new yg(paramParcel1);
        }
      }
      a((Hq)localObject3, (String)localObject4, (Bundle)localObject2, (Bundle)localObject5, (xea)localObject1, paramParcel1);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */