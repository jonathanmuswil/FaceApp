import android.graphics.Bitmap;
import java.io.File;

final class zEa<T, R>
  implements DRa<T, R>
{
  public static final zEa a = new zEa();
  
  public final File a(Bitmap paramBitmap)
  {
    oXa.b(paramBitmap, "bitmap");
    File localFile = _ra.h.c();
    WOa.a(WOa.e, paramBitmap, localFile, 0, 4, null);
    return localFile;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */