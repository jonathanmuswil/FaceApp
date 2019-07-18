import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.j;
import java.io.InputStream;

public class ph
  implements ch<Uri, InputStream>
{
  private final Context a;
  
  public ph(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  public ch.a<InputStream> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    if (lf.a(paramInt1, paramInt2)) {
      return new ch.a(new Bj(paramUri), mf.a(this.a, paramUri));
    }
    return null;
  }
  
  public boolean a(Uri paramUri)
  {
    return lf.a(paramUri);
  }
  
  public static class a
    implements dh<Uri, InputStream>
  {
    private final Context a;
    
    public a(Context paramContext)
    {
      this.a = paramContext;
    }
    
    public ch<Uri, InputStream> a(gh paramgh)
    {
      return new ph(this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */