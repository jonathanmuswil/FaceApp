class Dbb$a<R>
  implements VQa<tbb<R>>
{
  private final VQa<? super Cbb<R>> a;
  
  Dbb$a(VQa<? super Cbb<R>> paramVQa)
  {
    this.a = paramVQa;
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(Throwable paramThrowable)
  {
    try
    {
      this.a.a(Cbb.a(paramThrowable));
      this.a.a();
      return;
    }
    catch (Throwable paramThrowable)
    {
      try
      {
        this.a.a(paramThrowable);
      }
      catch (Throwable localThrowable)
      {
        pRa.b(localThrowable);
        zVa.b(new oRa(new Throwable[] { paramThrowable, localThrowable }));
      }
    }
  }
  
  public void a(kRa paramkRa)
  {
    this.a.a(paramkRa);
  }
  
  public void a(tbb<R> paramtbb)
  {
    this.a.a(Cbb.a(paramtbb));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Dbb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */