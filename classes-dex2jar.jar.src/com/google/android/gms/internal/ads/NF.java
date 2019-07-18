package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class nf
  extends XU
  implements lf
{
  nf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
  }
  
  public final sg m(String paramString)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString);
    localParcel = a(3, localParcel);
    paramString = tg.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return paramString;
  }
  
  public final of v(String paramString)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString);
    localParcel = a(1, localParcel);
    paramString = localParcel.readStrongBinder();
    if (paramString == null)
    {
      paramString = null;
    }
    else
    {
      IInterface localIInterface = paramString.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      if ((localIInterface instanceof of)) {
        paramString = (of)localIInterface;
      } else {
        paramString = new qf(paramString);
      }
    }
    localParcel.recycle();
    return paramString;
  }
  
  public final boolean y(String paramString)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString);
    paramString = a(2, localParcel);
    boolean bool = ZU.a(paramString);
    paramString.recycle();
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */