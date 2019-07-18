import java.util.NoSuchElementException;

final class xTa$a<T>
  implements VQa<T>, kRa
{
  final ZQa<? super T> a;
  final long b;
  final T c;
  kRa d;
  long e;
  boolean f;
  
  xTa$a(ZQa<? super T> paramZQa, long paramLong, T paramT)
  {
    this.a = paramZQa;
    this.b = paramLong;
    this.c = paramT;
  }
  
  public void a()
  {
    if (!this.f)
    {
      this.f = true;
      Object localObject = this.c;
      if (localObject != null) {
        this.a.b(localObject);
      } else {
        this.a.a(new NoSuchElementException());
      }
    }
  }
  
  public void a(T paramT)
  {
    if (this.f) {
      return;
    }
    long l = this.e;
    if (l == this.b)
    {
      this.f = true;
      this.d.i();
      this.a.b(paramT);
      return;
    }
    this.e = (l + 1L);
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.f)
    {
      zVa.b(paramThrowable);
      return;
    }
    this.f = true;
    this.a.a(paramThrowable);
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
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */