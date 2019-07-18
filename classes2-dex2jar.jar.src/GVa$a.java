import java.util.concurrent.atomic.AtomicBoolean;

final class GVa$a<T>
  extends AtomicBoolean
  implements kRa
{
  final VQa<? super T> a;
  final GVa<T> b;
  
  GVa$a(VQa<? super T> paramVQa, GVa<T> paramGVa)
  {
    this.a = paramVQa;
    this.b = paramGVa;
  }
  
  public void a()
  {
    if (!get()) {
      this.a.a();
    }
  }
  
  public void a(T paramT)
  {
    if (!get()) {
      this.a.a(paramT);
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    if (get()) {
      zVa.b(paramThrowable);
    } else {
      this.a.a(paramThrowable);
    }
  }
  
  public boolean h()
  {
    return get();
  }
  
  public void i()
  {
    if (compareAndSet(false, true)) {
      this.b.b(this);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/GVa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */