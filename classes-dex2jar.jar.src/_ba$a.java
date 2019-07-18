import java.util.concurrent.ThreadFactory;

public final class _ba$a
  implements ThreadFactory
{
  private final int a;
  
  public _ba$a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable);
    paramRunnable.setPriority(this.a);
    paramRunnable.setName("Queue");
    return paramRunnable;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_ba$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */