package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.RemoteException;

final class rb
  implements Runnable
{
  rb(jb paramjb, fb paramfb) {}
  
  public final void run()
  {
    n localn = jb.d(this.b);
    if (localn == null)
    {
      this.b.c().s().a("Failed to send current screen to service");
      return;
    }
    try
    {
      if (this.a == null) {
        localn.a(0L, null, null, this.b.getContext().getPackageName());
      } else {
        localn.a(this.a.c, this.a.a, this.a.b, this.b.getContext().getPackageName());
      }
      jb.e(this.b);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      this.b.c().s().a("Failed to send current screen to the service", localRemoteException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/rb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */