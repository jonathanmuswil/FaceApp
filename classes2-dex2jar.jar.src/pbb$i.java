import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class pbb$i<T>
  extends pbb<Map<String, T>>
{
  private final Zab<T, String> a;
  private final boolean b;
  
  pbb$i(Zab<T, String> paramZab, boolean paramBoolean)
  {
    this.a = paramZab;
    this.b = paramBoolean;
  }
  
  void a(rbb paramrbb, Map<String, T> paramMap)
    throws IOException
  {
    if (paramMap != null)
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (Map.Entry)localIterator.next();
        paramMap = (String)((Map.Entry)localObject).getKey();
        if (paramMap != null)
        {
          localObject = ((Map.Entry)localObject).getValue();
          if (localObject != null)
          {
            String str = (String)this.a.a(localObject);
            if (str != null)
            {
              paramrbb.c(paramMap, str, this.b);
            }
            else
            {
              paramrbb = new StringBuilder();
              paramrbb.append("Query map value '");
              paramrbb.append(localObject);
              paramrbb.append("' converted to null by ");
              paramrbb.append(this.a.getClass().getName());
              paramrbb.append(" for key '");
              paramrbb.append(paramMap);
              paramrbb.append("'.");
              throw new IllegalArgumentException(paramrbb.toString());
            }
          }
          else
          {
            paramrbb = new StringBuilder();
            paramrbb.append("Query map contained null value for key '");
            paramrbb.append(paramMap);
            paramrbb.append("'.");
            throw new IllegalArgumentException(paramrbb.toString());
          }
        }
        else
        {
          throw new IllegalArgumentException("Query map contained null key.");
        }
      }
      return;
    }
    throw new IllegalArgumentException("Query map was null.");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pbb$i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */