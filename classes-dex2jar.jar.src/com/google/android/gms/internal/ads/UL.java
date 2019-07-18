package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.t;

@yh
public final class ul
{
  private HandlerThread a = null;
  private Handler b = null;
  private int c = 0;
  private final Object d = new Object();
  
  public final Handler a()
  {
    return this.b;
  }
  
  public final Looper b()
  {
    synchronized (this.d)
    {
      if (this.c == 0)
      {
        if (this.a == null)
        {
          mk.f("Starting the looper thread.");
          localObject2 = new android/os/HandlerThread;
          ((HandlerThread)localObject2).<init>("LooperProvider");
          this.a = ((HandlerThread)localObject2);
          this.a.start();
          localObject2 = new com/google/android/gms/internal/ads/bN;
          ((bN)localObject2).<init>(this.a.getLooper());
          this.b = ((Handler)localObject2);
          mk.f("Looper thread started.");
        }
        else
        {
          mk.f("Resuming the looper thread");
          this.d.notifyAll();
        }
      }
      else {
        t.a(this.a, "Invalid state: mHandlerThread should already been initialized.");
      }
      this.c += 1;
      Object localObject2 = this.a.getLooper();
      return (Looper)localObject2;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */