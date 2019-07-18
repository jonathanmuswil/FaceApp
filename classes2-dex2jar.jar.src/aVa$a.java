import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class aVa$a
  extends WQa.c
{
  final ScheduledExecutorService a;
  final jRa b;
  volatile boolean c;
  
  aVa$a(ScheduledExecutorService paramScheduledExecutorService)
  {
    this.a = paramScheduledExecutorService;
    this.b = new jRa();
  }
  
  public kRa a(Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit)
  {
    if (this.c) {
      return JRa.a;
    }
    YUa localYUa = new YUa(zVa.a(paramRunnable), this.b);
    this.b.b(localYUa);
    if (paramLong <= 0L) {}
    try
    {
      paramRunnable = this.a.submit(localYUa);
      break label74;
      paramRunnable = this.a.schedule(localYUa, paramLong, paramTimeUnit);
      label74:
      localYUa.a(paramRunnable);
      return localYUa;
    }
    catch (RejectedExecutionException paramRunnable)
    {
      i();
      zVa.b(paramRunnable);
    }
    return JRa.a;
  }
  
  public boolean h()
  {
    return this.c;
  }
  
  public void i()
  {
    if (!this.c)
    {
      this.c = true;
      this.b.i();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/aVa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */