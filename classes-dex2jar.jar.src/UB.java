import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

class ub
{
  static <T> ObjectAnimator a(T paramT, Property<T, PointF> paramProperty, Path paramPath)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return ObjectAnimator.ofObject(paramT, paramProperty, null, paramPath);
    }
    return ObjectAnimator.ofFloat(paramT, new wb(paramProperty, paramPath), new float[] { 0.0F, 1.0F });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */