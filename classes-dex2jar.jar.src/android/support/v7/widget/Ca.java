package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class ca
  extends AnimatorListenerAdapter
{
  ca(ea paramea, ea.a parama, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.b.setListener(null);
    this.c.setAlpha(1.0F);
    this.c.setTranslationX(0.0F);
    this.c.setTranslationY(0.0F);
    this.d.a(this.a.a, true);
    this.d.s.remove(this.a.a);
    this.d.j();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.d.b(this.a.a, true);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */