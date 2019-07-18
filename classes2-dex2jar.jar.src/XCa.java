import android.graphics.Bitmap;
import java.io.File;

final class xCa
  extends pXa
  implements bXa<jga.b>
{
  xCa(Bitmap paramBitmap, DCa paramDCa, boolean paramBoolean, String paramString, jga.b paramb, oBa paramoBa)
  {
    super(0);
  }
  
  public final jga.b b()
  {
    jga.b localb = this.f;
    cBa localcBa = cBa.d;
    Bitmap localBitmap = this.b;
    File localFile = DCa.a(this.c);
    localcBa.a(localBitmap, localFile);
    return jga.b.a(localb, localFile, null, null, null, null, 30, null);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */