final class aTa$a<T>
  implements ZQa<T>, kRa
{
  final LQa<? super T> a;
  final FRa<? super T> b;
  kRa c;
  
  aTa$a(LQa<? super T> paramLQa, FRa<? super T> paramFRa)
  {
    this.a = paramLQa;
    this.b = paramFRa;
  }
  
  public void a(Throwable paramThrowable)
  {
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
  
  public void b(T paramT)
  {
    try
    {
      boolean bool = this.b.test(paramT);
      if (bool) {
        this.a.b(paramT);
      } else {
        this.a.a();
      }
      return;
    }
    catch (Throwable paramT)
    {
      pRa.b(paramT);
      this.a.a(paramT);
    }
  }
  
  public boolean h()
  {
    return this.c.h();
  }
  
  public void i()
  {
    kRa localkRa = this.c;
    this.c = IRa.a;
    localkRa.i();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/aTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */