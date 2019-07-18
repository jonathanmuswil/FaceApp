package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class nb
  implements Runnable
{
  nb(jb paramjb, pc parampc) {}
  
  public final void run()
  {
    n localn = jb.d(this.b);
    if (localn == null)
    {
      this.b.c().s().a("Failed to reset data on the service; null service");
      return;
    }
    try
    {
      localn.a(this.a);
    }
    catch (RemoteException localRemoteException)
    {
      this.b.c().s().a("Failed to reset data on the service", localRemoteException);
    }
    jb.e(this.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/nb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */