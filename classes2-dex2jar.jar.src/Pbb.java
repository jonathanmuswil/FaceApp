import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class pbb<T>
{
  final pbb<Object> a()
  {
    return new obb(this);
  }
  
  abstract void a(rbb paramrbb, T paramT)
    throws IOException;
  
  final pbb<Iterable<T>> b()
  {
    return new nbb(this);
  }
  
  static final class a<T>
    extends pbb<T>
  {
    private final Zab<T, AZa> a;
    
    a(Zab<T, AZa> paramZab)
    {
      this.a = paramZab;
    }
    
    void a(rbb paramrbb, T paramT)
    {
      if (paramT != null) {
        try
        {
          localObject = (AZa)this.a.a(paramT);
          paramrbb.a((AZa)localObject);
          return;
        }
        catch (IOException paramrbb)
        {
          Object localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Unable to convert ");
          ((StringBuilder)localObject).append(paramT);
          ((StringBuilder)localObject).append(" to RequestBody");
          throw new RuntimeException(((StringBuilder)localObject).toString(), paramrbb);
        }
      }
      throw new IllegalArgumentException("Body parameter value must not be null.");
    }
  }
  
  static final class b<T>
    extends pbb<T>
  {
    private final String a;
    private final Zab<T, String> b;
    private final boolean c;
    
    b(String paramString, Zab<T, String> paramZab, boolean paramBoolean)
    {
      xbb.a(paramString, "name == null");
      this.a = ((String)paramString);
      this.b = paramZab;
      this.c = paramBoolean;
    }
    
    void a(rbb paramrbb, T paramT)
      throws IOException
    {
      if (paramT == null) {
        return;
      }
      paramT = (String)this.b.a(paramT);
      if (paramT == null) {
        return;
      }
      paramrbb.a(this.a, paramT, this.c);
    }
  }
  
  static final class c<T>
    extends pbb<Map<String, T>>
  {
    private final Zab<T, String> a;
    private final boolean b;
    
    c(Zab<T, String> paramZab, boolean paramBoolean)
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
                paramrbb.a(paramMap, str, this.b);
              }
              else
              {
                paramrbb = new StringBuilder();
                paramrbb.append("Field map value '");
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
              paramrbb.append("Field map contained null value for key '");
              paramrbb.append(paramMap);
              paramrbb.append("'.");
              throw new IllegalArgumentException(paramrbb.toString());
            }
          }
          else
          {
            throw new IllegalArgumentException("Field map contained null key.");
          }
        }
        return;
      }
      throw new IllegalArgumentException("Field map was null.");
    }
  }
  
  static final class d<T>
    extends pbb<T>
  {
    private final String a;
    private final Zab<T, String> b;
    
    d(String paramString, Zab<T, String> paramZab)
    {
      xbb.a(paramString, "name == null");
      this.a = ((String)paramString);
      this.b = paramZab;
    }
    
    void a(rbb paramrbb, T paramT)
      throws IOException
    {
      if (paramT == null) {
        return;
      }
      paramT = (String)this.b.a(paramT);
      if (paramT == null) {
        return;
      }
      paramrbb.a(this.a, paramT);
    }
  }
  
  static final class e<T>
    extends pbb<T>
  {
    private final oZa a;
    private final Zab<T, AZa> b;
    
    e(oZa paramoZa, Zab<T, AZa> paramZab)
    {
      this.a = paramoZa;
      this.b = paramZab;
    }
    
    void a(rbb paramrbb, T paramT)
    {
      if (paramT == null) {
        return;
      }
      try
      {
        AZa localAZa = (AZa)this.b.a(paramT);
        paramrbb.a(this.a, localAZa);
        return;
      }
      catch (IOException localIOException)
      {
        paramrbb = new StringBuilder();
        paramrbb.append("Unable to convert ");
        paramrbb.append(paramT);
        paramrbb.append(" to RequestBody");
        throw new RuntimeException(paramrbb.toString(), localIOException);
      }
    }
  }
  
  static final class f<T>
    extends pbb<Map<String, T>>
  {
    private final Zab<T, AZa> a;
    private final String b;
    
    f(Zab<T, AZa> paramZab, String paramString)
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
  
  static final class g<T>
    extends pbb<T>
  {
    private final String a;
    private final Zab<T, String> b;
    private final boolean c;
    
    g(String paramString, Zab<T, String> paramZab, boolean paramBoolean)
    {
      xbb.a(paramString, "name == null");
      this.a = ((String)paramString);
      this.b = paramZab;
      this.c = paramBoolean;
    }
    
    void a(rbb paramrbb, T paramT)
      throws IOException
    {
      if (paramT != null)
      {
        paramrbb.b(this.a, (String)this.b.a(paramT), this.c);
        return;
      }
      paramrbb = new StringBuilder();
      paramrbb.append("Path parameter \"");
      paramrbb.append(this.a);
      paramrbb.append("\" value must not be null.");
      throw new IllegalArgumentException(paramrbb.toString());
    }
  }
  
  static final class h<T>
    extends pbb<T>
  {
    private final String a;
    private final Zab<T, String> b;
    private final boolean c;
    
    h(String paramString, Zab<T, String> paramZab, boolean paramBoolean)
    {
      xbb.a(paramString, "name == null");
      this.a = ((String)paramString);
      this.b = paramZab;
      this.c = paramBoolean;
    }
    
    void a(rbb paramrbb, T paramT)
      throws IOException
    {
      if (paramT == null) {
        return;
      }
      paramT = (String)this.b.a(paramT);
      if (paramT == null) {
        return;
      }
      paramrbb.c(this.a, paramT, this.c);
    }
  }
  
  static final class i<T>
    extends pbb<Map<String, T>>
  {
    private final Zab<T, String> a;
    private final boolean b;
    
    i(Zab<T, String> paramZab, boolean paramBoolean)
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
  
  static final class j<T>
    extends pbb<T>
  {
    private final Zab<T, String> a;
    private final boolean b;
    
    j(Zab<T, String> paramZab, boolean paramBoolean)
    {
      this.a = paramZab;
      this.b = paramBoolean;
    }
    
    void a(rbb paramrbb, T paramT)
      throws IOException
    {
      if (paramT == null) {
        return;
      }
      paramrbb.c((String)this.a.a(paramT), null, this.b);
    }
  }
  
  static final class k
    extends pbb<sZa.b>
  {
    static final k a = new k();
    
    void a(rbb paramrbb, sZa.b paramb)
    {
      if (paramb != null) {
        paramrbb.a(paramb);
      }
    }
  }
  
  static final class l
    extends pbb<Object>
  {
    void a(rbb paramrbb, Object paramObject)
    {
      xbb.a(paramObject, "@Url parameter is null.");
      paramrbb.a(paramObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */