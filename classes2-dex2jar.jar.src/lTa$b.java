import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class lTa$b<T, R>
  extends AtomicInteger
  implements kRa
{
  final VQa<? super R> a;
  final DRa<? super Object[], ? extends R> b;
  final lTa.a<T, R>[] c;
  Object[] d;
  final LUa<Object[]> e;
  final boolean f;
  volatile boolean g;
  volatile boolean h;
  final mVa i = new mVa();
  int j;
  int k;
  
  lTa$b(VQa<? super R> paramVQa, DRa<? super Object[], ? extends R> paramDRa, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.a = paramVQa;
    this.b = paramDRa;
    this.f = paramBoolean;
    this.d = new Object[paramInt1];
    paramVQa = new lTa.a[paramInt1];
    for (int m = 0; m < paramInt1; m++) {
      paramVQa[m] = new lTa.a(this, m);
    }
    this.c = paramVQa;
    this.e = new LUa(paramInt2);
  }
  
  void a()
  {
    lTa.a[] arrayOfa = this.c;
    int m = arrayOfa.length;
    for (int n = 0; n < m; n++) {
      arrayOfa[n].b();
    }
  }
  
  void a(int paramInt)
  {
    try
    {
      Object[] arrayOfObject = this.d;
      if (arrayOfObject == null) {
        return;
      }
      if (arrayOfObject[paramInt] == null) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (paramInt == 0)
      {
        int m = this.k + 1;
        this.k = m;
        if (m != arrayOfObject.length) {}
      }
      else
      {
        this.h = true;
      }
      if (paramInt != 0) {
        a();
      }
      b();
      return;
    }
    finally {}
  }
  
  void a(int paramInt, T paramT)
  {
    try
    {
      Object[] arrayOfObject = this.d;
      if (arrayOfObject == null) {
        return;
      }
      Object localObject = arrayOfObject[paramInt];
      int m = this.j;
      int n = m;
      if (localObject == null)
      {
        n = m + 1;
        this.j = n;
      }
      arrayOfObject[paramInt] = paramT;
      if (n == arrayOfObject.length)
      {
        this.e.offer(arrayOfObject.clone());
        paramInt = 1;
      }
      else
      {
        paramInt = 0;
      }
      if (paramInt != 0) {
        b();
      }
      return;
    }
    finally {}
  }
  
  void a(int paramInt, Throwable paramThrowable)
  {
    if (this.i.a(paramThrowable))
    {
      if (this.f) {
        try
        {
          paramThrowable = this.d;
          if (paramThrowable == null) {
            return;
          }
          if (paramThrowable[paramInt] == null) {
            paramInt = 1;
          } else {
            paramInt = 0;
          }
          if (paramInt == 0)
          {
            int m = this.k + 1;
            this.k = m;
            if (m != paramThrowable.length) {}
          }
          else
          {
            this.h = true;
          }
        }
        finally {}
      }
      paramInt = 1;
      if (paramInt != 0) {
        a();
      }
      b();
    }
    else
    {
      zVa.b(paramThrowable);
    }
  }
  
  void a(LUa<?> paramLUa)
  {
    try
    {
      this.d = null;
      paramLUa.clear();
      return;
    }
    finally {}
  }
  
  public void a(TQa<? extends T>[] paramArrayOfTQa)
  {
    lTa.a[] arrayOfa = this.c;
    int m = arrayOfa.length;
    this.a.a(this);
    for (int n = 0; (n < m) && (!this.h) && (!this.g); n++) {
      paramArrayOfTQa[n].a(arrayOfa[n]);
    }
  }
  
  void b()
  {
    if (getAndIncrement() != 0) {
      return;
    }
    Object localObject1 = this.e;
    VQa localVQa = this.a;
    boolean bool1 = this.f;
    int m = 1;
    for (;;)
    {
      if (this.g)
      {
        a((LUa)localObject1);
        return;
      }
      if ((!bool1) && (this.i.get() != null))
      {
        a();
        a((LUa)localObject1);
        localVQa.a(this.i.a());
        return;
      }
      boolean bool2 = this.h;
      Object localObject2 = (Object[])((LUa)localObject1).poll();
      int n;
      if (localObject2 == null) {
        n = 1;
      } else {
        n = 0;
      }
      if ((bool2) && (n != 0))
      {
        a((LUa)localObject1);
        localObject1 = this.i.a();
        if (localObject1 == null) {
          localVQa.a();
        } else {
          localVQa.a((Throwable)localObject1);
        }
        return;
      }
      if (n != 0)
      {
        n = addAndGet(-m);
        m = n;
        if (n != 0) {}
      }
      else
      {
        try
        {
          localObject2 = this.b.apply(localObject2);
          ORa.a(localObject2, "The combiner returned a null value");
          localVQa.a(localObject2);
        }
        catch (Throwable localThrowable)
        {
          pRa.b(localThrowable);
          this.i.a(localThrowable);
          a();
          a((LUa)localObject1);
          localVQa.a(this.i.a());
        }
      }
    }
  }
  
  public boolean h()
  {
    return this.g;
  }
  
  public void i()
  {
    if (!this.g)
    {
      this.g = true;
      a();
      if (getAndIncrement() == 0) {
        a(this.e);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lTa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */