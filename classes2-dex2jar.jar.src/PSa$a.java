import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

final class PSa$a<T>
  extends AtomicInteger
  implements HQa<T>, Pab
{
  final Oab<? super T> a;
  Pab b;
  volatile boolean c;
  Throwable d;
  volatile boolean e;
  final AtomicLong f = new AtomicLong();
  final AtomicReference<T> g = new AtomicReference();
  
  PSa$a(Oab<? super T> paramOab)
  {
    this.a = paramOab;
  }
  
  public void a()
  {
    this.c = true;
    b();
  }
  
  public void a(long paramLong)
  {
    if (kVa.c(paramLong))
    {
      nVa.a(this.f, paramLong);
      b();
    }
  }
  
  public void a(Pab paramPab)
  {
    if (kVa.a(this.b, paramPab))
    {
      this.b = paramPab;
      this.a.a(this);
      paramPab.a(Long.MAX_VALUE);
    }
  }
  
  public void a(T paramT)
  {
    this.g.lazySet(paramT);
    b();
  }
  
  public void a(Throwable paramThrowable)
  {
    this.d = paramThrowable;
    this.c = true;
    b();
  }
  
  boolean a(boolean paramBoolean1, boolean paramBoolean2, Oab<?> paramOab, AtomicReference<T> paramAtomicReference)
  {
    if (this.e)
    {
      paramAtomicReference.lazySet(null);
      return true;
    }
    if (paramBoolean1)
    {
      Throwable localThrowable = this.d;
      if (localThrowable != null)
      {
        paramAtomicReference.lazySet(null);
        paramOab.a(localThrowable);
        return true;
      }
      if (paramBoolean2)
      {
        paramOab.a();
        return true;
      }
    }
    return false;
  }
  
  void b()
  {
    if (getAndIncrement() != 0) {
      return;
    }
    Oab localOab = this.a;
    AtomicLong localAtomicLong = this.f;
    AtomicReference localAtomicReference = this.g;
    int i = 1;
    int j;
    do
    {
      boolean bool1;
      boolean bool2;
      boolean bool3;
      for (long l1 = 0L;; l1 += 1L)
      {
        long l2 = localAtomicLong.get();
        bool1 = false;
        if (l1 == l2) {
          break;
        }
        bool2 = this.c;
        Object localObject = localAtomicReference.getAndSet(null);
        if (localObject == null) {
          bool3 = true;
        } else {
          bool3 = false;
        }
        if (a(bool2, bool3, localOab, localAtomicReference)) {
          return;
        }
        if (bool3) {
          break;
        }
        localOab.a(localObject);
      }
      if (l1 == localAtomicLong.get())
      {
        bool2 = this.c;
        bool3 = bool1;
        if (localAtomicReference.get() == null) {
          bool3 = true;
        }
        if (a(bool2, bool3, localOab, localAtomicReference)) {
          return;
        }
      }
      if (l1 != 0L) {
        nVa.b(localAtomicLong, l1);
      }
      j = addAndGet(-i);
      i = j;
    } while (j != 0);
  }
  
  public void cancel()
  {
    if (!this.e)
    {
      this.e = true;
      this.b.cancel();
      if (getAndIncrement() == 0) {
        this.g.lazySet(null);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/PSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */