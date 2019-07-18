import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

final class Wab$a<R>
  implements Sab<R, CompletableFuture<R>>
{
  private final Type a;
  
  Wab$a(Type paramType)
  {
    this.a = paramType;
  }
  
  public Type a()
  {
    return this.a;
  }
  
  public CompletableFuture<R> a(Rab<R> paramRab)
  {
    Uab localUab = new Uab(this, paramRab);
    paramRab.a(new Vab(this, localUab));
    return localUab;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Wab$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */