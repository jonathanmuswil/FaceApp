import android.os.Handler;

final class hRa$b
  implements Runnable, kRa
{
  private final Handler a;
  private final Runnable b;
  private volatile boolean c;
  
  hRa$b(Handler paramHandler, Runnable paramRunnable)
  {
    this.a = paramHandler;
    this.b = paramRunnable;
  }
  
  public boolean h()
  {
    return this.c;
  }
  
  public void i()
  {
    this.a.removeCallbacks(this);
    this.c = true;
  }
  
  public void run()
  {
    try
    {
      this.b.run();
    }
    catch (Throwable localThrowable)
    {
      zVa.b(localThrowable);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hRa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */