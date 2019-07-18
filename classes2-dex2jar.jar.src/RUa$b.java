import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

final class RUa$b
  extends WQa.c
{
  private final jRa a;
  private final RUa.a b;
  private final RUa.c c;
  final AtomicBoolean d = new AtomicBoolean();
  
  RUa$b(RUa.a parama)
  {
    this.b = parama;
    this.a = new jRa();
    this.c = parama.b();
  }
  
  public kRa a(Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit)
  {
    if (this.a.h()) {
      return JRa.a;
    }
    return this.c.a(paramRunnable, paramLong, paramTimeUnit, this.a);
  }
  
  public boolean h()
  {
    return this.d.get();
  }
  
  public void i()
  {
    if (this.d.compareAndSet(false, true))
    {
      this.a.i();
      this.b.a(this.c);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/RUa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */