package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class ab
  extends XU
  implements Ya
{
  ab(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
  }
  
  public final String getText()
    throws RemoteException
  {
    Parcel localParcel = a(2, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final List<gb> va()
    throws RemoteException
  {
    Parcel localParcel = a(3, a());
    ArrayList localArrayList = ZU.b(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */