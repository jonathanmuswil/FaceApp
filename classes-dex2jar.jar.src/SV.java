import android.annotation.SuppressLint;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class sv
{
  @SuppressLint({"StaticFieldLeak"})
  private static final sv a = new sv();
  private final ScheduledExecutorService b;
  public final ConcurrentLinkedQueue<Pv> c;
  private final Runtime d;
  private ScheduledFuture e = null;
  private long f = -1L;
  
  private sv()
  {
    this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
  }
  
  private sv(ScheduledExecutorService paramScheduledExecutorService, Runtime paramRuntime)
  {
    this.b = paramScheduledExecutorService;
    this.c = new ConcurrentLinkedQueue();
    this.d = paramRuntime;
  }
  
  /* Error */
  private final void b(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: lload_1
    //   4: putfield 50	sv:f	J
    //   7: aload_0
    //   8: getfield 52	sv:b	Ljava/util/concurrent/ScheduledExecutorService;
    //   11: astore_3
    //   12: new 64	tv
    //   15: astore 4
    //   17: aload 4
    //   19: aload_0
    //   20: invokespecial 67	tv:<init>	(Lsv;)V
    //   23: aload_0
    //   24: aload_3
    //   25: aload 4
    //   27: lconst_0
    //   28: lload_1
    //   29: getstatic 73	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   32: invokeinterface 79 7 0
    //   37: putfield 46	sv:e	Ljava/util/concurrent/ScheduledFuture;
    //   40: aload_0
    //   41: monitorexit
    //   42: return
    //   43: astore_3
    //   44: aload_3
    //   45: invokevirtual 83	java/util/concurrent/RejectedExecutionException:getMessage	()Ljava/lang/String;
    //   48: invokestatic 89	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   51: astore_3
    //   52: aload_3
    //   53: invokevirtual 93	java/lang/String:length	()I
    //   56: ifeq +13 -> 69
    //   59: ldc 95
    //   61: aload_3
    //   62: invokevirtual 99	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   65: astore_3
    //   66: goto +13 -> 79
    //   69: new 85	java/lang/String
    //   72: dup
    //   73: ldc 95
    //   75: invokespecial 102	java/lang/String:<init>	(Ljava/lang/String;)V
    //   78: astore_3
    //   79: ldc 104
    //   81: aload_3
    //   82: invokestatic 110	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   85: pop
    //   86: aload_0
    //   87: monitorexit
    //   88: return
    //   89: astore_3
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_3
    //   93: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	sv
    //   0	94	1	paramLong	long
    //   11	14	3	localScheduledExecutorService	ScheduledExecutorService
    //   43	2	3	localRejectedExecutionException	java.util.concurrent.RejectedExecutionException
    //   51	31	3	str	String
    //   89	4	3	localObject	Object
    //   15	11	4	localtv	tv
    // Exception table:
    //   from	to	target	type
    //   7	40	43	java/util/concurrent/RejectedExecutionException
    //   2	7	89	finally
    //   7	40	89	finally
    //   44	66	89	finally
    //   69	79	89	finally
    //   79	86	89	finally
  }
  
  public static sv e()
  {
    return a;
  }
  
  /* Error */
  private final void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 52	sv:b	Ljava/util/concurrent/ScheduledExecutorService;
    //   6: astore_1
    //   7: new 113	uv
    //   10: astore_2
    //   11: aload_2
    //   12: aload_0
    //   13: invokespecial 114	uv:<init>	(Lsv;)V
    //   16: aload_1
    //   17: aload_2
    //   18: lconst_0
    //   19: getstatic 73	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   22: invokeinterface 118 5 0
    //   27: pop
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: astore_1
    //   32: goto +49 -> 81
    //   35: astore_1
    //   36: aload_1
    //   37: invokevirtual 83	java/util/concurrent/RejectedExecutionException:getMessage	()Ljava/lang/String;
    //   40: invokestatic 89	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   43: astore_1
    //   44: aload_1
    //   45: invokevirtual 93	java/lang/String:length	()I
    //   48: ifeq +13 -> 61
    //   51: ldc 120
    //   53: aload_1
    //   54: invokevirtual 99	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   57: astore_1
    //   58: goto +13 -> 71
    //   61: new 85	java/lang/String
    //   64: dup
    //   65: ldc 120
    //   67: invokespecial 102	java/lang/String:<init>	(Ljava/lang/String;)V
    //   70: astore_1
    //   71: ldc 104
    //   73: aload_1
    //   74: invokestatic 110	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   77: pop
    //   78: aload_0
    //   79: monitorexit
    //   80: return
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_1
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	sv
    //   6	11	1	localScheduledExecutorService	ScheduledExecutorService
    //   31	1	1	localObject	Object
    //   35	2	1	localRejectedExecutionException	java.util.concurrent.RejectedExecutionException
    //   43	41	1	str	String
    //   10	8	2	localuv	uv
    // Exception table:
    //   from	to	target	type
    //   2	28	31	finally
    //   36	58	31	finally
    //   61	71	31	finally
    //   71	78	31	finally
    //   2	28	35	java/util/concurrent/RejectedExecutionException
  }
  
  private final Pv g()
  {
    long l = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    Pv.a locala = Pv.j();
    locala.a(l);
    locala.a(iv.a(Bv.e.a(this.d.totalMemory() - this.d.freeMemory())));
    return (Pv)locala.O();
  }
  
  public final void a(long paramLong)
  {
    if (paramLong <= 0L) {
      return;
    }
    if (this.e != null)
    {
      if (this.f != paramLong)
      {
        c();
        b(paramLong);
      }
      return;
    }
    b(paramLong);
  }
  
  public final void c()
  {
    ScheduledFuture localScheduledFuture = this.e;
    if (localScheduledFuture == null) {
      return;
    }
    localScheduledFuture.cancel(false);
    this.e = null;
    this.f = -1L;
  }
  
  public final void d()
  {
    f();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */