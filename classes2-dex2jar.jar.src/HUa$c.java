import java.util.concurrent.atomic.AtomicReference;

final class HUa$c<T>
  extends AtomicReference<kRa>
  implements ZQa<T>
{
  final HUa.b<T, ?> a;
  final int b;
  
  HUa$c(HUa.b<T, ?> paramb, int paramInt)
  {
    this.a = paramb;
    this.b = paramInt;
  }
  
  public void a()
  {
    IRa.a(this);
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.a(paramThrowable, this.b);
  }
  
  public void a(kRa paramkRa)
  {
    IRa.c(this, paramkRa);
  }
  
  public void b(T paramT)
  {
    this.a.a(paramT, this.b);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/HUa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */