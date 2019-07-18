import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

final class ASa$e<T>
  extends ASa.a<T>
{
  final AtomicReference<T> c = new AtomicReference();
  Throwable d;
  volatile boolean e;
  final AtomicInteger f = new AtomicInteger();
  
  ASa$e(Oab<? super T> paramOab)
  {
    super(paramOab);
  }
  
  public void a()
  {
    this.e = true;
    f();
  }
  
  public void a(T paramT)
  {
    if ((!this.e) && (!c()))
    {
      if (paramT == null)
      {
        a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        return;
      }
      this.c.set(paramT);
      f();
    }
  }
  
  public boolean c(Throwable paramThrowable)
  {
    if ((!this.e) && (!c()))
    {
      if (paramThrowable == null) {
        a(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
      }
      this.d = paramThrowable;
      this.e = true;
      f();
      return true;
    }
    return false;
  }
  
  void d()
  {
    f();
  }
  
  void e()
  {
    if (this.f.getAndIncrement() == 0) {
      this.c.lazySet(null);
    }
  }
  
  void f()
  {
    if (this.f.getAndIncrement() != 0) {
      return;
    }
    Object localObject1 = this.a;
    AtomicReference localAtomicReference = this.c;
    int i = 1;
    int k;
    do
    {
      long l1 = get();
      int j;
      boolean bool1;
      boolean bool2;
      for (long l2 = 0L;; l2 += 1L)
      {
        j = 0;
        bool1 = l2 < l1;
        if (!bool1) {
          break;
        }
        if (c())
        {
          localAtomicReference.lazySet(null);
          return;
        }
        bool2 = this.e;
        Object localObject2 = localAtomicReference.getAndSet(null);
        if (localObject2 == null) {
          k = 1;
        } else {
          k = 0;
        }
        if ((bool2) && (k != 0))
        {
          localObject1 = this.d;
          if (localObject1 != null) {
            b((Throwable)localObject1);
          } else {
            b();
          }
          return;
        }
        if (k != 0) {
          break;
        }
        ((Oab)localObject1).a(localObject2);
      }
      if (!bool1)
      {
        if (c())
        {
          localAtomicReference.lazySet(null);
          return;
        }
        bool2 = this.e;
        k = j;
        if (localAtomicReference.get() == null) {
          k = 1;
        }
        if ((bool2) && (k != 0))
        {
          localObject1 = this.d;
          if (localObject1 != null) {
            b((Throwable)localObject1);
          } else {
            b();
          }
          return;
        }
      }
      if (l2 != 0L) {
        nVa.b(this, l2);
      }
      k = this.f.addAndGet(-i);
      i = k;
    } while (k != 0);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ASa$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */