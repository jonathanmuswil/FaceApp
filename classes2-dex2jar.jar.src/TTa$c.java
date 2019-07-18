import java.util.concurrent.atomic.AtomicInteger;

final class TTa$c<T>
  extends AtomicInteger
  implements kRa
{
  final TTa.g<T> a;
  final VQa<? super T> b;
  Object c;
  volatile boolean d;
  
  TTa$c(TTa.g<T> paramg, VQa<? super T> paramVQa)
  {
    this.a = paramg;
    this.b = paramVQa;
  }
  
  <U> U a()
  {
    return (U)this.c;
  }
  
  public boolean h()
  {
    return this.d;
  }
  
  public void i()
  {
    if (!this.d)
    {
      this.d = true;
      this.a.b(this);
      this.c = null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/TTa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */