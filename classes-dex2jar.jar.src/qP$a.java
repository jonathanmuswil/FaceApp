import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class qP$a
  implements qP.b
{
  private final CountDownLatch a = new CountDownLatch(1);
  
  public final void a()
  {
    this.a.countDown();
  }
  
  public final void a(Exception paramException)
  {
    this.a.countDown();
  }
  
  public final boolean a(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException
  {
    return this.a.await(paramLong, paramTimeUnit);
  }
  
  public final void b()
    throws InterruptedException
  {
    this.a.await();
  }
  
  public final void b(Object paramObject)
  {
    this.a.countDown();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qP$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */