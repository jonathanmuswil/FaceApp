import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import io.faceapp.k;

public final class kGa
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public kGa(View paramView, eGa parameGa) {}
  
  public void onGlobalLayout()
  {
    if ((this.a.getMeasuredWidth() > 0) || (this.a.getMeasuredHeight() > 0))
    {
      this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
      ConstraintLayout localConstraintLayout = (ConstraintLayout)this.a;
      localConstraintLayout.getLayoutParams().height = -2;
      ViewGroup.LayoutParams localLayoutParams = localConstraintLayout.getLayoutParams();
      Object localObject = localLayoutParams;
      if (!(localLayoutParams instanceof LinearLayout.LayoutParams)) {
        localObject = null;
      }
      localObject = (LinearLayout.LayoutParams)localObject;
      if (localObject != null) {
        ((LinearLayout.LayoutParams)localObject).weight = 0.0F;
      }
      localConstraintLayout.requestLayout();
      localObject = (FrameLayout)this.b.g(k.descriptionContainerView);
      oXa.a(localObject, "descriptionContainerView");
      localLayoutParams = ((FrameLayout)localObject).getLayoutParams();
      localLayoutParams.height = 0;
      localObject = localLayoutParams;
      if (!(localLayoutParams instanceof LinearLayout.LayoutParams)) {
        localObject = null;
      }
      localObject = (LinearLayout.LayoutParams)localObject;
      if (localObject != null) {
        ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
      }
      ((FrameLayout)this.b.g(k.descriptionContainerView)).requestLayout();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/kGa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */