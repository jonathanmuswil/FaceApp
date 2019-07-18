import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

final class LSa$c<T>
  extends LSa.a<T>
  implements HQa<T>
{
  final Oab<? super T> n;
  
  LSa$c(Oab<? super T> paramOab, WQa.c paramc, boolean paramBoolean, int paramInt)
  {
    super(paramc, paramBoolean, paramInt);
    this.n = paramOab;
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
    Oab localOab = this.n;
    _Ra local_Ra = this.g;
    long l1 = this.l;
    int i = 1;
    for (;;)
    {
      long l2 = this.e.get();
      boolean bool1;
      for (;;)
      {
        bool1 = l1 < l2;
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
            if (a(bool2, bool3, localOab)) {
              return;
            }
            if (!bool3)
            {
              localOab.a(localObject);
              long l3 = l1 + 1L;
              l1 = l3;
              if (l3 != this.d) {
                continue;
              }
              long l4 = l2;
              if (l2 != Long.MAX_VALUE) {
                l4 = this.e.addAndGet(-l3);
              }
              this.f.a(l3);
              l1 = 0L;
              l2 = l4;
            }
          }
          catch (Throwable localThrowable)
          {
            pRa.b(localThrowable);
            this.h = true;
            this.f.cancel();
            local_Ra.clear();
            localOab.a(localThrowable);
            this.a.i();
            return;
          }
        }
      }
      if ((!bool1) && (a(this.i, local_Ra.isEmpty(), localOab))) {
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
    Oab localOab = this.n;
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
            localOab.a();
            this.a.i();
            return;
          }
          localOab.a(localObject);
          l1 += 1L;
        }
        catch (Throwable localThrowable)
        {
          pRa.b(localThrowable);
          this.h = true;
          this.f.cancel();
          localOab.a(localThrowable);
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
        localOab.a();
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
      long l = this.l + 1L;
      if (l == this.d)
      {
        this.l = 0L;
        this.f.a(l);
      }
      else
      {
        this.l = l;
      }
    }
    return (T)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/LSa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */