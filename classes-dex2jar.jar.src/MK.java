import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

class mk
{
  private final ScheduledExecutorService a;
  private final List<mk.a> b = new ArrayList();
  private volatile boolean c = true;
  final AtomicReference<ScheduledFuture<?>> d = new AtomicReference();
  boolean e = true;
  
  public mk(ScheduledExecutorService paramScheduledExecutorService)
  {
    this.a = paramScheduledExecutorService;
  }
  
  private void c()
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      ((mk.a)localIterator.next()).a();
    }
  }
  
  public void a()
  {
    if ((this.c) && (!this.e))
    {
      this.e = true;
      try
      {
        AtomicReference localAtomicReference = this.d;
        ScheduledExecutorService localScheduledExecutorService = this.a;
        lk locallk = new lk;
        locallk.<init>(this);
        localAtomicReference.compareAndSet(null, localScheduledExecutorService.schedule(locallk, 5000L, TimeUnit.MILLISECONDS));
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        Naa.e().c("Answers", "Failed to schedule background detector", localRejectedExecutionException);
      }
    }
  }
  
  public void a(mk.a parama)
  {
    this.b.add(parama);
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public void b()
  {
    this.e = false;
    ScheduledFuture localScheduledFuture = (ScheduledFuture)this.d.getAndSet(null);
    if (localScheduledFuture != null) {
      localScheduledFuture.cancel(false);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */