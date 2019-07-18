import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

class cb
  extends AnimatorListenerAdapter
{
  cb(mb parammb, ViewGroup paramViewGroup, BitmapDrawable paramBitmapDrawable, View paramView, float paramFloat) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    _b.b(this.a).b(this.b);
    _b.a(this.c, this.d);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */