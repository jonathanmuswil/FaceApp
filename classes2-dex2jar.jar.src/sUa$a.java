import java.util.concurrent.atomic.AtomicReference;

final class sUa$a<T, R>
  extends AtomicReference<kRa>
  implements ZQa<T>, kRa
{
  final ZQa<? super R> a;
  final DRa<? super T, ? extends aRa<? extends R>> b;
  
  sUa$a(ZQa<? super R> paramZQa, DRa<? super T, ? extends aRa<? extends R>> paramDRa)
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
    if (IRa.c(this, paramkRa)) {
      this.a.a(this);
    }
  }
  
  public void b(T paramT)
  {
    try
    {
      paramT = this.b.apply(paramT);
      ORa.a(paramT, "The single returned by the mapper is null");
      paramT = (aRa)paramT;
      if (!h()) {
        paramT.a(new sUa.a.a(this, this.a));
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
    return IRa.a((kRa)get());
  }
  
  public void i()
  {
    IRa.a(this);
  }
  
  static final class a<R>
    implements ZQa<R>
  {
    final AtomicReference<kRa> a;
    final ZQa<? super R> b;
    
    a(AtomicReference<kRa> paramAtomicReference, ZQa<? super R> paramZQa)
    {
      this.a = paramAtomicReference;
      this.b = paramZQa;
    }
    
    public void a(Throwable paramThrowable)
    {
      this.b.a(paramThrowable);
    }
    
    public void a(kRa paramkRa)
    {
      IRa.a(this.a, paramkRa);
    }
    
    public void b(R paramR)
    {
      this.b.b(paramR);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */