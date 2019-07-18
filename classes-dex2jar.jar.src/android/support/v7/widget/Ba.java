package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class ba
  extends AnimatorListenerAdapter
{
  ba(ea paramea, RecyclerView.x paramx, int paramInt1, View paramView, int paramInt2, ViewPropertyAnimator paramViewPropertyAnimator) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    if (this.b != 0) {
      this.c.setTranslationX(0.0F);
    }
    if (this.d != 0) {
      this.c.setTranslationY(0.0F);
    }
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.e.setListener(null);
    this.f.j(this.a);
    this.f.q.remove(this.a);
    this.f.j();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.f.k(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */