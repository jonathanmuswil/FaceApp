import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.support.v4.view.y;
import android.view.View;

class kb
  extends AnimatorListenerAdapter
{
  private boolean a;
  
  kb(mb parammb, View paramView, Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.a = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (!this.a)
    {
      y.a(this.b, this.c);
      _b.a(this.b, this.d, this.e, this.f, this.g);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */