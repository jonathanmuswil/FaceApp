import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class cc
  extends bc
{
  private static Method i;
  private static boolean j;
  
  @SuppressLint({"PrivateApi"})
  private void e()
  {
    if (!j)
    {
      try
      {
        i = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE });
        i.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", localNoSuchMethodException);
      }
      j = true;
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    e();
    Method localMethod = i;
    if (localMethod != null) {}
    try
    {
      try
      {
        localMethod.invoke(paramView, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */