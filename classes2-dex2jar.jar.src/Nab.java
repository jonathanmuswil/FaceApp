import java.io.IOException;

public abstract class nab
  implements Dab
{
  private final Dab a;
  
  public nab(Dab paramDab)
  {
    if (paramDab != null)
    {
      this.a = paramDab;
      return;
    }
    throw new IllegalArgumentException("delegate == null");
  }
  
  public void a(jab paramjab, long paramLong)
    throws IOException
  {
    this.a.a(paramjab, paramLong);
  }
  
  public void close()
    throws IOException
  {
    this.a.close();
  }
  
  public void flush()
    throws IOException
  {
    this.a.flush();
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/nab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */