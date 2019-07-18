import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

abstract class LSa$a<T>
  extends fVa<T>
  implements HQa<T>, Runnable
{
  final WQa.c a;
  final boolean b;
  final int c;
  final int d;
  final AtomicLong e;
  Pab f;
  _Ra<T> g;
  volatile boolean h;
  volatile boolean i;
  Throwable j;
  int k;
  long l;
  boolean m;
  
  LSa$a(WQa.c paramc, boolean paramBoolean, int paramInt)
  {
    this.a = paramc;
    this.b = paramBoolean;
    this.c = paramInt;
    this.e = new AtomicLong();
    this.d = (paramInt - (paramInt >> 2));
  }
  
  public final int a(int paramInt)
  {
    if ((paramInt & 0x2) != 0)
    {
      this.m = true;
      return 2;
    }
    return 0;
  }
  
  public final void a()
  {
    if (!this.i)
    {
      this.i = true;
      e();
    }
  }
  
  public final void a(long paramLong)
  {
    if (kVa.c(paramLong))
    {
      nVa.a(this.e, paramLong);
      e();
    }
  }
  
  public final void a(T paramT)
  {
    if (this.i) {
      return;
    }
    if (this.k == 2)
    {
      e();
      return;
    }
    if (!this.g.offer(paramT))
    {
      this.f.cancel();
      this.j = new qRa("Queue is full?!");
      this.i = true;
    }
    e();
  }
  
  public final void a(Throwable paramThrowable)
  {
    if (this.i)
    {
      zVa.b(paramThrowable);
      return;
    }
    this.j = paramThrowable;
    this.i = true;
    e();
  }
  
  final boolean a(boolean paramBoolean1, boolean paramBoolean2, Oab<?> paramOab)
  {
    if (this.h)
    {
      clear();
      return true;
    }
    if (paramBoolean1)
    {
      Throwable localThrowable;
      if (this.b)
      {
        if (paramBoolean2)
        {
          this.h = true;
          localThrowable = this.j;
          if (localThrowable != null) {
            paramOab.a(localThrowable);
          } else {
            paramOab.a();
          }
          this.a.i();
          return true;
        }
      }
      else
      {
        localThrowable = this.j;
        if (localThrowable != null)
        {
          this.h = true;
          clear();
          paramOab.a(localThrowable);
          this.a.i();
          return true;
        }
        if (paramBoolean2)
        {
          this.h = true;
          paramOab.a();
          this.a.i();
          return true;
        }
      }
    }
    return false;
  }
  
  abstract void b();
  
  abstract void c();
  
  public final void cancel()
  {
    if (this.h) {
      return;
    }
    this.h = true;
    this.f.cancel();
    this.a.i();
    if (getAndIncrement() == 0) {
      this.g.clear();
    }
  }
  
  public final void clear()
  {
    this.g.clear();
  }
  
  abstract void d();
  
  final void e()
  {
    if (getAndIncrement() != 0) {
      return;
    }
    this.a.a(this);
  }
  
  public final boolean isEmpty()
  {
    return this.g.isEmpty();
  }
  
  public final void run()
  {
    if (this.m) {
      c();
    } else if (this.k == 1) {
      d();
    } else {
      b();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/LSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */