import java.util.concurrent.atomic.AtomicReference;

final class cUa$a<T, R>
  extends AtomicReference<kRa>
  implements VQa<R>
{
  final cUa.b<T, R> a;
  final long b;
  final int c;
  volatile _Ra<R> d;
  volatile boolean e;
  
  cUa$a(cUa.b<T, R> paramb, long paramLong, int paramInt)
  {
    this.a = paramb;
    this.b = paramLong;
    this.c = paramInt;
  }
  
  public void a()
  {
    if (this.b == this.a.k)
    {
      this.e = true;
      this.a.c();
    }
  }
  
  public void a(R paramR)
  {
    if (this.b == this.a.k)
    {
      if (paramR != null) {
        this.d.offer(paramR);
      }
      this.a.c();
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.a(this, paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.c(this, paramkRa))
    {
      if ((paramkRa instanceof VRa))
      {
        paramkRa = (VRa)paramkRa;
        int i = paramkRa.a(7);
        if (i == 1)
        {
          this.d = paramkRa;
          this.e = true;
          this.a.c();
          return;
        }
        if (i == 2)
        {
          this.d = paramkRa;
          return;
        }
      }
      this.d = new LUa(this.c);
    }
  }
  
  public void b()
  {
    IRa.a(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/cUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */