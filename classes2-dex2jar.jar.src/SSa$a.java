import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

final class sSa$a
  extends AtomicBoolean
  implements zQa
{
  final jRa a;
  final zQa b;
  final AtomicInteger c;
  
  sSa$a(zQa paramzQa, jRa paramjRa, AtomicInteger paramAtomicInteger)
  {
    this.b = paramzQa;
    this.a = paramjRa;
    this.c = paramAtomicInteger;
  }
  
  public void a()
  {
    if ((this.c.decrementAndGet() == 0) && (compareAndSet(false, true))) {
      this.b.a();
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.i();
    if (compareAndSet(false, true)) {
      this.b.a(paramThrowable);
    } else {
      zVa.b(paramThrowable);
    }
  }
  
  public void a(kRa paramkRa)
  {
    this.a.b(paramkRa);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */