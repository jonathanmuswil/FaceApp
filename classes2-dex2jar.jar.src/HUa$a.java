import java.util.concurrent.atomic.AtomicReference;

final class hUa$a
  extends AtomicReference<kRa>
  implements kRa, Runnable
{
  final VQa<? super Long> a;
  
  hUa$a(VQa<? super Long> paramVQa)
  {
    this.a = paramVQa;
  }
  
  public void a(kRa paramkRa)
  {
    IRa.d(this, paramkRa);
  }
  
  public boolean h()
  {
    boolean bool;
    if (get() == IRa.a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void i()
  {
    IRa.a(this);
  }
  
  public void run()
  {
    if (!h())
    {
      this.a.a(Long.valueOf(0L));
      lazySet(JRa.a);
      this.a.a();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */