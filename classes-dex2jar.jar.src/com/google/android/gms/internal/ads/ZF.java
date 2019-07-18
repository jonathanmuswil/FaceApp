package com.google.android.gms.internal.ads;

import Hq;
import Hq.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class zf
  extends XU
  implements xf
{
  zf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
  }
  
  public final void A()
    throws RemoteException
  {
    b(10, a());
  }
  
  public final gb E()
    throws RemoteException
  {
    Parcel localParcel = a(5, a());
    gb localgb = hb.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localgb;
  }
  
  public final String F()
    throws RemoteException
  {
    Parcel localParcel = a(9, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final double J()
    throws RemoteException
  {
    Parcel localParcel = a(7, a());
    double d = localParcel.readDouble();
    localParcel.recycle();
    return d;
  }
  
  public final String O()
    throws RemoteException
  {
    Parcel localParcel = a(8, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final boolean U()
    throws RemoteException
  {
    Parcel localParcel = a(13, a());
    boolean bool = ZU.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void a(Hq paramHq)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    b(16, localParcel);
  }
  
  public final void a(Hq paramHq1, Hq paramHq2, Hq paramHq3)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq1);
    ZU.a(localParcel, paramHq2);
    ZU.a(localParcel, paramHq3);
    b(22, localParcel);
  }
  
  public final Hq aa()
    throws RemoteException
  {
    Parcel localParcel = a(20, a());
    Hq localHq = Hq.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localHq;
  }
  
  public final void b(Hq paramHq)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    b(11, localParcel);
  }
  
  public final Hq da()
    throws RemoteException
  {
    Parcel localParcel = a(18, a());
    Hq localHq = Hq.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localHq;
  }
  
  public final void e(Hq paramHq)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    b(12, localParcel);
  }
  
  public final boolean ga()
    throws RemoteException
  {
    Parcel localParcel = a(14, a());
    boolean bool = ZU.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final Bundle getExtras()
    throws RemoteException
  {
    Parcel localParcel = a(15, a());
    Bundle localBundle = (Bundle)ZU.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final q getVideoController()
    throws RemoteException
  {
    Parcel localParcel = a(17, a());
    q localq = r.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localq;
  }
  
  public final Ya t()
    throws RemoteException
  {
    Parcel localParcel = a(19, a());
    Ya localYa = _a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localYa;
  }
  
  public final String u()
    throws RemoteException
  {
    Parcel localParcel = a(2, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String v()
    throws RemoteException
  {
    Parcel localParcel = a(6, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String x()
    throws RemoteException
  {
    Parcel localParcel = a(4, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final Hq y()
    throws RemoteException
  {
    Parcel localParcel = a(21, a());
    Hq localHq = Hq.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localHq;
  }
  
  public final List z()
    throws RemoteException
  {
    Parcel localParcel = a(3, a());
    ArrayList localArrayList = ZU.b(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */