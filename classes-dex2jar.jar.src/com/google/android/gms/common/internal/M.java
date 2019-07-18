package com.google.android.gms.common.internal;

import Yu;
import Zu;
import _u;
import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface m
  extends IInterface
{
  public abstract Account B()
    throws RemoteException;
  
  public static abstract class a
    extends Zu
    implements m
  {
    public static m a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
      if ((localIInterface instanceof m)) {
        return (m)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public static final class a
      extends Yu
      implements m
    {
      a(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.internal.IAccountAccessor");
      }
      
      public final Account B()
        throws RemoteException
      {
        Parcel localParcel = a(2, M());
        Account localAccount = (Account)_u.a(localParcel, Account.CREATOR);
        localParcel.recycle();
        return localAccount;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */