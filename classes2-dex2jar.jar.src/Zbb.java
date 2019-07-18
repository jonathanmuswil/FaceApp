final class zbb<T>
  extends QQa<tbb<T>>
{
  private final Rab<T> a;
  
  zbb(Rab<T> paramRab)
  {
    this.a = paramRab;
  }
  
  protected void b(VQa<? super tbb<T>> paramVQa)
  {
    Rab localRab = this.a.clone();
    zbb.a locala = new zbb.a(localRab, paramVQa);
    paramVQa.a(locala);
    if (!locala.h()) {
      localRab.a(locala);
    }
  }
  
  private static final class a<T>
    implements kRa, Tab<T>
  {
    private final Rab<?> a;
    private final VQa<? super tbb<T>> b;
    private volatile boolean c;
    boolean d = false;
    
    a(Rab<?> paramRab, VQa<? super tbb<T>> paramVQa)
    {
      this.a = paramRab;
      this.b = paramVQa;
    }
    
    public void a(Rab<T> paramRab, Throwable paramThrowable)
    {
      if (paramRab.D()) {
        return;
      }
      try
      {
        this.b.a(paramThrowable);
      }
      catch (Throwable paramRab)
      {
        pRa.b(paramRab);
        zVa.b(new oRa(new Throwable[] { paramThrowable, paramRab }));
      }
    }
    
    public void a(Rab<T> paramRab, tbb<T> paramtbb)
    {
      if (this.c) {
        return;
      }
      try
      {
        this.b.a(paramtbb);
        if (!this.c)
        {
          this.d = true;
          this.b.a();
        }
      }
      catch (Throwable paramRab)
      {
        if (this.d) {
          zVa.b(paramRab);
        } else if (!this.c) {
          try
          {
            this.b.a(paramRab);
          }
          catch (Throwable paramtbb)
          {
            pRa.b(paramtbb);
            zVa.b(new oRa(new Throwable[] { paramRab, paramtbb }));
          }
        }
      }
    }
    
    public boolean h()
    {
      return this.c;
    }
    
    public void i()
    {
      this.c = true;
      this.a.cancel();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */