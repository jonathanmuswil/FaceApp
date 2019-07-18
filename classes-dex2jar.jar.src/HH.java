import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.j;
import java.io.InputStream;

public class hh<Data>
  implements ch<Integer, Data>
{
  private final ch<Uri, Data> a;
  private final Resources b;
  
  public hh(Resources paramResources, ch<Uri, Data> paramch)
  {
    this.b = paramResources;
    this.a = paramch;
  }
  
  private Uri b(Integer paramInteger)
  {
    try
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("android.resource://");
      ((StringBuilder)localObject).append(this.b.getResourcePackageName(paramInteger.intValue()));
      ((StringBuilder)localObject).append('/');
      ((StringBuilder)localObject).append(this.b.getResourceTypeName(paramInteger.intValue()));
      ((StringBuilder)localObject).append('/');
      ((StringBuilder)localObject).append(this.b.getResourceEntryName(paramInteger.intValue()));
      localObject = Uri.parse(((StringBuilder)localObject).toString());
      return (Uri)localObject;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      Object localObject;
      if (Log.isLoggable("ResourceLoader", 5))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Received invalid resource id: ");
        ((StringBuilder)localObject).append(paramInteger);
        Log.w("ResourceLoader", ((StringBuilder)localObject).toString(), localNotFoundException);
      }
    }
    return null;
  }
  
  public ch.a<Data> a(Integer paramInteger, int paramInt1, int paramInt2, j paramj)
  {
    paramInteger = b(paramInteger);
    if (paramInteger == null) {
      paramInteger = null;
    } else {
      paramInteger = this.a.a(paramInteger, paramInt1, paramInt2, paramj);
    }
    return paramInteger;
  }
  
  public boolean a(Integer paramInteger)
  {
    return true;
  }
  
  public static final class a
    implements dh<Integer, AssetFileDescriptor>
  {
    private final Resources a;
    
    public a(Resources paramResources)
    {
      this.a = paramResources;
    }
    
    public ch<Integer, AssetFileDescriptor> a(gh paramgh)
    {
      return new hh(this.a, paramgh.a(Uri.class, AssetFileDescriptor.class));
    }
  }
  
  public static class b
    implements dh<Integer, ParcelFileDescriptor>
  {
    private final Resources a;
    
    public b(Resources paramResources)
    {
      this.a = paramResources;
    }
    
    public ch<Integer, ParcelFileDescriptor> a(gh paramgh)
    {
      return new hh(this.a, paramgh.a(Uri.class, ParcelFileDescriptor.class));
    }
  }
  
  public static class c
    implements dh<Integer, InputStream>
  {
    private final Resources a;
    
    public c(Resources paramResources)
    {
      this.a = paramResources;
    }
    
    public ch<Integer, InputStream> a(gh paramgh)
    {
      return new hh(this.a, paramgh.a(Uri.class, InputStream.class));
    }
  }
  
  public static class d
    implements dh<Integer, Uri>
  {
    private final Resources a;
    
    public d(Resources paramResources)
    {
      this.a = paramResources;
    }
    
    public ch<Integer, Uri> a(gh paramgh)
    {
      return new hh(this.a, kh.a());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */