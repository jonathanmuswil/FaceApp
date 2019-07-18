import java.util.concurrent.Callable;

final class NRa$k<T, U>
  implements Callable<U>, DRa<T, U>
{
  final U a;
  
  NRa$k(U paramU)
  {
    this.a = paramU;
  }
  
  public U apply(T paramT)
    throws Exception
  {
    return (U)this.a;
  }
  
  public U call()
    throws Exception
  {
    return (U)this.a;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/NRa$k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */