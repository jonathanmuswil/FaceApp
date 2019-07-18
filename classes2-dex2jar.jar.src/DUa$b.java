import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

final class DUa$b
  extends AtomicReference<Pab>
  implements HQa<Object>
{
  final DUa.a<?> a;
  
  DUa$b(DUa.a<?> parama)
  {
    this.a = parama;
  }
  
  public void a()
  {
    Object localObject = get();
    kVa localkVa = kVa.a;
    if (localObject != localkVa)
    {
      lazySet(localkVa);
      this.a.b(new CancellationException());
    }
  }
  
  public void a(Pab paramPab)
  {
    kVa.a(this, paramPab, Long.MAX_VALUE);
  }
  
  public void a(Object paramObject)
  {
    if (kVa.a(this)) {
      this.a.b(new CancellationException());
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.b(paramThrowable);
  }
  
  public void b()
  {
    kVa.a(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/DUa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */