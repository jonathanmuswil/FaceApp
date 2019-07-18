import java.util.ArrayList;
import java.util.List;

public final class oZa$a
{
  final List<String> a = new ArrayList(20);
  
  a a(String paramString)
  {
    int i = paramString.indexOf(":", 1);
    if (i != -1)
    {
      b(paramString.substring(0, i), paramString.substring(i + 1));
      return this;
    }
    if (paramString.startsWith(":"))
    {
      b("", paramString.substring(1));
      return this;
    }
    b("", paramString);
    return this;
  }
  
  public a a(String paramString1, String paramString2)
  {
    oZa.a(paramString1);
    oZa.a(paramString2, paramString1);
    b(paramString1, paramString2);
    return this;
  }
  
  public oZa a()
  {
    return new oZa(this);
  }
  
  public a b(String paramString)
  {
    int j;
    for (int i = 0; i < this.a.size(); i = j + 2)
    {
      j = i;
      if (paramString.equalsIgnoreCase((String)this.a.get(i)))
      {
        this.a.remove(i);
        this.a.remove(i);
        j = i - 2;
      }
    }
    return this;
  }
  
  a b(String paramString1, String paramString2)
  {
    this.a.add(paramString1);
    this.a.add(paramString2.trim());
    return this;
  }
  
  public a c(String paramString1, String paramString2)
  {
    oZa.a(paramString1);
    oZa.a(paramString2, paramString1);
    b(paramString1);
    b(paramString1, paramString2);
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oZa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */