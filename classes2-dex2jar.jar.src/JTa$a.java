final class JTa$a<T>
  implements VQa<T>, kRa
{
  final zQa a;
  kRa b;
  
  JTa$a(zQa paramzQa)
  {
    this.a = paramzQa;
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(T paramT) {}
  
  public void a(Throwable paramThrowable)
  {
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    this.b = paramkRa;
    this.a.a(this);
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/JTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */