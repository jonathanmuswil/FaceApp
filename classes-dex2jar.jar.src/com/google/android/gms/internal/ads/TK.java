package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@yh
public final class tk
{
  public static final Bm a = Cm.a(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), a("Default")));
  public static final Bm b;
  public static final ScheduledExecutorService c = new ScheduledThreadPoolExecutor(3, a("Schedule"));
  
  static
  {
    ThreadPoolExecutor localThreadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), a("Loader"));
    localThreadPoolExecutor.allowCoreThreadTimeOut(true);
    b = Cm.a(localThreadPoolExecutor);
  }
  
  public static xm<?> a(Runnable paramRunnable)
  {
    return a.a(paramRunnable);
  }
  
  public static <T> xm<T> a(Callable<T> paramCallable)
  {
    return a.a(paramCallable);
  }
  
  private static ThreadFactory a(String paramString)
  {
    return new uk(paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */