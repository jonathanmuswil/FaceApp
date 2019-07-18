import java.util.concurrent.atomic.AtomicReference;

final class cTa$a<T>
  extends AtomicReference<kRa>
  implements LQa<T>, kRa, Runnable
{
  final LQa<? super T> a;
  final WQa b;
  T c;
  Throwable d;
  
  cTa$a(LQa<? super T> paramLQa, WQa paramWQa)
  {
    this.a = paramLQa;
    this.b = paramWQa;
  }
  
  public void a()
  {
    IRa.a(this, this.b.a(this));
  }
  
  public void a(Throwable paramThrowable)
  {
    this.d = paramThrowable;
    IRa.a(this, this.b.a(this));
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.c(this, paramkRa)) {
      this.a.a(this);
    }
  }
  
  public void b(T paramT)
  {
    this.c = paramT;
    IRa.a(this, this.b.a(this));
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
    Object localObject = this.d;
    if (localObject != null)
    {
      this.d = null;
      this.a.a((Throwable)localObject);
    }
    else
    {
      localObject = this.c;
      if (localObject != null)
      {
        this.c = null;
        this.a.b(localObject);
      }
      else
      {
        this.a.a();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/cTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */