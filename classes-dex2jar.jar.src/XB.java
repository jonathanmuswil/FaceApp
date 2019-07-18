import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

class xb
{
  static PropertyValuesHolder a(Property<?, PointF> paramProperty, Path paramPath)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return PropertyValuesHolder.ofObject(paramProperty, null, paramPath);
    }
    return PropertyValuesHolder.ofFloat(new wb(paramProperty, paramPath), new float[] { 0.0F, 1.0F });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */