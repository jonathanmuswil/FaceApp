import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import io.faceapp.k;

public final class sDa
  implements ViewTreeObserver.OnPreDrawListener
{
  public sDa(View paramView, rDa paramrDa, APa paramAPa) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    ImageView localImageView = (ImageView)this.a;
    float f = localImageView.getWidth() / this.c.c();
    int i = (int)(this.c.b() * f);
    if (i < localImageView.getHeight())
    {
      localImageView = (ImageView)this.b.f(k.imageView);
      oXa.a(localImageView, "imageView");
      localImageView.getLayoutParams().height = i;
      ((ImageView)this.b.f(k.imageView)).requestLayout();
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sDa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */