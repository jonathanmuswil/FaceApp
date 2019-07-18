package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class mb
  implements Runnable
{
  mb(jb paramjb, AtomicReference paramAtomicReference, pc parampc, boolean paramBoolean) {}
  
  public final void run()
  {
    try
    {
      synchronized (this.a)
      {
        n localn = jb.d(this.d);
        if (localn == null) {
          this.d.c().s().a("Failed to get user properties");
        }
        try
        {
          this.a.notify();
          return;
        }
        finally {}
        this.a.set(localn.a(this.b, this.c));
        jb.e(this.d);
        this.a.notify();
      }
      this.a.notify();
    }
    catch (RemoteException localRemoteException)
    {
      this.d.c().s().a("Failed to get user properties", localRemoteException);
      this.a.notify();
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */