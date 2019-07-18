final class uSa$a
  implements zQa, kRa
{
  final zQa a;
  kRa b;
  
  uSa$a(uSa paramuSa, zQa paramzQa)
  {
    this.a = paramzQa;
  }
  
  public void a()
  {
    if (this.b == IRa.a) {
      return;
    }
    try
    {
      this.c.d.run();
      this.c.e.run();
      this.a.a();
      b();
      return;
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      this.a.a(localThrowable);
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.b == IRa.a)
    {
      zVa.b(paramThrowable);
      return;
    }
    try
    {
      this.c.c.accept(paramThrowable);
      this.c.e.run();
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      paramThrowable = new oRa(new Throwable[] { paramThrowable, localThrowable });
    }
    this.a.a(paramThrowable);
    b();
  }
  
  public void a(kRa paramkRa)
  {
    try
    {
      this.c.b.accept(paramkRa);
      if (IRa.a(this.b, paramkRa))
      {
        this.b = paramkRa;
        this.a.a(this);
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      paramkRa.i();
      this.b = IRa.a;
      JRa.a(localThrowable, this.a);
    }
  }
  
  void b()
  {
    try
    {
      this.c.f.run();
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      zVa.b(localThrowable);
    }
  }
  
  public boolean h()
  {
    return this.b.h();
  }
  
  public void i()
  {
    try
    {
      this.c.g.run();
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      zVa.b(localThrowable);
    }
    this.b.i();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/uSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */