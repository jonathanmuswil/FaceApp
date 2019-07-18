package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import ya;

class e
  extends AnimatorListenerAdapter
{
  e(FabTransformationBehavior paramFabTransformationBehavior, ya paramya, Drawable paramDrawable) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.a.setCircularRevealOverlayDrawable(null);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.a.setCircularRevealOverlayDrawable(this.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/transformation/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */