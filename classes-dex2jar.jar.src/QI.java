import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.j;

public class qi
  implements ti<Bitmap, BitmapDrawable>
{
  private final Resources a;
  
  public qi(Resources paramResources)
  {
    Nj.a(paramResources);
    this.a = ((Resources)paramResources);
  }
  
  public Wf<BitmapDrawable> a(Wf<Bitmap> paramWf, j paramj)
  {
    return Nh.a(this.a, paramWf);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */