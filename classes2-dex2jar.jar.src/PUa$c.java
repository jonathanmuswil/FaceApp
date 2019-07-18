import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class PUa$c
  extends WQa.c
  implements Runnable
{
  final boolean a;
  final Executor b;
  final JUa<Runnable> c;
  volatile boolean d;
  final AtomicInteger e = new AtomicInteger();
  final jRa f = new jRa();
  
  public PUa$c(Executor paramExecutor, boolean paramBoolean)
  {
    this.b = paramExecutor;
    this.c = new JUa();
    this.a = paramBoolean;
  }
  
  public kRa a(Runnable paramRunnable)
  {
    if (this.d) {
      return JRa.a;
    }
    paramRunnable = zVa.a(paramRunnable);
    if (this.a)
    {
      paramRunnable = new PUa.c.b(paramRunnable, this.f);
      this.f.b(paramRunnable);
    }
    else
    {
      paramRunnable = new PUa.c.a(paramRunnable);
    }
    this.c.offer(paramRunnable);
    if (this.e.getAndIncrement() == 0) {
      try
      {
        this.b.execute(this);
      }
      catch (RejectedExecutionException paramRunnable)
      {
        this.d = true;
        this.c.clear();
        zVa.b(paramRunnable);
        return JRa.a;
      }
    }
    return paramRunnable;
  }
  
  public kRa a(Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong <= 0L) {
      return a(paramRunnable);
    }
    if (this.d) {
      return JRa.a;
    }
    MRa localMRa1 = new MRa();
    MRa localMRa2 = new MRa(localMRa1);
    paramRunnable = new YUa(new PUa.c.c(localMRa2, zVa.a(paramRunnable)), this.f);
    this.f.b(paramRunnable);
    Executor localExecutor = this.b;
    if ((localExecutor instanceof ScheduledExecutorService)) {
      try
      {
        paramRunnable.a(((ScheduledExecutorService)localExecutor).schedule(paramRunnable, paramLong, paramTimeUnit));
      }
      catch (RejectedExecutionException paramRunnable)
      {
        this.d = true;
        zVa.b(paramRunnable);
        return JRa.a;
      }
    } else {
      paramRunnable.a(new OUa(PUa.b.a(paramRunnable, paramLong, paramTimeUnit)));
    }
    localMRa1.a(paramRunnable);
    return localMRa2;
  }
  
  public boolean h()
  {
    return this.d;
  }
  
  public void i()
  {
    if (!this.d)
    {
      this.d = true;
      this.f.i();
      if (this.e.getAndIncrement() == 0) {
        this.c.clear();
      }
    }
  }
  
  public void run()
  {
    JUa localJUa = this.c;
    int i = 1;
    if (this.d)
    {
      localJUa.clear();
      return;
    }
    do
    {
      Runnable localRunnable = (Runnable)localJUa.poll();
      if (localRunnable == null)
      {
        if (this.d)
        {
          localJUa.clear();
          return;
        }
        int j = this.e.addAndGet(-i);
        i = j;
        if (j != 0) {
          break;
        }
        return;
      }
      localRunnable.run();
    } while (!this.d);
    localJUa.clear();
  }
  
  static final class a
    extends AtomicBoolean
    implements Runnable, kRa
  {
    final Runnable a;
    
    a(Runnable paramRunnable)
    {
      this.a = paramRunnable;
    }
    
    public boolean h()
    {
      return get();
    }
    
    public void i()
    {
      lazySet(true);
    }
    
    public void run()
    {
      if (get()) {
        return;
      }
      try
      {
        this.a.run();
        return;
      }
      finally
      {
        lazySet(true);
      }
    }
  }
  
  static final class b
    extends AtomicInteger
    implements Runnable, kRa
  {
    final Runnable a;
    final HRa b;
    volatile Thread c;
    
    b(Runnable paramRunnable, HRa paramHRa)
    {
      this.a = paramRunnable;
      this.b = paramHRa;
    }
    
    void a()
    {
      HRa localHRa = this.b;
      if (localHRa != null) {
        localHRa.c(this);
      }
    }
    
    public boolean h()
    {
      boolean bool;
      if (get() >= 2) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void i()
    {
      do
      {
        do
        {
          int i = get();
          if (i >= 2) {
            return;
          }
          if (i != 0) {
            break;
          }
        } while (!compareAndSet(0, 4));
        a();
        break;
      } while (!compareAndSet(1, 3));
      Thread localThread = this.c;
      if (localThread != null)
      {
        localThread.interrupt();
        this.c = null;
      }
      set(4);
      a();
    }
    
    /* Error */
    public void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 39	java/util/concurrent/atomic/AtomicInteger:get	()I
      //   4: ifne +117 -> 121
      //   7: aload_0
      //   8: invokestatic 62	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   11: putfield 48	PUa$c$b:c	Ljava/lang/Thread;
      //   14: aload_0
      //   15: iconst_0
      //   16: iconst_1
      //   17: invokevirtual 44	java/util/concurrent/atomic/AtomicInteger:compareAndSet	(II)Z
      //   20: ifeq +96 -> 116
      //   23: aload_0
      //   24: getfield 25	PUa$c$b:a	Ljava/lang/Runnable;
      //   27: invokeinterface 64 1 0
      //   32: aload_0
      //   33: aconst_null
      //   34: putfield 48	PUa$c$b:c	Ljava/lang/Thread;
      //   37: aload_0
      //   38: iconst_1
      //   39: iconst_2
      //   40: invokevirtual 44	java/util/concurrent/atomic/AtomicInteger:compareAndSet	(II)Z
      //   43: ifeq +10 -> 53
      //   46: aload_0
      //   47: invokevirtual 46	PUa$c$b:a	()V
      //   50: goto +71 -> 121
      //   53: aload_0
      //   54: invokevirtual 39	java/util/concurrent/atomic/AtomicInteger:get	()I
      //   57: iconst_3
      //   58: if_icmpne +9 -> 67
      //   61: invokestatic 67	java/lang/Thread:yield	()V
      //   64: goto -11 -> 53
      //   67: invokestatic 70	java/lang/Thread:interrupted	()Z
      //   70: pop
      //   71: goto +50 -> 121
      //   74: astore_1
      //   75: aload_0
      //   76: aconst_null
      //   77: putfield 48	PUa$c$b:c	Ljava/lang/Thread;
      //   80: aload_0
      //   81: iconst_1
      //   82: iconst_2
      //   83: invokevirtual 44	java/util/concurrent/atomic/AtomicInteger:compareAndSet	(II)Z
      //   86: ifne +24 -> 110
      //   89: aload_0
      //   90: invokevirtual 39	java/util/concurrent/atomic/AtomicInteger:get	()I
      //   93: iconst_3
      //   94: if_icmpne +9 -> 103
      //   97: invokestatic 67	java/lang/Thread:yield	()V
      //   100: goto -11 -> 89
      //   103: invokestatic 70	java/lang/Thread:interrupted	()Z
      //   106: pop
      //   107: goto +7 -> 114
      //   110: aload_0
      //   111: invokevirtual 46	PUa$c$b:a	()V
      //   114: aload_1
      //   115: athrow
      //   116: aload_0
      //   117: aconst_null
      //   118: putfield 48	PUa$c$b:c	Ljava/lang/Thread;
      //   121: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	122	0	this	b
      //   74	41	1	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   23	32	74	finally
    }
  }
  
  final class c
    implements Runnable
  {
    private final MRa a;
    private final Runnable b;
    
    c(MRa paramMRa, Runnable paramRunnable)
    {
      this.a = paramMRa;
      this.b = paramRunnable;
    }
    
    public void run()
    {
      this.a.a(PUa.c.this.a(this.b));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/PUa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */