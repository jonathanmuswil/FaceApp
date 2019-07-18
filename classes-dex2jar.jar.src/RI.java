import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.j;

public final class ri
  implements ti<Drawable, byte[]>
{
  private final eg a;
  private final ti<Bitmap, byte[]> b;
  private final ti<hi, byte[]> c;
  
  public ri(eg parameg, ti<Bitmap, byte[]> paramti, ti<hi, byte[]> paramti1)
  {
    this.a = parameg;
    this.b = paramti;
    this.c = paramti1;
  }
  
  private static Wf<hi> a(Wf<Drawable> paramWf)
  {
    return paramWf;
  }
  
  public Wf<byte[]> a(Wf<Drawable> paramWf, j paramj)
  {
    Object localObject = (Drawable)paramWf.get();
    if ((localObject instanceof BitmapDrawable)) {
      return this.b.a(xh.a(((BitmapDrawable)localObject).getBitmap(), this.a), paramj);
    }
    if ((localObject instanceof hi))
    {
      localObject = this.c;
      a(paramWf);
      return ((ti)localObject).a(paramWf, paramj);
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */