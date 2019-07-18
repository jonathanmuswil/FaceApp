import java.util.concurrent.atomic.AtomicReference;

final class tUa$a<T>
  extends AtomicReference<kRa>
  implements ZQa<T>, zQa, kRa
{
  final zQa a;
  final DRa<? super T, ? extends BQa> b;
  
  tUa$a(zQa paramzQa, DRa<? super T, ? extends BQa> paramDRa)
  {
    this.a = paramzQa;
    this.b = paramDRa;
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    IRa.a(this, paramkRa);
  }
  
  public void b(T paramT)
  {
    try
    {
      paramT = this.b.apply(paramT);
      ORa.a(paramT, "The mapper returned a null CompletableSource");
      paramT = (BQa)paramT;
      if (!h()) {
        paramT.a(this);
      }
      return;
    }
    catch (Throwable paramT)
    {
      pRa.b(paramT);
      a(paramT);
    }
  }
  
  public boolean h()
  {
    return IRa.a((kRa)get());
  }
  
  public void i()
  {
    IRa.a(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */