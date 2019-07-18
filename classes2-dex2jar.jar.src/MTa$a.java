import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class mTa$a<T, R>
  extends AtomicInteger
  implements VQa<T>, kRa
{
  final VQa<? super R> a;
  final DRa<? super T, ? extends TQa<? extends R>> b;
  final int c;
  final mVa d;
  final mTa.a.a<R> e;
  final boolean f;
  _Ra<T> g;
  kRa h;
  volatile boolean i;
  volatile boolean j;
  volatile boolean k;
  int l;
  
  mTa$a(VQa<? super R> paramVQa, DRa<? super T, ? extends TQa<? extends R>> paramDRa, int paramInt, boolean paramBoolean)
  {
    this.a = paramVQa;
    this.b = paramDRa;
    this.c = paramInt;
    this.f = paramBoolean;
    this.d = new mVa();
    this.e = new mTa.a.a(paramVQa, this);
  }
  
  public void a()
  {
    this.j = true;
    b();
  }
  
  public void a(T paramT)
  {
    if (this.l == 0) {
      this.g.offer(paramT);
    }
    b();
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.d.a(paramThrowable))
    {
      this.j = true;
      b();
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.h, paramkRa))
    {
      this.h = paramkRa;
      if ((paramkRa instanceof VRa))
      {
        paramkRa = (VRa)paramkRa;
        int m = paramkRa.a(3);
        if (m == 1)
        {
          this.l = m;
          this.g = paramkRa;
          this.j = true;
          this.a.a(this);
          b();
          return;
        }
        if (m == 2)
        {
          this.l = m;
          this.g = paramkRa;
          this.a.a(this);
          return;
        }
      }
      this.g = new LUa(this.c);
      this.a.a(this);
    }
  }
  
  void b()
  {
    if (getAndIncrement() != 0) {
      return;
    }
    VQa localVQa = this.a;
    _Ra local_Ra = this.g;
    Object localObject1 = this.d;
    while (!this.i)
    {
      if (this.k)
      {
        local_Ra.clear();
        return;
      }
      if ((!this.f) && ((Throwable)((AtomicReference)localObject1).get() != null))
      {
        local_Ra.clear();
        this.k = true;
        localVQa.a(((mVa)localObject1).a());
        return;
      }
      boolean bool = this.j;
      try
      {
        Object localObject2 = local_Ra.poll();
        int m;
        if (localObject2 == null) {
          m = 1;
        } else {
          m = 0;
        }
        if ((bool) && (m != 0))
        {
          this.k = true;
          localObject1 = ((mVa)localObject1).a();
          if (localObject1 != null) {
            localVQa.a((Throwable)localObject1);
          } else {
            localVQa.a();
          }
          return;
        }
        if (m == 0) {
          try
          {
            localObject2 = this.b.apply(localObject2);
            ORa.a(localObject2, "The mapper returned a null ObservableSource");
            localObject2 = (TQa)localObject2;
            if ((localObject2 instanceof Callable))
            {
              try
              {
                localObject2 = ((Callable)localObject2).call();
                if ((localObject2 == null) || (this.k)) {
                  continue;
                }
                localVQa.a(localObject2);
              }
              catch (Throwable localThrowable2)
              {
                pRa.b(localThrowable2);
                ((mVa)localObject1).a(localThrowable2);
              }
              continue;
            }
            this.i = true;
            localThrowable2.a(this.e);
          }
          catch (Throwable localThrowable3)
          {
            pRa.b(localThrowable3);
            this.k = true;
            this.h.i();
            local_Ra.clear();
            ((mVa)localObject1).a(localThrowable3);
            localVQa.a(((mVa)localObject1).a());
            return;
          }
        } else if (decrementAndGet() != 0) {}
      }
      catch (Throwable localThrowable1)
      {
        pRa.b(localThrowable1);
        this.k = true;
        this.h.i();
        ((mVa)localObject1).a(localThrowable1);
        localVQa.a(((mVa)localObject1).a());
        return;
      }
    }
  }
  
  public boolean h()
  {
    return this.k;
  }
  
  public void i()
  {
    this.k = true;
    this.h.i();
    this.e.b();
  }
  
  static final class a<R>
    extends AtomicReference<kRa>
    implements VQa<R>
  {
    final VQa<? super R> a;
    final mTa.a<?, R> b;
    
    a(VQa<? super R> paramVQa, mTa.a<?, R> parama)
    {
      this.a = paramVQa;
      this.b = parama;
    }
    
    public void a()
    {
      mTa.a locala = this.b;
      locala.i = false;
      locala.b();
    }
    
    public void a(R paramR)
    {
      this.a.a(paramR);
    }
    
    public void a(Throwable paramThrowable)
    {
      mTa.a locala = this.b;
      if (locala.d.a(paramThrowable))
      {
        if (!locala.f) {
          locala.h.i();
        }
        locala.i = false;
        locala.b();
      }
      else
      {
        zVa.b(paramThrowable);
      }
    }
    
    public void a(kRa paramkRa)
    {
      IRa.a(this, paramkRa);
    }
    
    void b()
    {
      IRa.a(this);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */