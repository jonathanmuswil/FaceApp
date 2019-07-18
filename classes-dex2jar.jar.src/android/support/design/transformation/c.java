package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class c
  extends AnimatorListenerAdapter
{
  c(FabTransformationBehavior paramFabTransformationBehavior, boolean paramBoolean, View paramView1, View paramView2) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (!this.a)
    {
      this.b.setVisibility(4);
      this.c.setAlpha(1.0F);
      this.c.setVisibility(0);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    if (this.a)
    {
      this.b.setVisibility(0);
      this.c.setAlpha(0.0F);
      this.c.setVisibility(4);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/transformation/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */