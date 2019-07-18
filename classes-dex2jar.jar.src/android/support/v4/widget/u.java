package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

class u
  implements Animation.AnimationListener
{
  u(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = this.a;
    if (paramAnimation.e)
    {
      paramAnimation.D.setAlpha(255);
      this.a.D.start();
      paramAnimation = this.a;
      if (paramAnimation.J)
      {
        paramAnimation = paramAnimation.d;
        if (paramAnimation != null) {
          paramAnimation.a();
        }
      }
      paramAnimation = this.a;
      paramAnimation.o = paramAnimation.w.getTop();
    }
    else
    {
      paramAnimation.b();
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */