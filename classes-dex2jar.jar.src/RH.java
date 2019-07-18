import com.bumptech.glide.load.j;
import java.io.InputStream;
import java.net.URL;

public class rh
  implements ch<URL, InputStream>
{
  private final ch<Ug, InputStream> a;
  
  public rh(ch<Ug, InputStream> paramch)
  {
    this.a = paramch;
  }
  
  public ch.a<InputStream> a(URL paramURL, int paramInt1, int paramInt2, j paramj)
  {
    return this.a.a(new Ug(paramURL), paramInt1, paramInt2, paramj);
  }
  
  public boolean a(URL paramURL)
  {
    return true;
  }
  
  public static class a
    implements dh<URL, InputStream>
  {
    public ch<URL, InputStream> a(gh paramgh)
    {
      return new rh(paramgh.a(Ug.class, InputStream.class));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */