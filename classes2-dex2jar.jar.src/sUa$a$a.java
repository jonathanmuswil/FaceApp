import java.util.concurrent.atomic.AtomicReference;

final class sUa$a$a<R>
  implements ZQa<R>
{
  final AtomicReference<kRa> a;
  final ZQa<? super R> b;
  
  sUa$a$a(AtomicReference<kRa> paramAtomicReference, ZQa<? super R> paramZQa)
  {
    this.a = paramAtomicReference;
    this.b = paramZQa;
  }
  
  public void a(Throwable paramThrowable)
  {
    this.b.a(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    IRa.a(this.a, paramkRa);
  }
  
  public void b(R paramR)
  {
    this.b.b(paramR);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sUa$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */