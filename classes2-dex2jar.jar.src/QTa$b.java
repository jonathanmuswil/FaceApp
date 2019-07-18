import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class QTa$b<T>
  implements VQa<T>, kRa
{
  static final QTa.a[] a = new QTa.a[0];
  static final QTa.a[] b = new QTa.a[0];
  final AtomicReference<b<T>> c;
  final AtomicReference<QTa.a<T>[]> d = new AtomicReference(a);
  final AtomicBoolean e;
  final AtomicReference<kRa> f = new AtomicReference();
  
  QTa$b(AtomicReference<b<T>> paramAtomicReference)
  {
    this.c = paramAtomicReference;
    this.e = new AtomicBoolean();
  }
  
  public void a()
  {
    this.c.compareAndSet(this, null);
    QTa.a[] arrayOfa = (QTa.a[])this.d.getAndSet(b);
    int i = arrayOfa.length;
    for (int j = 0; j < i; j++) {
      arrayOfa[j].a.a();
    }
  }
  
  public void a(T paramT)
  {
    QTa.a[] arrayOfa = (QTa.a[])this.d.get();
    int i = arrayOfa.length;
    for (int j = 0; j < i; j++) {
      arrayOfa[j].a.a(paramT);
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    this.c.compareAndSet(this, null);
    QTa.a[] arrayOfa = (QTa.a[])this.d.getAndSet(b);
    if (arrayOfa.length != 0)
    {
      int i = arrayOfa.length;
      for (int j = 0; j < i; j++) {
        arrayOfa[j].a.a(paramThrowable);
      }
    }
    zVa.b(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    IRa.c(this.f, paramkRa);
  }
  
  boolean a(QTa.a<T> parama)
  {
    QTa.a[] arrayOfa1;
    QTa.a[] arrayOfa2;
    do
    {
      arrayOfa1 = (QTa.a[])this.d.get();
      if (arrayOfa1 == b) {
        return false;
      }
      int i = arrayOfa1.length;
      arrayOfa2 = new QTa.a[i + 1];
      System.arraycopy(arrayOfa1, 0, arrayOfa2, 0, i);
      arrayOfa2[i] = parama;
    } while (!this.d.compareAndSet(arrayOfa1, arrayOfa2));
    return true;
  }
  
  void b(QTa.a<T> parama)
  {
    QTa.a[] arrayOfa1;
    QTa.a[] arrayOfa2;
    do
    {
      arrayOfa1 = (QTa.a[])this.d.get();
      int i = arrayOfa1.length;
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
        if (arrayOfa1[k].equals(parama))
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
        arrayOfa2 = a;
      }
      else
      {
        arrayOfa2 = new QTa.a[i - 1];
        System.arraycopy(arrayOfa1, 0, arrayOfa2, 0, m);
        System.arraycopy(arrayOfa1, m + 1, arrayOfa2, m, i - m - 1);
      }
    } while (!this.d.compareAndSet(arrayOfa1, arrayOfa2));
  }
  
  public boolean h()
  {
    boolean bool;
    if (this.d.get() == b) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void i()
  {
    if ((QTa.a[])this.d.getAndSet(b) != b)
    {
      this.c.compareAndSet(this, null);
      IRa.a(this.f);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/QTa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */