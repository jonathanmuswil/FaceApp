import java.util.concurrent.atomic.AtomicReference;

final class zUa$a<T>
  extends AtomicReference<kRa>
  implements ZQa<T>, kRa, Runnable
{
  final ZQa<? super T> a;
  final WQa b;
  T c;
  Throwable d;
  
  zUa$a(ZQa<? super T> paramZQa, WQa paramWQa)
  {
    this.a = paramZQa;
    this.b = paramWQa;
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
    Throwable localThrowable = this.d;
    if (localThrowable != null) {
      this.a.a(localThrowable);
    } else {
      this.a.b(this.c);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */