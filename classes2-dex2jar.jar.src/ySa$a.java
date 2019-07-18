import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class ySa$a<T>
  extends jVa
  implements HQa<T>
{
  final Oab<? super T> i;
  final Nab<? extends T>[] j;
  final boolean k;
  final AtomicInteger l;
  int m;
  List<Throwable> n;
  long o;
  
  ySa$a(Nab<? extends T>[] paramArrayOfNab, boolean paramBoolean, Oab<? super T> paramOab)
  {
    super(false);
    this.i = paramOab;
    this.j = paramArrayOfNab;
    this.k = paramBoolean;
    this.l = new AtomicInteger();
  }
  
  public void a()
  {
    if (this.l.getAndIncrement() == 0)
    {
      Nab[] arrayOfNab = this.j;
      int i1 = arrayOfNab.length;
      int i2 = this.m;
      label195:
      do
      {
        Object localObject;
        NullPointerException localNullPointerException;
        for (;;)
        {
          if (i2 == i1)
          {
            localObject = this.n;
            if (localObject != null)
            {
              if (((List)localObject).size() == 1) {
                this.i.a((Throwable)((List)localObject).get(0));
              } else {
                this.i.a(new oRa((Iterable)localObject));
              }
            }
            else {
              this.i.a();
            }
            return;
          }
          localObject = arrayOfNab[i2];
          if (localObject != null) {
            break label195;
          }
          localNullPointerException = new NullPointerException("A Publisher entry is null");
          if (!this.k) {
            break;
          }
          List localList = this.n;
          localObject = localList;
          if (localList == null)
          {
            localObject = new ArrayList(i1 - i2 + 1);
            this.n = ((List)localObject);
          }
          ((List)localObject).add(localNullPointerException);
          i2++;
        }
        this.i.a(localNullPointerException);
        return;
        long l1 = this.o;
        if (l1 != 0L)
        {
          this.o = 0L;
          b(l1);
        }
        ((Nab)localObject).a(this);
        i2++;
        this.m = i2;
      } while (this.l.decrementAndGet() != 0);
    }
  }
  
  public void a(Pab paramPab)
  {
    b(paramPab);
  }
  
  public void a(T paramT)
  {
    this.o += 1L;
    this.i.a(paramT);
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.k)
    {
      List localList = this.n;
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList(this.j.length - this.m + 1);
        this.n = ((List)localObject);
      }
      ((List)localObject).add(paramThrowable);
      a();
    }
    else
    {
      this.i.a(paramThrowable);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ySa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */