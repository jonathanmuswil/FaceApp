import android.net.Uri;
import com.bumptech.glide.load.j;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class oh
  implements ch<Uri, InputStream>
{
  private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "http", "https" })));
  private final ch<Ug, InputStream> b;
  
  public oh(ch<Ug, InputStream> paramch)
  {
    this.b = paramch;
  }
  
  public ch.a<InputStream> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    return this.b.a(new Ug(paramUri.toString()), paramInt1, paramInt2, paramj);
  }
  
  public boolean a(Uri paramUri)
  {
    return a.contains(paramUri.getScheme());
  }
  
  public static class a
    implements dh<Uri, InputStream>
  {
    public ch<Uri, InputStream> a(gh paramgh)
    {
      return new oh(paramgh.a(Ug.class, InputStream.class));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */