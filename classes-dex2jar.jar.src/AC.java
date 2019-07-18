import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ac
  extends dc
{
  private static Method a;
  private static boolean b;
  private static Method c;
  private static boolean d;
  
  private void a()
  {
    if (!d)
    {
      try
      {
        c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
        c.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", localNoSuchMethodException);
      }
      d = true;
    }
  }
  
  private void b()
  {
    if (!b)
    {
      try
      {
        a = View.class.getDeclaredMethod("setTransitionAlpha", new Class[] { Float.TYPE });
        a.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", localNoSuchMethodException);
      }
      b = true;
    }
  }
  
  public void a(View paramView) {}
  
  public void a(View paramView, float paramFloat)
  {
    b();
    Method localMethod = a;
    if (localMethod != null) {}
    try
    {
      try
      {
        localMethod.invoke(paramView, new Object[] { Float.valueOf(paramFloat) });
      }
      catch (InvocationTargetException paramView)
      {
        throw new RuntimeException(paramView.getCause());
      }
      paramView.setAlpha(paramFloat);
      return;
    }
    catch (IllegalAccessException paramView)
    {
      for (;;) {}
    }
  }
  
  public float b(View paramView)
  {
    a();
    Method localMethod = c;
    if (localMethod != null) {}
    try
    {
      float f = ((Float)localMethod.invoke(paramView, new Object[0])).floatValue();
      return f;
    }
    catch (InvocationTargetException paramView)
    {
      throw new RuntimeException(paramView.getCause());
      return super.b(paramView);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
  }
  
  public void c(View paramView) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */