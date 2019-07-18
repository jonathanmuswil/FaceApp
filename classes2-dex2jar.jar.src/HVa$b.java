import java.util.concurrent.atomic.AtomicInteger;

final class HVa$b<T>
  extends AtomicInteger
  implements kRa
{
  final VQa<? super T> a;
  final HVa<T> b;
  Object c;
  volatile boolean d;
  
  HVa$b(VQa<? super T> paramVQa, HVa<T> paramHVa)
  {
    this.a = paramVQa;
    this.b = paramHVa;
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
      this.b.b(this);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/HVa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */