import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public class hh$b
  implements dh<Integer, ParcelFileDescriptor>
{
  private final Resources a;
  
  public hh$b(Resources paramResources)
  {
    this.a = paramResources;
  }
  
  public ch<Integer, ParcelFileDescriptor> a(gh paramgh)
  {
    return new hh(this.a, paramgh.a(Uri.class, ParcelFileDescriptor.class));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hh$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */