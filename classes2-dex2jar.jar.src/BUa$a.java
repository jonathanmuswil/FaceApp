final class bUa$a<T>
  implements VQa<T>
{
  final VQa<? super T> a;
  final TQa<? extends T> b;
  final MRa c;
  boolean d;
  
  bUa$a(VQa<? super T> paramVQa, TQa<? extends T> paramTQa)
  {
    this.a = paramVQa;
    this.b = paramTQa;
    this.d = true;
    this.c = new MRa();
  }
  
  public void a()
  {
    if (this.d)
    {
      this.d = false;
      this.b.a(this);
    }
    else
    {
      this.a.a();
    }
  }
  
  public void a(T paramT)
  {
    if (this.d) {
      this.d = false;
    }
    this.a.a(paramT);
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    this.c.b(paramkRa);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */