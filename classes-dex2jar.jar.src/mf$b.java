import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Video.Thumbnails;

class mf$b
  implements nf
{
  private static final String[] a = { "_data" };
  private final ContentResolver b;
  
  mf$b(ContentResolver paramContentResolver)
  {
    this.b = paramContentResolver;
  }
  
  public Cursor a(Uri paramUri)
  {
    paramUri = paramUri.getLastPathSegment();
    return this.b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND video_id = ?", new String[] { paramUri }, null);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mf$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */