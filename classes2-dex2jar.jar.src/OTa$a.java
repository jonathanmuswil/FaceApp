import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class oTa$a<T>
  extends AtomicReference<kRa>
  implements Runnable, kRa
{
  final T a;
  final long b;
  final oTa.b<T> c;
  final AtomicBoolean d = new AtomicBoolean();
  
  oTa$a(T paramT, long paramLong, oTa.b<T> paramb)
  {
    this.a = paramT;
    this.b = paramLong;
    this.c = paramb;
  }
  
  public void a(kRa paramkRa)
  {
    IRa.a(this, paramkRa);
  }
  
  public boolean h()
  {
    boolean bool;
    if (get() == IRa.a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void i()
  {
    IRa.a(this);
  }
  
  public void run()
  {
    if (this.d.compareAndSet(false, true)) {
      this.c.a(this.b, this.a, this);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */