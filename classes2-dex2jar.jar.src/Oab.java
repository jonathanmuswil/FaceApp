import java.io.IOException;

public abstract class oab
  implements Eab
{
  private final Eab a;
  
  public oab(Eab paramEab)
  {
    if (paramEab != null)
    {
      this.a = paramEab;
      return;
    }
    throw new IllegalArgumentException("delegate == null");
  }
  
  public final Eab a()
  {
    return this.a;
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    return this.a.b(paramjab, paramLong);
  }
  
  public void close()
    throws IOException
  {
    this.a.close();
  }
  
  public Gab n()
  {
    return this.a.n();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append("(");
    localStringBuilder.append(this.a.toString());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */