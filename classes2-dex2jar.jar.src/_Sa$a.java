import java.util.concurrent.atomic.AtomicReference;

final class _Sa$a<T>
  extends AtomicReference<kRa>
  implements KQa<T>, kRa
{
  final LQa<? super T> a;
  
  _Sa$a(LQa<? super T> paramLQa)
  {
    this.a = paramLQa;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 28	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   4: astore_1
    //   5: getstatic 33	IRa:a	LIRa;
    //   8: astore_2
    //   9: aload_1
    //   10: aload_2
    //   11: if_acmpeq +54 -> 65
    //   14: aload_0
    //   15: aload_2
    //   16: invokevirtual 37	java/util/concurrent/atomic/AtomicReference:getAndSet	(Ljava/lang/Object;)Ljava/lang/Object;
    //   19: checkcast 9	kRa
    //   22: astore_2
    //   23: aload_2
    //   24: getstatic 33	IRa:a	LIRa;
    //   27: if_acmpeq +38 -> 65
    //   30: aload_0
    //   31: getfield 21	_Sa$a:a	LLQa;
    //   34: invokeinterface 41 1 0
    //   39: aload_2
    //   40: ifnull +25 -> 65
    //   43: aload_2
    //   44: invokeinterface 44 1 0
    //   49: goto +16 -> 65
    //   52: astore_1
    //   53: aload_2
    //   54: ifnull +9 -> 63
    //   57: aload_2
    //   58: invokeinterface 44 1 0
    //   63: aload_1
    //   64: athrow
    //   65: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	a
    //   4	6	1	localObject1	Object
    //   52	12	1	localObject2	Object
    //   8	50	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   30	39	52	finally
  }
  
  public void a(Throwable paramThrowable)
  {
    if (!b(paramThrowable)) {
      zVa.b(paramThrowable);
    }
  }
  
  public void b(T paramT)
  {
    Object localObject1 = get();
    Object localObject2 = IRa.a;
    if (localObject1 != localObject2)
    {
      localObject2 = (kRa)getAndSet(localObject2);
      if (localObject2 != IRa.a)
      {
        if (paramT == null) {}
        try
        {
          paramT = this.a;
          localObject1 = new java/lang/NullPointerException;
          ((NullPointerException)localObject1).<init>("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
          paramT.a((Throwable)localObject1);
          break label69;
          this.a.b(paramT);
        }
        finally
        {
          label69:
          if (localObject2 != null) {
            ((kRa)localObject2).i();
          }
        }
      }
    }
  }
  
  public boolean b(Throwable paramThrowable)
  {
    Object localObject1 = paramThrowable;
    if (paramThrowable == null) {
      localObject1 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
    Object localObject3 = get();
    paramThrowable = IRa.a;
    if (localObject3 != paramThrowable)
    {
      paramThrowable = (kRa)getAndSet(paramThrowable);
      if (paramThrowable != IRa.a) {
        try
        {
          this.a.a((Throwable)localObject1);
          return true;
        }
        finally
        {
          if (paramThrowable != null) {
            paramThrowable.i();
          }
        }
      }
    }
    return false;
  }
  
  public boolean h()
  {
    return IRa.a((kRa)get());
  }
  
  public void i()
  {
    IRa.a(this);
  }
  
  public String toString()
  {
    return String.format("%s{%s}", new Object[] { a.class.getSimpleName(), super.toString() });
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Sa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */