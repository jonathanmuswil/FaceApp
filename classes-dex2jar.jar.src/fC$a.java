import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

class fc$a
  extends AnimatorListenerAdapter
  implements Eb.c, ab.a
{
  private final View a;
  private final int b;
  private final ViewGroup c;
  private final boolean d;
  private boolean e;
  boolean f = false;
  
  fc$a(View paramView, int paramInt, boolean paramBoolean)
  {
    this.a = paramView;
    this.b = paramInt;
    this.c = ((ViewGroup)paramView.getParent());
    this.d = paramBoolean;
    a(true);
  }
  
  private void a()
  {
    if (!this.f)
    {
      _b.a(this.a, this.b);
      ViewGroup localViewGroup = this.c;
      if (localViewGroup != null) {
        localViewGroup.invalidate();
      }
    }
    a(false);
  }
  
  private void a(boolean paramBoolean)
  {
    if ((this.d) && (this.e != paramBoolean))
    {
      ViewGroup localViewGroup = this.c;
      if (localViewGroup != null)
      {
        this.e = paramBoolean;
        Rb.a(localViewGroup, paramBoolean);
      }
    }
  }
  
  public void a(Eb paramEb)
  {
    a(false);
  }
  
  public void b(Eb paramEb) {}
  
  public void c(Eb paramEb)
  {
    a(true);
  }
  
  public void d(Eb paramEb)
  {
    a();
    paramEb.b(this);
  }
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.f = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    a();
  }
  
  public void onAnimationPause(Animator paramAnimator)
  {
    if (!this.f) {
      _b.a(this.a, this.b);
    }
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {}
  
  public void onAnimationResume(Animator paramAnimator)
  {
    if (!this.f) {
      _b.a(this.a, 0);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fc$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */