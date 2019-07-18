package com.google.android.gms.internal.ads;

import Hq;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class ofa
  extends XU
  implements mfa
{
  ofa(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IClientApi");
  }
  
  public final Xea a(Hq paramHq, String paramString, lf paramlf, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    localParcel.writeString(paramString);
    ZU.a(localParcel, paramlf);
    localParcel.writeInt(paramInt);
    paramString = a(3, localParcel);
    paramlf = paramString.readStrongBinder();
    if (paramlf == null)
    {
      paramHq = null;
    }
    else
    {
      paramHq = paramlf.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if ((paramHq instanceof Xea)) {
        paramHq = (Xea)paramHq;
      } else {
        paramHq = new Zea(paramlf);
      }
    }
    paramString.recycle();
    return paramHq;
  }
  
  public final bfa a(Hq paramHq, xea paramxea, String paramString, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramxea);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    paramxea = a(10, localParcel);
    paramHq = paramxea.readStrongBinder();
    if (paramHq == null)
    {
      paramHq = null;
    }
    else
    {
      paramString = paramHq.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((paramString instanceof bfa)) {
        paramHq = (bfa)paramString;
      } else {
        paramHq = new dfa(paramHq);
      }
    }
    paramxea.recycle();
    return paramHq;
  }
  
  public final bfa a(Hq paramHq, xea paramxea, String paramString, lf paramlf, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramxea);
    localParcel.writeString(paramString);
    ZU.a(localParcel, paramlf);
    localParcel.writeInt(paramInt);
    paramxea = a(1, localParcel);
    paramHq = paramxea.readStrongBinder();
    if (paramHq == null)
    {
      paramHq = null;
    }
    else
    {
      paramString = paramHq.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((paramString instanceof bfa)) {
        paramHq = (bfa)paramString;
      } else {
        paramHq = new dfa(paramHq);
      }
    }
    paramxea.recycle();
    return paramHq;
  }
  
  public final ri a(Hq paramHq, lf paramlf, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramlf);
    localParcel.writeInt(paramInt);
    paramHq = a(6, localParcel);
    paramlf = si.a(paramHq.readStrongBinder());
    paramHq.recycle();
    return paramlf;
  }
  
  public final bfa b(Hq paramHq, xea paramxea, String paramString, lf paramlf, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramxea);
    localParcel.writeString(paramString);
    ZU.a(localParcel, paramlf);
    localParcel.writeInt(paramInt);
    paramxea = a(2, localParcel);
    paramHq = paramxea.readStrongBinder();
    if (paramHq == null)
    {
      paramHq = null;
    }
    else
    {
      paramString = paramHq.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((paramString instanceof bfa)) {
        paramHq = (bfa)paramString;
      } else {
        paramHq = new dfa(paramHq);
      }
    }
    paramxea.recycle();
    return paramHq;
  }
  
  public final sfa d(Hq paramHq, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    localParcel.writeInt(paramInt);
    localParcel = a(9, localParcel);
    paramHq = localParcel.readStrongBinder();
    if (paramHq == null)
    {
      paramHq = null;
    }
    else
    {
      IInterface localIInterface = paramHq.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      if ((localIInterface instanceof sfa)) {
        paramHq = (sfa)localIInterface;
      } else {
        paramHq = new d(paramHq);
      }
    }
    localParcel.recycle();
    return paramHq;
  }
  
  public final ch f(Hq paramHq)
    throws RemoteException
  {
    Object localObject = a();
    ZU.a((Parcel)localObject, paramHq);
    paramHq = a(8, (Parcel)localObject);
    localObject = dh.a(paramHq.readStrongBinder());
    paramHq.recycle();
    return (ch)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ofa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */