package com.google.android.gms.internal.ads;

import Hq;
import Hq.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class pf
  extends YU
  implements of
{
  public pf()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    boolean bool;
    switch (paramInt1)
    {
    case 29: 
    default: 
      return false;
    case 31: 
      a(Hq.a.a(paramParcel1.readStrongBinder()), ld.a(paramParcel1.readStrongBinder()), paramParcel1.createTypedArrayList(qd.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 30: 
      v(Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 28: 
      localObject1 = Hq.a.a(paramParcel1.readStrongBinder());
      localObject2 = (sea)ZU.a(paramParcel1, sea.CREATOR);
      localObject3 = paramParcel1.readString();
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = (Parcel)localObject6;
      }
      else
      {
        localObject5 = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject5 instanceof rf)) {
          paramParcel1 = (rf)localObject5;
        } else {
          paramParcel1 = new tf(paramParcel1);
        }
      }
      a((Hq)localObject1, (sea)localObject2, (String)localObject3, paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 27: 
      paramParcel1 = Fa();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 26: 
      paramParcel1 = getVideoController();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 25: 
      a(ZU.a(paramParcel1));
      paramParcel2.writeNoException();
      break;
    case 24: 
      paramParcel1 = Na();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 23: 
      a(Hq.a.a(paramParcel1.readStrongBinder()), Hi.a(paramParcel1.readStrongBinder()), paramParcel1.createStringArrayList());
      paramParcel2.writeNoException();
      break;
    case 22: 
      bool = Qa();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 21: 
      z(Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 20: 
      a((sea)ZU.a(paramParcel1, sea.CREATOR), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      break;
    case 19: 
      paramParcel1 = Za();
      paramParcel2.writeNoException();
      ZU.b(paramParcel2, paramParcel1);
      break;
    case 18: 
      paramParcel1 = getInterstitialAdapterInfo();
      paramParcel2.writeNoException();
      ZU.b(paramParcel2, paramParcel1);
      break;
    case 17: 
      paramParcel1 = zzsh();
      paramParcel2.writeNoException();
      ZU.b(paramParcel2, paramParcel1);
      break;
    case 16: 
      paramParcel1 = sb();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 15: 
      paramParcel1 = Bb();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 14: 
      localObject6 = Hq.a.a(paramParcel1.readStrongBinder());
      localObject5 = (sea)ZU.a(paramParcel1, sea.CREATOR);
      localObject4 = paramParcel1.readString();
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readStrongBinder();
      if (localObject3 == null) {
        localObject3 = localObject1;
      }
      for (;;)
      {
        break;
        localObject1 = ((IBinder)localObject3).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject1 instanceof rf)) {
          localObject3 = (rf)localObject1;
        } else {
          localObject3 = new tf((IBinder)localObject3);
        }
      }
      a((Hq)localObject6, (sea)localObject5, (String)localObject4, (String)localObject2, (rf)localObject3, (Wa)ZU.a(paramParcel1, Wa.CREATOR), paramParcel1.createStringArrayList());
      paramParcel2.writeNoException();
      break;
    case 13: 
      bool = isInitialized();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 12: 
      showVideo();
      paramParcel2.writeNoException();
      break;
    case 11: 
      a((sea)ZU.a(paramParcel1, sea.CREATOR), paramParcel1.readString());
      paramParcel2.writeNoException();
      break;
    case 10: 
      a(Hq.a.a(paramParcel1.readStrongBinder()), (sea)ZU.a(paramParcel1, sea.CREATOR), paramParcel1.readString(), Hi.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      break;
    case 9: 
      R();
      paramParcel2.writeNoException();
      break;
    case 8: 
      pause();
      paramParcel2.writeNoException();
      break;
    case 7: 
      localObject1 = Hq.a.a(paramParcel1.readStrongBinder());
      localObject6 = (sea)ZU.a(paramParcel1, sea.CREATOR);
      localObject5 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null) {
        paramParcel1 = (Parcel)localObject2;
      }
      for (;;)
      {
        break;
        localObject2 = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject2 instanceof rf)) {
          paramParcel1 = (rf)localObject2;
        } else {
          paramParcel1 = new tf(paramParcel1);
        }
      }
      a((Hq)localObject1, (sea)localObject6, (String)localObject5, (String)localObject3, paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 6: 
      localObject6 = Hq.a.a(paramParcel1.readStrongBinder());
      localObject4 = (xea)ZU.a(paramParcel1, xea.CREATOR);
      localObject1 = (sea)ZU.a(paramParcel1, sea.CREATOR);
      localObject5 = paramParcel1.readString();
      localObject2 = paramParcel1.readString();
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null) {
        paramParcel1 = (Parcel)localObject3;
      }
      for (;;)
      {
        break;
        localObject3 = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject3 instanceof rf)) {
          paramParcel1 = (rf)localObject3;
        } else {
          paramParcel1 = new tf(paramParcel1);
        }
      }
      a((Hq)localObject6, (xea)localObject4, (sea)localObject1, (String)localObject5, (String)localObject2, paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 5: 
      destroy();
      paramParcel2.writeNoException();
      break;
    case 4: 
      showInterstitial();
      paramParcel2.writeNoException();
      break;
    case 3: 
      localObject1 = Hq.a.a(paramParcel1.readStrongBinder());
      localObject3 = (sea)ZU.a(paramParcel1, sea.CREATOR);
      localObject2 = paramParcel1.readString();
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = (Parcel)localObject4;
      }
      else
      {
        localObject5 = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject5 instanceof rf)) {
          paramParcel1 = (rf)localObject5;
        } else {
          paramParcel1 = new tf(paramParcel1);
        }
      }
      b((Hq)localObject1, (sea)localObject3, (String)localObject2, paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 2: 
      paramParcel1 = Ba();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 1: 
      localObject6 = Hq.a.a(paramParcel1.readStrongBinder());
      localObject3 = (xea)ZU.a(paramParcel1, xea.CREATOR);
      localObject1 = (sea)ZU.a(paramParcel1, sea.CREATOR);
      localObject2 = paramParcel1.readString();
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null) {
        paramParcel1 = (Parcel)localObject5;
      }
      for (;;)
      {
        break;
        localObject5 = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject5 instanceof rf)) {
          paramParcel1 = (rf)localObject5;
        } else {
          paramParcel1 = new tf(paramParcel1);
        }
      }
      a((Hq)localObject6, (xea)localObject3, (sea)localObject1, (String)localObject2, paramParcel1);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */