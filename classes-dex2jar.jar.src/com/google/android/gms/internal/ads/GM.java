package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@yh
public final class gm
{
  public static <V> sm<V> a(xm<? extends V>... paramVarArgs)
  {
    return b(Arrays.asList(paramVarArgs));
  }
  
  public static <T> vm<T> a(Throwable paramThrowable)
  {
    return new vm(paramThrowable);
  }
  
  public static <T> wm<T> a(T paramT)
  {
    return new wm(paramT);
  }
  
  public static <V> xm<V> a(xm<V> paramxm, long paramLong, TimeUnit paramTimeUnit, ScheduledExecutorService paramScheduledExecutorService)
  {
    Hm localHm = new Hm();
    b(localHm, paramxm);
    paramTimeUnit = paramScheduledExecutorService.schedule(new mm(localHm), paramLong, paramTimeUnit);
    a(paramxm, localHm);
    localHm.a(new nm(paramTimeUnit), Cm.b);
    return localHm;
  }
  
  public static <A, B> xm<B> a(xm<A> paramxm, am<? super A, ? extends B> paramam, Executor paramExecutor)
  {
    Hm localHm = new Hm();
    paramxm.a(new jm(localHm, paramam, paramxm), paramExecutor);
    b(localHm, paramxm);
    return localHm;
  }
  
  public static <A, B> xm<B> a(xm<A> paramxm, bm<A, B> parambm, Executor paramExecutor)
  {
    Hm localHm = new Hm();
    paramxm.a(new im(localHm, parambm, paramxm), paramExecutor);
    b(localHm, paramxm);
    return localHm;
  }
  
  public static <V, X extends Throwable> xm<V> a(xm<? extends V> paramxm, Class<X> paramClass, am<? super X, ? extends V> paramam, Executor paramExecutor)
  {
    Hm localHm = new Hm();
    b(localHm, paramxm);
    paramxm.a(new pm(localHm, paramxm, paramClass, paramam, paramExecutor), Cm.b);
    return localHm;
  }
  
  public static <V> xm<List<V>> a(Iterable<? extends xm<? extends V>> paramIterable)
  {
    Hm localHm = new Hm();
    AtomicInteger localAtomicInteger = new AtomicInteger(0);
    Object localObject = paramIterable.iterator();
    xm localxm;
    while (((Iterator)localObject).hasNext())
    {
      localxm = (xm)((Iterator)localObject).next();
      localAtomicInteger.incrementAndGet();
      b(localHm, localxm);
    }
    localObject = new km(paramIterable, localHm);
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      localxm = (xm)paramIterable.next();
      localxm.a(new lm(localxm, localAtomicInteger, (Runnable)localObject, localHm), Cm.b);
    }
    return localHm;
  }
  
  private static <V> void a(xm<? extends V> paramxm, Hm<V> paramHm)
  {
    b(paramHm, paramxm);
    paramxm.a(new qm(paramHm, paramxm), Cm.b);
  }
  
  public static <V> void a(xm<V> paramxm, cm<? super V> paramcm, Executor paramExecutor)
  {
    paramxm.a(new hm(paramcm, paramxm), paramExecutor);
  }
  
  public static <V> sm<V> b(Iterable<? extends xm<? extends V>> paramIterable)
  {
    return new sm(paramIterable);
  }
  
  private static <A, B> void b(xm<A> paramxm, Future<B> paramFuture)
  {
    paramxm.a(new rm(paramxm, paramFuture), Cm.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */