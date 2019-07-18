import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import io.faceapp.ui.components.CollagePartView;
import java.util.Iterator;

public final class jGa
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public jGa(View paramView, eGa parameGa, float paramFloat) {}
  
  public void onGlobalLayout()
  {
    if ((this.a.getMeasuredWidth() > 0) || (this.a.getMeasuredHeight() > 0))
    {
      this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
      Object localObject = (ConstraintLayout)this.a;
      int i = ((ViewGroup)localObject).getWidth();
      int j = ((ViewGroup)localObject).getHeight();
      float f1 = j;
      float f2 = this.c;
      float f3 = i;
      if (f1 * f2 <= f3) {
        i = (int)(f1 * f2);
      } else {
        j = (int)(f3 / f2);
      }
      ((ViewGroup)localObject).getLayoutParams().width = i;
      ((ViewGroup)localObject).getLayoutParams().height = j;
      ((ConstraintLayout)localObject).requestLayout();
      localObject = eGa.a(this.b).iterator();
      while (((Iterator)localObject).hasNext())
      {
        CollagePartView localCollagePartView = (CollagePartView)((Iterator)localObject).next();
        localCollagePartView.post(new iGa(localCollagePartView));
      }
      EPa.a(this.b);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/jGa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */