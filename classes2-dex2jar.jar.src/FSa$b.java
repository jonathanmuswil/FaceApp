import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

final class FSa$b<T, U>
  extends AtomicInteger
  implements HQa<T>, Pab
{
  static final FSa.a<?, ?>[] a = new FSa.a[0];
  static final FSa.a<?, ?>[] b = new FSa.a[0];
  final Oab<? super U> c;
  final DRa<? super T, ? extends Nab<? extends U>> d;
  final boolean e;
  final int f;
  final int g;
  volatile ZRa<U> h;
  volatile boolean i;
  final mVa j = new mVa();
  volatile boolean k;
  final AtomicReference<FSa.a<?, ?>[]> l = new AtomicReference();
  final AtomicLong m = new AtomicLong();
  Pab n;
  long o;
  long p;
  int q;
  int r;
  final int s;
  
  FSa$b(Oab<? super U> paramOab, DRa<? super T, ? extends Nab<? extends U>> paramDRa, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.c = paramOab;
    this.d = paramDRa;
    this.e = paramBoolean;
    this.f = paramInt1;
    this.g = paramInt2;
    this.s = Math.max(1, paramInt1 >> 1);
    this.l.lazySet(a);
  }
  
  public void a()
  {
    if (this.i) {
      return;
    }
    this.i = true;
    e();
  }
  
  public void a(long paramLong)
  {
    if (kVa.c(paramLong))
    {
      nVa.a(this.m, paramLong);
      e();
    }
  }
  
  void a(FSa.a<T, U> parama, Throwable paramThrowable)
  {
    if (this.j.a(paramThrowable))
    {
      parama.e = true;
      if (!this.e)
      {
        this.n.cancel();
        parama = (FSa.a[])this.l.getAndSet(b);
        int i1 = parama.length;
        for (int i2 = 0; i2 < i1; i2++) {
          parama[i2].i();
        }
      }
      e();
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  public void a(Pab paramPab)
  {
    if (kVa.a(this.n, paramPab))
    {
      this.n = paramPab;
      this.c.a(this);
      if (!this.k)
      {
        int i1 = this.f;
        if (i1 == Integer.MAX_VALUE) {
          paramPab.a(Long.MAX_VALUE);
        } else {
          paramPab.a(i1);
        }
      }
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
      ORa.a(paramT, "The mapper returned a null Publisher");
      Nab localNab = (Nab)paramT;
      if ((localNab instanceof Callable)) {
        try
        {
          paramT = ((Callable)localNab).call();
          if (paramT != null)
          {
            b(paramT);
          }
          else if ((this.f != Integer.MAX_VALUE) && (!this.k))
          {
            int i1 = this.r + 1;
            this.r = i1;
            int i2 = this.s;
            if (i1 == i2)
            {
              this.r = 0;
              this.n.a(i2);
            }
          }
        }
        catch (Throwable paramT)
        {
          pRa.b(paramT);
          this.j.a(paramT);
          e();
          return;
        }
      }
      long l1 = this.o;
      this.o = (1L + l1);
      paramT = new FSa.a(this, l1);
      if (a(paramT)) {
        localNab.a(paramT);
      }
      return;
    }
    catch (Throwable paramT)
    {
      pRa.b(paramT);
      this.n.cancel();
      a(paramT);
    }
  }
  
  void a(U paramU, FSa.a<T, U> parama)
  {
    _Ra local_Ra;
    Object localObject;
    if ((get() == 0) && (compareAndSet(0, 1)))
    {
      long l1 = this.m.get();
      local_Ra = parama.f;
      if ((l1 != 0L) && ((local_Ra == null) || (local_Ra.isEmpty())))
      {
        this.c.a(paramU);
        if (l1 != Long.MAX_VALUE) {
          this.m.decrementAndGet();
        }
        parama.a(1L);
      }
      else
      {
        localObject = local_Ra;
        if (local_Ra == null) {
          localObject = b(parama);
        }
        if (!((_Ra)localObject).offer(paramU))
        {
          a(new qRa("Inner queue full?!"));
          return;
        }
      }
      if (decrementAndGet() != 0) {}
    }
    else
    {
      local_Ra = parama.f;
      localObject = local_Ra;
      if (local_Ra == null)
      {
        localObject = new KUa(this.g);
        parama.f = ((_Ra)localObject);
      }
      if (!((_Ra)localObject).offer(paramU))
      {
        a(new qRa("Inner queue full?!"));
        return;
      }
      if (getAndIncrement() != 0) {
        return;
      }
    }
    f();
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
      e();
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  boolean a(FSa.a<T, U> parama)
  {
    FSa.a[] arrayOfa1;
    FSa.a[] arrayOfa2;
    do
    {
      arrayOfa1 = (FSa.a[])this.l.get();
      if (arrayOfa1 == b)
      {
        parama.i();
        return false;
      }
      int i1 = arrayOfa1.length;
      arrayOfa2 = new FSa.a[i1 + 1];
      System.arraycopy(arrayOfa1, 0, arrayOfa2, 0, i1);
      arrayOfa2[i1] = parama;
    } while (!this.l.compareAndSet(arrayOfa1, arrayOfa2));
    return true;
  }
  
  _Ra<U> b(FSa.a<T, U> parama)
  {
    _Ra local_Ra = parama.f;
    Object localObject = local_Ra;
    if (local_Ra == null)
    {
      localObject = new KUa(this.g);
      parama.f = ((_Ra)localObject);
    }
    return (_Ra<U>)localObject;
  }
  
  void b(U paramU)
  {
    if ((get() == 0) && (compareAndSet(0, 1)))
    {
      long l1 = this.m.get();
      ZRa localZRa = this.h;
      if ((l1 != 0L) && ((localZRa == null) || (localZRa.isEmpty())))
      {
        this.c.a(paramU);
        if (l1 != Long.MAX_VALUE) {
          this.m.decrementAndGet();
        }
        if ((this.f != Integer.MAX_VALUE) && (!this.k))
        {
          int i1 = this.r + 1;
          this.r = i1;
          int i2 = this.s;
          if (i1 == i2)
          {
            this.r = 0;
            this.n.a(i2);
          }
        }
      }
      else
      {
        Object localObject = localZRa;
        if (localZRa == null) {
          localObject = g();
        }
        if (!((_Ra)localObject).offer(paramU))
        {
          a(new IllegalStateException("Scalar queue full?!"));
          return;
        }
      }
      if (decrementAndGet() != 0) {}
    }
    else
    {
      if (!g().offer(paramU))
      {
        a(new IllegalStateException("Scalar queue full?!"));
        return;
      }
      if (getAndIncrement() != 0) {
        return;
      }
    }
    f();
  }
  
  boolean b()
  {
    if (this.k)
    {
      c();
      return true;
    }
    if ((!this.e) && (this.j.get() != null))
    {
      c();
      Throwable localThrowable = this.j.a();
      if (localThrowable != rVa.a) {
        this.c.a(localThrowable);
      }
      return true;
    }
    return false;
  }
  
  void c()
  {
    ZRa localZRa = this.h;
    if (localZRa != null) {
      localZRa.clear();
    }
  }
  
  void c(FSa.a<T, U> parama)
  {
    FSa.a[] arrayOfa1;
    FSa.a[] arrayOfa2;
    do
    {
      arrayOfa1 = (FSa.a[])this.l.get();
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
        arrayOfa2 = new FSa.a[i1 - 1];
        System.arraycopy(arrayOfa1, 0, arrayOfa2, 0, i4);
        System.arraycopy(arrayOfa1, i4 + 1, arrayOfa2, i4, i1 - i4 - 1);
      }
    } while (!this.l.compareAndSet(arrayOfa1, arrayOfa2));
  }
  
  public void cancel()
  {
    if (!this.k)
    {
      this.k = true;
      this.n.cancel();
      d();
      if (getAndIncrement() == 0)
      {
        ZRa localZRa = this.h;
        if (localZRa != null) {
          localZRa.clear();
        }
      }
    }
  }
  
  void d()
  {
    FSa.a[] arrayOfa = (FSa.a[])this.l.get();
    Object localObject = b;
    if (arrayOfa != localObject)
    {
      localObject = (FSa.a[])this.l.getAndSet(localObject);
      if (localObject != b)
      {
        int i1 = localObject.length;
        for (int i2 = 0; i2 < i1; i2++) {
          localObject[i2].i();
        }
        localObject = this.j.a();
        if ((localObject != null) && (localObject != rVa.a)) {
          zVa.b((Throwable)localObject);
        }
      }
    }
  }
  
  void e()
  {
    if (getAndIncrement() == 0) {
      f();
    }
  }
  
  void f()
  {
    Oab localOab = this.c;
    int i1 = 1;
    int i5;
    label771:
    do
    {
      do
      {
        if (b()) {
          return;
        }
        Object localObject1 = this.h;
        long l1 = this.m.get();
        int i2;
        if (l1 == Long.MAX_VALUE) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        long l2;
        if (localObject1 != null)
        {
          l2 = 0L;
          for (;;)
          {
            l3 = 0L;
            localObject3 = null;
            while (l1 != 0L)
            {
              localObject3 = ((ZRa)localObject1).poll();
              if (b()) {
                return;
              }
              if (localObject3 == null) {
                break;
              }
              localOab.a(localObject3);
              l2 += 1L;
              l3 += 1L;
              l1 -= 1L;
            }
            if (l3 != 0L) {
              if (i2 != 0) {
                l1 = Long.MAX_VALUE;
              } else {
                l1 = this.m.addAndGet(-l3);
              }
            }
            l4 = l1;
            l3 = l2;
            if (l1 == 0L) {
              break;
            }
            if (localObject3 == null)
            {
              l4 = l1;
              l3 = l2;
              break;
            }
          }
        }
        long l3 = 0L;
        long l4 = l1;
        boolean bool = this.i;
        localObject1 = this.h;
        Object localObject3 = (FSa.a[])this.l.get();
        int i3 = localObject3.length;
        if ((bool) && ((localObject1 == null) || (((_Ra)localObject1).isEmpty())) && (i3 == 0))
        {
          localObject3 = this.j.a();
          if (localObject3 != rVa.a) {
            if (localObject3 == null) {
              localOab.a();
            } else {
              localOab.a((Throwable)localObject3);
            }
          }
          return;
        }
        if (i3 != 0)
        {
          l1 = this.p;
          int i4 = this.q;
          if (i3 > i4)
          {
            i5 = i4;
            if (localObject3[i4].a == l1) {}
          }
          else
          {
            i5 = i4;
            if (i3 <= i4) {
              i5 = 0;
            }
            for (i4 = 0; (i4 < i3) && (localObject3[i5].a != l1); i4++)
            {
              i6 = i5 + 1;
              i5 = i6;
              if (i6 == i3) {
                i5 = 0;
              }
            }
            this.q = i5;
            this.p = localObject3[i5].a;
          }
          int i7 = 0;
          i4 = 0;
          l1 = l3;
          l3 = l4;
          int i6 = i5;
          i5 = i7;
          while (i4 < i3)
          {
            if (b()) {
              return;
            }
            FSa.a locala = localObject3[i6];
            localObject1 = null;
            for (;;)
            {
              if (b()) {
                return;
              }
              local_Ra = locala.f;
              if (local_Ra == null)
              {
                l2 = l3;
                break;
              }
              l2 = 0L;
              for (;;)
              {
                if (l3 != 0L) {
                  try
                  {
                    localObject1 = local_Ra.poll();
                    if (localObject1 != null)
                    {
                      localOab.a(localObject1);
                      if (b()) {
                        return;
                      }
                      l3 -= 1L;
                      l2 += 1L;
                    }
                  }
                  catch (Throwable localThrowable)
                  {
                    pRa.b(localThrowable);
                    locala.i();
                    this.j.a(localThrowable);
                    if (!this.e) {
                      this.n.cancel();
                    }
                    if (b()) {
                      return;
                    }
                    c(locala);
                    i4++;
                    i5 = 1;
                    break label771;
                  }
                }
              }
              if (l2 != 0L)
              {
                if (i2 == 0) {
                  l3 = this.m.addAndGet(-l2);
                } else {
                  l3 = Long.MAX_VALUE;
                }
                locala.a(l2);
                l4 = 0L;
              }
              else
              {
                l4 = 0L;
              }
              l2 = l3;
              if (l3 == l4) {
                break;
              }
              if (localThrowable == null)
              {
                l2 = l3;
                break;
              }
            }
            Object localObject2 = localObject3;
            bool = locala.e;
            _Ra local_Ra = locala.f;
            if ((bool) && ((local_Ra == null) || (local_Ra.isEmpty())))
            {
              c(locala);
              if (b()) {
                return;
              }
              l1 += 1L;
              i5 = 1;
            }
            if (l2 == 0L)
            {
              localObject3 = localObject2;
              break;
            }
            i6++;
            if (i6 == i3)
            {
              i6 = 0;
              l3 = l2;
            }
            else
            {
              l3 = l2;
            }
            i4++;
          }
          this.q = i6;
          this.p = localObject3[i6].a;
        }
        else
        {
          i5 = 0;
          l1 = l3;
        }
        if ((l1 != 0L) && (!this.k)) {
          this.n.a(l1);
        }
      } while (i5 != 0);
      i5 = addAndGet(-i1);
      i1 = i5;
    } while (i5 != 0);
  }
  
  _Ra<U> g()
  {
    ZRa localZRa = this.h;
    Object localObject = localZRa;
    if (localZRa == null)
    {
      int i1 = this.f;
      if (i1 == Integer.MAX_VALUE) {
        localObject = new LUa(this.g);
      } else {
        localObject = new KUa(i1);
      }
      this.h = ((ZRa)localObject);
    }
    return (_Ra<U>)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/FSa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */