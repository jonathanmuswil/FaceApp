package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class nba
{
  private final ExecutorService a;
  private pba<? extends qba> b;
  private IOException c;
  
  public nba(String paramString)
  {
    this.a = Hba.a(paramString);
  }
  
  public final <T extends qba> long a(T paramT, oba<T> paramoba, int paramInt)
  {
    Looper localLooper = Looper.myLooper();
    boolean bool;
    if (localLooper != null) {
      bool = true;
    } else {
      bool = false;
    }
    tba.b(bool);
    long l = SystemClock.elapsedRealtime();
    new pba(this, localLooper, paramT, paramoba, paramInt, l).a(0L);
    return l;
  }
  
  public final void a(int paramInt)
    throws IOException
  {
    Object localObject = this.c;
    if (localObject == null)
    {
      localObject = this.b;
      if (localObject != null) {
        ((pba)localObject).a(((pba)localObject).c);
      }
      return;
    }
    throw ((Throwable)localObject);
  }
  
  public final void a(Runnable paramRunnable)
  {
    pba localpba = this.b;
    if (localpba != null) {
      localpba.a(true);
    }
    this.a.execute(paramRunnable);
    this.a.shutdown();
  }
  
  public final boolean a()
  {
    return this.b != null;
  }
  
  public final void b()
  {
    this.b.a(false);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */