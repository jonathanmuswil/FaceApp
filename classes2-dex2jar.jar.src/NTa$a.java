import java.util.concurrent.atomic.AtomicReference;

final class nTa$a<T>
  extends AtomicReference<kRa>
  implements RQa<T>, kRa
{
  final VQa<? super T> a;
  
  nTa$a(VQa<? super T> paramVQa)
  {
    this.a = paramVQa;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 28	nTa$a:h	()Z
    //   4: ifne +26 -> 30
    //   7: aload_0
    //   8: getfield 21	nTa$a:a	LVQa;
    //   11: invokeinterface 32 1 0
    //   16: aload_0
    //   17: invokevirtual 35	nTa$a:i	()V
    //   20: goto +10 -> 30
    //   23: astore_1
    //   24: aload_0
    //   25: invokevirtual 35	nTa$a:i	()V
    //   28: aload_1
    //   29: athrow
    //   30: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	a
    //   23	6	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   7	16	23	finally
  }
  
  public void a(T paramT)
  {
    if (paramT == null)
    {
      a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
      return;
    }
    if (!h()) {
      this.a.a(paramT);
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    if (!b(paramThrowable)) {
      zVa.b(paramThrowable);
    }
  }
  
  public void a(kRa paramkRa)
  {
    IRa.b(this, paramkRa);
  }
  
  public void a(zRa paramzRa)
  {
    a(new GRa(paramzRa));
  }
  
  public boolean b(Throwable paramThrowable)
  {
    Object localObject = paramThrowable;
    if (paramThrowable == null) {
      localObject = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
    if (!h()) {
      try
      {
        this.a.a((Throwable)localObject);
        return true;
      }
      finally
      {
        i();
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/nTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */