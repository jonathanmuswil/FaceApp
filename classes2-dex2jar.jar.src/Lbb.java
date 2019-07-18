import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;

final class lbb<T>
  implements Rab<T>
{
  private final sbb a;
  private final Object[] b;
  private final YYa.a c;
  private final Zab<DZa, T> d;
  private volatile boolean e;
  private YYa f;
  private Throwable g;
  private boolean h;
  
  lbb(sbb paramsbb, Object[] paramArrayOfObject, YYa.a parama, Zab<DZa, T> paramZab)
  {
    this.a = paramsbb;
    this.b = paramArrayOfObject;
    this.c = parama;
    this.d = paramZab;
  }
  
  private YYa a()
    throws IOException
  {
    YYa localYYa = this.c.a(this.a.a(this.b));
    if (localYYa != null) {
      return localYYa;
    }
    throw new NullPointerException("Call.Factory returned null.");
  }
  
  public boolean D()
  {
    boolean bool1 = this.e;
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    try
    {
      if ((this.f == null) || (!this.f.D())) {
        bool2 = false;
      }
      return bool2;
    }
    finally {}
  }
  
  tbb<T> a(BZa paramBZa)
    throws IOException
  {
    Object localObject = paramBZa.a();
    paramBZa = paramBZa.h();
    paramBZa.a(new lbb.b(((DZa)localObject).d(), ((DZa)localObject).c()));
    BZa localBZa = paramBZa.a();
    int i = localBZa.c();
    if ((i >= 200) && (i < 300))
    {
      if ((i != 204) && (i != 205))
      {
        paramBZa = new lbb.a((DZa)localObject);
        try
        {
          localObject = tbb.a(this.d.a(paramBZa), localBZa);
          return (tbb<T>)localObject;
        }
        catch (RuntimeException localRuntimeException)
        {
          paramBZa.f();
          throw localRuntimeException;
        }
      }
      localRuntimeException.close();
      return tbb.a(null, localBZa);
    }
    try
    {
      paramBZa = tbb.a(xbb.a(localRuntimeException), localBZa);
      return paramBZa;
    }
    finally
    {
      localRuntimeException.close();
    }
  }
  
  public void a(Tab<T> paramTab)
  {
    xbb.a(paramTab, "callback == null");
    try
    {
      if (!this.h)
      {
        this.h = true;
        YYa localYYa1 = this.f;
        Throwable localThrowable1 = this.g;
        YYa localYYa2 = localYYa1;
        Throwable localThrowable2 = localThrowable1;
        if (localYYa1 == null)
        {
          localYYa2 = localYYa1;
          localThrowable2 = localThrowable1;
          if (localThrowable1 == null) {
            try
            {
              localYYa2 = a();
              this.f = localYYa2;
              localThrowable2 = localThrowable1;
            }
            catch (Throwable localThrowable3)
            {
              xbb.a(localThrowable3);
              this.g = localThrowable3;
              localYYa2 = localYYa1;
            }
          }
        }
        if (localThrowable3 != null)
        {
          paramTab.a(this, localThrowable3);
          return;
        }
        if (this.e) {
          localYYa2.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(localYYa2, new jbb(this, paramTab));
        return;
      }
      paramTab = new java/lang/IllegalStateException;
      paramTab.<init>("Already executed.");
      throw paramTab;
    }
    finally {}
  }
  
  public void cancel()
  {
    this.e = true;
    try
    {
      YYa localYYa = this.f;
      if (localYYa != null) {
        localYYa.cancel();
      }
      return;
    }
    finally {}
  }
  
  public lbb<T> clone()
  {
    return new lbb(this.a, this.b, this.c, this.d);
  }
  
  /* Error */
  public tbb<T> execute()
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 148	lbb:h	Z
    //   6: ifne +127 -> 133
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield 148	lbb:h	Z
    //   14: aload_0
    //   15: getfield 150	lbb:g	Ljava/lang/Throwable;
    //   18: ifnull +47 -> 65
    //   21: aload_0
    //   22: getfield 150	lbb:g	Ljava/lang/Throwable;
    //   25: instanceof 50
    //   28: ifne +29 -> 57
    //   31: aload_0
    //   32: getfield 150	lbb:g	Ljava/lang/Throwable;
    //   35: instanceof 81
    //   38: ifeq +11 -> 49
    //   41: aload_0
    //   42: getfield 150	lbb:g	Ljava/lang/Throwable;
    //   45: checkcast 81	java/lang/RuntimeException
    //   48: athrow
    //   49: aload_0
    //   50: getfield 150	lbb:g	Ljava/lang/Throwable;
    //   53: checkcast 193	java/lang/Error
    //   56: athrow
    //   57: aload_0
    //   58: getfield 150	lbb:g	Ljava/lang/Throwable;
    //   61: checkcast 50	java/io/IOException
    //   64: athrow
    //   65: aload_0
    //   66: getfield 74	lbb:f	LYYa;
    //   69: astore_1
    //   70: aload_1
    //   71: astore_2
    //   72: aload_1
    //   73: ifnonnull +36 -> 109
    //   76: aload_0
    //   77: invokespecial 152	lbb:a	()LYYa;
    //   80: astore_2
    //   81: aload_0
    //   82: aload_2
    //   83: putfield 74	lbb:f	LYYa;
    //   86: goto +23 -> 109
    //   89: astore_2
    //   90: goto +8 -> 98
    //   93: astore_2
    //   94: goto +4 -> 98
    //   97: astore_2
    //   98: aload_2
    //   99: invokestatic 155	xbb:a	(Ljava/lang/Throwable;)V
    //   102: aload_0
    //   103: aload_2
    //   104: putfield 150	lbb:g	Ljava/lang/Throwable;
    //   107: aload_2
    //   108: athrow
    //   109: aload_0
    //   110: monitorexit
    //   111: aload_0
    //   112: getfield 72	lbb:e	Z
    //   115: ifeq +9 -> 124
    //   118: aload_2
    //   119: invokeinterface 163 1 0
    //   124: aload_0
    //   125: aload_2
    //   126: invokestatic 196	com/google/firebase/perf/network/FirebasePerfOkHttpClient:execute	(LYYa;)LBZa;
    //   129: invokevirtual 198	lbb:a	(LBZa;)Ltbb;
    //   132: areturn
    //   133: new 174	java/lang/IllegalStateException
    //   136: astore_2
    //   137: aload_2
    //   138: ldc -80
    //   140: invokespecial 177	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   143: aload_2
    //   144: athrow
    //   145: astore_2
    //   146: aload_0
    //   147: monitorexit
    //   148: aload_2
    //   149: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	this	lbb
    //   69	4	1	localYYa1	YYa
    //   71	12	2	localYYa2	YYa
    //   89	1	2	localError	Error
    //   93	1	2	localRuntimeException	RuntimeException
    //   97	29	2	localIOException	IOException
    //   136	8	2	localIllegalStateException	IllegalStateException
    //   145	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   76	86	89	java/lang/Error
    //   76	86	93	java/lang/RuntimeException
    //   76	86	97	java/io/IOException
    //   2	49	145	finally
    //   49	57	145	finally
    //   57	65	145	finally
    //   65	70	145	finally
    //   76	86	145	finally
    //   98	109	145	finally
    //   109	111	145	finally
    //   133	145	145	finally
    //   146	148	145	finally
  }
  
  static final class a
    extends DZa
  {
    private final DZa b;
    IOException c;
    
    a(DZa paramDZa)
    {
      this.b = paramDZa;
    }
    
    public long c()
    {
      return this.b.c();
    }
    
    public void close()
    {
      this.b.close();
    }
    
    public rZa d()
    {
      return this.b.d();
    }
    
    public lab e()
    {
      return vab.a(new kbb(this, this.b.e()));
    }
    
    void f()
      throws IOException
    {
      IOException localIOException = this.c;
      if (localIOException == null) {
        return;
      }
      throw localIOException;
    }
  }
  
  static final class b
    extends DZa
  {
    private final rZa b;
    private final long c;
    
    b(rZa paramrZa, long paramLong)
    {
      this.b = paramrZa;
      this.c = paramLong;
    }
    
    public long c()
    {
      return this.c;
    }
    
    public rZa d()
    {
      return this.b;
    }
    
    public lab e()
    {
      throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */