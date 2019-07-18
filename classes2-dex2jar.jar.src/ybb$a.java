class ybb$a<R>
  implements VQa<tbb<R>>
{
  private final VQa<? super R> a;
  private boolean b;
  
  ybb$a(VQa<? super R> paramVQa)
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ybb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */