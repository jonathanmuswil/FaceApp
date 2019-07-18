import java.util.concurrent.atomic.AtomicReference;

final class PUa$b
  extends AtomicReference<Runnable>
  implements Runnable, kRa, DVa
{
  final MRa a = new MRa();
  final MRa b = new MRa();
  
  PUa$b(Runnable paramRunnable)
  {
    super(paramRunnable);
  }
  
  public boolean h()
  {
    boolean bool;
    if (get() == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void i()
  {
    if (getAndSet(null) != null)
    {
      this.a.i();
      this.b.i();
    }
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 37	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   4: checkcast 7	java/lang/Runnable
    //   7: astore_1
    //   8: aload_1
    //   9: ifnull +65 -> 74
    //   12: aload_1
    //   13: invokeinterface 47 1 0
    //   18: aload_0
    //   19: aconst_null
    //   20: invokevirtual 50	java/util/concurrent/atomic/AtomicReference:lazySet	(Ljava/lang/Object;)V
    //   23: aload_0
    //   24: getfield 28	PUa$b:a	LMRa;
    //   27: getstatic 55	IRa:a	LIRa;
    //   30: invokevirtual 50	java/util/concurrent/atomic/AtomicReference:lazySet	(Ljava/lang/Object;)V
    //   33: aload_0
    //   34: getfield 30	PUa$b:b	LMRa;
    //   37: getstatic 55	IRa:a	LIRa;
    //   40: invokevirtual 50	java/util/concurrent/atomic/AtomicReference:lazySet	(Ljava/lang/Object;)V
    //   43: goto +31 -> 74
    //   46: astore_1
    //   47: aload_0
    //   48: aconst_null
    //   49: invokevirtual 50	java/util/concurrent/atomic/AtomicReference:lazySet	(Ljava/lang/Object;)V
    //   52: aload_0
    //   53: getfield 28	PUa$b:a	LMRa;
    //   56: getstatic 55	IRa:a	LIRa;
    //   59: invokevirtual 50	java/util/concurrent/atomic/AtomicReference:lazySet	(Ljava/lang/Object;)V
    //   62: aload_0
    //   63: getfield 30	PUa$b:b	LMRa;
    //   66: getstatic 55	IRa:a	LIRa;
    //   69: invokevirtual 50	java/util/concurrent/atomic/AtomicReference:lazySet	(Ljava/lang/Object;)V
    //   72: aload_1
    //   73: athrow
    //   74: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	b
    //   7	6	1	localRunnable	Runnable
    //   46	27	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   12	18	46	finally
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/PUa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */