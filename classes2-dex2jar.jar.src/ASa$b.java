import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

final class ASa$b<T>
  extends ASa.a<T>
{
  final LUa<T> c;
  Throwable d;
  volatile boolean e;
  final AtomicInteger f;
  
  ASa$b(Oab<? super T> paramOab, int paramInt)
  {
    super(paramOab);
    this.c = new LUa(paramInt);
    this.f = new AtomicInteger();
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
      this.c.offer(paramT);
      f();
    }
  }
  
  public boolean c(Throwable paramThrowable)
  {
    if ((!this.e) && (!c()))
    {
      Object localObject = paramThrowable;
      if (paramThrowable == null) {
        localObject = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
      }
      this.d = ((Throwable)localObject);
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
      this.c.clear();
    }
  }
  
  void f()
  {
    if (this.f.getAndIncrement() != 0) {
      return;
    }
    Oab localOab = this.a;
    LUa localLUa = this.c;
    int i = 1;
    int j;
    do
    {
      long l1 = get();
      boolean bool1;
      boolean bool2;
      Object localObject;
      for (long l2 = 0L;; l2 += 1L)
      {
        bool1 = l2 < l1;
        if (!bool1) {
          break;
        }
        if (c())
        {
          localLUa.clear();
          return;
        }
        bool2 = this.e;
        localObject = localLUa.poll();
        if (localObject == null) {
          j = 1;
        } else {
          j = 0;
        }
        if ((bool2) && (j != 0))
        {
          localObject = this.d;
          if (localObject != null) {
            b((Throwable)localObject);
          } else {
            b();
          }
          return;
        }
        if (j != 0) {
          break;
        }
        localOab.a(localObject);
      }
      if (!bool1)
      {
        if (c())
        {
          localLUa.clear();
          return;
        }
        bool2 = this.e;
        boolean bool3 = localLUa.isEmpty();
        if ((bool2) && (bool3))
        {
          localObject = this.d;
          if (localObject != null) {
            b((Throwable)localObject);
          } else {
            b();
          }
          return;
        }
      }
      if (l2 != 0L) {
        nVa.b(this, l2);
      }
      j = this.f.addAndGet(-i);
      i = j;
    } while (j != 0);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ASa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */