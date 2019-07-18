package android.support.v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

class e
  implements Animator.AnimatorListener
{
  e(f paramf, f.a parama) {}
  
  public void onAnimationCancel(Animator paramAnimator) {}
  
  public void onAnimationEnd(Animator paramAnimator) {}
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    this.b.a(1.0F, this.a, true);
    this.a.l();
    this.a.j();
    f localf = this.b;
    if (localf.i)
    {
      localf.i = false;
      paramAnimator.cancel();
      paramAnimator.setDuration(1332L);
      paramAnimator.start();
      this.a.a(false);
    }
    else
    {
      localf.h += 1.0F;
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.b.h = 0.0F;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */