import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

public class if
  extends Xe<InputStream>
{
  public if(AssetManager paramAssetManager, String paramString)
  {
    super(paramAssetManager, paramString);
  }
  
  protected InputStream a(AssetManager paramAssetManager, String paramString)
    throws IOException
  {
    return paramAssetManager.open(paramString);
  }
  
  public Class<InputStream> a()
  {
    return InputStream.class;
  }
  
  protected void a(InputStream paramInputStream)
    throws IOException
  {
    paramInputStream.close();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/if.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */