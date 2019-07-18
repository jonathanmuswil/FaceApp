package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.content.a;
import android.support.v4.content.e;
import android.util.Log;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.l;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class g
  extends a<Void>
  implements l
{
  private Semaphore p = new Semaphore(0);
  private Set<f> q;
  
  public g(Context paramContext, Set<f> paramSet)
  {
    super(paramContext);
    this.q = paramSet;
  }
  
  private final Void B()
  {
    Iterator localIterator = this.q.iterator();
    int i = 0;
    while (localIterator.hasNext()) {
      if (((f)localIterator.next()).a(this)) {
        i++;
      }
    }
    try
    {
      this.p.tryAcquire(i, 5L, TimeUnit.SECONDS);
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.i("GACSignInLoader", "Unexpected InterruptedException", localInterruptedException);
      Thread.currentThread().interrupt();
    }
    return null;
  }
  
  public final void a()
  {
    this.p.release();
  }
  
  protected final void p()
  {
    this.p.drainPermits();
    f();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */