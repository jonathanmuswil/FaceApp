import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import java.io.File;

public class vh
  implements l<BitmapDrawable>
{
  private final eg a;
  private final l<Bitmap> b;
  
  public vh(eg parameg, l<Bitmap> paraml)
  {
    this.a = parameg;
    this.b = paraml;
  }
  
  public c a(j paramj)
  {
    return this.b.a(paramj);
  }
  
  public boolean a(Wf<BitmapDrawable> paramWf, File paramFile, j paramj)
  {
    return this.b.a(new xh(((BitmapDrawable)paramWf.get()).getBitmap(), this.a), paramFile, paramj);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */