import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public class ph$a
  implements dh<Uri, InputStream>
{
  private final Context a;
  
  public ph$a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public ch<Uri, InputStream> a(gh paramgh)
  {
    return new ph(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ph$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */