package com.google.android.gms.dynamite;

import Hq;
import Hq.a;
import Yu;
import _u;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class j
  extends Yu
  implements i
{
  j(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
  }
  
  public final int a(Hq paramHq, String paramString, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = M();
    _u.a(localParcel, paramHq);
    localParcel.writeString(paramString);
    _u.a(localParcel, paramBoolean);
    paramHq = a(5, localParcel);
    int i = paramHq.readInt();
    paramHq.recycle();
    return i;
  }
  
  public final Hq a(Hq paramHq, String paramString, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = M();
    _u.a(localParcel, paramHq);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    paramString = a(2, localParcel);
    paramHq = Hq.a.a(paramString.readStrongBinder());
    paramString.recycle();
    return paramHq;
  }
  
  public final int b(Hq paramHq, String paramString, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = M();
    _u.a(localParcel, paramHq);
    localParcel.writeString(paramString);
    _u.a(localParcel, paramBoolean);
    paramHq = a(3, localParcel);
    int i = paramHq.readInt();
    paramHq.recycle();
    return i;
  }
  
  public final Hq b(Hq paramHq, String paramString, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = M();
    _u.a(localParcel, paramHq);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    paramHq = a(4, localParcel);
    paramString = Hq.a.a(paramHq.readStrongBinder());
    paramHq.recycle();
    return paramString;
  }
  
  public final int ub()
    throws RemoteException
  {
    Parcel localParcel = a(6, M());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/dynamite/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */