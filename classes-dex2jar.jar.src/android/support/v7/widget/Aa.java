package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class aa
  extends AnimatorListenerAdapter
{
  aa(ea paramea, RecyclerView.x paramx, View paramView, ViewPropertyAnimator paramViewPropertyAnimator) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.b.setAlpha(1.0F);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.c.setListener(null);
    this.d.h(this.a);
    this.d.p.remove(this.a);
    this.d.j();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.d.i(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */