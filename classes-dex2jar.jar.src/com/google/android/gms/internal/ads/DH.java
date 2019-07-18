package com.google.android.gms.internal.ads;

import Hq.a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class dh
  extends YU
  implements ch
{
  public dh()
  {
    super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
  }
  
  public static ch a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    if ((localIInterface instanceof ch)) {
      return (ch)localIInterface;
    }
    return new eh(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 13: 
      y(Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      break;
    case 12: 
      onActivityResult(paramParcel1.readInt(), paramParcel1.readInt(), (Intent)ZU.a(paramParcel1, Intent.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 11: 
      boolean bool = Ja();
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, bool);
      break;
    case 10: 
      fa();
      paramParcel2.writeNoException();
      break;
    case 9: 
      Wa();
      paramParcel2.writeNoException();
      break;
    case 8: 
      onDestroy();
      paramParcel2.writeNoException();
      break;
    case 7: 
      j();
      paramParcel2.writeNoException();
      break;
    case 6: 
      paramParcel1 = (Bundle)ZU.a(paramParcel1, Bundle.CREATOR);
      i(paramParcel1);
      paramParcel2.writeNoException();
      ZU.b(paramParcel2, paramParcel1);
      break;
    case 5: 
      onPause();
      paramParcel2.writeNoException();
      break;
    case 4: 
      onResume();
      paramParcel2.writeNoException();
      break;
    case 3: 
      i();
      paramParcel2.writeNoException();
      break;
    case 2: 
      kb();
      paramParcel2.writeNoException();
      break;
    case 1: 
      k((Bundle)ZU.a(paramParcel1, Bundle.CREATOR));
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */