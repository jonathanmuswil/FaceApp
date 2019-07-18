import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class gTa$a<T, R>
  extends AtomicInteger
  implements VQa<T>, kRa
{
  final VQa<? super R> a;
  final DRa<? super T, ? extends aRa<? extends R>> b;
  final mVa c;
  final gTa.a.a<R> d;
  final ZRa<T> e;
  final qVa f;
  kRa g;
  volatile boolean h;
  volatile boolean i;
  R j;
  volatile int k;
  
  gTa$a(VQa<? super R> paramVQa, DRa<? super T, ? extends aRa<? extends R>> paramDRa, int paramInt, qVa paramqVa)
  {
    this.a = paramVQa;
    this.b = paramDRa;
    this.f = paramqVa;
    this.c = new mVa();
    this.d = new gTa.a.a(this);
    this.e = new LUa(paramInt);
  }
  
  public void a()
  {
    this.h = true;
    b();
  }
  
  public void a(T paramT)
  {
    this.e.offer(paramT);
    b();
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.c.a(paramThrowable))
    {
      if (this.f == qVa.a) {
        this.d.a();
      }
      this.h = true;
      b();
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.g, paramkRa))
    {
      this.g = paramkRa;
      this.a.a(this);
    }
  }
  
  void b()
  {
    if (getAndIncrement() != 0) {
      return;
    }
    VQa localVQa = this.a;
    qVa localqVa = this.f;
    Object localObject1 = this.e;
    mVa localmVa = this.c;
    int m = 1;
    int i1;
    do
    {
      for (;;)
      {
        if (this.i)
        {
          ((_Ra)localObject1).clear();
          this.j = null;
          break;
        }
        int n = this.k;
        if ((localmVa.get() != null) && ((localqVa == qVa.a) || ((localqVa == qVa.b) && (n == 0))))
        {
          ((_Ra)localObject1).clear();
          this.j = null;
          localVQa.a(localmVa.a());
          return;
        }
        i1 = 0;
        if (n == 0)
        {
          boolean bool = this.h;
          localObject2 = ((ZRa)localObject1).poll();
          if (localObject2 == null) {
            i1 = 1;
          }
          if ((bool) && (i1 != 0))
          {
            localObject1 = localmVa.a();
            if (localObject1 == null) {
              localVQa.a();
            } else {
              localVQa.a((Throwable)localObject1);
            }
            return;
          }
          if (i1 != 0) {
            break;
          }
          try
          {
            localObject2 = this.b.apply(localObject2);
            ORa.a(localObject2, "The mapper returned a null SingleSource");
            localObject2 = (aRa)localObject2;
            this.k = 1;
            ((aRa)localObject2).a(this.d);
          }
          catch (Throwable localThrowable)
          {
            pRa.b(localThrowable);
            this.g.i();
            ((_Ra)localObject1).clear();
            localmVa.a(localThrowable);
            localVQa.a(localmVa.a());
            return;
          }
        }
        if (n != 2) {
          break;
        }
        Object localObject2 = this.j;
        this.j = null;
        localVQa.a(localObject2);
        this.k = 0;
      }
      i1 = addAndGet(-m);
      m = i1;
    } while (i1 != 0);
  }
  
  void b(R paramR)
  {
    this.j = paramR;
    this.k = 2;
    b();
  }
  
  void b(Throwable paramThrowable)
  {
    if (this.c.a(paramThrowable))
    {
      if (this.f != qVa.c) {
        this.g.i();
      }
      this.k = 0;
      b();
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  public boolean h()
  {
    return this.i;
  }
  
  public void i()
  {
    this.i = true;
    this.g.i();
    this.d.a();
    if (getAndIncrement() == 0)
    {
      this.e.clear();
      this.j = null;
    }
  }
  
  static final class a<R>
    extends AtomicReference<kRa>
    implements ZQa<R>
  {
    final gTa.a<?, R> a;
    
    a(gTa.a<?, R> parama)
    {
      this.a = parama;
    }
    
    void a()
    {
      IRa.a(this);
    }
    
    public void a(Throwable paramThrowable)
    {
      this.a.b(paramThrowable);
    }
    
    public void a(kRa paramkRa)
    {
      IRa.a(this, paramkRa);
    }
    
    public void b(R paramR)
    {
      this.a.b(paramR);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */