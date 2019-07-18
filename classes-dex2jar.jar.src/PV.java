import android.os.Build.VERSION;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class pv
{
  private static final long a = TimeUnit.SECONDS.toMicros(1L);
  private static pv b = null;
  private ScheduledFuture c = null;
  private final ScheduledExecutorService d;
  private long e;
  private final long f;
  private final String g;
  public final ConcurrentLinkedQueue<Wv> h;
  
  private pv()
  {
    long l = -1L;
    this.e = -1L;
    this.h = new ConcurrentLinkedQueue();
    this.d = Executors.newSingleThreadScheduledExecutor();
    String str = Integer.toString(Process.myPid());
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
    localStringBuilder.append("/proc/");
    localStringBuilder.append(str);
    localStringBuilder.append("/stat");
    this.g = localStringBuilder.toString();
    if (Build.VERSION.SDK_INT >= 21) {
      l = Os.sysconf(OsConstants._SC_CLK_TCK);
    }
    this.f = l;
  }
  
  public static pv a()
  {
    if (b == null) {
      b = new pv();
    }
    return b;
  }
  
  /* Error */
  private final void b(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: lload_1
    //   4: putfield 45	pv:e	J
    //   7: aload_0
    //   8: getfield 58	pv:d	Ljava/util/concurrent/ScheduledExecutorService;
    //   11: astore_3
    //   12: new 123	qv
    //   15: astore 4
    //   17: aload 4
    //   19: aload_0
    //   20: invokespecial 126	qv:<init>	(Lpv;)V
    //   23: aload_0
    //   24: aload_3
    //   25: aload 4
    //   27: lconst_0
    //   28: lload_1
    //   29: getstatic 129	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   32: invokeinterface 135 7 0
    //   37: putfield 41	pv:c	Ljava/util/concurrent/ScheduledFuture;
    //   40: aload_0
    //   41: monitorexit
    //   42: return
    //   43: astore 4
    //   45: aload 4
    //   47: invokevirtual 138	java/util/concurrent/RejectedExecutionException:getMessage	()Ljava/lang/String;
    //   50: invokestatic 78	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   53: astore 4
    //   55: aload 4
    //   57: invokevirtual 81	java/lang/String:length	()I
    //   60: ifeq +15 -> 75
    //   63: ldc -116
    //   65: aload 4
    //   67: invokevirtual 144	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   70: astore 4
    //   72: goto +14 -> 86
    //   75: new 74	java/lang/String
    //   78: dup
    //   79: ldc -116
    //   81: invokespecial 147	java/lang/String:<init>	(Ljava/lang/String;)V
    //   84: astore 4
    //   86: ldc -107
    //   88: aload 4
    //   90: invokestatic 155	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   93: pop
    //   94: aload_0
    //   95: monitorexit
    //   96: return
    //   97: astore 4
    //   99: aload_0
    //   100: monitorexit
    //   101: aload 4
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	pv
    //   0	104	1	paramLong	long
    //   11	14	3	localScheduledExecutorService	ScheduledExecutorService
    //   15	11	4	localqv	qv
    //   43	3	4	localRejectedExecutionException	java.util.concurrent.RejectedExecutionException
    //   53	36	4	str	String
    //   97	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   7	40	43	java/util/concurrent/RejectedExecutionException
    //   2	7	97	finally
    //   7	40	97	finally
    //   45	72	97	finally
    //   75	86	97	finally
    //   86	94	97	finally
  }
  
  private final long c(long paramLong)
  {
    return Math.round(paramLong / this.f * a);
  }
  
  /* Error */
  private final void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 58	pv:d	Ljava/util/concurrent/ScheduledExecutorService;
    //   6: astore_1
    //   7: new 163	rv
    //   10: astore_2
    //   11: aload_2
    //   12: aload_0
    //   13: invokespecial 164	rv:<init>	(Lpv;)V
    //   16: aload_1
    //   17: aload_2
    //   18: lconst_0
    //   19: getstatic 129	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   22: invokeinterface 168 5 0
    //   27: pop
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: astore_1
    //   32: goto +49 -> 81
    //   35: astore_1
    //   36: aload_1
    //   37: invokevirtual 138	java/util/concurrent/RejectedExecutionException:getMessage	()Ljava/lang/String;
    //   40: invokestatic 78	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   43: astore_1
    //   44: aload_1
    //   45: invokevirtual 81	java/lang/String:length	()I
    //   48: ifeq +13 -> 61
    //   51: ldc -86
    //   53: aload_1
    //   54: invokevirtual 144	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   57: astore_1
    //   58: goto +13 -> 71
    //   61: new 74	java/lang/String
    //   64: dup
    //   65: ldc -86
    //   67: invokespecial 147	java/lang/String:<init>	(Ljava/lang/String;)V
    //   70: astore_1
    //   71: ldc -107
    //   73: aload_1
    //   74: invokestatic 155	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
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
    //   0	85	0	this	pv
    //   6	11	1	localScheduledExecutorService	ScheduledExecutorService
    //   31	1	1	localObject	Object
    //   35	2	1	localRejectedExecutionException	java.util.concurrent.RejectedExecutionException
    //   43	41	1	str	String
    //   10	8	2	localrv	rv
    // Exception table:
    //   from	to	target	type
    //   2	28	31	finally
    //   36	58	31	finally
    //   61	71	31	finally
    //   71	78	31	finally
    //   2	28	35	java/util/concurrent/RejectedExecutionException
  }
  
  /* Error */
  private final Wv g()
  {
    // Byte code:
    //   0: new 183	java/io/BufferedReader
    //   3: astore_1
    //   4: new 185	java/io/FileReader
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: getfield 97	pv:g	Ljava/lang/String;
    //   13: invokespecial 186	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   16: aload_1
    //   17: aload_2
    //   18: invokespecial 189	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   21: getstatic 129	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   24: invokestatic 195	java/lang/System:currentTimeMillis	()J
    //   27: invokevirtual 31	java/util/concurrent/TimeUnit:toMicros	(J)J
    //   30: lstore_3
    //   31: aload_1
    //   32: invokevirtual 198	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   35: ldc -56
    //   37: invokevirtual 204	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   40: astore_2
    //   41: aload_2
    //   42: bipush 13
    //   44: aaload
    //   45: invokestatic 210	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   48: lstore 5
    //   50: aload_2
    //   51: bipush 15
    //   53: aaload
    //   54: invokestatic 210	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   57: lstore 7
    //   59: aload_2
    //   60: bipush 14
    //   62: aaload
    //   63: invokestatic 210	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   66: lstore 9
    //   68: aload_2
    //   69: bipush 16
    //   71: aaload
    //   72: invokestatic 210	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   75: lstore 11
    //   77: invokestatic 216	Wv:j	()LWv$a;
    //   80: astore_2
    //   81: aload_2
    //   82: lload_3
    //   83: invokevirtual 221	Wv$a:a	(J)LWv$a;
    //   86: pop
    //   87: aload_2
    //   88: aload_0
    //   89: lload 9
    //   91: lload 11
    //   93: ladd
    //   94: invokespecial 223	pv:c	(J)J
    //   97: invokevirtual 225	Wv$a:c	(J)LWv$a;
    //   100: pop
    //   101: aload_2
    //   102: aload_0
    //   103: lload 5
    //   105: lload 7
    //   107: ladd
    //   108: invokespecial 223	pv:c	(J)J
    //   111: invokevirtual 227	Wv$a:b	(J)LWv$a;
    //   114: pop
    //   115: aload_2
    //   116: invokevirtual 233	sx$a:O	()Lby;
    //   119: checkcast 235	sx
    //   122: checkcast 212	Wv
    //   125: astore_2
    //   126: aload_1
    //   127: invokevirtual 238	java/io/BufferedReader:close	()V
    //   130: aload_2
    //   131: areturn
    //   132: astore_2
    //   133: aconst_null
    //   134: astore 13
    //   136: goto +9 -> 145
    //   139: astore 13
    //   141: aload 13
    //   143: athrow
    //   144: astore_2
    //   145: aload 13
    //   147: ifnull +20 -> 167
    //   150: aload_1
    //   151: invokevirtual 238	java/io/BufferedReader:close	()V
    //   154: goto +17 -> 171
    //   157: astore_1
    //   158: aload 13
    //   160: aload_1
    //   161: invokestatic 243	jv:a	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   164: goto +7 -> 171
    //   167: aload_1
    //   168: invokevirtual 238	java/io/BufferedReader:close	()V
    //   171: aload_2
    //   172: athrow
    //   173: astore_2
    //   174: goto +8 -> 182
    //   177: astore_2
    //   178: goto +4 -> 182
    //   181: astore_2
    //   182: aload_2
    //   183: invokevirtual 246	java/lang/RuntimeException:getMessage	()Ljava/lang/String;
    //   186: invokestatic 78	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   189: astore_2
    //   190: aload_2
    //   191: invokevirtual 81	java/lang/String:length	()I
    //   194: ifeq +13 -> 207
    //   197: ldc -8
    //   199: aload_2
    //   200: invokevirtual 144	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   203: astore_2
    //   204: goto +13 -> 217
    //   207: new 74	java/lang/String
    //   210: dup
    //   211: ldc -8
    //   213: invokespecial 147	java/lang/String:<init>	(Ljava/lang/String;)V
    //   216: astore_2
    //   217: ldc -107
    //   219: aload_2
    //   220: invokestatic 155	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   223: pop
    //   224: goto +46 -> 270
    //   227: astore_2
    //   228: aload_2
    //   229: invokevirtual 249	java/io/IOException:getMessage	()Ljava/lang/String;
    //   232: invokestatic 78	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   235: astore_2
    //   236: aload_2
    //   237: invokevirtual 81	java/lang/String:length	()I
    //   240: ifeq +13 -> 253
    //   243: ldc -5
    //   245: aload_2
    //   246: invokevirtual 144	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   249: astore_2
    //   250: goto +13 -> 263
    //   253: new 74	java/lang/String
    //   256: dup
    //   257: ldc -5
    //   259: invokespecial 147	java/lang/String:<init>	(Ljava/lang/String;)V
    //   262: astore_2
    //   263: ldc -107
    //   265: aload_2
    //   266: invokestatic 155	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   269: pop
    //   270: aconst_null
    //   271: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	272	0	this	pv
    //   3	148	1	localBufferedReader	java.io.BufferedReader
    //   157	11	1	localThrowable1	Throwable
    //   7	124	2	localObject1	Object
    //   132	1	2	localObject2	Object
    //   144	28	2	localObject3	Object
    //   173	1	2	localNullPointerException	NullPointerException
    //   177	1	2	localNumberFormatException	NumberFormatException
    //   181	2	2	localArrayIndexOutOfBoundsException	ArrayIndexOutOfBoundsException
    //   189	31	2	str1	String
    //   227	2	2	localIOException	java.io.IOException
    //   235	31	2	str2	String
    //   30	53	3	l1	long
    //   48	56	5	l2	long
    //   57	49	7	l3	long
    //   66	24	9	l4	long
    //   75	17	11	l5	long
    //   134	1	13	localObject4	Object
    //   139	20	13	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   21	126	132	finally
    //   21	126	139	java/lang/Throwable
    //   141	144	144	finally
    //   150	154	157	java/lang/Throwable
    //   0	21	173	java/lang/NullPointerException
    //   126	130	173	java/lang/NullPointerException
    //   158	164	173	java/lang/NullPointerException
    //   167	171	173	java/lang/NullPointerException
    //   171	173	173	java/lang/NullPointerException
    //   0	21	177	java/lang/NumberFormatException
    //   126	130	177	java/lang/NumberFormatException
    //   158	164	177	java/lang/NumberFormatException
    //   167	171	177	java/lang/NumberFormatException
    //   171	173	177	java/lang/NumberFormatException
    //   0	21	181	java/lang/ArrayIndexOutOfBoundsException
    //   126	130	181	java/lang/ArrayIndexOutOfBoundsException
    //   158	164	181	java/lang/ArrayIndexOutOfBoundsException
    //   167	171	181	java/lang/ArrayIndexOutOfBoundsException
    //   171	173	181	java/lang/ArrayIndexOutOfBoundsException
    //   0	21	227	java/io/IOException
    //   126	130	227	java/io/IOException
    //   158	164	227	java/io/IOException
    //   167	171	227	java/io/IOException
    //   171	173	227	java/io/IOException
  }
  
  public final void a(long paramLong)
  {
    long l = this.f;
    if ((l != -1L) && (l != 0L))
    {
      if (paramLong <= 0L) {
        return;
      }
      if (this.c != null)
      {
        if (this.e != paramLong)
        {
          b();
          b(paramLong);
        }
        return;
      }
      b(paramLong);
    }
  }
  
  public final void b()
  {
    ScheduledFuture localScheduledFuture = this.c;
    if (localScheduledFuture == null) {
      return;
    }
    localScheduledFuture.cancel(false);
    this.c = null;
    this.e = -1L;
  }
  
  public final void c()
  {
    f();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */