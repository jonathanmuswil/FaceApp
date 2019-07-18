import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class fab
  extends Gab
{
  private static final long e = TimeUnit.SECONDS.toMillis(60L);
  private static final long f = TimeUnit.MILLISECONDS.toNanos(e);
  static fab g;
  private boolean h;
  private fab i;
  private long j;
  
  private static void a(fab paramfab, long paramLong, boolean paramBoolean)
  {
    try
    {
      if (g == null)
      {
        localObject = new fab;
        ((fab)localObject).<init>();
        g = (fab)localObject;
        localObject = new fab$a;
        ((fab.a)localObject).<init>();
        ((Thread)localObject).start();
      }
      long l = System.nanoTime();
      boolean bool = paramLong < 0L;
      if ((bool) && (paramBoolean))
      {
        paramfab.j = (Math.min(paramLong, paramfab.c() - l) + l);
      }
      else if (bool)
      {
        paramfab.j = (paramLong + l);
      }
      else
      {
        if (!paramBoolean) {
          break label187;
        }
        paramfab.j = paramfab.c();
      }
      paramLong = paramfab.b(l);
      for (Object localObject = g; (((fab)localObject).i != null) && (paramLong >= ((fab)localObject).i.b(l)); localObject = ((fab)localObject).i) {}
      paramfab.i = ((fab)localObject).i;
      ((fab)localObject).i = paramfab;
      if (localObject == g) {
        fab.class.notify();
      }
      return;
      label187:
      paramfab = new java/lang/AssertionError;
      paramfab.<init>();
      throw paramfab;
    }
    finally {}
  }
  
  private static boolean a(fab paramfab)
  {
    try
    {
      for (fab localfab = g; localfab != null; localfab = localfab.i) {
        if (localfab.i == paramfab)
        {
          localfab.i = paramfab.i;
          paramfab.i = null;
          return false;
        }
      }
      return true;
    }
    finally {}
  }
  
  private long b(long paramLong)
  {
    return this.j - paramLong;
  }
  
  static fab g()
    throws InterruptedException
  {
    Object localObject1 = g.i;
    Object localObject2 = null;
    long l1;
    if (localObject1 == null)
    {
      l1 = System.nanoTime();
      fab.class.wait(e);
      localObject1 = localObject2;
      if (g.i == null)
      {
        localObject1 = localObject2;
        if (System.nanoTime() - l1 >= f) {
          localObject1 = g;
        }
      }
      return (fab)localObject1;
    }
    long l2 = ((fab)localObject1).b(System.nanoTime());
    if (l2 > 0L)
    {
      l1 = l2 / 1000000L;
      fab.class.wait(l1, (int)(l2 - 1000000L * l1));
      return null;
    }
    g.i = ((fab)localObject1).i;
    ((fab)localObject1).i = null;
    return (fab)localObject1;
  }
  
  public final Dab a(Dab paramDab)
  {
    return new dab(this, paramDab);
  }
  
  public final Eab a(Eab paramEab)
  {
    return new eab(this, paramEab);
  }
  
  final IOException a(IOException paramIOException)
    throws IOException
  {
    if (!i()) {
      return paramIOException;
    }
    return b(paramIOException);
  }
  
  final void a(boolean paramBoolean)
    throws IOException
  {
    if ((i()) && (paramBoolean)) {
      throw b(null);
    }
  }
  
  protected IOException b(IOException paramIOException)
  {
    InterruptedIOException localInterruptedIOException = new InterruptedIOException("timeout");
    if (paramIOException != null) {
      localInterruptedIOException.initCause(paramIOException);
    }
    return localInterruptedIOException;
  }
  
  public final void h()
  {
    if (!this.h)
    {
      long l = f();
      boolean bool = d();
      if ((l == 0L) && (!bool)) {
        return;
      }
      this.h = true;
      a(this, l, bool);
      return;
    }
    throw new IllegalStateException("Unbalanced enter/exit");
  }
  
  public final boolean i()
  {
    if (!this.h) {
      return false;
    }
    this.h = false;
    return a(this);
  }
  
  protected void j() {}
  
  private static final class a
    extends Thread
  {
    a()
    {
      super();
      setDaemon(true);
    }
    
    public void run()
    {
      try
      {
        for (;;)
        {
          try
          {
            fab localfab = fab.g();
            if (localfab == null) {}
            if (localfab == fab.g)
            {
              fab.g = null;
              return;
            }
            localfab.j();
          }
          finally {}
        }
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */