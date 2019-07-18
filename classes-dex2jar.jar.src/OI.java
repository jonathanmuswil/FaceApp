import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class oi
  implements k<InputStream, hi>
{
  private final List<ImageHeaderParser> a;
  private final k<ByteBuffer, hi> b;
  private final bg c;
  
  public oi(List<ImageHeaderParser> paramList, k<ByteBuffer, hi> paramk, bg parambg)
  {
    this.a = paramList;
    this.b = paramk;
    this.c = parambg;
  }
  
  private static byte[] a(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(16384);
    try
    {
      byte[] arrayOfByte = new byte['䀀'];
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      localByteArrayOutputStream.flush();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException paramInputStream)
    {
      if (Log.isLoggable("StreamGifDecoder", 5)) {
        Log.w("StreamGifDecoder", "Error reading data from stream", paramInputStream);
      }
    }
    return null;
  }
  
  public Wf<hi> a(InputStream paramInputStream, int paramInt1, int paramInt2, j paramj)
    throws IOException
  {
    paramInputStream = a(paramInputStream);
    if (paramInputStream == null) {
      return null;
    }
    paramInputStream = ByteBuffer.wrap(paramInputStream);
    return this.b.a(paramInputStream, paramInt1, paramInt2, paramj);
  }
  
  public boolean a(InputStream paramInputStream, j paramj)
    throws IOException
  {
    boolean bool;
    if ((!((Boolean)paramj.a(ni.b)).booleanValue()) && (f.b(this.a, paramInputStream, this.c) == ImageHeaderParser.ImageType.GIF)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */