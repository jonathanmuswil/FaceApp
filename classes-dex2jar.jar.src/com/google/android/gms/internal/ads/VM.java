package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@yh
final class vm<T>
  implements xm<T>
{
  private final Throwable a;
  private final ym b;
  
  vm(Throwable paramThrowable)
  {
    this.a = paramThrowable;
    this.b = new ym();
    this.b.a();
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor)
  {
    this.b.a(paramRunnable, paramExecutor);
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    return false;
  }
  
  public final T get()
    throws ExecutionException
  {
    throw new ExecutionException(this.a);
  }
  
  public final T get(long paramLong, TimeUnit paramTimeUnit)
    throws ExecutionException
  {
    throw new ExecutionException(this.a);
  }
  
  public final boolean isCancelled()
  {
    return false;
  }
  
  public final boolean isDone()
  {
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */