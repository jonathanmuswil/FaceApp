import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

abstract class VTa$c<T>
  extends AtomicReference<T>
  implements VQa<T>, kRa, Runnable
{
  final VQa<? super T> a;
  final long b;
  final TimeUnit c;
  final WQa d;
  final AtomicReference<kRa> e = new AtomicReference();
  kRa f;
  
  VTa$c(VQa<? super T> paramVQa, long paramLong, TimeUnit paramTimeUnit, WQa paramWQa)
  {
    this.a = paramVQa;
    this.b = paramLong;
    this.c = paramTimeUnit;
    this.d = paramWQa;
  }
  
  public void a()
  {
    b();
    c();
  }
  
  public void a(T paramT)
  {
    lazySet(paramT);
  }
  
  public void a(Throwable paramThrowable)
  {
    b();
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.f, paramkRa))
    {
      this.f = paramkRa;
      this.a.a(this);
      paramkRa = this.d;
      long l = this.b;
      paramkRa = paramkRa.a(this, l, l, this.c);
      IRa.a(this.e, paramkRa);
    }
  }
  
  void b()
  {
    IRa.a(this.e);
  }
  
  abstract void c();
  
  void d()
  {
    Object localObject = getAndSet(null);
    if (localObject != null) {
      this.a.a(localObject);
    }
  }
  
  public boolean h()
  {
    return this.f.h();
  }
  
  public void i()
  {
    b();
    this.f.i();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/VTa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */