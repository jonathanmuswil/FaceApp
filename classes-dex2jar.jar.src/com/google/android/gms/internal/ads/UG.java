package com.google.android.gms.internal.ads;

import Hq;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class ug
  extends XU
  implements sg
{
  ug(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
  }
  
  public final void a(Hq paramHq, String paramString, Bundle paramBundle1, Bundle paramBundle2, xea paramxea, vg paramvg)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    localParcel.writeString(paramString);
    ZU.a(localParcel, paramBundle1);
    ZU.a(localParcel, paramBundle2);
    ZU.a(localParcel, paramxea);
    ZU.a(localParcel, paramvg);
    b(1, localParcel);
  }
  
  public final void a(String paramString1, String paramString2, sea paramsea, Hq paramHq, gg paramgg, rf paramrf, xea paramxea)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    ZU.a(localParcel, paramsea);
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramgg);
    ZU.a(localParcel, paramrf);
    ZU.a(localParcel, paramxea);
    b(13, localParcel);
  }
  
  public final void a(String paramString1, String paramString2, sea paramsea, Hq paramHq, jg paramjg, rf paramrf)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    ZU.a(localParcel, paramsea);
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, paramjg);
    ZU.a(localParcel, paramrf);
    b(14, localParcel);
  }
  
  public final void a(String paramString1, String paramString2, sea paramsea, Hq paramHq, mg parammg, rf paramrf)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    ZU.a(localParcel, paramsea);
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, parammg);
    ZU.a(localParcel, paramrf);
    b(18, localParcel);
  }
  
  public final void a(String paramString1, String paramString2, sea paramsea, Hq paramHq, pg parampg, rf paramrf)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    ZU.a(localParcel, paramsea);
    ZU.a(localParcel, paramHq);
    ZU.a(localParcel, parampg);
    ZU.a(localParcel, paramrf);
    b(16, localParcel);
  }
  
  public final q getVideoController()
    throws RemoteException
  {
    Parcel localParcel = a(5, a());
    q localq = r.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localq;
  }
  
  public final Gg hb()
    throws RemoteException
  {
    Parcel localParcel = a(3, a());
    Gg localGg = (Gg)ZU.a(localParcel, Gg.CREATOR);
    localParcel.recycle();
    return localGg;
  }
  
  public final boolean n(Hq paramHq)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    paramHq = a(15, localParcel);
    boolean bool = ZU.a(paramHq);
    paramHq.recycle();
    return bool;
  }
  
  public final boolean o(Hq paramHq)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    paramHq = a(17, localParcel);
    boolean bool = ZU.a(paramHq);
    paramHq.recycle();
    return bool;
  }
  
  public final Gg qb()
    throws RemoteException
  {
    Parcel localParcel = a(2, a());
    Gg localGg = (Gg)ZU.a(localParcel, Gg.CREATOR);
    localParcel.recycle();
    return localGg;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */