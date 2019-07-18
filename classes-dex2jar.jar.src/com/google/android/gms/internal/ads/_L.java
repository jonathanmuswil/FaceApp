package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;

@yh
public abstract class _l
  extends AbstractExecutorService
  implements Bm
{
  public final xm<?> a(Runnable paramRunnable)
    throws RejectedExecutionException
  {
    return (xm)super.submit(paramRunnable);
  }
  
  public final <T> xm<T> a(Callable<T> paramCallable)
    throws RejectedExecutionException
  {
    return (xm)super.submit(paramCallable);
  }
  
  protected final <T> RunnableFuture<T> newTaskFor(Runnable paramRunnable, T paramT)
  {
    return new Am(paramRunnable, paramT);
  }
  
  protected final <T> RunnableFuture<T> newTaskFor(Callable<T> paramCallable)
  {
    return new Am(paramCallable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */