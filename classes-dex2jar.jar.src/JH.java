import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.j;
import java.io.File;
import java.io.InputStream;

public class jh<Data>
  implements ch<String, Data>
{
  private final ch<Uri, Data> a;
  
  public jh(ch<Uri, Data> paramch)
  {
    this.a = paramch;
  }
  
  private static Uri b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    if (paramString.charAt(0) == '/')
    {
      paramString = c(paramString);
    }
    else
    {
      Uri localUri = Uri.parse(paramString);
      if (localUri.getScheme() == null) {
        paramString = c(paramString);
      } else {
        paramString = localUri;
      }
    }
    return paramString;
  }
  
  private static Uri c(String paramString)
  {
    return Uri.fromFile(new File(paramString));
  }
  
  public ch.a<Data> a(String paramString, int paramInt1, int paramInt2, j paramj)
  {
    paramString = b(paramString);
    if ((paramString != null) && (this.a.a(paramString))) {
      return this.a.a(paramString, paramInt1, paramInt2, paramj);
    }
    return null;
  }
  
  public boolean a(String paramString)
  {
    return true;
  }
  
  public static final class a
    implements dh<String, AssetFileDescriptor>
  {
    public ch<String, AssetFileDescriptor> a(gh paramgh)
    {
      return new jh(paramgh.a(Uri.class, AssetFileDescriptor.class));
    }
  }
  
  public static class b
    implements dh<String, ParcelFileDescriptor>
  {
    public ch<String, ParcelFileDescriptor> a(gh paramgh)
    {
      return new jh(paramgh.a(Uri.class, ParcelFileDescriptor.class));
    }
  }
  
  public static class c
    implements dh<String, InputStream>
  {
    public ch<String, InputStream> a(gh paramgh)
    {
      return new jh(paramgh.a(Uri.class, InputStream.class));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */