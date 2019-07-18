final class qUa$a
  implements ZQa<T>
{
  final ZQa<? super T> a;
  
  qUa$a(ZQa<? super T> paramZQa)
  {
    ZQa localZQa;
    this.a = localZQa;
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    this.a.a(paramkRa);
  }
  
  public void b(T paramT)
  {
    try
    {
      this.b.b.accept(paramT);
      this.a.b(paramT);
      return;
    }
    catch (Throwable paramT)
    {
      pRa.b(paramT);
      this.a.a(paramT);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */