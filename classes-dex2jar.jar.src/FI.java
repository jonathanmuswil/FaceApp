import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

public class fi
  implements k<ByteBuffer, hi>
{
  private static final fi.a a = new fi.a();
  private static final fi.b b = new fi.b();
  private final Context c;
  private final List<ImageHeaderParser> d;
  private final fi.b e;
  private final fi.a f;
  private final gi g;
  
  public fi(Context paramContext, List<ImageHeaderParser> paramList, eg parameg, bg parambg)
  {
    this(paramContext, paramList, parameg, parambg, b, a);
  }
  
  fi(Context paramContext, List<ImageHeaderParser> paramList, eg parameg, bg parambg, fi.b paramb, fi.a parama)
  {
    this.c = paramContext.getApplicationContext();
    this.d = paramList;
    this.f = parama;
    this.g = new gi(parameg, parambg);
    this.e = paramb;
  }
  
  private static int a(Te paramTe, int paramInt1, int paramInt2)
  {
    int i = Math.min(paramTe.a() / paramInt2, paramTe.d() / paramInt1);
    if (i == 0) {
      i = 0;
    } else {
      i = Integer.highestOneBit(i);
    }
    i = Math.max(1, i);
    if ((Log.isLoggable("BufferGifDecoder", 2)) && (i > 1))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Downsampling GIF, sampleSize: ");
      localStringBuilder.append(i);
      localStringBuilder.append(", target dimens: [");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append("x");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append("], actual dimens: [");
      localStringBuilder.append(paramTe.d());
      localStringBuilder.append("x");
      localStringBuilder.append(paramTe.a());
      localStringBuilder.append("]");
      Log.v("BufferGifDecoder", localStringBuilder.toString());
    }
    return i;
  }
  
  private ji a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, Ue paramUe, j paramj)
  {
    long l = Jj.a();
    try
    {
      Object localObject = paramUe.b();
      if ((((Te)localObject).b() > 0) && (((Te)localObject).c() == 0))
      {
        if (paramj.a(ni.a) == b.b) {
          paramUe = Bitmap.Config.RGB_565;
        } else {
          paramUe = Bitmap.Config.ARGB_8888;
        }
        int i = a((Te)localObject, paramInt1, paramInt2);
        paramByteBuffer = this.f.a(this.g, (Te)localObject, paramByteBuffer, i);
        paramByteBuffer.a(paramUe);
        paramByteBuffer.advance();
        localObject = paramByteBuffer.a();
        if (localObject == null) {
          return null;
        }
        paramj = th.a();
        paramUe = new hi;
        paramUe.<init>(this.c, paramByteBuffer, paramj, paramInt1, paramInt2, (Bitmap)localObject);
        paramUe = new ji(paramUe);
        return paramUe;
      }
      return null;
    }
    finally
    {
      if (Log.isLoggable("BufferGifDecoder", 2))
      {
        paramByteBuffer = new StringBuilder();
        paramByteBuffer.append("Decoded GIF from stream in ");
        paramByteBuffer.append(Jj.a(l));
        Log.v("BufferGifDecoder", paramByteBuffer.toString());
      }
    }
  }
  
  public ji a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, j paramj)
  {
    Ue localUe = this.e.a(paramByteBuffer);
    try
    {
      paramByteBuffer = a(paramByteBuffer, paramInt1, paramInt2, localUe, paramj);
      return paramByteBuffer;
    }
    finally
    {
      this.e.a(localUe);
    }
  }
  
  public boolean a(ByteBuffer paramByteBuffer, j paramj)
    throws IOException
  {
    boolean bool;
    if ((!((Boolean)paramj.a(ni.b)).booleanValue()) && (f.a(this.d, paramByteBuffer) == ImageHeaderParser.ImageType.GIF)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  static class a
  {
    Re a(Re.a parama, Te paramTe, ByteBuffer paramByteBuffer, int paramInt)
    {
      return new Ve(parama, paramTe, paramByteBuffer, paramInt);
    }
  }
  
  static class b
  {
    private final Queue<Ue> a = Pj.a(0);
    
    Ue a(ByteBuffer paramByteBuffer)
    {
      try
      {
        Ue localUe1 = (Ue)this.a.poll();
        Ue localUe2 = localUe1;
        if (localUe1 == null)
        {
          localUe2 = new Ue;
          localUe2.<init>();
        }
        localUe2.a(paramByteBuffer);
        return localUe2;
      }
      finally {}
    }
    
    void a(Ue paramUe)
    {
      try
      {
        paramUe.a();
        this.a.offer(paramUe);
        return;
      }
      finally
      {
        paramUe = finally;
        throw paramUe;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */