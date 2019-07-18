import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

public class hh$c
  implements dh<Integer, InputStream>
{
  private final Resources a;
  
  public hh$c(Resources paramResources)
  {
    this.a = paramResources;
  }
  
  public ch<Integer, InputStream> a(gh paramgh)
  {
    return new hh(this.a, paramgh.a(Uri.class, InputStream.class));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hh$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */