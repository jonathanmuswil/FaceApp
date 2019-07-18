package com.google.android.gms.internal.ads;

import Hq;
import Hq.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class qf
  extends XU
  implements of
{
  qf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }
  
  public final Hq Ba()
    throws RemoteException
  {
    Parcel localParcel = a(2, a());
    Hq localHq = Hq.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localHq;
  }
  
  public final xf Bb()
    throws RemoteException
  {
    Parcel localParcel = a(15, a());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      if ((localIInterface instanceof xf)) {
        localObject = (xf)localIInterface;
      } else {
        localObject = new zf((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (xf)localObject;
  }
  
  public final Df Fa()
    throws RemoteException
  {
    Parcel localParcel = a(27, a());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
      if ((localIInterface instanceof Df)) {
        localObject = (Df)localIInterface;
      } else {
        localObject = new Ff((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (Df)localObject;
  }
  
  public final boolean Qa()
    throws RemoteException
  {
    Parcel localParcel = a(22, a());
    boolean bool = ZU.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void R()
    throws RemoteException
  {
    b(9, a());
  }
  
  public final void a(Hq paramHq, Gi paramGi, List<String> paramList)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramGi);
    localParcel.writeStringList(paramList);
    b(23, localParcel);
  }
  
  public final void a(Hq paramHq, kd paramkd, List<qd> paramList)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramkd);
    localParcel.writeTypedList(paramList);
    b(31, localParcel);
  }
  
  public final void a(Hq paramHq, sea paramsea, String paramString1, Gi paramGi, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramsea);
    localParcel.writeString(paramString1);
    ZU.a(localParcel, paramGi);
    localParcel.writeString(paramString2);
    b(10, localParcel);
  }
  
  public final void a(Hq paramHq, sea paramsea, String paramString, rf paramrf)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramsea);
    localParcel.writeString(paramString);
    ZU.a(localParcel, paramrf);
    b(28, localParcel);
  }
  
  public final void a(Hq paramHq, sea paramsea, String paramString1, String paramString2, rf paramrf)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramsea);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    ZU.a(localParcel, paramrf);
    b(7, localParcel);
  }
  
  public final void a(Hq paramHq, sea paramsea, String paramString1, String paramString2, rf paramrf, Wa paramWa, List<String> paramList)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramsea);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    ZU.a(localParcel, paramrf);
    ZU.a(localParcel, paramWa);
    localParcel.writeStringList(paramList);
    b(14, localParcel);
  }
  
  public final void a(Hq paramHq, xea paramxea, sea paramsea, String paramString, rf paramrf)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramxea);
    ZU.a(localParcel, paramsea);
    localParcel.writeString(paramString);
    ZU.a(localParcel, paramrf);
    b(1, localParcel);
  }
  
  public final void a(Hq paramHq, xea paramxea, sea paramsea, String paramString1, String paramString2, rf paramrf)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramxea);
    ZU.a(localParcel, paramsea);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    ZU.a(localParcel, paramrf);
    b(6, localParcel);
  }
  
  public final void a(sea paramsea, String paramString)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramsea);
    localParcel.writeString(paramString);
    b(11, localParcel);
  }
  
  public final void a(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramBoolean);
    b(25, localParcel);
  }
  
  public final void b(Hq paramHq, sea paramsea, String paramString, rf paramrf)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramsea);
    localParcel.writeString(paramString);
    ZU.a(localParcel, paramrf);
    b(3, localParcel);
  }
  
  public final void destroy()
    throws RemoteException
  {
    b(5, a());
  }
  
  public final q getVideoController()
    throws RemoteException
  {
    Parcel localParcel = a(26, a());
    q localq = r.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localq;
  }
  
  public final boolean isInitialized()
    throws RemoteException
  {
    Parcel localParcel = a(13, a());
    boolean bool = ZU.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void pause()
    throws RemoteException
  {
    b(8, a());
  }
  
  public final Af sb()
    throws RemoteException
  {
    Parcel localParcel = a(16, a());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      if ((localIInterface instanceof Af)) {
        localObject = (Af)localIInterface;
      } else {
        localObject = new Cf((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (Af)localObject;
  }
  
  public final void showInterstitial()
    throws RemoteException
  {
    b(4, a());
  }
  
  public final void showVideo()
    throws RemoteException
  {
    b(12, a());
  }
  
  public final void v(Hq paramHq)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    b(30, localParcel);
  }
  
  public final void z(Hq paramHq)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    b(21, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */