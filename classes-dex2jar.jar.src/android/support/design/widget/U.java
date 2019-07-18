package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class u
  implements ValueAnimator.AnimatorUpdateListener
{
  u(CollapsingToolbarLayout paramCollapsingToolbarLayout) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    this.a.setScrimAlpha(((Integer)paramValueAnimator.getAnimatedValue()).intValue());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */