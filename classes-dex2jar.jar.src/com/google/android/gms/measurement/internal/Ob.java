package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class ob
  implements Runnable
{
  ob(jb paramjb, AtomicReference paramAtomicReference, pc parampc) {}
  
  public final void run()
  {
    try
    {
      synchronized (this.a)
      {
        Object localObject1 = jb.d(this.c);
        if (localObject1 == null) {
          this.c.c().s().a("Failed to get app instance id");
        }
        try
        {
          this.a.notify();
          return;
        }
        finally {}
        this.a.set(((n)localObject1).c(this.b));
        localObject1 = (String)this.a.get();
        if (localObject1 != null)
        {
          this.c.o().a((String)localObject1);
          this.c.f().m.a((String)localObject1);
        }
        jb.e(this.c);
        this.a.notify();
      }
      this.a.notify();
    }
    catch (RemoteException localRemoteException)
    {
      this.c.c().s().a("Failed to get app instance id", localRemoteException);
      this.a.notify();
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/ob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */