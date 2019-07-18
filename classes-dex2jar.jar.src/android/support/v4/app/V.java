package android.support.v4.app;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class v
  extends z.b
{
  v(z paramz, Animation.AnimationListener paramAnimationListener, ViewGroup paramViewGroup, l paraml)
  {
    super(paramAnimationListener);
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    super.onAnimationEnd(paramAnimation);
    this.b.post(new u(this));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */