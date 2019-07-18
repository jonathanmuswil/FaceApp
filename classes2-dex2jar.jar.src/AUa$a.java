import java.util.concurrent.atomic.AtomicReference;

final class aUa$a<T>
  extends AtomicReference<kRa>
  implements VQa<T>, kRa
{
  final VQa<? super T> a;
  final AtomicReference<kRa> b;
  
  aUa$a(VQa<? super T> paramVQa)
  {
    this.a = paramVQa;
    this.b = new AtomicReference();
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(T paramT)
  {
    this.a.a(paramT);
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    IRa.c(this.b, paramkRa);
  }
  
  void b(kRa paramkRa)
  {
    IRa.c(this, paramkRa);
  }
  
  public boolean h()
  {
    return IRa.a((kRa)get());
  }
  
  public void i()
  {
    IRa.a(this.b);
    IRa.a(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/aUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */