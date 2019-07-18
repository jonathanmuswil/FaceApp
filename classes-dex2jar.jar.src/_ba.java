import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class _ba
  extends ThreadPoolExecutor
{
  private static final int a = Runtime.getRuntime().availableProcessors();
  private static final int b;
  private static final int c;
  
  static
  {
    int i = a;
    b = i + 1;
    c = i * 2 + 1;
  }
  
  <T extends Runnable,  extends Qba,  extends aca,  extends Yba> _ba(int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, Rba<T> paramRba, ThreadFactory paramThreadFactory)
  {
    super(paramInt1, paramInt2, paramLong, paramTimeUnit, paramRba, paramThreadFactory);
    prestartAllCoreThreads();
  }
  
  public static _ba a()
  {
    return a(b, c);
  }
  
  public static <T extends Runnable,  extends Qba,  extends aca,  extends Yba> _ba a(int paramInt1, int paramInt2)
  {
    return new _ba(paramInt1, paramInt2, 1L, TimeUnit.SECONDS, new Rba(), new _ba.a(10));
  }
  
  protected void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    aca localaca = (aca)paramRunnable;
    localaca.a(true);
    localaca.a(paramThrowable);
    getQueue().m();
    super.afterExecute(paramRunnable, paramThrowable);
  }
  
  @TargetApi(9)
  public void execute(Runnable paramRunnable)
  {
    if (Zba.b(paramRunnable)) {
      super.execute(paramRunnable);
    } else {
      super.execute(newTaskFor(paramRunnable, null));
    }
  }
  
  public Rba getQueue()
  {
    return (Rba)super.getQueue();
  }
  
  protected <T> RunnableFuture<T> newTaskFor(Runnable paramRunnable, T paramT)
  {
    return new Xba(paramRunnable, paramT);
  }
  
  protected <T> RunnableFuture<T> newTaskFor(Callable<T> paramCallable)
  {
    return new Xba(paramCallable);
  }
  
  protected static final class a
    implements ThreadFactory
  {
    private final int a;
    
    public a(int paramInt)
    {
      this.a = paramInt;
    }
    
    public Thread newThread(Runnable paramRunnable)
    {
      paramRunnable = new Thread(paramRunnable);
      paramRunnable.setPriority(this.a);
      paramRunnable.setName("Queue");
      return paramRunnable;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */