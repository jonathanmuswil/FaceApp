final class oUa$a
  implements ZQa<T>
{
  private final ZQa<? super T> a;
  
  oUa$a(ZQa<? super T> paramZQa)
  {
    ZQa localZQa;
    this.a = localZQa;
  }
  
  public void a(Throwable paramThrowable)
  {
    try
    {
      this.b.b.accept(null, paramThrowable);
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      paramThrowable = new oRa(new Throwable[] { paramThrowable, localThrowable });
    }
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
      this.b.b.accept(paramT, null);
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */