import java.util.concurrent.atomic.AtomicBoolean;

final class RTa$b<T>
  extends AtomicBoolean
  implements VQa<T>, kRa
{
  final VQa<? super T> a;
  final RTa<T> b;
  final RTa.a c;
  kRa d;
  
  RTa$b(VQa<? super T> paramVQa, RTa<T> paramRTa, RTa.a parama)
  {
    this.a = paramVQa;
    this.b = paramRTa;
    this.c = parama;
  }
  
  public void a()
  {
    if (compareAndSet(false, true))
    {
      this.b.b(this.c);
      this.a.a();
    }
  }
  
  public void a(T paramT)
  {
    this.a.a(paramT);
  }
  
  public void a(Throwable paramThrowable)
  {
    if (compareAndSet(false, true))
    {
      this.b.b(this.c);
      this.a.a(paramThrowable);
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.d, paramkRa))
    {
      this.d = paramkRa;
      this.a.a(this);
    }
  }
  
  public boolean h()
  {
    return this.d.h();
  }
  
  public void i()
  {
    this.d.i();
    if (compareAndSet(false, true)) {
      this.b.a(this.c);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/RTa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */