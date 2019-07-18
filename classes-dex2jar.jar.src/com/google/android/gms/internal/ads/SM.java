package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public final class sm<V>
{
  private final Hm<Void> a = new Hm();
  
  sm(Iterable<? extends xm<? extends V>> paramIterable)
  {
    AtomicInteger localAtomicInteger = new AtomicInteger(0);
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      xm localxm = (xm)localIterator.next();
      localAtomicInteger.incrementAndGet();
      gm.a(this.a, localxm);
    }
    if (localAtomicInteger.get() == 0)
    {
      this.a.b(null);
      return;
    }
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      ((xm)paramIterable.next()).a(new tm(this, localAtomicInteger), Cm.b);
    }
  }
  
  public final <C> xm<C> a(Callable<C> paramCallable, Executor paramExecutor)
  {
    return gm.a(this.a, new um(paramCallable), paramExecutor);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */