import java.util.concurrent.atomic.AtomicReference;

final class XSa$a
  extends AtomicReference<kRa>
  implements Pab, Runnable
{
  final Oab<? super Long> a;
  volatile boolean b;
  
  XSa$a(Oab<? super Long> paramOab)
  {
    this.a = paramOab;
  }
  
  public void a(long paramLong)
  {
    if (kVa.c(paramLong)) {
      this.b = true;
    }
  }
  
  public void a(kRa paramkRa)
  {
    IRa.d(this, paramkRa);
  }
  
  public void cancel()
  {
    IRa.a(this);
  }
  
  public void run()
  {
    if (get() != IRa.a) {
      if (this.b)
      {
        this.a.a(Long.valueOf(0L));
        lazySet(JRa.a);
        this.a.a();
      }
      else
      {
        lazySet(JRa.a);
        this.a.a(new qRa("Can't deliver value due to lack of requests"));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/XSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */