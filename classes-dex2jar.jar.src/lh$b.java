import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public class lh$b
  implements dh<Uri, ParcelFileDescriptor>, lh.c<ParcelFileDescriptor>
{
  private final ContentResolver a;
  
  public lh$b(ContentResolver paramContentResolver)
  {
    this.a = paramContentResolver;
  }
  
  public Ze<ParcelFileDescriptor> a(Uri paramUri)
  {
    return new ef(this.a, paramUri);
  }
  
  public ch<Uri, ParcelFileDescriptor> a(gh paramgh)
  {
    return new lh(this);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lh$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */