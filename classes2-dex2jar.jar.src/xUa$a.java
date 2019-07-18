final class xUa$a<T, R>
  implements ZQa<T>
{
  final ZQa<? super R> a;
  final DRa<? super T, ? extends R> b;
  
  xUa$a(ZQa<? super R> paramZQa, DRa<? super T, ? extends R> paramDRa)
  {
    this.a = paramZQa;
    this.b = paramDRa;
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
      paramT = this.b.apply(paramT);
      ORa.a(paramT, "The mapper function returned a null value.");
      this.a.b(paramT);
      return;
    }
    catch (Throwable paramT)
    {
      pRa.b(paramT);
      a(paramT);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */