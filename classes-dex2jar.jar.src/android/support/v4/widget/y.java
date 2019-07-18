package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class y
  implements Animation.AnimationListener
{
  y(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = this.a;
    if (!paramAnimation.t) {
      paramAnimation.a(null);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */