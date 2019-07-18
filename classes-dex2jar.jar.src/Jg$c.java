import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;

public class Jg$c
  implements dh<Uri, InputStream>, Jg.a<InputStream>
{
  private final AssetManager a;
  
  public Jg$c(AssetManager paramAssetManager)
  {
    this.a = paramAssetManager;
  }
  
  public Ze<InputStream> a(AssetManager paramAssetManager, String paramString)
  {
    return new if(paramAssetManager, paramString);
  }
  
  public ch<Uri, InputStream> a(gh paramgh)
  {
    return new Jg(this.a, this);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Jg$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */