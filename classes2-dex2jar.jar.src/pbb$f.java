import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class pbb$f<T>
  extends pbb<Map<String, T>>
{
  private final Zab<T, AZa> a;
  private final String b;
  
  pbb$f(Zab<T, AZa> paramZab, String paramString)
  {
    this.a = paramZab;
    this.b = paramString;
  }
  
  void a(rbb paramrbb, Map<String, T> paramMap)
    throws IOException
  {
    if (paramMap != null)
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject1 = (Map.Entry)localIterator.next();
        paramMap = (String)((Map.Entry)localObject1).getKey();
        if (paramMap != null)
        {
          Object localObject2 = ((Map.Entry)localObject1).getValue();
          if (localObject2 != null)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("form-data; name=\"");
            ((StringBuilder)localObject1).append(paramMap);
            ((StringBuilder)localObject1).append("\"");
            paramrbb.a(oZa.a(new String[] { "Content-Disposition", ((StringBuilder)localObject1).toString(), "Content-Transfer-Encoding", this.b }), (AZa)this.a.a(localObject2));
          }
          else
          {
            paramrbb = new StringBuilder();
            paramrbb.append("Part map contained null value for key '");
            paramrbb.append(paramMap);
            paramrbb.append("'.");
            throw new IllegalArgumentException(paramrbb.toString());
          }
        }
        else
        {
          throw new IllegalArgumentException("Part map contained null key.");
        }
      }
      return;
    }
    throw new IllegalArgumentException("Part map was null.");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pbb$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */