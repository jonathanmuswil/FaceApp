import java.util.concurrent.atomic.AtomicReference;

final class eTa$a$a<T>
  implements LQa<T>
{
  final LQa<? super T> a;
  final AtomicReference<kRa> b;
  
  eTa$a$a(LQa<? super T> paramLQa, AtomicReference<kRa> paramAtomicReference)
  {
    this.a = paramLQa;
    this.b = paramAtomicReference;
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
    IRa.c(this.b, paramkRa);
  }
  
  public void b(T paramT)
  {
    this.a.b(paramT);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eTa$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */