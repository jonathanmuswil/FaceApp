import android.util.Log;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import java.io.File;
import java.io.IOException;

public class ii
  implements l<hi>
{
  public c a(j paramj)
  {
    return c.a;
  }
  
  public boolean a(Wf<hi> paramWf, File paramFile, j paramj)
  {
    paramWf = (hi)paramWf.get();
    boolean bool;
    try
    {
      Cj.a(paramWf.b(), paramFile);
      bool = true;
    }
    catch (IOException paramWf)
    {
      if (Log.isLoggable("GifEncoder", 5)) {
        Log.w("GifEncoder", "Failed to encode GIF drawable data", paramWf);
      }
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */