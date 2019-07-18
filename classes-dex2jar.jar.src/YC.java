import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class yc
  extends xc
{
  protected Typeface a(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(this.a, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)this.g.invoke(null, new Object[] { localObject, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1) });
      return (Typeface)paramObject;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  protected Method d(Class paramClass)
    throws NoSuchMethodException
  {
    paramClass = Array.newInstance(paramClass, 1).getClass();
    Class localClass = Integer.TYPE;
    paramClass = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { paramClass, String.class, localClass, localClass });
    paramClass.setAccessible(true);
    return paramClass;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */