import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class BTa$b<T, U>
  extends AtomicInteger
  implements kRa, VQa<T>
{
  static final BTa.a<?, ?>[] a = new BTa.a[0];
  static final BTa.a<?, ?>[] b = new BTa.a[0];
  final VQa<? super U> c;
  final DRa<? super T, ? extends TQa<? extends U>> d;
  final boolean e;
  final int f;
  final int g;
  volatile ZRa<U> h;
  volatile boolean i;
  final mVa j = new mVa();
  volatile boolean k;
  final AtomicReference<BTa.a<?, ?>[]> l;
  kRa m;
  long n;
  long o;
  int p;
  Queue<TQa<? extends U>> q;
  int r;
  
  BTa$b(VQa<? super U> paramVQa, DRa<? super T, ? extends TQa<? extends U>> paramDRa, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.c = paramVQa;
    this.d = paramDRa;
    this.e = paramBoolean;
    this.f = paramInt1;
    this.g = paramInt2;
    if (paramInt1 != Integer.MAX_VALUE) {
      this.q = new ArrayDeque(paramInt1);
    }
    this.l = new AtomicReference(a);
  }
  
  public void a()
  {
    if (this.i) {
      return;
    }
    this.i = true;
    d();
  }
  
  void a(TQa<? extends U> paramTQa)
  {
    while ((paramTQa instanceof Callable))
    {
      if ((!a((Callable)paramTQa)) || (this.f == Integer.MAX_VALUE)) {
        return;
      }
      int i1 = 0;
      try
      {
        paramTQa = (TQa)this.q.poll();
        if (paramTQa == null)
        {
          this.r -= 1;
          i1 = 1;
        }
        if (i1 != 0)
        {
          d();
          return;
        }
      }
      finally {}
    }
    long l1 = this.n;
    this.n = (1L + l1);
    BTa.a locala = new BTa.a(this, l1);
    if (a(locala)) {
      paramTQa.a(locala);
    }
  }
  
  public void a(T paramT)
  {
    if (this.i) {
      return;
    }
    try
    {
      paramT = this.d.apply(paramT);
      ORa.a(paramT, "The mapper returned a null ObservableSource");
      paramT = (TQa)paramT;
      if (this.f != Integer.MAX_VALUE) {
        try
        {
          if (this.r == this.f)
          {
            this.q.offer(paramT);
            return;
          }
          this.r += 1;
        }
        finally {}
      }
      a(paramT);
      return;
    }
    catch (Throwable paramT)
    {
      pRa.b(paramT);
      this.m.i();
      a(paramT);
    }
  }
  
  void a(U paramU, BTa.a<T, U> parama)
  {
    if ((get() == 0) && (compareAndSet(0, 1)))
    {
      this.c.a(paramU);
      if (decrementAndGet() != 0) {}
    }
    else
    {
      _Ra local_Ra = parama.d;
      Object localObject = local_Ra;
      if (local_Ra == null)
      {
        localObject = new LUa(this.g);
        parama.d = ((_Ra)localObject);
      }
      ((_Ra)localObject).offer(paramU);
      if (getAndIncrement() != 0) {
        return;
      }
    }
    e();
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.i)
    {
      zVa.b(paramThrowable);
      return;
    }
    if (this.j.a(paramThrowable))
    {
      this.i = true;
      d();
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.m, paramkRa))
    {
      this.m = paramkRa;
      this.c.a(this);
    }
  }
  
  boolean a(BTa.a<T, U> parama)
  {
    BTa.a[] arrayOfa1;
    BTa.a[] arrayOfa2;
    do
    {
      arrayOfa1 = (BTa.a[])this.l.get();
      if (arrayOfa1 == b)
      {
        parama.b();
        return false;
      }
      int i1 = arrayOfa1.length;
      arrayOfa2 = new BTa.a[i1 + 1];
      System.arraycopy(arrayOfa1, 0, arrayOfa2, 0, i1);
      arrayOfa2[i1] = parama;
    } while (!this.l.compareAndSet(arrayOfa1, arrayOfa2));
    return true;
  }
  
  boolean a(Callable<? extends U> paramCallable)
  {
    try
    {
      Object localObject = paramCallable.call();
      if (localObject == null) {
        return true;
      }
      if ((get() == 0) && (compareAndSet(0, 1)))
      {
        this.c.a(localObject);
        if (decrementAndGet() == 0) {
          return true;
        }
      }
      else
      {
        ZRa localZRa = this.h;
        paramCallable = localZRa;
        if (localZRa == null)
        {
          int i1 = this.f;
          if (i1 == Integer.MAX_VALUE) {
            paramCallable = new LUa(this.g);
          } else {
            paramCallable = new KUa(i1);
          }
          this.h = paramCallable;
        }
        if (!paramCallable.offer(localObject))
        {
          a(new IllegalStateException("Scalar queue full?!"));
          return true;
        }
        if (getAndIncrement() != 0) {
          return false;
        }
      }
      e();
      return true;
    }
    catch (Throwable paramCallable)
    {
      pRa.b(paramCallable);
      this.j.a(paramCallable);
      d();
    }
    return true;
  }
  
  void b(BTa.a<T, U> parama)
  {
    BTa.a[] arrayOfa1;
    BTa.a[] arrayOfa2;
    do
    {
      arrayOfa1 = (BTa.a[])this.l.get();
      int i1 = arrayOfa1.length;
      if (i1 == 0) {
        return;
      }
      int i2 = -1;
      int i4;
      for (int i3 = 0;; i3++)
      {
        i4 = i2;
        if (i3 >= i1) {
          break;
        }
        if (arrayOfa1[i3] == parama)
        {
          i4 = i3;
          break;
        }
      }
      if (i4 < 0) {
        return;
      }
      if (i1 == 1)
      {
        arrayOfa2 = a;
      }
      else
      {
        arrayOfa2 = new BTa.a[i1 - 1];
        System.arraycopy(arrayOfa1, 0, arrayOfa2, 0, i4);
        System.arraycopy(arrayOfa1, i4 + 1, arrayOfa2, i4, i1 - i4 - 1);
      }
    } while (!this.l.compareAndSet(arrayOfa1, arrayOfa2));
  }
  
  boolean b()
  {
    if (this.k) {
      return true;
    }
    Throwable localThrowable = (Throwable)this.j.get();
    if ((!this.e) && (localThrowable != null))
    {
      c();
      localThrowable = this.j.a();
      if (localThrowable != rVa.a) {
        this.c.a(localThrowable);
      }
      return true;
    }
    return false;
  }
  
  boolean c()
  {
    this.m.i();
    BTa.a[] arrayOfa1 = (BTa.a[])this.l.get();
    BTa.a[] arrayOfa2 = b;
    int i1 = 0;
    if (arrayOfa1 != arrayOfa2)
    {
      arrayOfa2 = (BTa.a[])this.l.getAndSet(arrayOfa2);
      if (arrayOfa2 != b)
      {
        int i2 = arrayOfa2.length;
        while (i1 < i2)
        {
          arrayOfa2[i1].b();
          i1++;
        }
        return true;
      }
    }
    return false;
  }
  
  void d()
  {
    if (getAndIncrement() == 0) {
      e();
    }
  }
  
  void e()
  {
    VQa localVQa = this.c;
    int i1 = 1;
    int i3;
    label543:
    do
    {
      if (b()) {
        return;
      }
      Object localObject3 = this.h;
      if (localObject3 != null) {
        for (;;)
        {
          if (b()) {
            return;
          }
          localObject4 = ((ZRa)localObject3).poll();
          if (localObject4 == null) {
            break;
          }
          localVQa.a(localObject4);
        }
      }
      boolean bool = this.i;
      Object localObject4 = this.h;
      localObject3 = (BTa.a[])this.l.get();
      int i2 = localObject3.length;
      if (this.f != Integer.MAX_VALUE) {
        try
        {
          i3 = this.q.size();
        }
        finally {}
      } else {
        i3 = 0;
      }
      if ((bool) && ((localObject4 == null) || (((_Ra)localObject4).isEmpty())) && (i2 == 0) && (i3 == 0))
      {
        localObject3 = this.j.a();
        if (localObject3 != rVa.a) {
          if (localObject3 == null) {
            ((VQa)localObject1).a();
          } else {
            ((VQa)localObject1).a((Throwable)localObject3);
          }
        }
        return;
      }
      int i4;
      if (i2 != 0)
      {
        long l1 = this.o;
        i4 = this.p;
        int i5;
        if (i2 > i4)
        {
          i3 = i4;
          if (localObject3[i4].a == l1) {}
        }
        else
        {
          i3 = i4;
          if (i2 <= i4) {
            i3 = 0;
          }
          for (i4 = 0; (i4 < i2) && (localObject3[i3].a != l1); i4++)
          {
            i5 = i3 + 1;
            i3 = i5;
            if (i5 == i2) {
              i3 = 0;
            }
          }
          this.p = i3;
          this.o = localObject3[i3].a;
        }
        int i6 = 0;
        i4 = 0;
        while (i6 < i2)
        {
          if (b()) {
            return;
          }
          localObject4 = localObject3[i3];
          _Ra local_Ra1 = ((BTa.a)localObject4).d;
          int i7;
          if (local_Ra1 != null)
          {
            try
            {
              do
              {
                Object localObject5 = local_Ra1.poll();
                if (localObject5 == null) {
                  break;
                }
                ((VQa)localObject1).a(localObject5);
              } while (!b());
              return;
            }
            catch (Throwable localThrowable)
            {
              pRa.b(localThrowable);
              ((BTa.a)localObject4).b();
              this.j.a(localThrowable);
              if (b()) {
                return;
              }
              b((BTa.a)localObject4);
              i5 = i4 + 1;
              i7 = i3 + 1;
              i4 = i5;
              i3 = i7;
              if (i7 != i2) {
                break label543;
              }
            }
            i4 = i5;
          }
          else
          {
            bool = ((BTa.a)localObject4).c;
            _Ra local_Ra2 = ((BTa.a)localObject4).d;
            i5 = i4;
            if (bool) {
              if (local_Ra2 != null)
              {
                i5 = i4;
                if (!local_Ra2.isEmpty()) {}
              }
              else
              {
                b((BTa.a)localObject4);
                if (b()) {
                  return;
                }
                i5 = i4 + 1;
              }
            }
            i7 = i3 + 1;
            i4 = i5;
            i3 = i7;
            if (i7 != i2) {
              break label543;
            }
            i4 = i5;
          }
          i3 = 0;
          i6++;
        }
        this.p = i3;
        this.o = localObject3[i3].a;
      }
      else
      {
        i4 = 0;
      }
      if (i4 != 0) {
        while ((this.f != Integer.MAX_VALUE) && (i4 != 0)) {
          try
          {
            localObject3 = (TQa)this.q.poll();
            if (localObject3 == null) {
              this.r -= 1;
            } else {
              a((TQa)localObject3);
            }
            i4--;
          }
          finally {}
        }
      }
      i3 = addAndGet(-i1);
      i1 = i3;
    } while (i3 != 0);
  }
  
  public boolean h()
  {
    return this.k;
  }
  
  public void i()
  {
    if (!this.k)
    {
      this.k = true;
      if (c())
      {
        Throwable localThrowable = this.j.a();
        if ((localThrowable != null) && (localThrowable != rVa.a)) {
          zVa.b(localThrowable);
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/BTa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */