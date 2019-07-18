package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class v
  extends Animation
{
  v(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    this.a.setAnimationProgress(paramFloat);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */