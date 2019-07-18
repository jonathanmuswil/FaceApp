import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class cUa$b<T, R>
  extends AtomicInteger
  implements VQa<T>, kRa
{
  static final cUa.a<Object, Object> a = new cUa.a(null, -1L, 1);
  final VQa<? super R> b;
  final DRa<? super T, ? extends TQa<? extends R>> c;
  final int d;
  final boolean e;
  final mVa f;
  volatile boolean g;
  volatile boolean h;
  kRa i;
  final AtomicReference<cUa.a<T, R>> j = new AtomicReference();
  volatile long k;
  
  static
  {
    a.b();
  }
  
  cUa$b(VQa<? super R> paramVQa, DRa<? super T, ? extends TQa<? extends R>> paramDRa, int paramInt, boolean paramBoolean)
  {
    this.b = paramVQa;
    this.c = paramDRa;
    this.d = paramInt;
    this.e = paramBoolean;
    this.f = new mVa();
  }
  
  public void a()
  {
    if (!this.g)
    {
      this.g = true;
      c();
    }
  }
  
  void a(cUa.a<T, R> parama, Throwable paramThrowable)
  {
    if ((parama.b == this.k) && (this.f.a(paramThrowable)))
    {
      if (!this.e) {
        this.i.i();
      }
      parama.e = true;
      c();
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  public void a(T paramT)
  {
    long l = this.k + 1L;
    this.k = l;
    cUa.a locala1 = (cUa.a)this.j.get();
    if (locala1 != null) {
      locala1.b();
    }
    try
    {
      paramT = this.c.apply(paramT);
      ORa.a(paramT, "The ObservableSource returned is null");
      paramT = (TQa)paramT;
      locala1 = new cUa.a(this, l, this.d);
      cUa.a locala2;
      do
      {
        locala2 = (cUa.a)this.j.get();
        if (locala2 == a) {
          break;
        }
      } while (!this.j.compareAndSet(locala2, locala1));
      paramT.a(locala1);
      return;
    }
    catch (Throwable paramT)
    {
      pRa.b(paramT);
      this.i.i();
      a(paramT);
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    if ((!this.g) && (this.f.a(paramThrowable)))
    {
      if (!this.e) {
        b();
      }
      this.g = true;
      c();
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.i, paramkRa))
    {
      this.i = paramkRa;
      this.b.a(this);
    }
  }
  
  void b()
  {
    cUa.a locala1 = (cUa.a)this.j.get();
    cUa.a locala2 = a;
    if (locala1 != locala2)
    {
      locala1 = (cUa.a)this.j.getAndSet(locala2);
      if ((locala1 != a) && (locala1 != null)) {
        locala1.b();
      }
    }
  }
  
  void c()
  {
    if (getAndIncrement() != 0) {
      return;
    }
    VQa localVQa = this.b;
    AtomicReference localAtomicReference = this.j;
    boolean bool1 = this.e;
    int m = 1;
    int n;
    label423:
    label442:
    do
    {
      Object localObject1;
      cUa.a locala;
      _Ra local_Ra;
      boolean bool2;
      for (;;)
      {
        if (this.h) {
          return;
        }
        if (this.g)
        {
          if (localAtomicReference.get() == null) {
            n = 1;
          } else {
            n = 0;
          }
          if (bool1)
          {
            if (n != 0)
            {
              localObject1 = (Throwable)this.f.get();
              if (localObject1 != null) {
                localVQa.a((Throwable)localObject1);
              } else {
                localVQa.a();
              }
            }
          }
          else
          {
            if ((Throwable)this.f.get() != null)
            {
              localVQa.a(this.f.a());
              return;
            }
            if (n != 0)
            {
              localVQa.a();
              return;
            }
          }
        }
        locala = (cUa.a)localAtomicReference.get();
        if (locala == null) {
          break label442;
        }
        local_Ra = locala.d;
        if (local_Ra == null) {
          break label442;
        }
        if (!locala.e) {
          break;
        }
        bool2 = local_Ra.isEmpty();
        if (bool1)
        {
          if (!bool2) {
            break;
          }
          localAtomicReference.compareAndSet(locala, null);
        }
        else
        {
          if ((Throwable)this.f.get() != null)
          {
            localVQa.a(this.f.a());
            return;
          }
          if (!bool2) {
            break;
          }
          localAtomicReference.compareAndSet(locala, null);
        }
      }
      n = 0;
      for (;;)
      {
        if (this.h) {
          return;
        }
        if (locala != localAtomicReference.get()) {}
        Object localObject2;
        int i1;
        for (;;)
        {
          n = 1;
          break label423;
          if ((!bool1) && ((Throwable)this.f.get() != null))
          {
            localVQa.a(this.f.a());
            return;
          }
          bool2 = locala.e;
          try
          {
            localObject1 = local_Ra.poll();
          }
          catch (Throwable localThrowable)
          {
            pRa.b(localThrowable);
            this.f.a(localThrowable);
            localAtomicReference.compareAndSet(locala, null);
            if (!bool1)
            {
              b();
              this.i.i();
              this.g = true;
            }
            else
            {
              locala.b();
            }
            localObject2 = null;
            n = 1;
          }
          if (localObject2 == null) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          if ((!bool2) || (i1 == 0)) {
            break;
          }
          localAtomicReference.compareAndSet(locala, null);
        }
        if (i1 != 0)
        {
          if (n == 0) {
            break label442;
          }
          break;
        }
        localVQa.a(localObject2);
      }
      n = addAndGet(-m);
      m = n;
    } while (n != 0);
  }
  
  public boolean h()
  {
    return this.h;
  }
  
  public void i()
  {
    if (!this.h)
    {
      this.h = true;
      this.i.i();
      b();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/cUa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */