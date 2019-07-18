import java.util.concurrent.atomic.AtomicReference;

final class BTa$a<T, U>
  extends AtomicReference<kRa>
  implements VQa<U>
{
  final long a;
  final BTa.b<T, U> b;
  volatile boolean c;
  volatile _Ra<U> d;
  int e;
  
  BTa$a(BTa.b<T, U> paramb, long paramLong)
  {
    this.a = paramLong;
    this.b = paramb;
  }
  
  public void a()
  {
    this.c = true;
    this.b.d();
  }
  
  public void a(U paramU)
  {
    if (this.e == 0) {
      this.b.a(paramU, this);
    } else {
      this.b.d();
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.b.j.a(paramThrowable))
    {
      paramThrowable = this.b;
      if (!paramThrowable.e) {
        paramThrowable.c();
      }
      this.c = true;
      this.b.d();
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  public void a(kRa paramkRa)
  {
    if ((IRa.c(this, paramkRa)) && ((paramkRa instanceof VRa)))
    {
      paramkRa = (VRa)paramkRa;
      int i = paramkRa.a(7);
      if (i == 1)
      {
        this.e = i;
        this.d = paramkRa;
        this.c = true;
        this.b.d();
        return;
      }
      if (i == 2)
      {
        this.e = i;
        this.d = paramkRa;
      }
    }
  }
  
  public void b()
  {
    IRa.a(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/BTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */