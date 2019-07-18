package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class da
  extends AnimatorListenerAdapter
{
  da(ea paramea, ea.a parama, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.b.setListener(null);
    this.c.setAlpha(1.0F);
    this.c.setTranslationX(0.0F);
    this.c.setTranslationY(0.0F);
    this.d.a(this.a.b, false);
    this.d.s.remove(this.a.b);
    this.d.j();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.d.b(this.a.b, false);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */