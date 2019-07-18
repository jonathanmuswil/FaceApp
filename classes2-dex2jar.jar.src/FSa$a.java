import java.util.concurrent.atomic.AtomicReference;

final class FSa$a<T, U>
  extends AtomicReference<Pab>
  implements HQa<U>, kRa
{
  final long a;
  final FSa.b<T, U> b;
  final int c;
  final int d;
  volatile boolean e;
  volatile _Ra<U> f;
  long g;
  int h;
  
  FSa$a(FSa.b<T, U> paramb, long paramLong)
  {
    this.a = paramLong;
    this.b = paramb;
    this.d = paramb.g;
    this.c = (this.d >> 2);
  }
  
  public void a()
  {
    this.e = true;
    this.b.e();
  }
  
  void a(long paramLong)
  {
    if (this.h != 1)
    {
      paramLong = this.g + paramLong;
      if (paramLong >= this.c)
      {
        this.g = 0L;
        ((Pab)get()).a(paramLong);
      }
      else
      {
        this.g = paramLong;
      }
    }
  }
  
  public void a(Pab paramPab)
  {
    if (kVa.a(this, paramPab))
    {
      if ((paramPab instanceof XRa))
      {
        XRa localXRa = (XRa)paramPab;
        int i = localXRa.a(7);
        if (i == 1)
        {
          this.h = i;
          this.f = localXRa;
          this.e = true;
          this.b.e();
          return;
        }
        if (i == 2)
        {
          this.h = i;
          this.f = localXRa;
        }
      }
      paramPab.a(this.d);
    }
  }
  
  public void a(U paramU)
  {
    if (this.h != 2) {
      this.b.a(paramU, this);
    } else {
      this.b.e();
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    lazySet(kVa.a);
    this.b.a(this, paramThrowable);
  }
  
  public boolean h()
  {
    boolean bool;
    if (get() == kVa.a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void i()
  {
    kVa.a(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/FSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */