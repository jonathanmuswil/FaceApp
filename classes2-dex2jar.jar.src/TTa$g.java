import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class TTa$g<T>
  extends AtomicReference<kRa>
  implements VQa<T>, kRa
{
  static final TTa.c[] a = new TTa.c[0];
  static final TTa.c[] b = new TTa.c[0];
  final TTa.e<T> c;
  boolean d;
  final AtomicReference<TTa.c[]> e;
  final AtomicBoolean f;
  
  TTa$g(TTa.e<T> parame)
  {
    this.c = parame;
    this.e = new AtomicReference(a);
    this.f = new AtomicBoolean();
  }
  
  public void a()
  {
    if (!this.d)
    {
      this.d = true;
      this.c.m();
      c();
    }
  }
  
  public void a(T paramT)
  {
    if (!this.d)
    {
      this.c.a(paramT);
      b();
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    if (!this.d)
    {
      this.d = true;
      this.c.a(paramThrowable);
      c();
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.c(this, paramkRa)) {
      b();
    }
  }
  
  boolean a(TTa.c<T> paramc)
  {
    TTa.c[] arrayOfc1;
    TTa.c[] arrayOfc2;
    do
    {
      arrayOfc1 = (TTa.c[])this.e.get();
      if (arrayOfc1 == b) {
        return false;
      }
      int i = arrayOfc1.length;
      arrayOfc2 = new TTa.c[i + 1];
      System.arraycopy(arrayOfc1, 0, arrayOfc2, 0, i);
      arrayOfc2[i] = paramc;
    } while (!this.e.compareAndSet(arrayOfc1, arrayOfc2));
    return true;
  }
  
  void b()
  {
    for (TTa.c localc : (TTa.c[])this.e.get()) {
      this.c.a(localc);
    }
  }
  
  void b(TTa.c<T> paramc)
  {
    TTa.c[] arrayOfc1;
    TTa.c[] arrayOfc2;
    do
    {
      arrayOfc1 = (TTa.c[])this.e.get();
      int i = arrayOfc1.length;
      if (i == 0) {
        return;
      }
      int j = -1;
      int m;
      for (int k = 0;; k++)
      {
        m = j;
        if (k >= i) {
          break;
        }
        if (arrayOfc1[k].equals(paramc))
        {
          m = k;
          break;
        }
      }
      if (m < 0) {
        return;
      }
      if (i == 1)
      {
        arrayOfc2 = a;
      }
      else
      {
        arrayOfc2 = new TTa.c[i - 1];
        System.arraycopy(arrayOfc1, 0, arrayOfc2, 0, m);
        System.arraycopy(arrayOfc1, m + 1, arrayOfc2, m, i - m - 1);
      }
    } while (!this.e.compareAndSet(arrayOfc1, arrayOfc2));
  }
  
  void c()
  {
    for (TTa.c localc : (TTa.c[])this.e.getAndSet(b)) {
      this.c.a(localc);
    }
  }
  
  public boolean h()
  {
    boolean bool;
    if (this.e.get() == b) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void i()
  {
    this.e.set(b);
    IRa.a(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/TTa$g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */