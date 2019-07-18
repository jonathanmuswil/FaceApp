import java.util.concurrent.CountDownLatch;

class Xk$b
{
  private boolean a = false;
  private final CountDownLatch b = new CountDownLatch(1);
  
  void a()
  {
    try
    {
      this.b.await();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
    this.b.countDown();
  }
  
  boolean b()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Xk$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */