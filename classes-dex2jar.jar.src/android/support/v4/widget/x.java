package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class x
  extends Animation
{
  x(SwipeRefreshLayout paramSwipeRefreshLayout, int paramInt1, int paramInt2) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this.c.D;
    int i = this.a;
    paramTransformation.setAlpha((int)(i + (this.b - i) * paramFloat));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */