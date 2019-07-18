import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;

final class _Ua$b
  implements Runnable
{
  public void run()
  {
    Iterator localIterator = new ArrayList(_Ua.d.keySet()).iterator();
    while (localIterator.hasNext())
    {
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor)localIterator.next();
      if (localScheduledThreadPoolExecutor.isShutdown()) {
        _Ua.d.remove(localScheduledThreadPoolExecutor);
      } else {
        localScheduledThreadPoolExecutor.purge();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Ua$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */