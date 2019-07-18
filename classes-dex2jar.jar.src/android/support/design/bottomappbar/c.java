package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.ActionMenuView;

class c
  extends AnimatorListenerAdapter
{
  public boolean a;
  
  c(BottomAppBar paramBottomAppBar, ActionMenuView paramActionMenuView, int paramInt, boolean paramBoolean) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.a = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (!this.a) {
      BottomAppBar.a(this.e, this.b, this.c, this.d);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/bottomappbar/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */