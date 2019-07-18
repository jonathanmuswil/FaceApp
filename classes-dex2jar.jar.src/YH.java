import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.m;

public abstract class yh
  implements m<Bitmap>
{
  public final Wf<Bitmap> a(Context paramContext, Wf<Bitmap> paramWf, int paramInt1, int paramInt2)
  {
    if (Pj.b(paramInt1, paramInt2))
    {
      paramContext = Ae.a(paramContext).c();
      Bitmap localBitmap1 = (Bitmap)paramWf.get();
      int i = paramInt1;
      if (paramInt1 == Integer.MIN_VALUE) {
        i = localBitmap1.getWidth();
      }
      paramInt1 = paramInt2;
      if (paramInt2 == Integer.MIN_VALUE) {
        paramInt1 = localBitmap1.getHeight();
      }
      Bitmap localBitmap2 = a(paramContext, localBitmap1, i, paramInt1);
      if (!localBitmap1.equals(localBitmap2)) {
        paramWf = xh.a(localBitmap2, paramContext);
      }
      return paramWf;
    }
    paramContext = new StringBuilder();
    paramContext.append("Cannot apply transformation on width: ");
    paramContext.append(paramInt1);
    paramContext.append(" or height: ");
    paramContext.append(paramInt2);
    paramContext.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
    throw new IllegalArgumentException(paramContext.toString());
  }
  
  protected abstract Bitmap a(eg parameg, Bitmap paramBitmap, int paramInt1, int paramInt2);
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */