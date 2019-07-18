import java.util.concurrent.atomic.AtomicReference;

final class TTa$h<T>
  implements TQa<T>
{
  private final AtomicReference<TTa.g<T>> a;
  private final TTa.b<T> b;
  
  TTa$h(AtomicReference<TTa.g<T>> paramAtomicReference, TTa.b<T> paramb)
  {
    this.a = paramAtomicReference;
    this.b = paramb;
  }
  
  public void a(VQa<? super T> paramVQa)
  {
    Object localObject2;
    do
    {
      localObject1 = (TTa.g)this.a.get();
      localObject2 = localObject1;
      if (localObject1 != null) {
        break;
      }
      localObject2 = new TTa.g(this.b.call());
    } while (!this.a.compareAndSet(null, localObject2));
    Object localObject1 = new TTa.c((TTa.g)localObject2, paramVQa);
    paramVQa.a((kRa)localObject1);
    ((TTa.g)localObject2).a((TTa.c)localObject1);
    if (((TTa.c)localObject1).h())
    {
      ((TTa.g)localObject2).b((TTa.c)localObject1);
      return;
    }
    ((TTa.g)localObject2).c.a((TTa.c)localObject1);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/TTa$h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */