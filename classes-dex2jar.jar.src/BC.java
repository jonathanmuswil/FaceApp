import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bc
  extends ac
{
  private static Method e;
  private static boolean f;
  private static Method g;
  private static boolean h;
  
  private void c()
  {
    if (!f)
    {
      try
      {
        e = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[] { Matrix.class });
        e.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", localNoSuchMethodException);
      }
      f = true;
    }
  }
  
  private void d()
  {
    if (!h)
    {
      try
      {
        g = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[] { Matrix.class });
        g.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", localNoSuchMethodException);
      }
      h = true;
    }
  }
  
  public void a(View paramView, Matrix paramMatrix)
  {
    c();
    Method localMethod = e;
    if (localMethod != null) {}
    try
    {
      try
      {
        localMethod.invoke(paramView, new Object[] { paramMatrix });
      }
      catch (InvocationTargetException paramView)
      {
        throw new RuntimeException(paramView.getCause());
      }
      return;
    }
    catch (IllegalAccessException paramView)
    {
      for (;;) {}
    }
  }
  
  public void b(View paramView, Matrix paramMatrix)
  {
    d();
    Method localMethod = g;
    if (localMethod != null) {}
    try
    {
      try
      {
        localMethod.invoke(paramView, new Object[] { paramMatrix });
      }
      catch (InvocationTargetException paramView)
      {
        throw new RuntimeException(paramView.getCause());
      }
      return;
    }
    catch (IllegalAccessException paramView)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */