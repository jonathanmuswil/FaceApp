import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewAnimationUtils;

public final class ua
{
  public static Animator.AnimatorListener a(ya paramya)
  {
    return new ta(paramya);
  }
  
  public static Animator a(ya paramya, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofObject(paramya, ya.b.a, ya.a.a, new ya.d[] { new ya.d(paramFloat1, paramFloat2, paramFloat3) });
    if (Build.VERSION.SDK_INT >= 21)
    {
      Object localObject = paramya.getRevealInfo();
      if (localObject != null)
      {
        float f = ((ya.d)localObject).c;
        localObject = ViewAnimationUtils.createCircularReveal((View)paramya, (int)paramFloat1, (int)paramFloat2, f, paramFloat3);
        paramya = new AnimatorSet();
        paramya.playTogether(new Animator[] { localObjectAnimator, localObject });
        return paramya;
      }
      throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
    return localObjectAnimator;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */