package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

final class p
  implements q
{
  private final IBinder a;
  
  p(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(o paramo, g paramg)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramo != null) {
        paramo = paramo.asBinder();
      } else {
        paramo = null;
      }
      localParcel1.writeStrongBinder(paramo);
      if (paramg != null)
      {
        localParcel1.writeInt(1);
        paramg.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      this.a.transact(46, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */