import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.j;
import java.io.ByteArrayOutputStream;

public class pi
  implements ti<Bitmap, byte[]>
{
  private final Bitmap.CompressFormat a;
  private final int b;
  
  public pi()
  {
    this(Bitmap.CompressFormat.JPEG, 100);
  }
  
  public pi(Bitmap.CompressFormat paramCompressFormat, int paramInt)
  {
    this.a = paramCompressFormat;
    this.b = paramInt;
  }
  
  public Wf<byte[]> a(Wf<Bitmap> paramWf, j paramj)
  {
    paramj = new ByteArrayOutputStream();
    ((Bitmap)paramWf.get()).compress(this.a, this.b, paramj);
    paramWf.a();
    return new Xh(paramj.toByteArray());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */