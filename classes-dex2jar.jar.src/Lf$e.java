import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

final class Lf$e
  implements Iterable<Lf.d>
{
  private final List<Lf.d> a;
  
  Lf$e()
  {
    this(new ArrayList(2));
  }
  
  Lf$e(List<Lf.d> paramList)
  {
    this.a = paramList;
  }
  
  private static Lf.d c(hj paramhj)
  {
    return new Lf.d(paramhj, Ij.a());
  }
  
  void a(hj paramhj, Executor paramExecutor)
  {
    this.a.add(new Lf.d(paramhj, paramExecutor));
  }
  
  boolean a(hj paramhj)
  {
    return this.a.contains(c(paramhj));
  }
  
  void b(hj paramhj)
  {
    this.a.remove(c(paramhj));
  }
  
  void clear()
  {
    this.a.clear();
  }
  
  boolean isEmpty()
  {
    return this.a.isEmpty();
  }
  
  public Iterator<Lf.d> iterator()
  {
    return this.a.iterator();
  }
  
  e m()
  {
    return new e(new ArrayList(this.a));
  }
  
  int size()
  {
    return this.a.size();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Lf$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */