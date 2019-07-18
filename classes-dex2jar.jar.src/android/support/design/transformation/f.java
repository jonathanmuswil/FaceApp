package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ya;

class f
  extends AnimatorListenerAdapter
{
  f(FabTransformationBehavior paramFabTransformationBehavior, ya paramya) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.a.getRevealInfo();
    paramAnimator.c = Float.MAX_VALUE;
    this.a.setRevealInfo(paramAnimator);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/transformation/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */