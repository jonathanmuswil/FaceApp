import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class xZa$a
{
  pZa a;
  String b;
  oZa.a c;
  AZa d;
  Map<Class<?>, Object> e = Collections.emptyMap();
  
  public xZa$a()
  {
    this.b = "GET";
    this.c = new oZa.a();
  }
  
  xZa$a(xZa paramxZa)
  {
    this.a = paramxZa.a;
    this.b = paramxZa.b;
    this.d = paramxZa.d;
    Object localObject;
    if (paramxZa.e.isEmpty()) {
      localObject = Collections.emptyMap();
    } else {
      localObject = new LinkedHashMap(paramxZa.e);
    }
    this.e = ((Map)localObject);
    this.c = paramxZa.c.a();
  }
  
  public <T> a a(Class<? super T> paramClass, T paramT)
  {
    if (paramClass != null)
    {
      if (paramT == null)
      {
        this.e.remove(paramClass);
      }
      else
      {
        if (this.e.isEmpty()) {
          this.e = new LinkedHashMap();
        }
        this.e.put(paramClass, paramClass.cast(paramT));
      }
      return this;
    }
    throw new NullPointerException("type == null");
  }
  
  public a a(String paramString)
  {
    this.c.b(paramString);
    return this;
  }
  
  public a a(String paramString, AZa paramAZa)
  {
    if (paramString != null)
    {
      if (paramString.length() != 0)
      {
        if ((paramAZa != null) && (!j_a.b(paramString)))
        {
          paramAZa = new StringBuilder();
          paramAZa.append("method ");
          paramAZa.append(paramString);
          paramAZa.append(" must not have a request body.");
          throw new IllegalArgumentException(paramAZa.toString());
        }
        if ((paramAZa == null) && (j_a.e(paramString)))
        {
          paramAZa = new StringBuilder();
          paramAZa.append("method ");
          paramAZa.append(paramString);
          paramAZa.append(" must have a request body.");
          throw new IllegalArgumentException(paramAZa.toString());
        }
        this.b = paramString;
        this.d = paramAZa;
        return this;
      }
      throw new IllegalArgumentException("method.length() == 0");
    }
    throw new NullPointerException("method == null");
  }
  
  public a a(String paramString1, String paramString2)
  {
    this.c.a(paramString1, paramString2);
    return this;
  }
  
  public a a(oZa paramoZa)
  {
    this.c = paramoZa.a();
    return this;
  }
  
  public a a(pZa parampZa)
  {
    if (parampZa != null)
    {
      this.a = parampZa;
      return this;
    }
    throw new NullPointerException("url == null");
  }
  
  public xZa a()
  {
    if (this.a != null) {
      return new xZa(this);
    }
    throw new IllegalStateException("url == null");
  }
  
  public a b(String paramString)
  {
    if (paramString != null)
    {
      Object localObject;
      if (paramString.regionMatches(true, 0, "ws:", 0, 3))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("http:");
        ((StringBuilder)localObject).append(paramString.substring(3));
        localObject = ((StringBuilder)localObject).toString();
      }
      else
      {
        localObject = paramString;
        if (paramString.regionMatches(true, 0, "wss:", 0, 4))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("https:");
          ((StringBuilder)localObject).append(paramString.substring(4));
          localObject = ((StringBuilder)localObject).toString();
        }
      }
      a(pZa.b((String)localObject));
      return this;
    }
    throw new NullPointerException("url == null");
  }
  
  public a b(String paramString1, String paramString2)
  {
    this.c.c(paramString1, paramString2);
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xZa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */