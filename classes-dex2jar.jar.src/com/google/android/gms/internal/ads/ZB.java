package com.google.android.gms.internal.ads;

import Hq;
import Hq.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class zb
  extends XU
  implements wb
{
  zb(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
  }
  
  public final Hq G()
    throws RemoteException
  {
    Parcel localParcel = a(2, a());
    Hq localHq = Hq.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localHq;
  }
  
  public final String N()
    throws RemoteException
  {
    Parcel localParcel = a(8, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final q getVideoController()
    throws RemoteException
  {
    Parcel localParcel = a(11, a());
    q localq = r.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localq;
  }
  
  public final gb sa()
    throws RemoteException
  {
    Parcel localParcel = a(6, a());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      if ((localIInterface instanceof gb)) {
        localObject = (gb)localIInterface;
      } else {
        localObject = new ib((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (gb)localObject;
  }
  
  public final Ya t()
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
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
      if ((localIInterface instanceof Ya)) {
        localObject = (Ya)localIInterface;
      } else {
        localObject = new ab((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (Ya)localObject;
  }
  
  public final String u()
    throws RemoteException
  {
    Parcel localParcel = a(3, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String v()
    throws RemoteException
  {
    Parcel localParcel = a(7, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String x()
    throws RemoteException
  {
    Parcel localParcel = a(5, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final List z()
    throws RemoteException
  {
    Parcel localParcel = a(4, a());
    ArrayList localArrayList = ZU.b(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */