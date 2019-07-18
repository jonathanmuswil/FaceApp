import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class mTa$b<T, U>
  extends AtomicInteger
  implements VQa<T>, kRa
{
  final VQa<? super U> a;
  final DRa<? super T, ? extends TQa<? extends U>> b;
  final mTa.b.a<U> c;
  final int d;
  _Ra<T> e;
  kRa f;
  volatile boolean g;
  volatile boolean h;
  volatile boolean i;
  int j;
  
  mTa$b(VQa<? super U> paramVQa, DRa<? super T, ? extends TQa<? extends U>> paramDRa, int paramInt)
  {
    this.a = paramVQa;
    this.b = paramDRa;
    this.d = paramInt;
    this.c = new mTa.b.a(paramVQa, this);
  }
  
  public void a()
  {
    if (this.i) {
      return;
    }
    this.i = true;
    b();
  }
  
  public void a(T paramT)
  {
    if (this.i) {
      return;
    }
    if (this.j == 0) {
      this.e.offer(paramT);
    }
    b();
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.i)
    {
      zVa.b(paramThrowable);
      return;
    }
    this.i = true;
    i();
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.f, paramkRa))
    {
      this.f = paramkRa;
      if ((paramkRa instanceof VRa))
      {
        paramkRa = (VRa)paramkRa;
        int k = paramkRa.a(3);
        if (k == 1)
        {
          this.j = k;
          this.e = paramkRa;
          this.i = true;
          this.a.a(this);
          b();
          return;
        }
        if (k == 2)
        {
          this.j = k;
          this.e = paramkRa;
          this.a.a(this);
          return;
        }
      }
      this.e = new LUa(this.d);
      this.a.a(this);
    }
  }
  
  void b()
  {
    if (getAndIncrement() != 0) {
      return;
    }
    for (;;)
    {
      if (this.h)
      {
        this.e.clear();
        return;
      }
      if (!this.g)
      {
        boolean bool = this.i;
        try
        {
          Object localObject = this.e.poll();
          int k;
          if (localObject == null) {
            k = 1;
          } else {
            k = 0;
          }
          if ((bool) && (k != 0))
          {
            this.h = true;
            this.a.a();
            return;
          }
          if (k == 0) {
            try
            {
              localObject = this.b.apply(localObject);
              ORa.a(localObject, "The mapper returned a null ObservableSource");
              localObject = (TQa)localObject;
              this.g = true;
              ((TQa)localObject).a(this.c);
            }
            catch (Throwable localThrowable1)
            {
              pRa.b(localThrowable1);
              i();
              this.e.clear();
              this.a.a(localThrowable1);
              return;
            }
          }
          if (decrementAndGet() != 0) {}
        }
        catch (Throwable localThrowable2)
        {
          pRa.b(localThrowable2);
          i();
          this.e.clear();
          this.a.a(localThrowable2);
          return;
        }
      }
    }
  }
  
  void c()
  {
    this.g = false;
    b();
  }
  
  public boolean h()
  {
    return this.h;
  }
  
  public void i()
  {
    this.h = true;
    this.c.b();
    this.f.i();
    if (getAndIncrement() == 0) {
      this.e.clear();
    }
  }
  
  static final class a<U>
    extends AtomicReference<kRa>
    implements VQa<U>
  {
    final VQa<? super U> a;
    final mTa.b<?, ?> b;
    
    a(VQa<? super U> paramVQa, mTa.b<?, ?> paramb)
    {
      this.a = paramVQa;
      this.b = paramb;
    }
    
    public void a()
    {
      this.b.c();
    }
    
    public void a(U paramU)
    {
      this.a.a(paramU);
    }
    
    public void a(Throwable paramThrowable)
    {
      this.b.i();
      this.a.a(paramThrowable);
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mTa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */