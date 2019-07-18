import java.util.ArrayList;
import java.util.List;

public final class pZa$a
{
  String a;
  String b = "";
  String c = "";
  String d;
  int e = -1;
  final List<String> f = new ArrayList();
  List<String> g;
  String h;
  
  public pZa$a()
  {
    this.f.add("");
  }
  
  private static String a(String paramString, int paramInt1, int paramInt2)
  {
    return LZa.a(pZa.a(paramString, paramInt1, paramInt2, false));
  }
  
  private void a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramString = pZa.a(paramString, paramInt1, paramInt2, " \"<>^`{}|/\\?#", paramBoolean2, false, false, true, null);
    if (f(paramString)) {
      return;
    }
    if (g(paramString))
    {
      d();
      return;
    }
    List localList = this.f;
    if (((String)localList.get(localList.size() - 1)).isEmpty())
    {
      localList = this.f;
      localList.set(localList.size() - 1, paramString);
    }
    else
    {
      this.f.add(paramString);
    }
    if (paramBoolean1) {
      this.f.add("");
    }
  }
  
  private static int b(String paramString, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 = Integer.parseInt(pZa.a(paramString, paramInt1, paramInt2, "", false, false, false, true, null));
      if ((paramInt1 > 0) && (paramInt1 <= 65535)) {
        return paramInt1;
      }
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return -1;
  }
  
  private static int c(String paramString, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      int i = paramString.charAt(paramInt1);
      if (i != 58)
      {
        int j = paramInt1;
        if (i != 91)
        {
          j = paramInt1;
        }
        else
        {
          do
          {
            paramInt1 = j + 1;
            j = paramInt1;
            if (paramInt1 >= paramInt2) {
              break;
            }
            j = paramInt1;
          } while (paramString.charAt(paramInt1) != ']');
          j = paramInt1;
        }
        paramInt1 = j + 1;
      }
      else
      {
        return paramInt1;
      }
    }
    return paramInt2;
  }
  
  private void d()
  {
    List localList = this.f;
    if ((((String)localList.remove(localList.size() - 1)).isEmpty()) && (!this.f.isEmpty()))
    {
      localList = this.f;
      localList.set(localList.size() - 1, "");
    }
    else
    {
      this.f.add("");
    }
  }
  
  private void d(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    int i = paramString.charAt(paramInt1);
    if ((i != 47) && (i != 92))
    {
      List localList = this.f;
      localList.set(localList.size() - 1, "");
    }
    else
    {
      this.f.clear();
      this.f.add("");
      break label134;
    }
    while (paramInt1 < paramInt2)
    {
      i = LZa.a(paramString, paramInt1, paramInt2, "/\\");
      boolean bool;
      if (i < paramInt2) {
        bool = true;
      } else {
        bool = false;
      }
      a(paramString, paramInt1, i, bool, true);
      paramInt1 = i;
      if (bool)
      {
        paramInt1 = i;
        label134:
        paramInt1++;
      }
    }
  }
  
  private static int e(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt2 - paramInt1 < 2) {
      return -1;
    }
    int i = paramString.charAt(paramInt1);
    int j;
    if (i >= 97)
    {
      j = paramInt1;
      if (i <= 122) {}
    }
    else
    {
      if (i < 65) {
        break label147;
      }
      j = paramInt1;
      if (i > 90) {
        break label147;
      }
    }
    for (;;)
    {
      paramInt1 = j + 1;
      if (paramInt1 >= paramInt2) {
        break label147;
      }
      i = paramString.charAt(paramInt1);
      if (i >= 97)
      {
        j = paramInt1;
        if (i <= 122) {}
      }
      else if (i >= 65)
      {
        j = paramInt1;
        if (i <= 90) {}
      }
      else if (i >= 48)
      {
        j = paramInt1;
        if (i <= 57) {}
      }
      else
      {
        j = paramInt1;
        if (i != 43)
        {
          j = paramInt1;
          if (i != 45)
          {
            if (i != 46) {
              break;
            }
            j = paramInt1;
          }
        }
      }
    }
    if (i == 58) {
      return paramInt1;
    }
    label147:
    return -1;
  }
  
  private static int f(String paramString, int paramInt1, int paramInt2)
  {
    int i = 0;
    while (paramInt1 < paramInt2)
    {
      int j = paramString.charAt(paramInt1);
      if ((j != 92) && (j != 47)) {
        break;
      }
      i++;
      paramInt1++;
    }
    return i;
  }
  
  private boolean f(String paramString)
  {
    boolean bool;
    if ((!paramString.equals(".")) && (!paramString.equalsIgnoreCase("%2e"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean g(String paramString)
  {
    boolean bool;
    if ((!paramString.equals("..")) && (!paramString.equalsIgnoreCase("%2e.")) && (!paramString.equalsIgnoreCase(".%2e")) && (!paramString.equalsIgnoreCase("%2e%2e"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public a a(int paramInt)
  {
    if ((paramInt > 0) && (paramInt <= 65535))
    {
      this.e = paramInt;
      return this;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("unexpected port: ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public a a(String paramString)
  {
    if (paramString != null) {
      paramString = pZa.d(pZa.a(paramString, " \"'<>#", true, false, true, true));
    } else {
      paramString = null;
    }
    this.g = paramString;
    return this;
  }
  
  public a a(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      if (this.g == null) {
        this.g = new ArrayList();
      }
      this.g.add(pZa.a(paramString1, " \"'<>#&=", true, false, true, true));
      List localList = this.g;
      if (paramString2 != null) {
        paramString1 = pZa.a(paramString2, " \"'<>#&=", true, false, true, true);
      } else {
        paramString1 = null;
      }
      localList.add(paramString1);
      return this;
    }
    throw new NullPointerException("encodedName == null");
  }
  
  a a(pZa parampZa, String paramString)
  {
    int i = LZa.a(paramString, 0, paramString.length());
    int j = LZa.b(paramString, i, paramString.length());
    int k = e(paramString, i, j);
    if (k != -1)
    {
      if (paramString.regionMatches(true, i, "https:", 0, 6))
      {
        this.a = "https";
        i += 6;
      }
      else if (paramString.regionMatches(true, i, "http:", 0, 5))
      {
        this.a = "http";
        i += 5;
      }
      else
      {
        parampZa = new StringBuilder();
        parampZa.append("Expected URL scheme 'http' or 'https' but was '");
        parampZa.append(paramString.substring(0, k));
        parampZa.append("'");
        throw new IllegalArgumentException(parampZa.toString());
      }
    }
    else
    {
      if (parampZa == null) {
        break label840;
      }
      this.a = parampZa.b;
    }
    k = f(paramString, i, j);
    int m;
    if ((k < 2) && (parampZa != null) && (parampZa.b.equals(this.a)))
    {
      this.b = parampZa.f();
      this.c = parampZa.b();
      this.d = parampZa.e;
      this.e = parampZa.f;
      this.f.clear();
      this.f.addAll(parampZa.d());
      if (i != j)
      {
        k = i;
        if (paramString.charAt(i) != '#') {}
      }
      else
      {
        a(parampZa.e());
        k = i;
      }
    }
    else
    {
      m = i + k;
      i = 0;
      k = 0;
      for (;;)
      {
        n = LZa.a(paramString, m, j, "@/\\?#");
        int i1;
        if (n != j) {
          i1 = paramString.charAt(n);
        } else {
          i1 = -1;
        }
        if ((i1 == -1) || (i1 == 35) || (i1 == 47) || (i1 == 92) || (i1 == 63)) {
          break;
        }
        if (i1 == 64)
        {
          if (i == 0)
          {
            int i2 = LZa.a(paramString, m, n, ':');
            i1 = n;
            String str = pZa.a(paramString, m, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
            parampZa = str;
            if (k != 0)
            {
              parampZa = new StringBuilder();
              parampZa.append(this.b);
              parampZa.append("%40");
              parampZa.append(str);
              parampZa = parampZa.toString();
            }
            this.b = parampZa;
            if (i2 != i1)
            {
              this.c = pZa.a(paramString, i2 + 1, i1, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
              i = 1;
            }
            k = 1;
          }
          else
          {
            parampZa = new StringBuilder();
            parampZa.append(this.c);
            parampZa.append("%40");
            parampZa.append(pZa.a(paramString, m, n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
            this.c = parampZa.toString();
          }
          m = n + 1;
        }
      }
      k = c(paramString, m, n);
      i = k + 1;
      if (i < n)
      {
        this.d = a(paramString, m, k);
        this.e = b(paramString, i, n);
        if (this.e == -1)
        {
          parampZa = new StringBuilder();
          parampZa.append("Invalid URL port: \"");
          parampZa.append(paramString.substring(i, n));
          parampZa.append('"');
          throw new IllegalArgumentException(parampZa.toString());
        }
      }
      else
      {
        this.d = a(paramString, m, k);
        this.e = pZa.a(this.a);
      }
      if (this.d == null) {
        break label793;
      }
      k = n;
    }
    int n = LZa.a(paramString, k, j, "?#");
    d(paramString, k, n);
    i = n;
    if (n < j)
    {
      i = n;
      if (paramString.charAt(n) == '?')
      {
        i = LZa.a(paramString, n, j, '#');
        this.g = pZa.d(pZa.a(paramString, n + 1, i, " \"'<>#", true, false, true, true, null));
      }
    }
    if ((i < j) && (paramString.charAt(i) == '#')) {
      this.h = pZa.a(paramString, 1 + i, j, "", true, false, false, false, null);
    }
    return this;
    label793:
    parampZa = new StringBuilder();
    parampZa.append("Invalid URL host: \"");
    parampZa.append(paramString.substring(m, k));
    parampZa.append('"');
    throw new IllegalArgumentException(parampZa.toString());
    label840:
    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
  }
  
  public pZa a()
  {
    if (this.a != null)
    {
      if (this.d != null) {
        return new pZa(this);
      }
      throw new IllegalStateException("host == null");
    }
    throw new IllegalStateException("scheme == null");
  }
  
  int b()
  {
    int i = this.e;
    if (i == -1) {
      i = pZa.a(this.a);
    }
    return i;
  }
  
  public a b(String paramString)
  {
    if (paramString != null)
    {
      Object localObject = a(paramString, 0, paramString.length());
      if (localObject != null)
      {
        this.d = ((String)localObject);
        return this;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("unexpected host: ");
      ((StringBuilder)localObject).append(paramString);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    throw new NullPointerException("host == null");
  }
  
  public a b(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      if (this.g == null) {
        this.g = new ArrayList();
      }
      this.g.add(pZa.a(paramString1, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
      List localList = this.g;
      if (paramString2 != null) {
        paramString1 = pZa.a(paramString2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
      } else {
        paramString1 = null;
      }
      localList.add(paramString1);
      return this;
    }
    throw new NullPointerException("name == null");
  }
  
  a c()
  {
    int i = this.f.size();
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      localObject = (String)this.f.get(k);
      this.f.set(k, pZa.a((String)localObject, "[]", true, true, false, true));
    }
    Object localObject = this.g;
    if (localObject != null)
    {
      i = ((List)localObject).size();
      for (k = j; k < i; k++)
      {
        localObject = (String)this.g.get(k);
        if (localObject != null) {
          this.g.set(k, pZa.a((String)localObject, "\\^`{|}", true, true, true, true));
        }
      }
    }
    localObject = this.h;
    if (localObject != null) {
      this.h = pZa.a((String)localObject, " \"#<>\\^`{|}", true, true, false, false);
    }
    return this;
  }
  
  public a c(String paramString)
  {
    if (paramString != null)
    {
      this.c = pZa.a(paramString, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
      return this;
    }
    throw new NullPointerException("password == null");
  }
  
  public a d(String paramString)
  {
    if (paramString != null)
    {
      if (paramString.equalsIgnoreCase("http"))
      {
        this.a = "http";
      }
      else
      {
        if (!paramString.equalsIgnoreCase("https")) {
          break label39;
        }
        this.a = "https";
      }
      return this;
      label39:
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("unexpected scheme: ");
      localStringBuilder.append(paramString);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    throw new NullPointerException("scheme == null");
  }
  
  public a e(String paramString)
  {
    if (paramString != null)
    {
      this.b = pZa.a(paramString, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
      return this;
    }
    throw new NullPointerException("username == null");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str = this.a;
    if (str != null)
    {
      localStringBuilder.append(str);
      localStringBuilder.append("://");
    }
    else
    {
      localStringBuilder.append("//");
    }
    if ((!this.b.isEmpty()) || (!this.c.isEmpty()))
    {
      localStringBuilder.append(this.b);
      if (!this.c.isEmpty())
      {
        localStringBuilder.append(':');
        localStringBuilder.append(this.c);
      }
      localStringBuilder.append('@');
    }
    str = this.d;
    if (str != null) {
      if (str.indexOf(':') != -1)
      {
        localStringBuilder.append('[');
        localStringBuilder.append(this.d);
        localStringBuilder.append(']');
      }
      else
      {
        localStringBuilder.append(this.d);
      }
    }
    if ((this.e != -1) || (this.a != null))
    {
      int i = b();
      str = this.a;
      if ((str == null) || (i != pZa.a(str)))
      {
        localStringBuilder.append(':');
        localStringBuilder.append(i);
      }
    }
    pZa.b(localStringBuilder, this.f);
    if (this.g != null)
    {
      localStringBuilder.append('?');
      pZa.a(localStringBuilder, this.g);
    }
    if (this.h != null)
    {
      localStringBuilder.append('#');
      localStringBuilder.append(this.h);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pZa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */