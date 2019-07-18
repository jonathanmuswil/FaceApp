import java.util.concurrent.atomic.AtomicInteger;

final class oSa$a
  extends AtomicInteger
  implements zQa, kRa
{
  final zQa a;
  final uRa b;
  kRa c;
  
  oSa$a(zQa paramzQa, uRa paramuRa)
  {
    this.a = paramzQa;
    this.b = paramuRa;
  }
  
  public void a()
  {
    this.a.a();
    b();
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.a(paramThrowable);
    b();
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.c, paramkRa))
    {
      this.c = paramkRa;
      this.a.a(this);
    }
  }
  
  void b()
  {
    if (compareAndSet(0, 1)) {
      try
      {
        this.b.run();
      }
      catch (Throwable localThrowable)
      {
        pRa.b(localThrowable);
        zVa.b(localThrowable);
      }
    }
  }
  
  public boolean h()
  {
    return this.c.h();
  }
  
  public void i()
  {
    this.c.i();
    b();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */