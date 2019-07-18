final class ybb<T>
  extends QQa<T>
{
  private final QQa<tbb<T>> a;
  
  ybb(QQa<tbb<T>> paramQQa)
  {
    this.a = paramQQa;
  }
  
  protected void b(VQa<? super T> paramVQa)
  {
    this.a.a(new ybb.a(paramVQa));
  }
  
  private static class a<R>
    implements VQa<tbb<R>>
  {
    private final VQa<? super R> a;
    private boolean b;
    
    a(VQa<? super R> paramVQa)
    {
      this.a = paramVQa;
    }
    
    public void a()
    {
      if (!this.b) {
        this.a.a();
      }
    }
    
    public void a(Throwable paramThrowable)
    {
      if (!this.b)
      {
        this.a.a(paramThrowable);
      }
      else
      {
        AssertionError localAssertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        localAssertionError.initCause(paramThrowable);
        zVa.b(localAssertionError);
      }
    }
    
    public void a(kRa paramkRa)
    {
      this.a.a(paramkRa);
    }
    
    public void a(tbb<R> paramtbb)
    {
      if (paramtbb.d())
      {
        this.a.a(paramtbb.a());
      }
      else
      {
        this.b = true;
        Bbb localBbb = new Bbb(paramtbb);
        try
        {
          this.a.a(localBbb);
        }
        catch (Throwable paramtbb)
        {
          pRa.b(paramtbb);
          zVa.b(new oRa(new Throwable[] { localBbb, paramtbb }));
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ybb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */