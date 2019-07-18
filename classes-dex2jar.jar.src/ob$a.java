import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.y;
import android.view.View;

class ob$a
  extends AnimatorListenerAdapter
{
  private final View a;
  private boolean b = false;
  
  ob$a(View paramView)
  {
    this.a = paramView;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    _b.a(this.a, 1.0F);
    if (this.b) {
      this.a.setLayerType(0, null);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    if ((y.y(this.a)) && (this.a.getLayerType() == 0))
    {
      this.b = true;
      this.a.setLayerType(2, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ob$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */