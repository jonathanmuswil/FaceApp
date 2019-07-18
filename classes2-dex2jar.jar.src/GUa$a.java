import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

final class gUa$a<T>
  extends AtomicReference<kRa>
  implements VQa<T>, kRa, Runnable
{
  final VQa<? super T> a;
  final long b;
  final TimeUnit c;
  final WQa.c d;
  kRa e;
  volatile boolean f;
  boolean g;
  
  gUa$a(VQa<? super T> paramVQa, long paramLong, TimeUnit paramTimeUnit, WQa.c paramc)
  {
    this.a = paramVQa;
    this.b = paramLong;
    this.c = paramTimeUnit;
    this.d = paramc;
  }
  
  public void a()
  {
    if (!this.g)
    {
      this.g = true;
      this.a.a();
      this.d.i();
    }
  }
  
  public void a(T paramT)
  {
    if ((!this.f) && (!this.g))
    {
      this.f = true;
      this.a.a(paramT);
      paramT = (kRa)get();
      if (paramT != null) {
        paramT.i();
      }
      IRa.a(this, this.d.a(this, this.b, this.c));
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.g)
    {
      zVa.b(paramThrowable);
    }
    else
    {
      this.g = true;
      this.a.a(paramThrowable);
      this.d.i();
    }
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.e, paramkRa))
    {
      this.e = paramkRa;
      this.a.a(this);
    }
  }
  
  public boolean h()
  {
    return this.d.h();
  }
  
  public void i()
  {
    this.e.i();
    this.d.i();
  }
  
  public void run()
  {
    this.f = false;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */