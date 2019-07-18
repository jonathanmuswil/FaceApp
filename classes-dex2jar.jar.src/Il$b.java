import java.util.concurrent.Callable;

final class Il$b
  implements Callable<Boolean>
{
  private final Jl a;
  
  public Il$b(Jl paramJl)
  {
    this.a = paramJl;
  }
  
  public Boolean call()
    throws Exception
  {
    if (!this.a.b()) {
      return Boolean.FALSE;
    }
    Naa.e().d("CrashlyticsCore", "Found previous crash marker.");
    this.a.c();
    return Boolean.TRUE;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Il$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */