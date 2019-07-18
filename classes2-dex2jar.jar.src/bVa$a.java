import java.util.concurrent.TimeUnit;

final class bVa$a
  implements Runnable
{
  private final Runnable a;
  private final bVa.c b;
  private final long c;
  
  bVa$a(Runnable paramRunnable, bVa.c paramc, long paramLong)
  {
    this.a = paramRunnable;
    this.b = paramc;
    this.c = paramLong;
  }
  
  public void run()
  {
    if (!this.b.d)
    {
      long l1 = this.b.a(TimeUnit.MILLISECONDS);
      long l2 = this.c;
      if (l2 > l1) {
        try
        {
          Thread.sleep(l2 - l1);
        }
        catch (InterruptedException localInterruptedException)
        {
          Thread.currentThread().interrupt();
          zVa.b(localInterruptedException);
          return;
        }
      }
      if (!this.b.d) {
        this.a.run();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bVa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */