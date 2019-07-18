import java.util.concurrent.atomic.AtomicReference;

final class tSa$a
  extends AtomicReference<kRa>
  implements zQa, kRa, Runnable
{
  final zQa a;
  final WQa b;
  Throwable c;
  
  tSa$a(zQa paramzQa, WQa paramWQa)
  {
    this.a = paramzQa;
    this.b = paramWQa;
  }
  
  public void a()
  {
    IRa.a(this, this.b.a(this));
  }
  
  public void a(Throwable paramThrowable)
  {
    this.c = paramThrowable;
    IRa.a(this, this.b.a(this));
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.c(this, paramkRa)) {
      this.a.a(this);
    }
  }
  
  public boolean h()
  {
    return IRa.a((kRa)get());
  }
  
  public void i()
  {
    IRa.a(this);
  }
  
  public void run()
  {
    Throwable localThrowable = this.c;
    if (localThrowable != null)
    {
      this.c = null;
      this.a.a(localThrowable);
    }
    else
    {
      this.a.a();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */