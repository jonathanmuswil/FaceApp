import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ef
  extends hf<ParcelFileDescriptor>
{
  public ef(ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramContentResolver, paramUri);
  }
  
  protected ParcelFileDescriptor a(Uri paramUri, ContentResolver paramContentResolver)
    throws FileNotFoundException
  {
    paramContentResolver = paramContentResolver.openAssetFileDescriptor(paramUri, "r");
    if (paramContentResolver != null) {
      return paramContentResolver.getParcelFileDescriptor();
    }
    paramContentResolver = new StringBuilder();
    paramContentResolver.append("FileDescriptor is null for: ");
    paramContentResolver.append(paramUri);
    throw new FileNotFoundException(paramContentResolver.toString());
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */