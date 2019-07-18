final class PTa$a<T>
  implements VQa<T>, kRa
{
  final VQa<? super T> a;
  final DRa<? super Throwable, ? extends T> b;
  kRa c;
  
  PTa$a(VQa<? super T> paramVQa, DRa<? super Throwable, ? extends T> paramDRa)
  {
    this.a = paramVQa;
    this.b = paramDRa;
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(T paramT)
  {
    this.a.a(paramT);
  }
  
  public void a(Throwable paramThrowable)
  {
    try
    {
      Object localObject = this.b.apply(paramThrowable);
      if (localObject == null)
      {
        localObject = new NullPointerException("The supplied value is null");
        ((NullPointerException)localObject).initCause(paramThrowable);
        this.a.a((Throwable)localObject);
        return;
      }
      this.a.a(localObject);
      this.a.a();
      return;
    }
    catch (Throwable localThrowable)
    {
      pRa.b(localThrowable);
      this.a.a(new oRa(new Throwable[] { paramThrowable, localThrowable }));
    }
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.c, paramkRa))
    {
      this.c = paramkRa;
      this.a.a(this);
    }
  }
  
  public boolean h()
  {
    return this.c.h();
  }
  
  public void i()
  {
    this.c.i();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/PTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */