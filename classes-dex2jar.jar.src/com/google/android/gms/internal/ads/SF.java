package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class sf
  extends YU
  implements rf
{
  public sf()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
  }
  
  public static rf a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    if ((localIInterface instanceof rf)) {
      return (rf)localIInterface;
    }
    return new tf(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 20: 
      ra();
      break;
    case 19: 
      a((Bundle)ZU.a(paramParcel1, Bundle.CREATOR));
      break;
    case 18: 
      xb();
      break;
    case 17: 
      b(paramParcel1.readInt());
      break;
    case 16: 
      a(Ni.a(paramParcel1.readStrongBinder()));
      break;
    case 15: 
      ka();
      break;
    case 14: 
      a((Ki)ZU.a(paramParcel1, Ki.CREATOR));
      break;
    case 13: 
      xa();
      break;
    case 12: 
      o(paramParcel1.readString());
      break;
    case 11: 
      na();
      break;
    case 10: 
      a(Cb.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      break;
    case 9: 
      a(paramParcel1.readString(), paramParcel1.readString());
      break;
    case 8: 
      k();
      break;
    case 7: 
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = null;
      }
      else
      {
        IInterface localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
        if ((localIInterface instanceof uf)) {
          paramParcel1 = (uf)localIInterface;
        } else {
          paramParcel1 = new wf(paramParcel1);
        }
      }
      a(paramParcel1);
      break;
    case 6: 
      h();
      break;
    case 5: 
      p();
      break;
    case 4: 
      q();
      break;
    case 3: 
      a(paramParcel1.readInt());
      break;
    case 2: 
      r();
      break;
    case 1: 
      l();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */