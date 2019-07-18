package com.google.android.gms.internal.ads;

import Hq;
import Hq.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class dfa
  extends XU
  implements bfa
{
  dfa(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdManager");
  }
  
  public final Bundle P()
    throws RemoteException
  {
    Parcel localParcel = a(37, a());
    Bundle localBundle = (Bundle)ZU.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final void R()
    throws RemoteException
  {
    b(6, a());
  }
  
  public final void a(Ma paramMa)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramMa);
    b(19, localParcel);
  }
  
  public final void a(Nea paramNea)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramNea);
    b(20, localParcel);
  }
  
  public final void a(Qea paramQea)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramQea);
    b(7, localParcel);
  }
  
  public final void a(aa paramaa)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramaa);
    b(29, localParcel);
  }
  
  public final void a(gfa paramgfa)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramgfa);
    b(36, localParcel);
  }
  
  public final void a(jfa paramjfa)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramjfa);
    b(8, localParcel);
  }
  
  public final void a(pfa parampfa)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, parampfa);
    b(21, localParcel);
  }
  
  public final void a(xea paramxea)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramxea);
    b(13, localParcel);
  }
  
  public final void a(xi paramxi)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramxi);
    b(24, localParcel);
  }
  
  public final void a(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramBoolean);
    b(34, localParcel);
  }
  
  public final boolean b(sea paramsea)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramsea);
    paramsea = a(4, localParcel);
    boolean bool = ZU.a(paramsea);
    paramsea.recycle();
    return bool;
  }
  
  public final void destroy()
    throws RemoteException
  {
    b(2, a());
  }
  
  public final void e(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramBoolean);
    b(22, localParcel);
  }
  
  public final q getVideoController()
    throws RemoteException
  {
    Parcel localParcel = a(26, a());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
    {
      localObject = null;
    }
    else
    {
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
      if ((localObject instanceof q)) {
        localObject = (q)localObject;
      } else {
        localObject = new s(localIBinder);
      }
    }
    localParcel.recycle();
    return (q)localObject;
  }
  
  public final String ma()
    throws RemoteException
  {
    Parcel localParcel = a(35, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final xea nb()
    throws RemoteException
  {
    Parcel localParcel = a(12, a());
    xea localxea = (xea)ZU.a(localParcel, xea.CREATOR);
    localParcel.recycle();
    return localxea;
  }
  
  public final void pause()
    throws RemoteException
  {
    b(5, a());
  }
  
  public final void showInterstitial()
    throws RemoteException
  {
    b(9, a());
  }
  
  public final String tb()
    throws RemoteException
  {
    Parcel localParcel = a(31, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final Hq wa()
    throws RemoteException
  {
    Parcel localParcel = a(1, a());
    Hq localHq = Hq.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localHq;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */