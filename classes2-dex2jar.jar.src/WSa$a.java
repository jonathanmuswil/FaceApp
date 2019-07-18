import java.util.concurrent.atomic.AtomicReference;

final class wSa$a
  extends AtomicReference<kRa>
  implements zQa, kRa, Runnable
{
  final zQa a;
  final MRa b;
  final BQa c;
  
  wSa$a(zQa paramzQa, BQa paramBQa)
  {
    this.a = paramzQa;
    this.c = paramBQa;
    this.b = new MRa();
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    IRa.c(this, paramkRa);
  }
  
  public boolean h()
  {
    return IRa.a((kRa)get());
  }
  
  public void i()
  {
    IRa.a(this);
    this.b.i();
  }
  
  public void run()
  {
    this.c.a(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */