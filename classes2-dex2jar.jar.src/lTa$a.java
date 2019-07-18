import java.util.concurrent.atomic.AtomicReference;

final class lTa$a<T, R>
  extends AtomicReference<kRa>
  implements VQa<T>
{
  final lTa.b<T, R> a;
  final int b;
  
  lTa$a(lTa.b<T, R> paramb, int paramInt)
  {
    this.a = paramb;
    this.b = paramInt;
  }
  
  public void a()
  {
    this.a.a(this.b);
  }
  
  public void a(T paramT)
  {
    this.a.a(this.b, paramT);
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.a(this.b, paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    IRa.c(this, paramkRa);
  }
  
  public void b()
  {
    IRa.a(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */