package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

class x
  extends AnimatorListenerAdapter
{
  x(z paramz, ViewGroup paramViewGroup, View paramView, l paraml) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.a.endViewTransition(this.b);
    paramAnimator.removeListener(this);
    paramAnimator = this.c.K;
    if (paramAnimator != null) {
      paramAnimator.setVisibility(8);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */