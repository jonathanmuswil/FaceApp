import java.util.concurrent.atomic.AtomicReference;

final class mTa$b$a<U>
  extends AtomicReference<kRa>
  implements VQa<U>
{
  final VQa<? super U> a;
  final mTa.b<?, ?> b;
  
  mTa$b$a(VQa<? super U> paramVQa, mTa.b<?, ?> paramb)
  {
    this.a = paramVQa;
    this.b = paramb;
  }
  
  public void a()
  {
    this.b.c();
  }
  
  public void a(U paramU)
  {
    this.a.a(paramU);
  }
  
  public void a(Throwable paramThrowable)
  {
    this.b.i();
    this.a.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    IRa.a(this, paramkRa);
  }
  
  void b()
  {
    IRa.a(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mTa$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */