import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

public final class Hya$a
  implements ValueAnimator.AnimatorUpdateListener
{
  private final int a;
  private final int b;
  
  public Hya$a(int paramInt1, int paramInt2)
  {
    this.a = paramInt2;
    int i;
    this.b = i;
  }
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    oXa.b(paramValueAnimator, "animation");
    paramValueAnimator = paramValueAnimator.getAnimatedValue();
    if (paramValueAnimator != null)
    {
      float f = ((Float)paramValueAnimator).floatValue();
      int i = BXa.a(this.a * (1.0F - f) + this.b * f);
      Hya.a(this.c, i);
      return;
    }
    throw new _Va("null cannot be cast to non-null type kotlin.Float");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Hya$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */