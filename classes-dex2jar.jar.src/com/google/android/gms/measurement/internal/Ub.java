package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class ub
  implements Runnable
{
  ub(jb paramjb, pc parampc) {}
  
  public final void run()
  {
    n localn = jb.d(this.b);
    if (localn == null)
    {
      this.b.c().s().a("Failed to send measurementEnabled to service");
      return;
    }
    try
    {
      localn.b(this.a);
      jb.e(this.b);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      this.b.c().s().a("Failed to send measurementEnabled to the service", localRemoteException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */