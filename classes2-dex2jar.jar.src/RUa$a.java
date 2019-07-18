import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

final class RUa$a
  implements Runnable
{
  private final long a;
  private final ConcurrentLinkedQueue<RUa.c> b;
  final jRa c;
  private final ScheduledExecutorService d;
  private final Future<?> e;
  private final ThreadFactory f;
  
  RUa$a(long paramLong, TimeUnit paramTimeUnit, ThreadFactory paramThreadFactory)
  {
    if (paramTimeUnit != null) {
      paramLong = paramTimeUnit.toNanos(paramLong);
    } else {
      paramLong = 0L;
    }
    this.a = paramLong;
    this.b = new ConcurrentLinkedQueue();
    this.c = new jRa();
    this.f = paramThreadFactory;
    paramThreadFactory = null;
    if (paramTimeUnit != null)
    {
      paramThreadFactory = Executors.newScheduledThreadPool(1, RUa.c);
      paramLong = this.a;
      paramTimeUnit = paramThreadFactory.scheduleWithFixedDelay(this, paramLong, paramLong, TimeUnit.NANOSECONDS);
    }
    else
    {
      paramTimeUnit = null;
    }
    this.d = paramThreadFactory;
    this.e = paramTimeUnit;
  }
  
  void a()
  {
    if (!this.b.isEmpty())
    {
      long l = c();
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        RUa.c localc = (RUa.c)localIterator.next();
        if (localc.b() > l) {
          break;
        }
        if (this.b.remove(localc)) {
          this.c.a(localc);
        }
      }
    }
  }
  
  void a(RUa.c paramc)
  {
    paramc.a(c() + this.a);
    this.b.offer(paramc);
  }
  
  RUa.c b()
  {
    if (this.c.h()) {
      return RUa.f;
    }
    while (!this.b.isEmpty())
    {
      localc = (RUa.c)this.b.poll();
      if (localc != null) {
        return localc;
      }
    }
    RUa.c localc = new RUa.c(this.f);
    this.c.b(localc);
    return localc;
  }
  
  long c()
  {
    return System.nanoTime();
  }
  
  void d()
  {
    this.c.i();
    Object localObject = this.e;
    if (localObject != null) {
      ((Future)localObject).cancel(true);
    }
    localObject = this.d;
    if (localObject != null) {
      ((ScheduledExecutorService)localObject).shutdownNow();
    }
  }
  
  public void run()
  {
    a();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/RUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */