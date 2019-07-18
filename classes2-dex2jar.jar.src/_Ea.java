import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import io.faceapp.k;

public final class _Ea
  implements ViewTreeObserver.OnPreDrawListener
{
  public boolean onPreDraw()
  {
    ConstraintLayout localConstraintLayout = (ConstraintLayout)this.a.g(k.duoContainerView);
    oXa.a(localConstraintLayout, "duoContainerView");
    if (localConstraintLayout.getHeight() <= 0)
    {
      YEa localYEa = this.a;
      localConstraintLayout = (ConstraintLayout)localYEa.g(k.duoContainerView);
      oXa.a(localConstraintLayout, "duoContainerView");
      YEa.a(localYEa, localConstraintLayout.getWidth());
    }
    else
    {
      localConstraintLayout = (ConstraintLayout)this.a.g(k.duoContainerView);
      oXa.a(localConstraintLayout, "duoContainerView");
      localConstraintLayout.getViewTreeObserver().removeOnPreDrawListener(this);
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */