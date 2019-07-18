import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public final class a_a$a
{
  private final List<EZa> a;
  private int b = 0;
  
  a_a$a(List<EZa> paramList)
  {
    this.a = paramList;
  }
  
  public List<EZa> a()
  {
    return new ArrayList(this.a);
  }
  
  public boolean b()
  {
    boolean bool;
    if (this.b < this.a.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public EZa c()
  {
    if (b())
    {
      List localList = this.a;
      int i = this.b;
      this.b = (i + 1);
      return (EZa)localList.get(i);
    }
    throw new NoSuchElementException();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/a_a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */