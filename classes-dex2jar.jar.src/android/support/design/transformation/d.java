package android.support.design.transformation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class d
  implements ValueAnimator.AnimatorUpdateListener
{
  d(FabTransformationBehavior paramFabTransformationBehavior, View paramView) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    this.a.invalidate();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/transformation/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */