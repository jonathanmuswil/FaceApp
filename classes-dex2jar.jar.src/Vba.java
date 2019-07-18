import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class vba
  implements ThreadFactory
{
  vba(String paramString, AtomicLong paramAtomicLong) {}
  
  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = Executors.defaultThreadFactory().newThread(new uba(this, paramRunnable));
    paramRunnable = new StringBuilder();
    paramRunnable.append(this.a);
    paramRunnable.append(this.b.getAndIncrement());
    localThread.setName(paramRunnable.toString());
    return localThread;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */