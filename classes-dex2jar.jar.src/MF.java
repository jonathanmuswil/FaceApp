import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video.Thumbnails;
import android.util.Log;
import com.bumptech.glide.load.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class mf
  implements Ze<InputStream>
{
  private final Uri a;
  private final of b;
  private InputStream c;
  
  mf(Uri paramUri, of paramof)
  {
    this.a = paramUri;
    this.b = paramof;
  }
  
  public static mf a(Context paramContext, Uri paramUri)
  {
    return a(paramContext, paramUri, new mf.a(paramContext.getContentResolver()));
  }
  
  private static mf a(Context paramContext, Uri paramUri, nf paramnf)
  {
    bg localbg = Ae.a(paramContext).b();
    return new mf(paramUri, new of(Ae.a(paramContext).g().a(), paramnf, localbg, paramContext.getContentResolver()));
  }
  
  public static mf b(Context paramContext, Uri paramUri)
  {
    return a(paramContext, paramUri, new mf.b(paramContext.getContentResolver()));
  }
  
  private InputStream d()
    throws FileNotFoundException
  {
    InputStream localInputStream = this.b.b(this.a);
    int i;
    if (localInputStream != null) {
      i = this.b.a(this.a);
    } else {
      i = -1;
    }
    Object localObject = localInputStream;
    if (i != -1) {
      localObject = new cf(localInputStream, i);
    }
    return (InputStream)localObject;
  }
  
  public Class<InputStream> a()
  {
    return InputStream.class;
  }
  
  public void a(Fe paramFe, Ze.a<? super InputStream> parama)
  {
    try
    {
      this.c = d();
      parama.a(this.c);
      return;
    }
    catch (FileNotFoundException paramFe)
    {
      if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", paramFe);
      }
      parama.a(paramFe);
    }
  }
  
  public void b()
  {
    InputStream localInputStream = this.c;
    if (localInputStream != null) {}
    try
    {
      localInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public a c()
  {
    return a.a;
  }
  
  public void cancel() {}
  
  static class a
    implements nf
  {
    private static final String[] a = { "_data" };
    private final ContentResolver b;
    
    a(ContentResolver paramContentResolver)
    {
      this.b = paramContentResolver;
    }
    
    public Cursor a(Uri paramUri)
    {
      paramUri = paramUri.getLastPathSegment();
      return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[] { paramUri }, null);
    }
  }
  
  static class b
    implements nf
  {
    private static final String[] a = { "_data" };
    private final ContentResolver b;
    
    b(ContentResolver paramContentResolver)
    {
      this.b = paramContentResolver;
    }
    
    public Cursor a(Uri paramUri)
    {
      paramUri = paramUri.getLastPathSegment();
      return this.b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND video_id = ?", new String[] { paramUri }, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */