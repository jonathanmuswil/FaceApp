final class CSa$a<T>
  implements HQa<T>, Pab
{
  final Oab<? super T> a;
  final ARa<? super Pab> b;
  final ERa c;
  final uRa d;
  Pab e;
  
  CSa$a(Oab<? super T> paramOab, ARa<? super Pab> paramARa, ERa paramERa, uRa paramuRa)
  {
    this.a = paramOab;
    this.b = paramARa;
    this.d = paramuRa;
    this.c = paramERa;
  }
  
  public void a()
  {
    if (this.e != kVa.a) {
      this.a.a();
    }
  }
  
  public void a(long paramLong)
  {
    try
    {
      this.c.accept(paramLong);
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      zVa.b(localThrowable);
    }
    this.e.a(paramLong);
  }
  
  public void a(Pab paramPab)
  {
    try
    {
      this.b.accept(paramPab);
      if (kVa.a(this.e, paramPab))
      {
        this.e = paramPab;
        this.a.a(this);
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      paramPab.cancel();
      this.e = kVa.a;
      hVa.a(localThrowable, this.a);
    }
  }
  
  public void a(T paramT)
  {
    this.a.a(paramT);
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.e != kVa.a) {
      this.a.a(paramThrowable);
    } else {
      zVa.b(paramThrowable);
    }
  }
  
  public void cancel()
  {
    Pab localPab = this.e;
    kVa localkVa = kVa.a;
    if (localPab != localkVa)
    {
      this.e = localkVa;
      try
      {
        this.d.run();
      }
      catch (Throwable localThrowable)
      {
        pRa.b(localThrowable);
        zVa.b(localThrowable);
      }
      localPab.cancel();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/CSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */