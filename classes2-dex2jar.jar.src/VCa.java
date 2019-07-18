import android.graphics.Bitmap;
import java.io.File;

final class vCa
  extends pXa
  implements bXa<File>
{
  vCa(wCa paramwCa, Bitmap paramBitmap)
  {
    super(0);
  }
  
  public final File b()
  {
    cBa localcBa = cBa.d;
    Bitmap localBitmap = this.c;
    File localFile = wCa.a(this.b);
    localcBa.a(localBitmap, localFile);
    return localFile;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */