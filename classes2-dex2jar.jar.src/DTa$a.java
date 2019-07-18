import java.util.concurrent.atomic.AtomicReference;

final class dTa$a<T>
  extends AtomicReference<kRa>
  implements LQa<T>, kRa
{
  final MRa a;
  final LQa<? super T> b;
  
  dTa$a(LQa<? super T> paramLQa)
  {
    this.b = paramLQa;
    this.a = new MRa();
  }
  
  public void a()
  {
    this.b.a();
  }
  
  public void a(Throwable paramThrowable)
  {
    this.b.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    IRa.c(this, paramkRa);
  }
  
  public void b(T paramT)
  {
    this.b.b(paramT);
  }
  
  public boolean h()
  {
    return IRa.a((kRa)get());
  }
  
  public void i()
  {
    IRa.a(this);
    this.a.i();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */