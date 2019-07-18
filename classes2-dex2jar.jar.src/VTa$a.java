import java.util.NoSuchElementException;

final class vTa$a<T>
  implements VQa<T>, kRa
{
  final VQa<? super T> a;
  final long b;
  final T c;
  final boolean d;
  kRa e;
  long f;
  boolean g;
  
  vTa$a(VQa<? super T> paramVQa, long paramLong, T paramT, boolean paramBoolean)
  {
    this.a = paramVQa;
    this.b = paramLong;
    this.c = paramT;
    this.d = paramBoolean;
  }
  
  public void a()
  {
    if (!this.g)
    {
      this.g = true;
      Object localObject = this.c;
      if ((localObject == null) && (this.d))
      {
        this.a.a(new NoSuchElementException());
      }
      else
      {
        if (localObject != null) {
          this.a.a(localObject);
        }
        this.a.a();
      }
    }
  }
  
  public void a(T paramT)
  {
    if (this.g) {
      return;
    }
    long l = this.f;
    if (l == this.b)
    {
      this.g = true;
      this.e.i();
      this.a.a(paramT);
      this.a.a();
      return;
    }
    this.f = (l + 1L);
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.g)
    {
      zVa.b(paramThrowable);
      return;
    }
    this.g = true;
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.e, paramkRa))
    {
      this.e = paramkRa;
      this.a.a(this);
    }
  }
  
  public boolean h()
  {
    return this.e.h();
  }
  
  public void i()
  {
    this.e.i();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */