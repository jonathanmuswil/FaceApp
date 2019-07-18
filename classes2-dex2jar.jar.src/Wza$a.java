import java.util.concurrent.atomic.AtomicInteger;

final class wZa$a
  extends KZa
{
  private final ZYa b;
  private volatile AtomicInteger c = new AtomicInteger(0);
  
  wZa$a(wZa paramwZa, ZYa paramZYa)
  {
    super("OkHttp %s", new Object[] { paramwZa.b() });
    this.b = paramZYa;
  }
  
  /* Error */
  void a(java.util.concurrent.ExecutorService paramExecutorService)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: invokeinterface 46 2 0
    //   7: goto +64 -> 71
    //   10: astore_1
    //   11: goto +61 -> 72
    //   14: astore_2
    //   15: new 48	java/io/InterruptedIOException
    //   18: astore_1
    //   19: aload_1
    //   20: ldc 50
    //   22: invokespecial 53	java/io/InterruptedIOException:<init>	(Ljava/lang/String;)V
    //   25: aload_1
    //   26: aload_2
    //   27: invokevirtual 57	java/io/InterruptedIOException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   30: pop
    //   31: aload_0
    //   32: getfield 17	wZa$a:d	LwZa;
    //   35: invokestatic 60	wZa:a	(LwZa;)Lc_a;
    //   38: aload_1
    //   39: invokevirtual 65	c_a:a	(Ljava/io/IOException;)Ljava/io/IOException;
    //   42: pop
    //   43: aload_0
    //   44: getfield 36	wZa$a:b	LZYa;
    //   47: aload_0
    //   48: getfield 17	wZa$a:d	LwZa;
    //   51: aload_1
    //   52: invokeinterface 70 3 0
    //   57: aload_0
    //   58: getfield 17	wZa$a:d	LwZa;
    //   61: getfield 73	wZa:a	LuZa;
    //   64: invokevirtual 79	uZa:h	()LhZa;
    //   67: aload_0
    //   68: invokevirtual 84	hZa:b	(LwZa$a;)V
    //   71: return
    //   72: aload_0
    //   73: getfield 17	wZa$a:d	LwZa;
    //   76: getfield 73	wZa:a	LuZa;
    //   79: invokevirtual 79	uZa:h	()LhZa;
    //   82: aload_0
    //   83: invokevirtual 84	hZa:b	(LwZa$a;)V
    //   86: aload_1
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	a
    //   0	88	1	paramExecutorService	java.util.concurrent.ExecutorService
    //   14	13	2	localRejectedExecutionException	java.util.concurrent.RejectedExecutionException
    // Exception table:
    //   from	to	target	type
    //   0	7	10	finally
    //   15	57	10	finally
    //   0	7	14	java/util/concurrent/RejectedExecutionException
  }
  
  void a(a parama)
  {
    this.c = parama.c;
  }
  
  /* Error */
  protected void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 17	wZa$a:d	LwZa;
    //   4: invokestatic 60	wZa:a	(LwZa;)Lc_a;
    //   7: invokevirtual 90	c_a:i	()V
    //   10: aload_0
    //   11: getfield 17	wZa$a:d	LwZa;
    //   14: invokevirtual 93	wZa:a	()LBZa;
    //   17: astore_1
    //   18: iconst_1
    //   19: istore_2
    //   20: aload_0
    //   21: getfield 36	wZa$a:b	LZYa;
    //   24: aload_0
    //   25: getfield 17	wZa$a:d	LwZa;
    //   28: aload_1
    //   29: invokeinterface 96 3 0
    //   34: aload_0
    //   35: getfield 17	wZa$a:d	LwZa;
    //   38: getfield 73	wZa:a	LuZa;
    //   41: invokevirtual 79	uZa:h	()LhZa;
    //   44: aload_0
    //   45: invokevirtual 84	hZa:b	(LwZa$a;)V
    //   48: goto +84 -> 132
    //   51: astore_1
    //   52: goto +10 -> 62
    //   55: astore_1
    //   56: goto +77 -> 133
    //   59: astore_1
    //   60: iconst_0
    //   61: istore_2
    //   62: iload_2
    //   63: ifeq +52 -> 115
    //   66: invokestatic 101	U_a:a	()LU_a;
    //   69: astore_3
    //   70: new 103	java/lang/StringBuilder
    //   73: astore 4
    //   75: aload 4
    //   77: invokespecial 105	java/lang/StringBuilder:<init>	()V
    //   80: aload 4
    //   82: ldc 107
    //   84: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload 4
    //   90: aload_0
    //   91: getfield 17	wZa$a:d	LwZa;
    //   94: invokevirtual 113	wZa:c	()Ljava/lang/String;
    //   97: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload_3
    //   102: iconst_4
    //   103: aload 4
    //   105: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: aload_1
    //   109: invokevirtual 119	U_a:a	(ILjava/lang/String;Ljava/lang/Throwable;)V
    //   112: goto -78 -> 34
    //   115: aload_0
    //   116: getfield 36	wZa$a:b	LZYa;
    //   119: aload_0
    //   120: getfield 17	wZa$a:d	LwZa;
    //   123: aload_1
    //   124: invokeinterface 70 3 0
    //   129: goto -95 -> 34
    //   132: return
    //   133: aload_0
    //   134: getfield 17	wZa$a:d	LwZa;
    //   137: getfield 73	wZa:a	LuZa;
    //   140: invokevirtual 79	uZa:h	()LhZa;
    //   143: aload_0
    //   144: invokevirtual 84	hZa:b	(LwZa$a;)V
    //   147: aload_1
    //   148: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	a
    //   17	12	1	localBZa	BZa
    //   51	1	1	localIOException1	java.io.IOException
    //   55	1	1	localObject	Object
    //   59	89	1	localIOException2	java.io.IOException
    //   19	44	2	i	int
    //   69	33	3	localU_a	U_a
    //   73	31	4	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   20	34	51	java/io/IOException
    //   10	18	55	finally
    //   20	34	55	finally
    //   66	112	55	finally
    //   115	129	55	finally
    //   10	18	59	java/io/IOException
  }
  
  AtomicInteger c()
  {
    return this.c;
  }
  
  wZa d()
  {
    return this.d;
  }
  
  String e()
  {
    return this.d.c.g().g();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wZa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */