import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.v4.view.y;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class ob
  extends fc
{
  public ob(int paramInt)
  {
    a(paramInt);
  }
  
  private static float a(Mb paramMb, float paramFloat)
  {
    float f = paramFloat;
    if (paramMb != null)
    {
      paramMb = (Float)paramMb.a.get("android:fade:transitionAlpha");
      f = paramFloat;
      if (paramMb != null) {
        f = paramMb.floatValue();
      }
    }
    return f;
  }
  
  private Animator a(View paramView, float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 == paramFloat2) {
      return null;
    }
    _b.a(paramView, paramFloat1);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramView, _b.d, new float[] { paramFloat2 });
    localObjectAnimator.addListener(new ob.a(paramView));
    a(new nb(this, paramView));
    return localObjectAnimator;
  }
  
  public Animator a(ViewGroup paramViewGroup, View paramView, Mb paramMb1, Mb paramMb2)
  {
    float f1 = 0.0F;
    float f2 = a(paramMb1, 0.0F);
    if (f2 != 1.0F) {
      f1 = f2;
    }
    return a(paramView, f1, 1.0F);
  }
  
  public Animator b(ViewGroup paramViewGroup, View paramView, Mb paramMb1, Mb paramMb2)
  {
    _b.e(paramView);
    return a(paramView, a(paramMb1, 1.0F), 0.0F);
  }
  
  public void c(Mb paramMb)
  {
    super.c(paramMb);
    paramMb.a.put("android:fade:transitionAlpha", Float.valueOf(_b.c(paramMb.b)));
  }
  
  private static class a
    extends AnimatorListenerAdapter
  {
    private final View a;
    private boolean b = false;
    
    a(View paramView)
    {
      this.a = paramView;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      _b.a(this.a, 1.0F);
      if (this.b) {
        this.a.setLayerType(0, null);
      }
    }
    
    public void onAnimationStart(Animator paramAnimator)
    {
      if ((y.y(this.a)) && (this.a.getLayerType() == 0))
      {
        this.b = true;
        this.a.setLayerType(2, null);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */