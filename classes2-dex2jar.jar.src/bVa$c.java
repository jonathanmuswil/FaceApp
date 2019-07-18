import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class bVa$c
  extends WQa.c
  implements kRa
{
  final PriorityBlockingQueue<bVa.b> a = new PriorityBlockingQueue();
  private final AtomicInteger b = new AtomicInteger();
  final AtomicInteger c = new AtomicInteger();
  volatile boolean d;
  
  public kRa a(Runnable paramRunnable)
  {
    return a(paramRunnable, a(TimeUnit.MILLISECONDS));
  }
  
  kRa a(Runnable paramRunnable, long paramLong)
  {
    if (this.d) {
      return JRa.a;
    }
    paramRunnable = new bVa.b(paramRunnable, Long.valueOf(paramLong), this.c.incrementAndGet());
    this.a.add(paramRunnable);
    if (this.b.getAndIncrement() == 0)
    {
      int i = 1;
      for (;;)
      {
        if (this.d)
        {
          this.a.clear();
          return JRa.a;
        }
        paramRunnable = (bVa.b)this.a.poll();
        if (paramRunnable == null)
        {
          int j = this.b.addAndGet(-i);
          i = j;
          if (j == 0) {
            return JRa.a;
          }
        }
        else if (!paramRunnable.d)
        {
          paramRunnable.a.run();
        }
      }
    }
    return lRa.a(new bVa.c.a(paramRunnable));
  }
  
  public kRa a(Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit)
  {
    paramLong = a(TimeUnit.MILLISECONDS) + paramTimeUnit.toMillis(paramLong);
    return a(new bVa.a(paramRunnable, this, paramLong), paramLong);
  }
  
  public boolean h()
  {
    return this.d;
  }
  
  public void i()
  {
    this.d = true;
  }
  
  final class a
    implements Runnable
  {
    final bVa.b a;
    
    a(bVa.b paramb)
    {
      this.a = paramb;
    }
    
    public void run()
    {
      bVa.b localb = this.a;
      localb.d = true;
      bVa.c.this.a.remove(localb);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bVa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */