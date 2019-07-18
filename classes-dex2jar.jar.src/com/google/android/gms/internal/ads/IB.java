package com.google.android.gms.internal.ads;

import Hq;
import Hq.a;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class ib
  extends XU
  implements gb
{
  ib(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
  }
  
  public final double Ua()
    throws RemoteException
  {
    Parcel localParcel = a(3, a());
    double d = localParcel.readDouble();
    localParcel.recycle();
    return d;
  }
  
  public final Hq _a()
    throws RemoteException
  {
    Parcel localParcel = a(1, a());
    Hq localHq = Hq.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localHq;
  }
  
  public final int getHeight()
    throws RemoteException
  {
    Parcel localParcel = a(5, a());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final Uri getUri()
    throws RemoteException
  {
    Parcel localParcel = a(2, a());
    Uri localUri = (Uri)ZU.a(localParcel, Uri.CREATOR);
    localParcel.recycle();
    return localUri;
  }
  
  public final int getWidth()
    throws RemoteException
  {
    Parcel localParcel = a(4, a());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */