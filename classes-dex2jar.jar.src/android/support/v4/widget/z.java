package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;

class z
  extends Animation
{
  z(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this.a;
    if (!paramTransformation.L) {
      i = paramTransformation.B - Math.abs(paramTransformation.A);
    } else {
      i = paramTransformation.B;
    }
    paramTransformation = this.a;
    int j = paramTransformation.y;
    int i = (int)((i - j) * paramFloat);
    int k = paramTransformation.w.getTop();
    this.a.setTargetOffsetTopAndBottom(j + i - k);
    this.a.D.a(1.0F - paramFloat);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */