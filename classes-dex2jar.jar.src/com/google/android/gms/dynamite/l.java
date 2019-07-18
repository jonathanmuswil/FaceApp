package com.google.android.gms.dynamite;

import Hq;
import Hq.a;
import Yu;
import _u;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class l
  extends Yu
  implements k
{
  l(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
  }
  
  public final Hq a(Hq paramHq1, String paramString, int paramInt, Hq paramHq2)
    throws RemoteException
  {
    Parcel localParcel = M();
    _u.a(localParcel, paramHq1);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    _u.a(localParcel, paramHq2);
    paramString = a(2, localParcel);
    paramHq1 = Hq.a.a(paramString.readStrongBinder());
    paramString.recycle();
    return paramHq1;
  }
  
  public final Hq b(Hq paramHq1, String paramString, int paramInt, Hq paramHq2)
    throws RemoteException
  {
    Parcel localParcel = M();
    _u.a(localParcel, paramHq1);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    _u.a(localParcel, paramHq2);
    paramString = a(3, localParcel);
    paramHq1 = Hq.a.a(paramString.readStrongBinder());
    paramString.recycle();
    return paramHq1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/dynamite/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */