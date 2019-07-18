import java.util.concurrent.Callable;

class bl
  implements Callable<Void>
{
  bl(Cl paramCl) {}
  
  public Void call()
    throws Exception
  {
    Cl.g(this.a);
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */