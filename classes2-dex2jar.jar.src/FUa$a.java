final class fUa$a<T>
  implements VQa<T>, kRa
{
  final VQa<? super T> a;
  final FRa<? super T> b;
  kRa c;
  boolean d;
  
  fUa$a(VQa<? super T> paramVQa, FRa<? super T> paramFRa)
  {
    this.a = paramVQa;
    this.b = paramFRa;
  }
  
  public void a()
  {
    if (this.d) {
      return;
    }
    this.d = true;
    this.a.a();
  }
  
  public void a(T paramT)
  {
    if (this.d) {
      return;
    }
    try
    {
      boolean bool = this.b.test(paramT);
      if (!bool)
      {
        this.d = true;
        this.c.i();
        this.a.a();
        return;
      }
      this.a.a(paramT);
      return;
    }
    catch (Throwable paramT)
    {
      pRa.b(paramT);
      this.c.i();
      a(paramT);
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.d)
    {
      zVa.b(paramThrowable);
      return;
    }
    this.d = true;
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */