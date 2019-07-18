import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

final class FVa$a<T>
  implements kRa, lVa.a<Object>
{
  final VQa<? super T> a;
  final FVa<T> b;
  boolean c;
  boolean d;
  lVa<Object> e;
  boolean f;
  volatile boolean g;
  long h;
  
  FVa$a(VQa<? super T> paramVQa, FVa<T> paramFVa)
  {
    this.a = paramVQa;
    this.b = paramFVa;
  }
  
  void a()
  {
    if (this.g) {
      return;
    }
    try
    {
      if (this.g) {
        return;
      }
      if (this.c) {
        return;
      }
      Object localObject1 = this.b;
      Lock localLock = ((FVa)localObject1).g;
      localLock.lock();
      this.h = ((FVa)localObject1).j;
      localObject1 = ((FVa)localObject1).d.get();
      localLock.unlock();
      boolean bool;
      if (localObject1 != null) {
        bool = true;
      } else {
        bool = false;
      }
      this.d = bool;
      this.c = true;
      if (localObject1 != null)
      {
        if (test(localObject1)) {
          return;
        }
        b();
      }
      return;
    }
    finally {}
  }
  
  void a(Object paramObject, long paramLong)
  {
    if (this.g) {
      return;
    }
    if (!this.f) {
      try
      {
        if (this.g) {
          return;
        }
        if (this.h == paramLong) {
          return;
        }
        if (this.d)
        {
          lVa locallVa1 = this.e;
          lVa locallVa2 = locallVa1;
          if (locallVa1 == null)
          {
            locallVa2 = new lVa;
            locallVa2.<init>(4);
            this.e = locallVa2;
          }
          locallVa2.a(paramObject);
          return;
        }
        this.c = true;
        this.f = true;
      }
      finally {}
    }
    test(paramObject);
  }
  
  void b()
  {
    for (;;)
    {
      if (this.g) {
        return;
      }
      try
      {
        lVa locallVa = this.e;
        if (locallVa == null)
        {
          this.d = false;
          return;
        }
        this.e = null;
        locallVa.a(this);
      }
      finally {}
    }
  }
  
  public boolean h()
  {
    return this.g;
  }
  
  public void i()
  {
    if (!this.g)
    {
      this.g = true;
      this.b.b(this);
    }
  }
  
  public boolean test(Object paramObject)
  {
    boolean bool;
    if ((!this.g) && (!tVa.a(paramObject, this.a))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/FVa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */