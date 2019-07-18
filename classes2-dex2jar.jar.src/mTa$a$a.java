import java.util.concurrent.atomic.AtomicReference;

final class mTa$a$a<R>
  extends AtomicReference<kRa>
  implements VQa<R>
{
  final VQa<? super R> a;
  final mTa.a<?, R> b;
  
  mTa$a$a(VQa<? super R> paramVQa, mTa.a<?, R> parama)
  {
    this.a = paramVQa;
    this.b = parama;
  }
  
  public void a()
  {
    mTa.a locala = this.b;
    locala.i = false;
    locala.b();
  }
  
  public void a(R paramR)
  {
    this.a.a(paramR);
  }
  
  public void a(Throwable paramThrowable)
  {
    mTa.a locala = this.b;
    if (locala.d.a(paramThrowable))
    {
      if (!locala.f) {
        locala.h.i();
      }
      locala.i = false;
      locala.b();
    }
    else
    {
      zVa.b(paramThrowable);
    }
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mTa$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */