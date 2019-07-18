import java.io.InputStream;

public final class gf$a
  implements _e.a<InputStream>
{
  private final bg a;
  
  public gf$a(bg parambg)
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gf$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */