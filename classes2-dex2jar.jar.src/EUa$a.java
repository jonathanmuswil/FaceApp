import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class eUa$a<T, U>
  extends AtomicInteger
  implements VQa<T>, kRa
{
  final VQa<? super T> a;
  final AtomicReference<kRa> b;
  final a<T, U>.a c;
  final mVa d;
  
  eUa$a(VQa<? super T> paramVQa)
  {
    this.a = paramVQa;
    this.b = new AtomicReference();
    this.c = new eUa.a.a();
    this.d = new mVa();
  }
  
  public void a()
  {
    IRa.a(this.c);
    sVa.a(this.a, this, this.d);
  }
  
  public void a(T paramT)
  {
    sVa.a(this.a, paramT, this, this.d);
  }
  
  public void a(Throwable paramThrowable)
  {
    IRa.a(this.c);
    sVa.a(this.a, paramThrowable, this, this.d);
  }
  
  public void a(kRa paramkRa)
  {
    IRa.c(this.b, paramkRa);
  }
  
  void b()
  {
    IRa.a(this.b);
    sVa.a(this.a, this, this.d);
  }
  
  void b(Throwable paramThrowable)
  {
    IRa.a(this.b);
    sVa.a(this.a, paramThrowable, this, this.d);
  }
  
  public boolean h()
  {
    return IRa.a((kRa)this.b.get());
  }
  
  public void i()
  {
    IRa.a(this.b);
    IRa.a(this.c);
  }
  
  final class a
    extends AtomicReference<kRa>
    implements VQa<U>
  {
    a() {}
    
    public void a()
    {
      eUa.a.this.b();
    }
    
    public void a(U paramU)
    {
      IRa.a(this);
      eUa.a.this.b();
    }
    
    public void a(Throwable paramThrowable)
    {
      eUa.a.this.b(paramThrowable);
    }
    
    public void a(kRa paramkRa)
    {
      IRa.c(this, paramkRa);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eUa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */