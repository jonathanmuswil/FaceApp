import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

class C_a$d
  extends KZa
  implements I_a.b
{
  final I_a b;
  
  C_a$d(C_a paramC_a, I_a paramI_a)
  {
    super("OkHttp %s", new Object[] { paramC_a.e });
    this.b = paramI_a;
  }
  
  private void a(O_a paramO_a)
  {
    try
    {
      ScheduledExecutorService localScheduledExecutorService = C_a.a(this.c);
      G_a localG_a = new G_a;
      localG_a.<init>(this, "OkHttp %s ACK Settings", new Object[] { this.c.e }, paramO_a);
      localScheduledExecutorService.execute(localG_a);
      return;
    }
    catch (RejectedExecutionException paramO_a)
    {
      for (;;) {}
    }
  }
  
  public void a() {}
  
  public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {}
  
  public void a(int paramInt1, int paramInt2, List<t_a> paramList)
  {
    this.c.a(paramInt2, paramList);
  }
  
  public void a(int paramInt, long paramLong)
  {
    if (paramInt == 0) {
      synchronized (this.c)
      {
        C_a localC_a = this.c;
        localC_a.n += paramLong;
        this.c.notifyAll();
      }
    }
    ??? = this.c.a(paramInt);
    if (??? != null) {
      try
      {
        ((J_a)???).a(paramLong);
      }
      finally {}
    }
  }
  
  public void a(int paramInt, s_a params_a)
  {
    if (this.c.b(paramInt))
    {
      this.c.a(paramInt, params_a);
      return;
    }
    J_a localJ_a = this.c.c(paramInt);
    if (localJ_a != null) {
      localJ_a.b(params_a);
    }
  }
  
  public void a(int paramInt, s_a params_a, mab arg3)
  {
    ???.e();
    synchronized (this.c)
    {
      params_a = (J_a[])this.c.d.values().toArray(new J_a[this.c.d.size()]);
      this.c.h = true;
      int i = params_a.length;
      for (int j = 0; j < i; j++)
      {
        ??? = params_a[j];
        if ((???.c() > paramInt) && (???.f()))
        {
          ???.b(s_a.e);
          this.c.c(???.c());
        }
      }
      return;
    }
  }
  
  public void a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramBoolean) {
      synchronized (this.c)
      {
        C_a.a(this.c, false);
        this.c.notifyAll();
      }
    }
    try
    {
      ??? = C_a.a(this.c);
      C_a.c localc = new C_a$c;
      localc.<init>(this.c, true, paramInt1, paramInt2);
      ((ScheduledExecutorService)???).execute(localc);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      for (;;) {}
    }
  }
  
  public void a(boolean paramBoolean, int paramInt1, int paramInt2, List<t_a> paramList)
  {
    if (this.c.b(paramInt1))
    {
      this.c.a(paramInt1, paramList, paramBoolean);
      return;
    }
    synchronized (this.c)
    {
      Object localObject = this.c.a(paramInt1);
      if (localObject == null)
      {
        if (this.c.h) {
          return;
        }
        if (paramInt1 <= this.c.f) {
          return;
        }
        if (paramInt1 % 2 == this.c.g % 2) {
          return;
        }
        localObject = LZa.b(paramList);
        paramList = new J_a;
        paramList.<init>(paramInt1, this.c, false, paramBoolean, (oZa)localObject);
        this.c.f = paramInt1;
        this.c.d.put(Integer.valueOf(paramInt1), paramList);
        ExecutorService localExecutorService = C_a.a();
        localObject = new E_a;
        ((E_a)localObject).<init>(this, "OkHttp %s stream %d", new Object[] { this.c.e, Integer.valueOf(paramInt1) }, paramList);
        localExecutorService.execute((Runnable)localObject);
        return;
      }
      ((J_a)localObject).a(LZa.b(paramList), paramBoolean);
      return;
    }
  }
  
  public void a(boolean paramBoolean, int paramInt1, lab paramlab, int paramInt2)
    throws IOException
  {
    if (this.c.b(paramInt1))
    {
      this.c.a(paramInt1, paramlab, paramInt2, paramBoolean);
      return;
    }
    Object localObject = this.c.a(paramInt1);
    if (localObject == null)
    {
      this.c.c(paramInt1, s_a.b);
      localObject = this.c;
      long l = paramInt2;
      ((C_a)localObject).i(l);
      paramlab.skip(l);
      return;
    }
    ((J_a)localObject).a(paramlab, paramInt2);
    if (paramBoolean) {
      ((J_a)localObject).a(LZa.c, true);
    }
  }
  
  public void a(boolean paramBoolean, O_a paramO_a)
  {
    synchronized (this.c)
    {
      int i = this.c.p.c();
      if (paramBoolean) {
        this.c.p.a();
      }
      this.c.p.a(paramO_a);
      a(paramO_a);
      int j = this.c.p.c();
      paramO_a = null;
      long l2;
      if ((j != -1) && (j != i))
      {
        long l1 = j - i;
        if (!this.c.q) {
          this.c.q = true;
        }
        l2 = l1;
        if (!this.c.d.isEmpty())
        {
          paramO_a = (J_a[])this.c.d.values().toArray(new J_a[this.c.d.size()]);
          l2 = l1;
        }
      }
      else
      {
        l2 = 0L;
      }
      ExecutorService localExecutorService = C_a.a();
      F_a localF_a = new F_a;
      String str = this.c.e;
      i = 0;
      localF_a.<init>(this, "OkHttp %s settings", new Object[] { str });
      localExecutorService.execute(localF_a);
      if ((paramO_a != null) && (l2 != 0L))
      {
        j = paramO_a.length;
        while (i < j) {
          synchronized (paramO_a[i])
          {
            ???.a(l2);
            i++;
          }
        }
      }
      return;
    }
  }
  
  /* Error */
  protected void b()
  {
    // Byte code:
    //   0: getstatic 234	s_a:c	Ls_a;
    //   3: astore_1
    //   4: aconst_null
    //   5: astore_2
    //   6: aconst_null
    //   7: astore_3
    //   8: aconst_null
    //   9: astore 4
    //   11: aload_0
    //   12: getfield 36	C_a$d:b	LI_a;
    //   15: aload_0
    //   16: invokevirtual 239	I_a:a	(LI_a$b;)V
    //   19: aload_0
    //   20: getfield 36	C_a$d:b	LI_a;
    //   23: iconst_0
    //   24: aload_0
    //   25: invokevirtual 242	I_a:a	(ZLI_a$b;)Z
    //   28: ifeq +6 -> 34
    //   31: goto -12 -> 19
    //   34: getstatic 244	s_a:a	Ls_a;
    //   37: astore 5
    //   39: aload_2
    //   40: astore_3
    //   41: aload 5
    //   43: astore_2
    //   44: getstatic 246	s_a:f	Ls_a;
    //   47: astore 6
    //   49: aload 6
    //   51: astore_2
    //   52: goto +47 -> 99
    //   55: astore 4
    //   57: aload 5
    //   59: astore_2
    //   60: goto +17 -> 77
    //   63: astore_2
    //   64: aload_1
    //   65: astore 4
    //   67: aload_2
    //   68: astore 5
    //   70: goto +54 -> 124
    //   73: astore 4
    //   75: aload_1
    //   76: astore_2
    //   77: aload 4
    //   79: astore_3
    //   80: getstatic 191	s_a:b	Ls_a;
    //   83: astore 5
    //   85: aload 4
    //   87: astore_3
    //   88: aload 5
    //   90: astore_2
    //   91: getstatic 191	s_a:b	Ls_a;
    //   94: astore 6
    //   96: aload 6
    //   98: astore_2
    //   99: aload_0
    //   100: getfield 23	C_a$d:c	LC_a;
    //   103: aload 5
    //   105: aload_2
    //   106: aload 4
    //   108: invokevirtual 249	C_a:a	(Ls_a;Ls_a;Ljava/io/IOException;)V
    //   111: aload_0
    //   112: getfield 36	C_a$d:b	LI_a;
    //   115: invokestatic 252	LZa:a	(Ljava/io/Closeable;)V
    //   118: return
    //   119: astore 5
    //   121: aload_2
    //   122: astore 4
    //   124: aload_0
    //   125: getfield 23	C_a$d:c	LC_a;
    //   128: aload 4
    //   130: aload_1
    //   131: aload_3
    //   132: invokevirtual 249	C_a:a	(Ls_a;Ls_a;Ljava/io/IOException;)V
    //   135: aload_0
    //   136: getfield 36	C_a$d:b	LI_a;
    //   139: invokestatic 252	LZa:a	(Ljava/io/Closeable;)V
    //   142: aload 5
    //   144: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	d
    //   3	128	1	locals_a1	s_a
    //   5	55	2	localObject1	Object
    //   63	5	2	localObject2	Object
    //   76	46	2	localObject3	Object
    //   7	125	3	localObject4	Object
    //   9	1	4	localObject5	Object
    //   55	1	4	localIOException1	IOException
    //   65	1	4	locals_a2	s_a
    //   73	34	4	localIOException2	IOException
    //   122	7	4	localObject6	Object
    //   37	67	5	localObject7	Object
    //   119	24	5	localObject8	Object
    //   47	50	6	locals_a3	s_a
    // Exception table:
    //   from	to	target	type
    //   44	49	55	java/io/IOException
    //   11	19	63	finally
    //   19	31	63	finally
    //   34	39	63	finally
    //   11	19	73	java/io/IOException
    //   19	31	73	java/io/IOException
    //   34	39	73	java/io/IOException
    //   44	49	119	finally
    //   80	85	119	finally
    //   91	96	119	finally
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/C_a$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */