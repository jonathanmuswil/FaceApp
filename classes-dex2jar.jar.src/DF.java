import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

public class df
  extends Xe<ParcelFileDescriptor>
{
  public df(AssetManager paramAssetManager, String paramString)
  {
    super(paramAssetManager, paramString);
  }
  
  protected ParcelFileDescriptor a(AssetManager paramAssetManager, String paramString)
    throws IOException
  {
    return paramAssetManager.openFd(paramString).getParcelFileDescriptor();
  }
  
  public Class<ParcelFileDescriptor> a()
  {
    return ParcelFileDescriptor.class;
  }
  
  protected void a(ParcelFileDescriptor paramParcelFileDescriptor)
    throws IOException
  {
    paramParcelFileDescriptor.close();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */