import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class pab
  extends Gab
{
  private Gab e;
  
  public pab(Gab paramGab)
  {
    if (paramGab != null)
    {
      this.e = paramGab;
      return;
    }
    throw new IllegalArgumentException("delegate == null");
  }
  
  public Gab a()
  {
    return this.e.a();
  }
  
  public Gab a(long paramLong)
  {
    return this.e.a(paramLong);
  }
  
  public Gab a(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.e.a(paramLong, paramTimeUnit);
  }
  
  public final pab a(Gab paramGab)
  {
    if (paramGab != null)
    {
      this.e = paramGab;
      return this;
    }
    throw new IllegalArgumentException("delegate == null");
  }
  
  public Gab b()
  {
    return this.e.b();
  }
  
  public long c()
  {
    return this.e.c();
  }
  
  public boolean d()
  {
    return this.e.d();
  }
  
  public void e()
    throws IOException
  {
    this.e.e();
  }
  
  public final Gab g()
  {
    return this.e;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */