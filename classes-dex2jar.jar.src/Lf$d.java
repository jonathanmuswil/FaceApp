import java.util.concurrent.Executor;

final class Lf$d
{
  final hj a;
  final Executor b;
  
  Lf$d(hj paramhj, Executor paramExecutor)
  {
    this.a = paramhj;
    this.b = paramExecutor;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof d))
    {
      paramObject = (d)paramObject;
      return this.a.equals(((d)paramObject).a);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Lf$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */