final class WQa$a
  implements kRa, Runnable, DVa
{
  final Runnable a;
  final WQa.c b;
  Thread c;
  
  WQa$a(Runnable paramRunnable, WQa.c paramc)
  {
    this.a = paramRunnable;
    this.b = paramc;
  }
  
  public boolean h()
  {
    return this.b.h();
  }
  
  public void i()
  {
    if (this.c == Thread.currentThread())
    {
      WQa.c localc = this.b;
      if ((localc instanceof TUa))
      {
        ((TUa)localc).a();
        return;
      }
    }
    this.b.i();
  }
  
  public void run()
  {
    this.c = Thread.currentThread();
    try
    {
      this.a.run();
      return;
    }
    finally
    {
      i();
      this.c = null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WQa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */