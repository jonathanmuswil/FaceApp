import java.util.concurrent.atomic.AtomicReference;

final class jUa$a<T>
  extends AtomicReference<kRa>
  implements YQa<T>, kRa
{
  final ZQa<? super T> a;
  
  jUa$a(ZQa<? super T> paramZQa)
  {
    this.a = paramZQa;
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
      localObject1 = (kRa)getAndSet(localObject2);
      if (localObject1 != IRa.a)
      {
        if (paramT == null) {}
        try
        {
          paramT = this.a;
          localObject2 = new java/lang/NullPointerException;
          ((NullPointerException)localObject2).<init>("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
          paramT.a((Throwable)localObject2);
          break label69;
          this.a.b(paramT);
        }
        finally
        {
          label69:
          if (localObject1 != null) {
            ((kRa)localObject1).i();
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
    paramThrowable = get();
    IRa localIRa = IRa.a;
    if (paramThrowable != localIRa)
    {
      paramThrowable = (kRa)getAndSet(localIRa);
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/jUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */