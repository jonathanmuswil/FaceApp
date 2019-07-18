import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

final class TTa$k<T>
  extends ArrayList<Object>
  implements TTa.e<T>
{
  volatile int a;
  
  TTa$k(int paramInt)
  {
    super(paramInt);
  }
  
  public void a(TTa.c<T> paramc)
  {
    if (paramc.getAndIncrement() != 0) {
      return;
    }
    VQa localVQa = paramc.b;
    int i = 1;
    int k;
    do
    {
      if (paramc.h()) {
        return;
      }
      int j = this.a;
      Integer localInteger = (Integer)paramc.a();
      if (localInteger != null) {
        k = localInteger.intValue();
      }
      for (k = 0; k < j; k++)
      {
        if (tVa.a(get(k), localVQa)) {
          return;
        }
        if (paramc.h()) {
          return;
        }
      }
      paramc.c = Integer.valueOf(k);
      k = paramc.addAndGet(-i);
      i = k;
    } while (k != 0);
  }
  
  public void a(T paramT)
  {
    tVa.e(paramT);
    add(paramT);
    this.a += 1;
  }
  
  public void a(Throwable paramThrowable)
  {
    add(tVa.a(paramThrowable));
    this.a += 1;
  }
  
  public void m()
  {
    add(tVa.a());
    this.a += 1;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/TTa$k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */