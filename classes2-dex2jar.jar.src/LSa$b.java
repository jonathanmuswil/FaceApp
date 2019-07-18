import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

final class LSa$b<T>
  extends LSa.a<T>
{
  final PRa<? super T> n;
  long o;
  
  LSa$b(PRa<? super T> paramPRa, WQa.c paramc, boolean paramBoolean, int paramInt)
  {
    super(paramc, paramBoolean, paramInt);
    this.n = paramPRa;
  }
  
  public void a(Pab paramPab)
  {
    if (kVa.a(this.f, paramPab))
    {
      this.f = paramPab;
      if ((paramPab instanceof XRa))
      {
        XRa localXRa = (XRa)paramPab;
        int i = localXRa.a(7);
        if (i == 1)
        {
          this.k = 1;
          this.g = localXRa;
          this.i = true;
          this.n.a(this);
          return;
        }
        if (i == 2)
        {
          this.k = 2;
          this.g = localXRa;
          this.n.a(this);
          paramPab.a(this.c);
          return;
        }
      }
      this.g = new KUa(this.c);
      this.n.a(this);
      paramPab.a(this.c);
    }
  }
  
  void b()
  {
    PRa localPRa = this.n;
    _Ra local_Ra = this.g;
    long l1 = this.l;
    long l2 = this.o;
    int i = 1;
    for (;;)
    {
      long l3 = this.e.get();
      boolean bool1;
      for (;;)
      {
        bool1 = l1 < l3;
        if (bool1)
        {
          boolean bool2 = this.i;
          try
          {
            Object localObject = local_Ra.poll();
            boolean bool3;
            if (localObject == null) {
              bool3 = true;
            } else {
              bool3 = false;
            }
            if (a(bool2, bool3, localPRa)) {
              return;
            }
            if (!bool3)
            {
              long l4 = l1;
              if (localPRa.c(localObject)) {
                l4 = l1 + 1L;
              }
              long l5 = l2 + 1L;
              l1 = l4;
              l2 = l5;
              if (l5 != this.d) {
                continue;
              }
              this.f.a(l5);
              l2 = 0L;
              l1 = l4;
            }
          }
          catch (Throwable localThrowable)
          {
            pRa.b(localThrowable);
            this.h = true;
            this.f.cancel();
            local_Ra.clear();
            localPRa.a(localThrowable);
            this.a.i();
            return;
          }
        }
      }
      if ((!bool1) && (a(this.i, local_Ra.isEmpty(), localPRa))) {
        return;
      }
      int j = get();
      if (i == j)
      {
        this.l = l1;
        this.o = l2;
        j = addAndGet(-i);
        i = j;
        if (j != 0) {}
      }
      else
      {
        i = j;
      }
    }
  }
  
  void c()
  {
    int i = 1;
    int j;
    do
    {
      if (this.h) {
        return;
      }
      boolean bool = this.i;
      this.n.a(null);
      if (bool)
      {
        this.h = true;
        Throwable localThrowable = this.j;
        if (localThrowable != null) {
          this.n.a(localThrowable);
        } else {
          this.n.a();
        }
        this.a.i();
        return;
      }
      j = addAndGet(-i);
      i = j;
    } while (j != 0);
  }
  
  void d()
  {
    PRa localPRa = this.n;
    _Ra local_Ra = this.g;
    long l1 = this.l;
    int i = 1;
    for (;;)
    {
      long l2 = this.e.get();
      while (l1 != l2) {
        try
        {
          Object localObject = local_Ra.poll();
          if (this.h) {
            return;
          }
          if (localObject == null)
          {
            this.h = true;
            localPRa.a();
            this.a.i();
            return;
          }
          if (localPRa.c(localObject)) {
            l1 += 1L;
          }
        }
        catch (Throwable localThrowable)
        {
          pRa.b(localThrowable);
          this.h = true;
          this.f.cancel();
          localPRa.a(localThrowable);
          this.a.i();
          return;
        }
      }
      if (this.h) {
        return;
      }
      if (local_Ra.isEmpty())
      {
        this.h = true;
        localPRa.a();
        this.a.i();
        return;
      }
      int j = get();
      if (i == j)
      {
        this.l = l1;
        j = addAndGet(-i);
        i = j;
        if (j != 0) {}
      }
      else
      {
        i = j;
      }
    }
  }
  
  public T poll()
    throws Exception
  {
    Object localObject = this.g.poll();
    if ((localObject != null) && (this.k != 1))
    {
      long l = this.o + 1L;
      if (l == this.d)
      {
        this.o = 0L;
        this.f.a(l);
      }
      else
      {
        this.o = l;
      }
    }
    return (T)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/LSa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */