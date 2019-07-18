package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

class w
  extends AnimatorListenerAdapter
{
  w(z paramz, ViewGroup paramViewGroup, View paramView, l paraml) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.a.endViewTransition(this.b);
    paramAnimator = this.c.Ia();
    this.c.a(null);
    if ((paramAnimator != null) && (this.a.indexOfChild(this.b) < 0))
    {
      paramAnimator = this.d;
      l locall = this.c;
      paramAnimator.a(locall, locall.ab(), 0, 0, false);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */