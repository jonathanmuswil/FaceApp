import java.util.concurrent.atomic.AtomicInteger;

final class PUa$c$b
  extends AtomicInteger
  implements Runnable, kRa
{
  final Runnable a;
  final HRa b;
  volatile Thread c;
  
  PUa$c$b(Runnable paramRunnable, HRa paramHRa)
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/PUa$c$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */