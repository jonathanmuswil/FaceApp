import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

public final class hh$a
  implements dh<Integer, AssetFileDescriptor>
{
  private final Resources a;
  
  public hh$a(Resources paramResources)
  {
    this.a = paramResources;
  }
  
  public ch<Integer, AssetFileDescriptor> a(gh paramgh)
  {
    return new hh(this.a, paramgh.a(Uri.class, AssetFileDescriptor.class));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hh$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */