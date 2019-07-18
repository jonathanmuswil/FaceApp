import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;

public final class lh$a
  implements dh<Uri, AssetFileDescriptor>, lh.c<AssetFileDescriptor>
{
  private final ContentResolver a;
  
  public lh$a(ContentResolver paramContentResolver)
  {
    this.a = paramContentResolver;
  }
  
  public Ze<AssetFileDescriptor> a(Uri paramUri)
  {
    return new We(this.a, paramUri);
  }
  
  public ch<Uri, AssetFileDescriptor> a(gh paramgh)
  {
    return new lh(this);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lh$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */