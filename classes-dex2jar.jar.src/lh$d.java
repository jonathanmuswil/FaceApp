import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

public class lh$d
  implements dh<Uri, InputStream>, lh.c<InputStream>
{
  private final ContentResolver a;
  
  public lh$d(ContentResolver paramContentResolver)
  {
    this.a = paramContentResolver;
  }
  
  public Ze<InputStream> a(Uri paramUri)
  {
    return new jf(this.a, paramUri);
  }
  
  public ch<Uri, InputStream> a(gh paramgh)
  {
    return new lh(this);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lh$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */