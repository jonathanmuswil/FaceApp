package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

public final class aa
  implements Z
{
  private final IBinder a;
  
  aa(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(Message paramMessage)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
    localParcel.writeInt(1);
    paramMessage.writeToParcel(localParcel, 0);
    try
    {
      this.a.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */