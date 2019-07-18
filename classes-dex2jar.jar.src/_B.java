import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

class _b
{
  private static final dc a;
  private static Field b;
  private static boolean c;
  static final Property<View, Float> d = new Yb(Float.class, "translationAlpha");
  static final Property<View, Rect> e = new Zb(Rect.class, "clipBounds");
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 22) {
      a = new cc();
    } else if (i >= 21) {
      a = new bc();
    } else if (i >= 19) {
      a = new ac();
    } else {
      a = new dc();
    }
  }
  
  private static void a()
  {
    if (!c)
    {
      try
      {
        b = View.class.getDeclaredField("mViewFlags");
        b.setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        Log.i("ViewUtils", "fetchViewFlagsField: ");
      }
      c = true;
    }
  }
  
  static void a(View paramView)
  {
    a.a(paramView);
  }
  
  static void a(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }
  
  static void a(View paramView, int paramInt)
  {
    a();
    Field localField = b;
    if (localField != null) {}
    try
    {
      int i = localField.getInt(paramView);
      b.setInt(paramView, paramInt | i & 0xFFFFFFF3);
      return;
    }
    catch (IllegalAccessException paramView)
    {
      for (;;) {}
    }
  }
  
  static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  static void a(View paramView, Matrix paramMatrix)
  {
    a.a(paramView, paramMatrix);
  }
  
  static Xb b(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return new Wb(paramView);
    }
    return Vb.c(paramView);
  }
  
  static void b(View paramView, Matrix paramMatrix)
  {
    a.b(paramView, paramMatrix);
  }
  
  static float c(View paramView)
  {
    return a.b(paramView);
  }
  
  static ic d(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return new hc(paramView);
    }
    return new gc(paramView.getWindowToken());
  }
  
  static void e(View paramView)
  {
    a.c(paramView);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */