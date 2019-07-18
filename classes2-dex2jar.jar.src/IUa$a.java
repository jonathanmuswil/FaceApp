import java.util.concurrent.atomic.AtomicReference;

final class iUa$a<T, U, R>
  extends AtomicReference<U>
  implements VQa<T>, kRa
{
  final VQa<? super R> a;
  final wRa<? super T, ? super U, ? extends R> b;
  final AtomicReference<kRa> c = new AtomicReference();
  final AtomicReference<kRa> d = new AtomicReference();
  
  iUa$a(VQa<? super R> paramVQa, wRa<? super T, ? super U, ? extends R> paramwRa)
  {
    this.a = paramVQa;
    this.b = paramwRa;
  }
  
  public void a()
  {
    IRa.a(this.d);
    this.a.a();
  }
  
  public void a(T paramT)
  {
    Object localObject = get();
    if (localObject != null) {
      try
      {
        paramT = this.b.apply(paramT, localObject);
        ORa.a(paramT, "The combiner returned a null value");
        this.a.a(paramT);
      }
      catch (Throwable paramT)
      {
        pRa.b(paramT);
        i();
        this.a.a(paramT);
      }
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    IRa.a(this.d);
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    IRa.c(this.c, paramkRa);
  }
  
  public void b(Throwable paramThrowable)
  {
    IRa.a(this.c);
    this.a.a(paramThrowable);
  }
  
  public boolean b(kRa paramkRa)
  {
    return IRa.c(this.d, paramkRa);
  }
  
  public boolean h()
  {
    return IRa.a((kRa)this.c.get());
  }
  
  public void i()
  {
    IRa.a(this.c);
    IRa.a(this.d);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/iUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */