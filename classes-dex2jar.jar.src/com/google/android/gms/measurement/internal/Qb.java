package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class qb
  implements Runnable
{
  qb(jb paramjb, pc parampc) {}
  
  public final void run()
  {
    n localn = jb.d(this.b);
    if (localn == null)
    {
      this.b.c().s().a("Discarding data. Failed to send app launch");
      return;
    }
    try
    {
      localn.d(this.a);
      this.b.a(localn, null, this.a);
      jb.e(this.b);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      this.b.c().s().a("Failed to send app launch to the service", localRemoteException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/qb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */