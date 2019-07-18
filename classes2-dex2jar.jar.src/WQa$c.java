import java.util.concurrent.TimeUnit;

public abstract class WQa$c
  implements kRa
{
  public long a(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
  }
  
  public kRa a(Runnable paramRunnable)
  {
    return a(paramRunnable, 0L, TimeUnit.NANOSECONDS);
  }
  
  public kRa a(Runnable paramRunnable, long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    MRa localMRa1 = new MRa();
    MRa localMRa2 = new MRa(localMRa1);
    paramRunnable = zVa.a(paramRunnable);
    long l = paramTimeUnit.toNanos(paramLong2);
    paramLong2 = a(TimeUnit.NANOSECONDS);
    paramRunnable = a(new WQa.c.a(paramLong2 + paramTimeUnit.toNanos(paramLong1), paramRunnable, paramLong2, localMRa2, l), paramLong1, paramTimeUnit);
    if (paramRunnable == JRa.a) {
      return paramRunnable;
    }
    localMRa1.a(paramRunnable);
    return localMRa2;
  }
  
  public abstract kRa a(Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit);
  
  final class a
    implements Runnable, DVa
  {
    final Runnable a;
    final MRa b;
    final long c;
    long d;
    long e;
    long f;
    
    a(long paramLong1, Runnable paramRunnable, long paramLong2, MRa paramMRa, long paramLong3)
    {
      this.a = paramRunnable;
      this.b = paramMRa;
      this.c = paramLong3;
      this.e = paramLong2;
      this.f = paramLong1;
    }
    
    public void run()
    {
      this.a.run();
      if (!this.b.h())
      {
        long l1 = WQa.c.this.a(TimeUnit.NANOSECONDS);
        long l2 = WQa.a;
        long l3 = this.e;
        if (l1 + l2 >= l3)
        {
          l4 = this.c;
          if (l1 < l3 + l4 + l2)
          {
            l3 = this.f;
            l2 = this.d + 1L;
            this.d = l2;
            l4 = l3 + l2 * l4;
            break label135;
          }
        }
        l3 = this.c;
        long l4 = l1 + l3;
        l2 = this.d + 1L;
        this.d = l2;
        this.f = (l4 - l3 * l2);
        label135:
        this.e = l1;
        this.b.a(WQa.c.this.a(this, l4 - l1, TimeUnit.NANOSECONDS));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WQa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */