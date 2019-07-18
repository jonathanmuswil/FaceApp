import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

class pe$a
  implements MenuItem.OnMenuItemClickListener
{
  private static final Class<?>[] a = { MenuItem.class };
  private Object b;
  private Method c;
  
  public pe$a(Object paramObject, String paramString)
  {
    this.b = paramObject;
    Class localClass = paramObject.getClass();
    try
    {
      this.c = localClass.getMethod(paramString, a);
      return;
    }
    catch (Exception paramObject)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Couldn't resolve menu item onClick handler ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" in class ");
      localStringBuilder.append(localClass.getName());
      paramString = new InflateException(localStringBuilder.toString());
      paramString.initCause((Throwable)paramObject);
      throw paramString;
    }
  }
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    try
    {
      if (this.c.getReturnType() == Boolean.TYPE) {
        return ((Boolean)this.c.invoke(this.b, new Object[] { paramMenuItem })).booleanValue();
      }
      this.c.invoke(this.b, new Object[] { paramMenuItem });
      return true;
    }
    catch (Exception paramMenuItem)
    {
      throw new RuntimeException(paramMenuItem);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pe$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */