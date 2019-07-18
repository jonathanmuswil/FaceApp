import java.util.concurrent.atomic.AtomicBoolean;

final class PUa$c$a
  extends AtomicBoolean
  implements Runnable, kRa
{
  final Runnable a;
  
  PUa$c$a(Runnable paramRunnable)
  {
    this.a = paramRunnable;
  }
  
  public boolean h()
  {
    return get();
  }
  
  public void i()
  {
    lazySet(true);
  }
  
  public void run()
  {
    if (get()) {
      return;
    }
    try
    {
      this.a.run();
      return;
    }
    finally
    {
      lazySet(true);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/PUa$c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */