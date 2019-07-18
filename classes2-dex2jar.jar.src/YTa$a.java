final class YTa$a<T>
  implements VQa<T>, kRa
{
  final LQa<? super T> a;
  kRa b;
  T c;
  boolean d;
  
  YTa$a(LQa<? super T> paramLQa)
  {
    this.a = paramLQa;
  }
  
  public void a()
  {
    if (this.d) {
      return;
    }
    this.d = true;
    Object localObject = this.c;
    this.c = null;
    if (localObject == null) {
      this.a.a();
    } else {
      this.a.b(localObject);
    }
  }
  
  public void a(T paramT)
  {
    if (this.d) {
      return;
    }
    if (this.c != null)
    {
      this.d = true;
      this.b.i();
      this.a.a(new IllegalArgumentException("Sequence contains more than one element!"));
      return;
    }
    this.c = paramT;
  }
  
  public void a(Throwable paramThrowable)
  {
    if (this.d)
    {
      zVa.b(paramThrowable);
      return;
    }
    this.d = true;
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.b, paramkRa))
    {
      this.b = paramkRa;
      this.a.a(this);
    }
  }
  
  public boolean h()
  {
    return this.b.h();
  }
  
  public void i()
  {
    this.b.i();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/YTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */