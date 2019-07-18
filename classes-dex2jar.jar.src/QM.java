import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class qm
{
  static final Map<String, String> a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
  private static final short[] b = { 10, 20, 30, 60, 120, 300 };
  private final Object c = new Object();
  private final Ql d;
  private final String e;
  private final qm.c f;
  private final qm.b g;
  private Thread h;
  
  public qm(String paramString, Ql paramQl, qm.c paramc, qm.b paramb)
  {
    if (paramQl != null)
    {
      this.d = paramQl;
      this.e = paramString;
      this.f = paramc;
      this.g = paramb;
      return;
    }
    throw new IllegalArgumentException("createReportCall must not be null.");
  }
  
  public void a(float paramFloat, qm.d paramd)
  {
    try
    {
      if (this.h != null)
      {
        Naa.e().d("CrashlyticsCore", "Report upload has already been started.");
        return;
      }
      qm.e locale = new qm$e;
      locale.<init>(this, paramFloat, paramd);
      paramd = new java/lang/Thread;
      paramd.<init>(locale, "Crashlytics Report Uploader");
      this.h = paramd;
      this.h.start();
      return;
    }
    finally {}
  }
  
  /* Error */
  boolean a(pm parampm)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 60	qm:c	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: iconst_0
    //   8: istore_3
    //   9: new 113	Pl
    //   12: astore 4
    //   14: aload 4
    //   16: aload_0
    //   17: getfield 64	qm:e	Ljava/lang/String;
    //   20: aload_1
    //   21: invokespecial 116	Pl:<init>	(Ljava/lang/String;Lpm;)V
    //   24: aload_0
    //   25: getfield 62	qm:d	LQl;
    //   28: aload 4
    //   30: invokeinterface 121 2 0
    //   35: istore 5
    //   37: invokestatic 86	Naa:e	()LXaa;
    //   40: astore 6
    //   42: new 123	java/lang/StringBuilder
    //   45: astore 7
    //   47: aload 7
    //   49: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   52: aload 7
    //   54: ldc 126
    //   56: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: iload 5
    //   62: ifeq +10 -> 72
    //   65: ldc -124
    //   67: astore 4
    //   69: goto +7 -> 76
    //   72: ldc -122
    //   74: astore 4
    //   76: aload 7
    //   78: aload 4
    //   80: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload 7
    //   86: aload_1
    //   87: invokeinterface 139 1 0
    //   92: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: aload 6
    //   98: ldc 88
    //   100: aload 7
    //   102: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokeinterface 144 3 0
    //   110: iload_3
    //   111: istore 8
    //   113: iload 5
    //   115: ifeq +70 -> 185
    //   118: aload_1
    //   119: invokeinterface 147 1 0
    //   124: iconst_1
    //   125: istore 8
    //   127: goto +58 -> 185
    //   130: astore_1
    //   131: goto +59 -> 190
    //   134: astore 4
    //   136: invokestatic 86	Naa:e	()LXaa;
    //   139: astore 6
    //   141: new 123	java/lang/StringBuilder
    //   144: astore 7
    //   146: aload 7
    //   148: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   151: aload 7
    //   153: ldc -107
    //   155: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload 7
    //   161: aload_1
    //   162: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload 6
    //   168: ldc 88
    //   170: aload 7
    //   172: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: aload 4
    //   177: invokeinterface 155 4 0
    //   182: iload_3
    //   183: istore 8
    //   185: aload_2
    //   186: monitorexit
    //   187: iload 8
    //   189: ireturn
    //   190: aload_2
    //   191: monitorexit
    //   192: aload_1
    //   193: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	this	qm
    //   0	194	1	parampm	pm
    //   4	187	2	localObject1	Object
    //   8	175	3	bool1	boolean
    //   12	67	4	localObject2	Object
    //   134	42	4	localException	Exception
    //   35	79	5	bool2	boolean
    //   40	127	6	localXaa	Xaa
    //   45	126	7	localStringBuilder	StringBuilder
    //   111	77	8	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   9	60	130	finally
    //   76	110	130	finally
    //   118	124	130	finally
    //   136	182	130	finally
    //   185	187	130	finally
    //   190	192	130	finally
    //   9	60	134	java/lang/Exception
    //   76	110	134	java/lang/Exception
    //   118	124	134	java/lang/Exception
  }
  
  List<pm> b()
  {
    Naa.e().d("CrashlyticsCore", "Checking for crash reports...");
    synchronized (this.c)
    {
      Object localObject2 = this.f.c();
      Object localObject3 = this.f.b();
      File[] arrayOfFile = this.f.a();
      ??? = new LinkedList();
      int i = 0;
      int j;
      int k;
      Object localObject5;
      Object localObject6;
      StringBuilder localStringBuilder;
      if (localObject2 != null)
      {
        j = localObject2.length;
        for (k = 0; k < j; k++)
        {
          localObject5 = localObject2[k];
          localObject6 = Naa.e();
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("Found crash report ");
          localStringBuilder.append(((File)localObject5).getPath());
          ((Xaa)localObject6).d("CrashlyticsCore", localStringBuilder.toString());
          ((List)???).add(new tm((File)localObject5));
        }
      }
      localObject2 = new HashMap();
      if (localObject3 != null)
      {
        j = localObject3.length;
        for (k = 0; k < j; k++)
        {
          localObject5 = localObject3[k];
          localObject6 = Cl.a((File)localObject5);
          if (!((Map)localObject2).containsKey(localObject6)) {
            ((Map)localObject2).put(localObject6, new LinkedList());
          }
          ((List)((Map)localObject2).get(localObject6)).add(localObject5);
        }
      }
      localObject3 = ((Map)localObject2).keySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject5 = (String)((Iterator)localObject3).next();
        localObject6 = Naa.e();
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Found invalid session: ");
        localStringBuilder.append((String)localObject5);
        ((Xaa)localObject6).d("CrashlyticsCore", localStringBuilder.toString());
        localObject6 = (List)((Map)localObject2).get(localObject5);
        ((List)???).add(new Zl((String)localObject5, (File[])((List)localObject6).toArray(new File[((List)localObject6).size()])));
      }
      if (arrayOfFile != null)
      {
        j = arrayOfFile.length;
        for (k = i; k < j; k++) {
          ((List)???).add(new hm(arrayOfFile[k]));
        }
      }
      if (((List)???).isEmpty()) {
        Naa.e().d("CrashlyticsCore", "No reports found.");
      }
      return (List<pm>)???;
    }
  }
  
  static final class a
    implements qm.d
  {
    public boolean a()
    {
      return true;
    }
  }
  
  static abstract interface b
  {
    public abstract boolean a();
  }
  
  static abstract interface c
  {
    public abstract File[] a();
    
    public abstract File[] b();
    
    public abstract File[] c();
  }
  
  static abstract interface d
  {
    public abstract boolean a();
  }
  
  private class e
    extends mba
  {
    private final float a;
    private final qm.d b;
    
    e(float paramFloat, qm.d paramd)
    {
      this.a = paramFloat;
      this.b = paramd;
    }
    
    private void b()
    {
      Xaa localXaa = Naa.e();
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Starting report processing in ");
      ((StringBuilder)localObject2).append(this.a);
      ((StringBuilder)localObject2).append(" second(s)...");
      localXaa.d("CrashlyticsCore", ((StringBuilder)localObject2).toString());
      float f = this.a;
      long l;
      if (f > 0.0F)
      {
        l = (f * 1000.0F);
        try
        {
          Thread.sleep(l);
        }
        catch (InterruptedException localInterruptedException1)
        {
          Thread.currentThread().interrupt();
          return;
        }
      }
      Object localObject1 = qm.this.b();
      if (qm.a(qm.this).a()) {
        return;
      }
      Object localObject3;
      if ((!((List)localObject1).isEmpty()) && (!this.b.a()))
      {
        localObject2 = Naa.e();
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("User declined to send. Removing ");
        ((StringBuilder)localObject3).append(((List)localObject1).size());
        ((StringBuilder)localObject3).append(" Report(s).");
        ((Xaa)localObject2).d("CrashlyticsCore", ((StringBuilder)localObject3).toString());
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((pm)((Iterator)localObject1).next()).remove();
        }
        return;
      }
      int i = 0;
      for (;;)
      {
        if (!((List)localObject1).isEmpty())
        {
          if (qm.a(qm.this).a()) {
            return;
          }
          localObject3 = Naa.e();
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Attempting to send ");
          ((StringBuilder)localObject2).append(((List)localObject1).size());
          ((StringBuilder)localObject2).append(" report(s)");
          ((Xaa)localObject3).d("CrashlyticsCore", ((StringBuilder)localObject2).toString());
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (pm)((Iterator)localObject1).next();
            qm.this.a((pm)localObject2);
          }
          localObject2 = qm.this.b();
          localObject1 = localObject2;
          if (!((List)localObject2).isEmpty())
          {
            l = qm.a()[Math.min(i, qm.a().length - 1)];
            localObject1 = Naa.e();
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("Report submisson: scheduling delayed retry in ");
            ((StringBuilder)localObject3).append(l);
            ((StringBuilder)localObject3).append(" seconds");
            ((Xaa)localObject1).d("CrashlyticsCore", ((StringBuilder)localObject3).toString());
            try
            {
              Thread.sleep(l * 1000L);
              i++;
              localObject1 = localObject2;
            }
            catch (InterruptedException localInterruptedException2)
            {
              Thread.currentThread().interrupt();
            }
          }
        }
      }
    }
    
    public void a()
    {
      try
      {
        b();
      }
      catch (Exception localException)
      {
        Naa.e().b("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", localException);
      }
      qm.a(qm.this, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */