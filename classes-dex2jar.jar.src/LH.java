import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.j;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class lh<Data>
  implements ch<Uri, Data>
{
  private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "file", "android.resource", "content" })));
  private final lh.c<Data> b;
  
  public lh(lh.c<Data> paramc)
  {
    this.b = paramc;
  }
  
  public ch.a<Data> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    return new ch.a(new Bj(paramUri), this.b.a(paramUri));
  }
  
  public boolean a(Uri paramUri)
  {
    return a.contains(paramUri.getScheme());
  }
  
  public static final class a
    implements dh<Uri, AssetFileDescriptor>, lh.c<AssetFileDescriptor>
  {
    private final ContentResolver a;
    
    public a(ContentResolver paramContentResolver)
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
  
  public static class b
    implements dh<Uri, ParcelFileDescriptor>, lh.c<ParcelFileDescriptor>
  {
    private final ContentResolver a;
    
    public b(ContentResolver paramContentResolver)
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
  
  public static abstract interface c<Data>
  {
    public abstract Ze<Data> a(Uri paramUri);
  }
  
  public static class d
    implements dh<Uri, InputStream>, lh.c<InputStream>
  {
    private final ContentResolver a;
    
    public d(ContentResolver paramContentResolver)
    {
      this.a = paramContentResolver;
    }
    
    public Ze<InputStream> a(Uri paramUri)
    {
      return new jf(this.a, paramUri);
    }
    
    public ch<Uri, InputStream> a(gh paramgh)
    {
      return new lh(this);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */