import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class ga
{
  public static final TimeInterpolator a = new LinearInterpolator();
  public static final TimeInterpolator b = new Dd();
  public static final TimeInterpolator c = new Cd();
  public static final TimeInterpolator d = new Ed();
  public static final TimeInterpolator e = new DecelerateInterpolator();
  
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return paramFloat1 + paramFloat3 * (paramFloat2 - paramFloat1);
  }
  
  public static int a(int paramInt1, int paramInt2, float paramFloat)
  {
    return paramInt1 + Math.round(paramFloat * (paramInt2 - paramInt1));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */