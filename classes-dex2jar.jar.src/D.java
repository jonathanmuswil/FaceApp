import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class d
  extends e
{
  private final Object a = new Object();
  private ExecutorService b = Executors.newFixedThreadPool(2);
  private volatile Handler c;
  
  public void a(Runnable paramRunnable)
  {
    this.b.execute(paramRunnable);
  }
  
  public boolean a()
  {
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void b(Runnable paramRunnable)
  {
    if (this.c == null) {
      synchronized (this.a)
      {
        if (this.c == null)
        {
          Handler localHandler = new android/os/Handler;
          localHandler.<init>(Looper.getMainLooper());
          this.c = localHandler;
        }
      }
    }
    this.c.post(paramRunnable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */