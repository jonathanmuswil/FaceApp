package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class g
  extends AnimatorListenerAdapter
{
  g(FabTransformationScrimBehavior paramFabTransformationScrimBehavior, boolean paramBoolean, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (!this.a) {
      this.b.setVisibility(4);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    if (this.a) {
      this.b.setVisibility(0);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/transformation/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */