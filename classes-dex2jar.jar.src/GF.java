import java.io.IOException;
import java.io.InputStream;

public final class gf
  implements _e<InputStream>
{
  private final Oh a;
  
  gf(InputStream paramInputStream, bg parambg)
  {
    this.a = new Oh(paramInputStream, parambg);
    this.a.mark(5242880);
  }
  
  public InputStream a()
    throws IOException
  {
    this.a.reset();
    return this.a;
  }
  
  public void b()
  {
    this.a.b();
  }
  
  public static final class a
    implements _e.a<InputStream>
  {
    private final bg a;
    
    public a(bg parambg)
    {
      this.a = parambg;
    }
    
    public _e<InputStream> a(InputStream paramInputStream)
    {
      return new gf(paramInputStream, this.a);
    }
    
    public Class<InputStream> a()
    {
      return InputStream.class;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */