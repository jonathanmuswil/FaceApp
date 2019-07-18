import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

final class Wab$b<R>
  implements Sab<R, CompletableFuture<tbb<R>>>
{
  private final Type a;
  
  Wab$b(Type paramType)
  {
    this.a = paramType;
  }
  
  public Type a()
  {
    return this.a;
  }
  
  public CompletableFuture<tbb<R>> a(Rab<R> paramRab)
  {
    Xab localXab = new Xab(this, paramRab);
    paramRab.a(new Yab(this, localXab));
    return localXab;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Wab$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */