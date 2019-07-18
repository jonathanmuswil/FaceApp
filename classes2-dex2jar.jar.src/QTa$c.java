import java.util.concurrent.atomic.AtomicReference;

final class QTa$c<T>
  implements TQa<T>
{
  private final AtomicReference<QTa.b<T>> a;
  
  QTa$c(AtomicReference<QTa.b<T>> paramAtomicReference)
  {
    this.a = paramAtomicReference;
  }
  
  public void a(VQa<? super T> paramVQa)
  {
    QTa.a locala = new QTa.a(paramVQa);
    paramVQa.a(locala);
    do
    {
      QTa.b localb;
      do
      {
        localb = (QTa.b)this.a.get();
        if (localb != null)
        {
          paramVQa = localb;
          if (!localb.h()) {
            break;
          }
        }
        paramVQa = new QTa.b(this.a);
      } while (!this.a.compareAndSet(localb, paramVQa));
    } while (!paramVQa.a(locala));
    locala.a(paramVQa);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/QTa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */