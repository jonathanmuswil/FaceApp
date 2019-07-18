import android.graphics.Bitmap;
import android.graphics.PointF;
import java.io.File;

final class sCa
  extends pXa
  implements bXa<File>
{
  sCa(Bitmap paramBitmap1, rCa paramrCa, Bitmap paramBitmap2, Bitmap paramBitmap3, PointF paramPointF, Bitmap paramBitmap4, Bitmap paramBitmap5, String paramString)
  {
    super(0);
  }
  
  public final File b()
  {
    cBa localcBa = cBa.d;
    Bitmap localBitmap = this.b;
    File localFile = rCa.a(this.c);
    localcBa.a(localBitmap, localFile);
    return localFile;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */