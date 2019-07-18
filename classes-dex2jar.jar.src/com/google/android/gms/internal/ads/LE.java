package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class le
  implements Runnable
{
  le(ce paramce, we paramwe, Rd paramRd) {}
  
  public final void run()
  {
    synchronized (ce.a(this.c))
    {
      if ((this.a.a() != -1) && (this.a.a() != 1))
      {
        this.a.b();
        Executor localExecutor = Cm.a;
        Rd localRd = this.b;
        localRd.getClass();
        localExecutor.execute(me.a(localRd));
        mk.f("Could not receive loaded message in a timely manner. Rejecting.");
        return;
      }
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/le.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */