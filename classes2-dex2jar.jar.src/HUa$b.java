import java.util.concurrent.atomic.AtomicInteger;

final class HUa$b<T, R>
  extends AtomicInteger
  implements kRa
{
  final ZQa<? super R> a;
  final DRa<? super Object[], ? extends R> b;
  final HUa.c<T>[] c;
  final Object[] d;
  
  HUa$b(ZQa<? super R> paramZQa, int paramInt, DRa<? super Object[], ? extends R> paramDRa)
  {
    super(paramInt);
    this.a = paramZQa;
    this.b = paramDRa;
    paramZQa = new HUa.c[paramInt];
    for (int i = 0; i < paramInt; i++) {
      paramZQa[i] = new HUa.c(this, i);
    }
    this.c = paramZQa;
    this.d = new Object[paramInt];
  }
  
  void a(int paramInt)
  {
    HUa.c[] arrayOfc = this.c;
    int i = arrayOfc.length;
    int k;
    for (int j = 0;; j++)
    {
      k = paramInt;
      if (j >= paramInt) {
        break;
      }
      arrayOfc[j].a();
    }
    for (;;)
    {
      k++;
      if (k >= i) {
        break;
      }
      arrayOfc[k].a();
    }
  }
  
  void a(T paramT, int paramInt)
  {
    this.d[paramInt] = paramT;
    if (decrementAndGet() == 0) {
      try
      {
        paramT = this.b.apply(this.d);
        ORa.a(paramT, "The zipper returned a null value");
        this.a.b(paramT);
      }
      catch (Throwable paramT)
      {
        pRa.b(paramT);
        this.a.a(paramT);
      }
    }
  }
  
  void a(Throwable paramThrowable, int paramInt)
  {
    if (getAndSet(0) > 0)
    {
      a(paramInt);
      this.a.a(paramThrowable);
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  public boolean h()
  {
    boolean bool;
    if (get() <= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void i()
  {
    int i = 0;
    if (getAndSet(0) > 0)
    {
      HUa.c[] arrayOfc = this.c;
      int j = arrayOfc.length;
      while (i < j)
      {
        arrayOfc[i].a();
        i++;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/HUa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */