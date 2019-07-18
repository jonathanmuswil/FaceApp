package com.google.android.gms.common.internal;

import Zu;
import _u;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface o
  extends IInterface
{
  public abstract void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(int paramInt, IBinder paramIBinder, H paramH)
    throws RemoteException;
  
  public abstract void b(int paramInt, Bundle paramBundle)
    throws RemoteException;
  
  public static abstract class a
    extends Zu
    implements o
  {
    public a()
    {
      super();
    }
    
    protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      if (paramInt1 != 1)
      {
        if (paramInt1 != 2)
        {
          if (paramInt1 != 3) {
            return false;
          }
          a(paramParcel1.readInt(), paramParcel1.readStrongBinder(), (H)_u.a(paramParcel1, H.CREATOR));
        }
        else
        {
          b(paramParcel1.readInt(), (Bundle)_u.a(paramParcel1, Bundle.CREATOR));
        }
      }
      else {
        a(paramParcel1.readInt(), paramParcel1.readStrongBinder(), (Bundle)_u.a(paramParcel1, Bundle.CREATOR));
      }
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */