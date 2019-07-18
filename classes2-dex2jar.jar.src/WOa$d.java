import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class WOa$d
  implements WOa.c
{
  private final Uri a;
  
  public WOa$d(Uri paramUri)
  {
    this.a = paramUri;
  }
  
  public WOa$d(String paramString)
  {
    this(paramString);
  }
  
  public InputStream a()
    throws FileNotFoundException
  {
    InputStream localInputStream = FaceApplication.d.a().getContentResolver().openInputStream(this.a);
    if (localInputStream != null) {
      return localInputStream;
    }
    throw new FileNotFoundException("result is null");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WOa$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */