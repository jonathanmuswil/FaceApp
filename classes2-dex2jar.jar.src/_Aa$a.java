import android.graphics.Bitmap;
import java.io.File;

public final class _Aa$a
{
  public final _Aa a(Bitmap paramBitmap, String paramString, boolean paramBoolean)
  {
    oXa.b(paramBitmap, "source");
    oXa.b(paramString, "cacheKey");
    return new _Aa.b(paramBitmap, paramString, paramBoolean);
  }
  
  public final _Aa a(File paramFile, String paramString, boolean paramBoolean)
  {
    oXa.b(paramFile, "source");
    oXa.b(paramString, "cacheKey");
    return new _Aa.c(paramFile, paramString, paramBoolean);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Aa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */