import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class CVa$a
  extends fVa<T>
{
  CVa$a(CVa paramCVa) {}
  
  public int a(int paramInt)
  {
    if ((paramInt & 0x2) != 0)
    {
      this.a.l = true;
      return 2;
    }
    return 0;
  }
  
  public void a(long paramLong)
  {
    if (kVa.c(paramLong))
    {
      nVa.a(this.a.k, paramLong);
      this.a.k();
    }
  }
  
  public void cancel()
  {
    if (this.a.h) {
      return;
    }
    CVa localCVa = this.a;
    localCVa.h = true;
    localCVa.j();
    localCVa = this.a;
    if ((!localCVa.l) && (localCVa.j.getAndIncrement() == 0))
    {
      this.a.b.clear();
      this.a.g.lazySet(null);
    }
  }
  
  public void clear()
  {
    this.a.b.clear();
  }
  
  public boolean isEmpty()
  {
    return this.a.b.isEmpty();
  }
  
  public T poll()
  {
    return (T)this.a.b.poll();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/CVa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */