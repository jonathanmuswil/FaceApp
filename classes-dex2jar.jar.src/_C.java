import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class _c
{
  private final Object a = new Object();
  private HandlerThread b;
  private Handler c;
  private int d;
  private Handler.Callback e = new Wc(this);
  private final int f;
  private final int g;
  private final String h;
  
  public _c(String paramString, int paramInt1, int paramInt2)
  {
    this.h = paramString;
    this.g = paramInt1;
    this.f = paramInt2;
    this.d = 0;
  }
  
  private void b(Runnable paramRunnable)
  {
    synchronized (this.a)
    {
      if (this.b == null)
      {
        Object localObject2 = new android/os/HandlerThread;
        ((HandlerThread)localObject2).<init>(this.h, this.g);
        this.b = ((HandlerThread)localObject2);
        this.b.start();
        localObject2 = new android/os/Handler;
        ((Handler)localObject2).<init>(this.b.getLooper(), this.e);
        this.c = ((Handler)localObject2);
        this.d += 1;
      }
      this.c.removeMessages(0);
      this.c.sendMessage(this.c.obtainMessage(1, paramRunnable));
      return;
    }
  }
  
  public <T> T a(Callable<T> paramCallable, int paramInt)
    throws InterruptedException
  {
    localReentrantLock = new ReentrantLock();
    Condition localCondition = localReentrantLock.newCondition();
    AtomicReference localAtomicReference = new AtomicReference();
    AtomicBoolean localAtomicBoolean = new AtomicBoolean(true);
    b(new Zc(this, localAtomicReference, paramCallable, localReentrantLock, localAtomicBoolean, localCondition));
    localReentrantLock.lock();
    label102:
    do
    {
      try
      {
        if (!localAtomicBoolean.get())
        {
          paramCallable = localAtomicReference.get();
          return paramCallable;
        }
        l1 = TimeUnit.MILLISECONDS.toNanos(paramInt);
      }
      finally
      {
        long l1;
        long l2;
        localReentrantLock.unlock();
      }
      try
      {
        l2 = localCondition.awaitNanos(l1);
        l1 = l2;
      }
      catch (InterruptedException paramCallable)
      {
        break label102;
      }
      if (!localAtomicBoolean.get())
      {
        paramCallable = localAtomicReference.get();
        localReentrantLock.unlock();
        return paramCallable;
      }
    } while (l1 > 0L);
    paramCallable = new java/lang/InterruptedException;
    paramCallable.<init>("timeout");
    throw paramCallable;
  }
  
  void a()
  {
    synchronized (this.a)
    {
      if (this.c.hasMessages(1)) {
        return;
      }
      this.b.quit();
      this.b = null;
      this.c = null;
      return;
    }
  }
  
  void a(Runnable paramRunnable)
  {
    paramRunnable.run();
    synchronized (this.a)
    {
      this.c.removeMessages(0);
      this.c.sendMessageDelayed(this.c.obtainMessage(0), this.f);
      return;
    }
  }
  
  public <T> void a(Callable<T> paramCallable, _c.a<T> parama)
  {
    b(new Yc(this, paramCallable, new Handler(), parama));
  }
  
  public static abstract interface a<T>
  {
    public abstract void a(T paramT);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */