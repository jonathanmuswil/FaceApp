final class tTa$a<T>
  implements VQa<T>, kRa
{
  final VQa<? super T> a;
  final ARa<? super T> b;
  final ARa<? super Throwable> c;
  final uRa d;
  final uRa e;
  kRa f;
  boolean g;
  
  tTa$a(VQa<? super T> paramVQa, ARa<? super T> paramARa, ARa<? super Throwable> paramARa1, uRa paramuRa1, uRa paramuRa2)
  {
    this.a = paramVQa;
    this.b = paramARa;
    this.c = paramARa1;
    this.d = paramuRa1;
    this.e = paramuRa2;
  }
  
  public void a()
  {
    if (this.g) {
      return;
    }
    try
    {
      this.d.run();
      this.g = true;
      this.a.a();
      try
      {
        this.e.run();
      }
      catch (Throwable localThrowable1)
      {
        pRa.b(localThrowable1);
        zVa.b(localThrowable1);
      }
      return;
    }
    catch (Throwable localThrowable2)
    {
      pRa.b(localThrowable2);
      a(localThrowable2);
    }
  }
  
  public void a(T paramT)
  {
    if (this.g) {
      return;
    }
    try
    {
      this.b.accept(paramT);
      this.a.a(paramT);
      return;
    }
    catch (Throwable paramT)
    {
      pRa.b(paramT);
      this.f.i();
      a(paramT);
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.g)
    {
      zVa.b(paramThrowable);
      return;
    }
    this.g = true;
    try
    {
      this.c.accept(paramThrowable);
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      paramThrowable = new oRa(new Throwable[] { paramThrowable, localThrowable });
    }
    this.a.a(paramThrowable);
    try
    {
      this.e.run();
    }
    catch (Throwable paramThrowable)
    {
      pRa.b(paramThrowable);
      zVa.b(paramThrowable);
    }
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.f, paramkRa))
    {
      this.f = paramkRa;
      this.a.a(this);
    }
  }
  
  public boolean h()
  {
    return this.f.h();
  }
  
  public void i()
  {
    this.f.i();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */