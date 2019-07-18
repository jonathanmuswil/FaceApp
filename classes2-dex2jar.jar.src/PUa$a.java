final class pUa$a<T>
  implements ZQa<T>
{
  final ZQa<? super T> a;
  final ARa<? super kRa> b;
  boolean c;
  
  pUa$a(ZQa<? super T> paramZQa, ARa<? super kRa> paramARa)
  {
    this.a = paramZQa;
    this.b = paramARa;
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.c)
    {
      zVa.b(paramThrowable);
      return;
    }
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    try
    {
      this.b.accept(paramkRa);
      this.a.a(paramkRa);
      return;
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      this.c = true;
      paramkRa.i();
      JRa.a(localThrowable, this.a);
    }
  }
  
  public void b(T paramT)
  {
    if (this.c) {
      return;
    }
    this.a.b(paramT);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */