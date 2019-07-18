import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class xba
{
  public static ExecutorService a(String paramString)
  {
    ExecutorService localExecutorService = Executors.newSingleThreadExecutor(c(paramString));
    a(paramString, localExecutorService);
    return localExecutorService;
  }
  
  private static final void a(String paramString, ExecutorService paramExecutorService)
  {
    a(paramString, paramExecutorService, 2L, TimeUnit.SECONDS);
  }
  
  public static final void a(String paramString, ExecutorService paramExecutorService, long paramLong, TimeUnit paramTimeUnit)
  {
    Runtime localRuntime = Runtime.getRuntime();
    paramTimeUnit = new wba(paramString, paramExecutorService, paramLong, paramTimeUnit);
    paramExecutorService = new StringBuilder();
    paramExecutorService.append("Crashlytics Shutdown Hook for ");
    paramExecutorService.append(paramString);
    localRuntime.addShutdownHook(new Thread(paramTimeUnit, paramExecutorService.toString()));
  }
  
  public static ScheduledExecutorService b(String paramString)
  {
    ScheduledExecutorService localScheduledExecutorService = Executors.newSingleThreadScheduledExecutor(c(paramString));
    a(paramString, localScheduledExecutorService);
    return localScheduledExecutorService;
  }
  
  public static final ThreadFactory c(String paramString)
  {
    return new vba(paramString, new AtomicLong(1L));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */