import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class ZS$a<T extends Enum<T>>
  extends eR<T>
{
  private final Map<String, T> a = new HashMap();
  private final Map<T, String> b = new HashMap();
  
  public ZS$a(Class<T> paramClass)
  {
    try
    {
      for (Enum localEnum : (Enum[])paramClass.getEnumConstants())
      {
        Object localObject1 = localEnum.name();
        Object localObject2 = (iR)paramClass.getField((String)localObject1).getAnnotation(iR.class);
        if (localObject2 != null)
        {
          String str = ((iR)localObject2).value();
          localObject2 = ((iR)localObject2).alternate();
          int k = localObject2.length;
          for (int m = 0;; m++)
          {
            localObject1 = str;
            if (m >= k) {
              break;
            }
            localObject1 = localObject2[m];
            this.a.put(localObject1, localEnum);
          }
        }
        this.a.put(localObject1, localEnum);
        this.b.put(localEnum, localObject1);
      }
      return;
    }
    catch (NoSuchFieldException paramClass)
    {
      throw new AssertionError(paramClass);
    }
  }
  
  public T a(cT paramcT)
    throws IOException
  {
    if (paramcT.A() == dT.i)
    {
      paramcT.y();
      return null;
    }
    return (Enum)this.a.get(paramcT.z());
  }
  
  public void a(eT parameT, T paramT)
    throws IOException
  {
    if (paramT == null) {
      paramT = null;
    } else {
      paramT = (String)this.b.get(paramT);
    }
    parameT.d(paramT);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ZS$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */