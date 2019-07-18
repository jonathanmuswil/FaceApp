final class wTa$a<T>
  implements VQa<T>, kRa
{
  final LQa<? super T> a;
  final long b;
  kRa c;
  long d;
  boolean e;
  
  wTa$a(LQa<? super T> paramLQa, long paramLong)
  {
    this.a = paramLQa;
    this.b = paramLong;
  }
  
  public void a()
  {
    if (!this.e)
    {
      this.e = true;
      this.a.a();
    }
  }
  
  public void a(T paramT)
  {
    if (this.e) {
      return;
    }
    long l = this.d;
    if (l == this.b)
    {
      this.e = true;
      this.c.i();
      this.a.b(paramT);
      return;
    }
    this.d = (l + 1L);
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.e)
    {
      zVa.b(paramThrowable);
      return;
    }
    this.e = true;
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.c, paramkRa))
    {
      this.c = paramkRa;
      this.a.a(this);
    }
  }
  
  public boolean h()
  {
    return this.c.h();
  }
  
  public void i()
  {
    this.c.i();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */