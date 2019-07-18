final class WQa$b
  implements kRa, Runnable, DVa
{
  final Runnable a;
  final WQa.c b;
  volatile boolean c;
  
  WQa$b(Runnable paramRunnable, WQa.c paramc)
  {
    this.a = paramRunnable;
    this.b = paramc;
  }
  
  public boolean h()
  {
    return this.c;
  }
  
  public void i()
  {
    this.c = true;
    this.b.i();
  }
  
  public void run()
  {
    if (!this.c) {
      try
      {
        this.a.run();
      }
      catch (Throwable localThrowable)
      {
        pRa.b(localThrowable);
        this.b.i();
        throw rVa.a(localThrowable);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WQa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */