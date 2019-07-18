package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class b
  implements ValueAnimator.AnimatorUpdateListener
{
  b(AppBarLayout.BaseBehavior paramBaseBehavior, CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    this.c.c(this.a, this.b, ((Integer)paramValueAnimator.getAnimatedValue()).intValue());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */