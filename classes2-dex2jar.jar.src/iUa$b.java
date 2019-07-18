import java.util.concurrent.atomic.AtomicReference;

final class iUa$b
  implements VQa<U>
{
  private final iUa.a<T, U, R> a;
  
  iUa$b(iUa.a<T, U, R> parama)
  {
    iUa.a locala;
    this.a = locala;
  }
  
  public void a() {}
  
  public void a(U paramU)
  {
    this.a.lazySet(paramU);
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.b(paramThrowable);
  }
  
  public void a(kRa paramkRa)
  {
    this.a.b(paramkRa);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/iUa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */