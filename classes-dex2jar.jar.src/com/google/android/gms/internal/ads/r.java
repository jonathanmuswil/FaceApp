package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class r
  extends YU
  implements q
{
  public r()
  {
    super("com.google.android.gms.ads.internal.client.IVideoController");
  }
  
  public static q a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
    if ((localIInterface instanceof q)) {
      return (q)localIInterface;
    }
    return new s(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    boolean bool;
    float f;
    switch (paramInt1)
    {
    default: 
      return false;
    case 12: 
      bool = ya();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 11: 
      paramParcel1 = gb();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 10: 
      bool = jb();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 9: 
      f = ja();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 8: 
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = null;
      }
      else
      {
        IInterface localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
        if ((localIInterface instanceof t)) {
          paramParcel1 = (t)localIInterface;
        } else {
          paramParcel1 = new v(paramParcel1);
        }
      }
      a(paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 7: 
      f = pb();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 6: 
      f = zb();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 5: 
      paramInt1 = C();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      break;
    case 4: 
      bool = Ca();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 3: 
      g(ZU.a(paramParcel1));
      paramParcel2.writeNoException();
      break;
    case 2: 
      pause();
      paramParcel2.writeNoException();
      break;
    case 1: 
      ib();
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */