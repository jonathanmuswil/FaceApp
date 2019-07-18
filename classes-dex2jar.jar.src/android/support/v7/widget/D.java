package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class d
  extends AnimatorListenerAdapter
{
  d(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    paramAnimator = this.a;
    paramAnimator.x = null;
    paramAnimator.l = false;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.a;
    paramAnimator.x = null;
    paramAnimator.l = false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */