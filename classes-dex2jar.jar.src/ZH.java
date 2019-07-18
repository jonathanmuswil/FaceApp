import android.graphics.Bitmap;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import java.io.IOException;
import java.nio.ByteBuffer;

public class zh
  implements k<ByteBuffer, Bitmap>
{
  private final Gh a;
  
  public zh(Gh paramGh)
  {
    this.a = paramGh;
  }
  
  public Wf<Bitmap> a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, j paramj)
    throws IOException
  {
    paramByteBuffer = Cj.b(paramByteBuffer);
    return this.a.a(paramByteBuffer, paramInt1, paramInt2, paramj);
  }
  
  public boolean a(ByteBuffer paramByteBuffer, j paramj)
  {
    return this.a.a(paramByteBuffer);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */