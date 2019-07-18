import java.util.concurrent.TimeUnit;

final class WQa$c$a
  implements Runnable, DVa
{
  final Runnable a;
  final MRa b;
  final long c;
  long d;
  long e;
  long f;
  
  WQa$c$a(WQa.c paramc, long paramLong1, Runnable paramRunnable, long paramLong2, MRa paramMRa, long paramLong3)
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
      long l1 = this.g.a(TimeUnit.NANOSECONDS);
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
      this.b.a(this.g.a(this, l4 - l1, TimeUnit.NANOSECONDS));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WQa$c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */