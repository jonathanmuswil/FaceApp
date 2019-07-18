final class dUa$a<T>
  implements VQa<T>, kRa
{
  final VQa<? super T> a;
  boolean b;
  kRa c;
  long d;
  
  dUa$a(VQa<? super T> paramVQa, long paramLong)
  {
    this.a = paramVQa;
    this.d = paramLong;
  }
  
  public void a()
  {
    if (!this.b)
    {
      this.b = true;
      this.c.i();
      this.a.a();
    }
  }
  
  public void a(T paramT)
  {
    if (!this.b)
    {
      long l = this.d;
      this.d = (l - 1L);
      if (l > 0L)
      {
        int i;
        if (this.d == 0L) {
          i = 1;
        } else {
          i = 0;
        }
        this.a.a(paramT);
        if (i != 0) {
          a();
        }
      }
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.b)
    {
      zVa.b(paramThrowable);
      return;
    }
    this.b = true;
    this.c.i();
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.c, paramkRa))
    {
      this.c = paramkRa;
      if (this.d == 0L)
      {
        this.b = true;
        paramkRa.i();
        JRa.a(this.a);
      }
      else
      {
        this.a.a(this);
      }
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */