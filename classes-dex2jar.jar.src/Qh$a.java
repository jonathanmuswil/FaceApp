import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public class qh$a
  implements dh<Uri, InputStream>
{
  private final Context a;
  
  public qh$a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public ch<Uri, InputStream> a(gh paramgh)
  {
    return new qh(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qh$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */