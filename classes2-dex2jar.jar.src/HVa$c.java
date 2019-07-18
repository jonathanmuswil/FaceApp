import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class HVa$c<T>
  extends AtomicReference<Object>
  implements HVa.a<T>
{
  final List<Object> a;
  volatile boolean b;
  volatile int c;
  
  HVa$c(int paramInt)
  {
    ORa.a(paramInt, "capacityHint");
    this.a = new ArrayList(paramInt);
  }
  
  public void a() {}
  
  public void a(HVa.b<T> paramb)
  {
    if (paramb.getAndIncrement() != 0) {
      return;
    }
    List localList = this.a;
    VQa localVQa = paramb.a;
    Object localObject = (Integer)paramb.c;
    int i = 0;
    if (localObject != null) {
      i = ((Integer)localObject).intValue();
    } else {
      paramb.c = Integer.valueOf(0);
    }
    int j = 1;
    int k = i;
    i = j;
    do
    {
      do
      {
        if (paramb.d)
        {
          paramb.c = null;
          return;
        }
        for (int m = this.c; m != k; m = j)
        {
          if (paramb.d)
          {
            paramb.c = null;
            return;
          }
          localObject = localList.get(k);
          j = m;
          if (this.b)
          {
            int n = k + 1;
            j = m;
            if (n == m)
            {
              m = this.c;
              j = m;
              if (n == m)
              {
                if (tVa.c(localObject)) {
                  localVQa.a();
                } else {
                  localVQa.a(tVa.a(localObject));
                }
                paramb.c = null;
                paramb.d = true;
                return;
              }
            }
          }
          localVQa.a(localObject);
          k++;
        }
      } while (k != this.c);
      paramb.c = Integer.valueOf(k);
      j = paramb.addAndGet(-i);
      i = j;
    } while (j != 0);
  }
  
  public void a(Object paramObject)
  {
    this.a.add(paramObject);
    a();
    this.c += 1;
    this.b = true;
  }
  
  public void add(T paramT)
  {
    this.a.add(paramT);
    this.c += 1;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/HVa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */