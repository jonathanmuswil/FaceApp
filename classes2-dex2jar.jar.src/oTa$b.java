import java.util.concurrent.TimeUnit;

final class oTa$b<T>
  implements VQa<T>, kRa
{
  final VQa<? super T> a;
  final long b;
  final TimeUnit c;
  final WQa.c d;
  kRa e;
  kRa f;
  volatile long g;
  boolean h;
  
  oTa$b(VQa<? super T> paramVQa, long paramLong, TimeUnit paramTimeUnit, WQa.c paramc)
  {
    this.a = paramVQa;
    this.b = paramLong;
    this.c = paramTimeUnit;
    this.d = paramc;
  }
  
  public void a()
  {
    if (this.h) {
      return;
    }
    this.h = true;
    Object localObject = this.f;
    if (localObject != null) {
      ((kRa)localObject).i();
    }
    localObject = (oTa.a)localObject;
    if (localObject != null) {
      ((oTa.a)localObject).run();
    }
    this.a.a();
    this.d.i();
  }
  
  void a(long paramLong, T paramT, oTa.a<T> parama)
  {
    if (paramLong == this.g)
    {
      this.a.a(paramT);
      parama.i();
    }
  }
  
  public void a(T paramT)
  {
    if (this.h) {
      return;
    }
    long l = this.g + 1L;
    this.g = l;
    kRa localkRa = this.f;
    if (localkRa != null) {
      localkRa.i();
    }
    paramT = new oTa.a(paramT, l, this);
    this.f = paramT;
    paramT.a(this.d.a(paramT, this.b, this.c));
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.h)
    {
      zVa.b(paramThrowable);
      return;
    }
    kRa localkRa = this.f;
    if (localkRa != null) {
      localkRa.i();
    }
    this.h = true;
    this.a.a(paramThrowable);
    this.d.i();
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.e, paramkRa))
    {
      this.e = paramkRa;
      this.a.a(this);
    }
  }
  
  public boolean h()
  {
    return this.d.h();
  }
  
  public void i()
  {
    this.e.i();
    this.d.i();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oTa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */