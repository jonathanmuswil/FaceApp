package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class b
  extends AnimatorListenerAdapter
{
  b(ExpandableTransformationBehavior paramExpandableTransformationBehavior) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    ExpandableTransformationBehavior.a(this.a, null);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/transformation/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */