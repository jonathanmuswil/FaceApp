import java.util.concurrent.atomic.AtomicReference;

final class iTa$a<T, R>
  extends AtomicReference<kRa>
  implements VQa<R>, ZQa<T>, kRa
{
  final VQa<? super R> a;
  final DRa<? super T, ? extends TQa<? extends R>> b;
  
  iTa$a(VQa<? super R> paramVQa, DRa<? super T, ? extends TQa<? extends R>> paramDRa)
  {
    this.a = paramVQa;
    this.b = paramDRa;
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(R paramR)
  {
    this.a.a(paramR);
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
      ORa.a(paramT, "The mapper returned a null Publisher");
      paramT = (TQa)paramT;
      paramT.a(this);
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/iTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */