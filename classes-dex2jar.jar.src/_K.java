import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

class _k
{
  private final ExecutorService a;
  
  public _k(ExecutorService paramExecutorService)
  {
    this.a = paramExecutorService;
  }
  
  Future<?> a(Runnable paramRunnable)
  {
    try
    {
      ExecutorService localExecutorService = this.a;
      Yk localYk = new Yk;
      localYk.<init>(this, paramRunnable);
      paramRunnable = localExecutorService.submit(localYk);
      return paramRunnable;
    }
    catch (RejectedExecutionException paramRunnable)
    {
      Naa.e().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
    }
    return null;
  }
  
  <T> Future<T> a(Callable<T> paramCallable)
  {
    try
    {
      ExecutorService localExecutorService = this.a;
      Zk localZk = new Zk;
      localZk.<init>(this, paramCallable);
      paramCallable = localExecutorService.submit(localZk);
      return paramCallable;
    }
    catch (RejectedExecutionException paramCallable)
    {
      Naa.e().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
    }
    return null;
  }
  
  <T> T b(Callable<T> paramCallable)
  {
    try
    {
      if (Looper.getMainLooper() == Looper.myLooper()) {
        return (T)this.a.submit(paramCallable).get(4L, TimeUnit.SECONDS);
      }
      paramCallable = this.a.submit(paramCallable).get();
      return paramCallable;
    }
    catch (Exception paramCallable)
    {
      Naa.e().b("CrashlyticsCore", "Failed to execute task.", paramCallable);
      return null;
    }
    catch (RejectedExecutionException paramCallable)
    {
      Naa.e().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */