import java.util.concurrent.atomic.AtomicInteger;

final class UTa$a<T>
  extends AtomicInteger
  implements VQa<T>
{
  final VQa<? super T> a;
  final MRa b;
  final TQa<? extends T> c;
  final FRa<? super Throwable> d;
  long e;
  
  UTa$a(VQa<? super T> paramVQa, long paramLong, FRa<? super Throwable> paramFRa, MRa paramMRa, TQa<? extends T> paramTQa)
  {
    this.a = paramVQa;
    this.b = paramMRa;
    this.c = paramTQa;
    this.d = paramFRa;
    this.e = paramLong;
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(T paramT)
  {
    this.a.a(paramT);
  }
  
  public void a(Throwable paramThrowable)
  {
    long l = this.e;
    if (l != Long.MAX_VALUE) {
      this.e = (l - 1L);
    }
    if (l == 0L) {
      this.a.a(paramThrowable);
    }
    try
    {
      boolean bool = this.d.test(paramThrowable);
      if (!bool)
      {
        this.a.a(paramThrowable);
        return;
      }
      b();
      return;
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      this.a.a(new oRa(new Throwable[] { paramThrowable, localThrowable }));
    }
  }
  
  public void a(kRa paramkRa)
  {
    this.b.a(paramkRa);
  }
  
  void b()
  {
    if (getAndIncrement() == 0)
    {
      int i = 1;
      int j;
      do
      {
        if (this.b.h()) {
          return;
        }
        this.c.a(this);
        j = addAndGet(-i);
        i = j;
      } while (j != 0);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/UTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */