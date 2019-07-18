import com.bumptech.glide.load.g;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

final class sf
{
  private final boolean a;
  private final Executor b;
  final Map<g, sf.b> c = new HashMap();
  private final ReferenceQueue<Pf<?>> d = new ReferenceQueue();
  private Pf.a e;
  private volatile boolean f;
  private volatile sf.a g;
  
  sf(boolean paramBoolean)
  {
    this(paramBoolean, Executors.newSingleThreadExecutor(new qf()));
  }
  
  sf(boolean paramBoolean, Executor paramExecutor)
  {
    this.a = paramBoolean;
    this.b = paramExecutor;
    paramExecutor.execute(new rf(this));
  }
  
  void a()
  {
    while (!this.f) {
      try
      {
        a((sf.b)this.d.remove());
        sf.a locala = this.g;
        if (locala != null) {
          locala.a();
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
      }
    }
  }
  
  /* Error */
  void a(Pf.a parama)
  {
    // Byte code:
    //   0: aload_1
    //   1: monitorenter
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: aload_1
    //   6: putfield 95	sf:e	LPf$a;
    //   9: aload_0
    //   10: monitorexit
    //   11: aload_1
    //   12: monitorexit
    //   13: return
    //   14: astore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_2
    //   18: athrow
    //   19: astore_2
    //   20: aload_1
    //   21: monitorexit
    //   22: aload_2
    //   23: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	24	0	this	sf
    //   0	24	1	parama	Pf.a
    //   14	4	2	localObject1	Object
    //   19	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   4	11	14	finally
    //   15	17	14	finally
    //   2	4	19	finally
    //   11	13	19	finally
    //   17	19	19	finally
    //   20	22	19	finally
  }
  
  void a(g paramg)
  {
    try
    {
      paramg = (sf.b)this.c.remove(paramg);
      if (paramg != null) {
        paramg.a();
      }
      return;
    }
    finally {}
  }
  
  void a(g paramg, Pf<?> paramPf)
  {
    try
    {
      sf.b localb = new sf$b;
      localb.<init>(paramg, paramPf, this.d, this.a);
      paramg = (sf.b)this.c.put(paramg, localb);
      if (paramg != null) {
        paramg.a();
      }
      return;
    }
    finally {}
  }
  
  void a(sf.b paramb)
  {
    synchronized (this.e)
    {
      try
      {
        this.c.remove(paramb.a);
        if ((paramb.b) && (paramb.c != null))
        {
          Pf localPf = new Pf;
          localPf.<init>(paramb.c, true, false);
          localPf.a(paramb.a, this.e);
          this.e.a(paramb.a, localPf);
          return;
        }
        return;
      }
      finally {}
    }
  }
  
  Pf<?> b(g paramg)
  {
    try
    {
      sf.b localb = (sf.b)this.c.get(paramg);
      if (localb == null) {
        return null;
      }
      paramg = (Pf)localb.get();
      if (paramg == null) {
        a(localb);
      }
      return paramg;
    }
    finally {}
  }
  
  static abstract interface a
  {
    public abstract void a();
  }
  
  static final class b
    extends WeakReference<Pf<?>>
  {
    final g a;
    final boolean b;
    Wf<?> c;
    
    b(g paramg, Pf<?> paramPf, ReferenceQueue<? super Pf<?>> paramReferenceQueue, boolean paramBoolean)
    {
      super(paramReferenceQueue);
      Nj.a(paramg);
      this.a = ((g)paramg);
      if ((paramPf.f()) && (paramBoolean))
      {
        paramg = paramPf.e();
        Nj.a(paramg);
        paramg = (Wf)paramg;
      }
      else
      {
        paramg = null;
      }
      this.c = paramg;
      this.b = paramPf.f();
    }
    
    void a()
    {
      this.c = null;
      clear();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */