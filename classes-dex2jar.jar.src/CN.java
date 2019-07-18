import java.util.Collections;
import java.util.HashSet;

public final class cn
{
  private final HashSet<bn> a = new HashSet(Collections.singleton(bn.f));
  
  public boolean a(bn parambn)
  {
    synchronized (this.a)
    {
      boolean bool = this.a.contains(parambn);
      return bool;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */